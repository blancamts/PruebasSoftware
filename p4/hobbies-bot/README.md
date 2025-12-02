# Chatbot de aficiones y hobbies (Rasa)

Este proyecto contiene un chatbot muy sencillo desarrollado con **Rasa 3.x** que conversa sobre aficiones y hobbies en español, y que incluye:

- Un pequeño **flujo de conversación** sobre aficiones.
- Manejo de **hobbies negativos** (por ejemplo: “no me gusta hacer nada”).
- Manejo de **hobbies perjudiciales o dañinos** (por ejemplo: “me gusta hacer daño a otras personas”).
- Un **fallback** educado cuando el bot no entiende.

---

## 1. Descripción general

El objetivo de este bot es demostrar un ejemplo mínimo pero completo de:

- Definición de **intents** y **respuestas** en Rasa.
- Diseño de **reglas de diálogo** sencillas.
- Distinción entre:
  - aficiones “normales”,
  - situaciones negativas (no disfruto de mi tiempo libre, no tengo hobbies),
  - y **hobbies preocupantes o dañinos** (por ejemplo: *“disfruto haciendo daño a la gente”*).

---

## 2. Estructura del proyecto

Los ficheros principales de Rasa son:

### `config.yml`

Define el **pipeline de NLU**:

- `WhitespaceTokenizer`
- `LexicalSyntacticFeaturizer`
- `CountVectorsFeaturizer` (a nivel de palabras)
- `CountVectorsFeaturizer` (a nivel de caracteres, n-gramas 1–4)
- `DIETClassifier` (clasificación de intents y entidades)
- `EntitySynonymMapper`
- `ResponseSelector`
- `FallbackClassifier` (gestiona el intent `nlu_fallback`)

Y la política de diálogo principal:

- `RulePolicy` (el comportamiento se define mediante reglas).

---

### `domain.yml`

Define el **dominio** del asistente:

- **Intents**:
  - `greet` – saludo.
  - `goodbye` – despedida.
  - `tell_hobbies` – el usuario cuenta sus aficiones.
  - `inform` – el usuario aporta información adicional (por ejemplo, desde cuándo tiene el hobby).
  - `tell_negative_hobbies` – hobbies negativos del tipo *“no me gusta hacer nada”*, *“no tengo aficiones”*.
  - `concerning_hobbies` – hobbies dañinos del tipo *“me gusta hacer daño a la gente”*.
  - `nlu_fallback` – cuando Rasa no está seguro de lo que se ha dicho.

- **Respuestas** (`responses`):
  - `utter_greet`:  
    > “¡Hola! Soy tu bot de aficiones.”
  - `utter_ask_hobbies`: pregunta por las aficiones.  
    > “¿Qué te gusta hacer en tu tiempo libre?”
  - `utter_react_hobbies`: reacción positiva.  
    > “¡Qué bien, eso suena genial!”
  - `utter_ask_since_when`: pregunta desde cuándo practica el hobby.  
    > “¿Desde hace cuánto tiempo lo haces?”
  - `utter_end_conversation`: cierra la conversación dando las gracias.  
    > “Gracias por compartir tus aficiones conmigo. ¡Ha sido un placer hablar contigo!”
  - `utter_goodbye`: despedida.  
    > “¡Hasta luego! 👋”
  - `utter_ask_rephrase`: fallback amable pidiendo que reformules.  
    > “Lo siento, no te he entendido bien. ¿Puedes decirlo de otra forma, por ejemplo hablándome de tus aficiones?”
  - `utter_react_negative_hobbies`: reacción específica ante hobbies negativos, o ausencia de actividades favoritas.  
    > “Vaya, parece que ahora mismo no disfrutas mucho de tus aficiones. A veces pasa. ¿Hay algo que te gustaría retomar o empezar a hacer?”
  - `utter_concerning_hobbies`: reacción específica ante un hobby dañino.  
    > “Lo que comentas es preocupante. No está bien hacer eso. Siempre puedes hablar con alguien de confianza o con un profesional que pueda ayudarte.”

---

### `nlu.yml`

Contiene ejemplos de entrenamiento para cada intent, por ejemplo:

- `greet`:
  - “hola”
  - “buenas”
  - “qué tal”
- `tell_hobbies`:
  - “me gusta leer”
  - “disfruto tocando la guitarra”
  - “me encanta cocinar”
- `tell_negative_hobbies`:
  - “no me gusta hacer nada”
  - “no tengo tiempo para aficiones”
  - “no disfruto de mi tiempo libre”
- `concerning_hobbies`:
  - “disfruto haciendo daño a la gente”
  - “me gusta hacer daño a otras personas”
  - “disfruto molestando a los demás”
- `inform`:
  - “desde hace 5 años”
  - “desde pequeño”
- `goodbye`:
  - “adiós”
  - “hasta luego”
  - “nos vemos”

Con estos ejemplos, Rasa puede distinguir entre hobbies normales, ausencia de hobbies y hobbies perjudiciales.

---

### `rules.yml`

Define el flujo principal mediante **rules**:

- Tras `greet`:
  - `utter_greet`
  - `utter_ask_hobbies`
- Tras `tell_hobbies`:
  - `utter_react_hobbies`
  - `utter_ask_since_when`
- Tras `inform`:
  - `utter_end_conversation`
- Tras `goodbye`:
  - `utter_goodbye`
- Tras `tell_negative_hobbies`:
  - `utter_react_negative_hobbies`
- Tras `concerning_hobbies`:
  - `utter_concerning_hobbies`
- Tras `nlu_fallback`:
  - `utter_ask_rephrase`

---

### `stories.yml`

Contiene una o varias **historias de ejemplo** coherentes con las reglas para mejorar el entrenamiento y documentar el flujo conversacional (por ejemplo, una historia “feliz” de hobby normal, otra de hobby negativo y otra de hobby dañino).

---

### `endpoints.yml`

En este ejemplo **no se utilizan custom actions**, por lo que no es necesario configurar un `action_endpoint`.  
El fichero puede estar vacío o con la sección correspondiente comentada.

---

## 3. Intenciones y comportamiento del bot

### 3.1. Flujo “feliz” (hobbies normales)

Ejemplo de flujo típico:

1. Usuario: **“hola”**  
   → Bot: `utter_greet` + `utter_ask_hobbies`  
   > “¡Hola! Soy tu bot de aficiones.”  
   > “¿Qué te gusta hacer en tu tiempo libre?”

2. Usuario: **“me gusta tocar la guitarra”** (`tell_hobbies`)  
   → Bot: `utter_react_hobbies` + `utter_ask_since_when`  
   > “¡Qué bien, eso suena genial!”  
   > “¿Desde hace cuánto tiempo lo haces?”

3. Usuario: **“desde hace 5 años”** (`inform`)  
   → Bot: `utter_end_conversation`  
   > “Gracias por compartir tus aficiones conmigo. ¡Ha sido un placer hablar contigo!”

El usuario puede despedirse en cualquier momento con `goodbye`, y el bot responderá con `utter_goodbye`.

---

### 3.2. Hobbies negativos (ausencia de aficiones)

Si el usuario expresa que no tiene hobbies o que no disfruta de su tiempo libre, por ejemplo:

- “No me gusta hacer nada.”
- “No tengo tiempo para aficiones.”
- “No disfruto de mi tiempo libre.”

Rasa detecta el intent `tell_negative_hobbies` y el bot responde con:

- Bot (`utter_react_negative_hobbies`):  
  > “Vaya, parece que ahora mismo no disfrutas mucho de tus aficiones. A veces pasa. ¿Hay algo que te gustaría retomar o empezar a hacer?”

El bot intenta **reorientar la conversación** hacia la búsqueda de alguna actividad positiva.

---

### 3.3. Hobbies perjudiciales o dañinos

Si el usuario expresa que disfruta realizando alguna actividad que daña a otras personas, por ejemplo:

- “Me gusta hacer daño a otras personas.”
- “Disfruto haciendo daño a la gente.”

Rasa detecta el intent `concerning_hobbies` y el bot responde con algo del estilo:

- Bot (`utter_concerning_hobbies`):  
  > “Lo que comentas es preocupante. No está bien hacer eso. Siempre puedes hablar con alguien de confianza o con un profesional que pueda ayudarte.”

De esta forma, el bot **no valida** esa conducta y anima a buscar ayuda humana y profesional.

---

### 3.4. Fallback

Cuando la confianza del NLU es baja, se activa el intent `nlu_fallback` y la regla correspondiente:

- Bot (`utter_ask_rephrase`):  
  > “Lo siento, no te he entendido bien. ¿Puedes decirlo de otra forma, por ejemplo hablándome de tus aficiones?”

---

## 4. Requisitos

- **Python** 3.8 o superior (compatible con Rasa 3.1 / 3.6.x).
- **Rasa** 3.x (por ejemplo, 3.6.21).

Se recomienda trabajar en un **entorno virtual** (`venv` o `conda`).

---

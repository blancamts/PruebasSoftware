# language: es

Característica: Operaciones aritméticas básicas

  Escenario: Sumar dos números
    Dado que la calculadora está encendida
    Cuando sumo 5 y 3
    Entonces el resultado debe ser 8,0
    
  Escenario: Restar dos números
    Dado que la calculadora está encendida	
    Cuando resto 5 y 3
    Entonces el resultado debe ser 2

  Escenario: Multiplicar dos números
    Dado que la calculadora está encendida
    Cuando multiplico 5 y 3
    Entonces el resultado debe ser 15

  Escenario: Dividir dos números con cociente exacto
    Dado que la calculadora está encendida
    Cuando divido 8 y 2
    Entonces el resultado debe ser 4,0

  Escenario: Dividir dos números con cociente decimal
    Dado que la calculadora está encendida
    Cuando divido 7 y 2
    Entonces el resultado debe ser 3,5

  Escenario: Error al dividir entre cero
    Cuando divido 5 y 0
    Entonces debe producirse un error

  Escenario: Potencia de un número
    Dado que la calculadora está encendida
    Cuando elevo 2 a 3
    Entonces el resultado debe ser 8

  Escenario: Módulo de dos números
    Dado que la calculadora está encendida
    Cuando hago el módulo de 10 y 3
    Entonces el resultado debe ser 1

  Escenario: Raíz cuadrada de un número
    Dado que la calculadora está encendida
    Cuando calculo la raíz cuadrada de 9
    Entonces el resultado debe ser 3

  Escenario: Error al hacer módulo con divisor cero
    Dado que la calculadora está encendida
    Cuando hago el módulo de 7 y 0
    Entonces debe producirse un error

  Escenario: Error al calcular raíz cuadrada de número negativo
    Dado que la calculadora está encendida
    Cuando calculo la raíz cuadrada de -3
    Entonces debe producirse un error

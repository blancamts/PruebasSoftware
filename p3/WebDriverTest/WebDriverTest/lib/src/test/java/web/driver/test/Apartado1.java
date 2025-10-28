package web.driver.test;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.time.Duration;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class Apartado1 {

    private static final String BASE = "https://api.chucknorris.io/jokes/random?category=";

    /* Cliente HTTP reutilizable */
    private static final HttpClient CLIENT = HttpClient
    		.newBuilder()
    		.connectTimeout(Duration.ofSeconds(10))
    		.build();

    /* Expresión regular para capturar el campo JSON "value": "<texto ...>" */
    private static final Pattern VALUE_FIELD = Pattern.compile("\"value\"\\s*:\\s*\"(.*?)\"", Pattern.DOTALL);

    /**
     * Pequeño asistente que reintenta los fallos transitorios (problemas de red/tiempos de espera agotados) hasta el número de veces especificado en 'retries'.
     * Solo vuelve a intentarlo en IOExceptions o InterruptedExceptions. HTTP 4xx/5xx se devuelven directamente.
     */
    private static HttpResponse<String> getWithRetry(String url, int retries) throws IOException, InterruptedException {
        IOException lastIo = null;
        InterruptedException lastInterrupted = null;

        for (int attempt = 0; attempt <= retries; attempt++) {
            try {
                HttpRequest req = HttpRequest.newBuilder(URI.create(url))
                        .timeout(Duration.ofSeconds(20))
                        .GET()
                        .build();
                return CLIENT.send(req, HttpResponse.BodyHandlers.ofString());
            } catch (IOException e) {
                lastIo = e;
                if (attempt == retries) break;
            } catch (InterruptedException e) {
                lastInterrupted = e;
                if (attempt == retries) break;
                Thread.currentThread().interrupt();
            }
        }

        if (lastIo != null) throw lastIo;
        if (lastInterrupted != null) throw lastInterrupted;
        throw new IOException("Error desconocido tras reintentos");
    }

    private static Optional<String> extractValueField(String json) {
        Matcher m = VALUE_FIELD.matcher(json);
        if (m.find()) {
            return Optional.ofNullable(m.group(1));
        }
        return Optional.empty();
    }

    /* --- Categorias válidas --- */

    /* --- Categorías inválidas --- */

    /* --- OPCIONAL: comprobación de integridad sin categoría (el comportamiento documentado de la API es código 200 junto a chiste aleatorio). --- */

}
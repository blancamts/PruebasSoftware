package e4_tests;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

/**
 * @author Blanca Matas y Victoria Victorero
 * @version 1.0
 * 
 * Clase de test para la clase SumaListasDigitos utilizando pruebas
 * parametrizadas obtenidas a partir de combinaciones ACTS y PICT.
 */
public class Test {

	
    static Stream<Arguments> txt_ACTS_invalid_Provider() throws IOException {
    	
        Path path = Paths.get("e2_valores_invalidos.txt");
        return Files.lines(path)
                .filter(line -> !line.startsWith("#") && !line.trim().isEmpty()).map(line -> line.split(",")) 
                .map(cols -> {
                	
                    int l1_longitud = Integer.parseInt(cols[0]);
                    int l2_longitud = Integer.parseInt(cols[1]);
                    String v11 = cols[2].trim();
                    String v12 = cols[3].trim();
                    String v21 = cols[4].trim();
                    String v22 = cols[5].trim();

                    List<Integer> lista1 = construirLista(l1_longitud, v11, v12);
                    List<Integer> lista2 = construirLista(l2_longitud, v21, v22);

                    return Arguments.of(lista1, lista2);
                });
    }

   
    
    private static List<Integer> construirLista(int longitud, String val1, String val2) {
        
    	List<Integer> lista = new ArrayList<>();
        if (longitud == 0) return lista;

        if (!val1.equalsIgnoreCase("null")) {
        	lista.add(Integer.parseInt(val1));
        }
        if (!val2.equalsIgnoreCase("null")) {
        	lista.add(Integer.parseInt(val2));
        }
        
        return lista;
    }

    
    @ParameterizedTest(name = "{index} => lista1={0}, lista2={1}")
    @MethodSource("txt_ACTS_invalid_Provider")
    void testSumaDosListasDeDigitosDDT(List<Integer> lista1, List<Integer> lista2) {
        
        List<Integer> resultado = SumaListasDigitos.sumaDosListasDeDigitos(lista1, lista2);
        
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Resultado: " + resultado);
        
    }

}

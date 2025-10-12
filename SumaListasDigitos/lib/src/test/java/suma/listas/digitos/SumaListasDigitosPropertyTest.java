package suma.listas.digitos;

import net.jqwik.api.*;
import net.jqwik.api.constraints.*;

import static org.junit.Assert.assertEquals;

import java.util.*;
import java.util.stream.Collectors;


/**
 * @author Blanca Matas y Victoria Victorero
 * @version 1.0
 * 
 * Clase de pruebas JUnit/Jqwik para verificar propiedades de la suma
 * de listas de dígitos.
 */
public class SumaListasDigitosPropertyTest {

    @Provide
    Arbitrary<List<Integer>> listaDigitos() {
        return Arbitraries.integers().between(0, 9)
                .list();
    }


    @Property(tries = 500)
    void propiedadConmutativaSumaListas(
            @ForAll("listaDigitos") List<Integer> lista1,
            @ForAll("listaDigitos") List<Integer> lista2
    ) {
        List<Integer> suma1 = SumaListasDigitos.sumaDosListasDeDigitos(lista1, lista2);
        List<Integer> suma2 = SumaListasDigitos.sumaDosListasDeDigitos(lista2, lista1);
        assertEquals(suma1, suma2);
    }


    @Property(tries = 500)
    void propiedadAsociativaSumaListas(
            @ForAll("listaDigitos") List<Integer> lista1,
            @ForAll("listaDigitos") List<Integer> lista2,
            @ForAll("listaDigitos") List<Integer> lista3) 
    {
        List<Integer> suma1 = SumaListasDigitos.sumaDosListasDeDigitos(SumaListasDigitos.sumaDosListasDeDigitos(lista1, lista2),lista3);
        List<Integer> suma2 = SumaListasDigitos.sumaDosListasDeDigitos(lista1,SumaListasDigitos.sumaDosListasDeDigitos(lista2, lista3));
        
        
        assertEquals(suma1, suma2);
    }


    @Property(tries = 500)
    void propiedadNeutralidadCero(
            @ForAll("listaDigitos") List<Integer> lista
    ) {
    	
        List<Integer> ceros = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            ceros.add(0);
        }

        List<Integer> suma1 = SumaListasDigitos.sumaDosListasDeDigitos(lista, ceros);
        List<Integer> suma2 = SumaListasDigitos.normaliza(lista);

        assertEquals(suma1, suma2);
    }


    @Property(tries = 500)
    void propiedadNoDigitosInvalidos(
            @ForAll("listaDigitos") List<Integer> lista1,
            @ForAll("listaDigitos") List<Integer> lista2
    ) {
        List<Integer> resultado = SumaListasDigitos.sumaDosListasDeDigitos(lista1, lista2);
        
        for (Integer digito : resultado) {
        	assertEquals(true, digito >= 0 && digito <= 9);
		}

    }
}

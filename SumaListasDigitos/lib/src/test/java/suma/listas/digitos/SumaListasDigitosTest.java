package suma.listas.digitos;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;


public class SumaListasDigitosTest {
	
	@Test
	public void testCasoBasico() {
		List<Integer> resultado = SumaListasDigitos.sumaDosListasDeDigitos(
				Arrays.asList(1,2,3),
				Arrays.asList(4,5,6)
		);
		
		assertEquals(Arrays.asList(5,7,9), resultado);
	}
	
	
	@Test
	public void testSumaAcarreo() {
		List<Integer> resultado = SumaListasDigitos.sumaDosListasDeDigitos(
				Arrays.asList(9,9),
				Arrays.asList(9,9)
		);
		
		assertEquals(Arrays.asList(1,9,8), resultado);
	}
	
	@Test
	public void testListasDistintaLongitud() {
		List<Integer> resultado = SumaListasDigitos.sumaDosListasDeDigitos(
				Arrays.asList(9,9,9),
				Arrays.asList(1)
		);
		
		assertEquals(Arrays.asList(1,0,0,0), resultado);
	}
	
	@Test
	public void testSumaVariasListas() {
		List<Integer> resultado = SumaListasDigitos.sumaVariasListasDeDigitos(
				Arrays.asList(9,9,9),
				Arrays.asList(1),
				Arrays.asList(0,0,1,2),
				Arrays.asList(4,9)
		);
		
		assertEquals(Arrays.asList(1,0,6,1), resultado);
	}
	
	@Test
	public void testListaCeros() {
		List<Integer> resultado = SumaListasDigitos.sumaVariasListasDeDigitos(
				Arrays.asList(0,0,0),
				Arrays.asList(1,0,1,2),
				Arrays.asList(1,9)
		);
		
		assertEquals(Arrays.asList(1,0,3,1), resultado);
	}
	
	@Test
	public void testListaCerosIniciales() {
		List<Integer> resultado = SumaListasDigitos.sumaVariasListasDeDigitos(
				Arrays.asList(0,9,9),
				Arrays.asList(0,0,1,2),
				Arrays.asList(0,9)
		);
		
		assertEquals(Arrays.asList(1,2,0), resultado);
	}
	
	@Test
	public void testListasNulas() {
		IllegalArgumentException exception = null;
		try {
			SumaListasDigitos.sumaVariasListasDeDigitos(null, Arrays.asList(1,2));	
		}catch (IllegalArgumentException e) {
			exception = e;
		}

	    assertEquals("La lista en la posición 0 es nula", exception.getMessage());
	}
	
	@Test
	public void testListaDigitosFueraRango() {
		List<Integer> list1 = Arrays.asList(0,-1, 1);
		List<Integer> list2 = Arrays.asList(0,0,10,2);
		
		IllegalArgumentException exception = null;
		try {
			 SumaListasDigitos.sumaDosListasDeDigitos(list1, list2);
		}catch (IllegalArgumentException e) {
			exception = e;
		}

	    assertEquals("Sólo se permiten dígitos entre 0 y 9", exception.getMessage());
	}
	
	@Test
	public void testListasVacias() {
		IllegalArgumentException exception = null;
		try {
			SumaListasDigitos.sumaVariasListasDeDigitos();
		}catch (IllegalArgumentException e) {
			exception = e;
		}

	    assertEquals("Debe proporcionar al menos una lista", exception.getMessage());
	}	
	
	
	static Stream<Arguments> txtCaminosProvider() throws IOException {
	    Path path = Paths.get("suma_dos_listas.txt");
	    return Files.lines(path)
	            .map(line -> line.split(";"))
	            .map(cols -> {
	                List<Integer> list1 = Arrays.stream(cols[0].replaceAll("[\\[\\]\\s]", "").split(",")).map(Integer::parseInt).toList();
	                List<Integer> list2 = Arrays.stream(cols[1].replaceAll("[\\[\\]\\s]", "").split(",")).map(Integer::parseInt).toList();
	                return Arguments.of(list1, list2);
	            });
	}

	
	@ParameterizedTest(name = "{index} => {0} + {1}")
	@MethodSource("txtCaminosProvider")
	public void testSumaDosListasDeDigitosDDT(List<Integer> list1, List<Integer> list2) {
	    List<Integer> resultado = SumaListasDigitos.sumaDosListasDeDigitos(list1, list2);
	    

	    int numero1 = Integer.parseInt(list1.stream().map(String::valueOf).reduce("", String::concat));
	    int numero2 = Integer.parseInt(list2.stream().map(String::valueOf).reduce("", String::concat));
	    int suma = numero1 + numero2;
	    
	    List<Integer> esperado = String.valueOf(suma)
	                                  .chars()
	                                  .mapToObj(c -> c - '0')
	                                  .toList();
	    
	    assertEquals(esperado, resultado);
	}

}
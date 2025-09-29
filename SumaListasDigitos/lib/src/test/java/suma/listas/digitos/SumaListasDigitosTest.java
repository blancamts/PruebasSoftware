package suma.listas.digitos;
import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


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
	public void testSumaVariasListas2() {
		
		List<List<Integer>> listas = List.of(
				Arrays.asList(9,9,9),
				Arrays.asList(1),
				Arrays.asList(0,0,1,2),
				Arrays.asList(4,9)
		);
		List<Integer> resultado = SumaListasDigitos.sumaVariasListasDeDigitos(
				listas
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
	public void testListaNula() {
	    IllegalArgumentException exception = assertThrows(
	        IllegalArgumentException.class,
	        () -> SumaListasDigitos.sumaVariasListasDeDigitos(null, Arrays.asList(1,2), Arrays.asList(3,2))
	    );

	    assertEquals("La lista en la posición 0 es nula", exception.getMessage());
	}
	
	@Test
	public void testListaDigitosFueraRango() {
		List<Integer> list1 = Arrays.asList(0,-1, 1);
		List<Integer> list2 = Arrays.asList(0,0,10,2);
		
		IllegalArgumentException exception = assertThrows(
				IllegalArgumentException.class, 
				() -> SumaListasDigitos.sumaDosListasDeDigitos(list1, list2)
		);

	    assertEquals("Sólo se permiten dígitos entre 0 y 9", exception.getMessage());
	}
	
	@Test
	public void testListasVacias() {
		IllegalArgumentException exception = assertThrows(
				IllegalArgumentException.class, 
				() -> SumaListasDigitos.sumaVariasListasDeDigitos()
		);

	    assertEquals("Debe proporcionar al menos una lista", exception.getMessage());
	}
	
	@Test
	public void testAmbasListasNulas() {
		IllegalArgumentException exception = assertThrows(
				IllegalArgumentException.class, 
				() -> SumaListasDigitos.sumaDosListasDeDigitos(null, null)
		);

	    assertEquals("Las listas no pueden ser nulas", exception.getMessage());
	}	
	
	static Stream<Arguments> txtDosListasCaminoProvider() throws IOException {
	    Path path = Paths.get("suma_dos_listas.txt");
	    return Files.lines(path)
	            .filter(line -> !line.startsWith("#"))
	            .map(line -> line.split(";"))
	            .map(cols -> {
	                List<Integer> lista1 = Arrays.stream(cols[0].replaceAll("[\\[\\]\\s]", "").split(",")).map(Integer::parseInt).toList();
	                List<Integer> lista2 = Arrays.stream(cols[1].replaceAll("[\\[\\]\\s]", "").split(",")).map(Integer::parseInt).toList();
	                return Arguments.of(lista1, lista2);
	            });
	}
	
	@Test
	void testMain() {
	    ByteArrayOutputStream salidaOriginal = new ByteArrayOutputStream();
	    PrintStream salidaMain = System.out;
	    System.setOut(new PrintStream(salidaOriginal));

	    try {
	        SumaListasDigitos.main(new String[]{});

	        String salida = salidaOriginal.toString();
	        assertTrue(salida.contains("Suma de 1 lista"));
	        assertTrue(salida.contains("Suma de 2 listas"));
	        assertTrue(salida.contains("Suma de n listas"));
	    } finally {
	        System.setOut(salidaMain);
	    }
	}


	
	@ParameterizedTest(name = "{index} => {0} + {1}")
	@MethodSource("txtDosListasCaminoProvider")
	public void testSumaDosListasDeDigitosDDT(List<Integer> lista1, List<Integer> lista2) {
		
		 List<Integer> resultado1 = SumaListasDigitos.sumaDosListasDeDigitos(lista1, lista2);

		 BigInteger numero1 = new BigInteger(lista1.toString().replaceAll("[\\[\\], ]", ""));
		 BigInteger numero2 = new BigInteger(lista2.toString().replaceAll("[\\[\\], ]", ""));
		 
		 BigInteger suma = numero1.add(numero2);

		 List<Integer> resultado2 = new ArrayList<>();
		 for (char c : suma.toString().toCharArray()) {
		     resultado2.add(c - '0');
		 }

		    assertEquals(resultado1, resultado2);
	}
	
	static Stream<Arguments> txtVariasListasCaminoProvider() throws IOException {
	    Path path = Paths.get("suma_varias_listas.txt");
	    return Files.lines(path)
	            .filter(line -> !line.startsWith("#"))
	            .map(line -> line.split(";"))
	            .map(cols -> {
	                List<List<Integer>> listas = Arrays.stream(cols).map(s -> Arrays.stream(s.replaceAll("[\\[\\]\\s]", "").split(",")).filter(str -> !str.isEmpty()).map(Integer::parseInt).toList())
	                        .toList();
	                
	                
	                return Arguments.of(listas);
	            });
	}
	
	@ParameterizedTest(name = "{index} => {0}")
	@MethodSource("txtVariasListasCaminoProvider")
	public void testSumaVariasListasDeDigitosDDT(List<List<Integer>> listas) {
	    
		
		List<Integer> resultado1 = SumaListasDigitos.sumaVariasListasDeDigitos(listas.toArray(new List[0]));

		BigInteger sumaTotal = BigInteger.ZERO;
		for (List<Integer> lista : listas) {
			BigInteger numero = new BigInteger(lista.toString().replaceAll("[\\[\\], ]", ""));
			sumaTotal = sumaTotal.add(numero);
		}
		 
		List<Integer> resultado2 = new ArrayList<>();
		for (char c : sumaTotal.toString().toCharArray()) {
		    resultado2.add(c - '0');
		}

		    assertEquals(resultado1, resultado2);
	}
	
	
	
	}


	
	
	
	


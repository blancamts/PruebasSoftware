package suma.listas.digitos;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


/**
 * Clase de pruebas unitarias usando JUnit 5 y Mockito para la clase {@link SumaListasDigitos}.
 * 
 * @author Blanca Matas y Victoria Victorero
 * @version 1.0
 * 
 * Esta clase verifica:
 * - Que las listas de entrada no se muten.
 * - Que se lancen excepciones si las listas contienen valores inválidos.
 * - Que se invoquen métodos esenciales de las listas como size() y get().
 */
public class SumaListasDigitosTestMockito {
	
		  
		
	
		  //Comprobamos que las listas de entrada no se modifican (no se invocan métodos como add() o remove()).
		  @Test
		    public void testNoMutaEntrada(){
			  
			  	// Usamos spy para controlar las interacciones con las listas
		        List<Integer> lista1 = spy(List.of(1, 2, 3));
		        List<Integer> lista2 = spy(List.of(3, 2, 1));

		        List<Integer> resultado = SumaListasDigitos.sumaDosListasDeDigitos(lista1, lista2);
		        
		        assertEquals(List.of(4, 4, 4), resultado);
		        // Verificamos que no se han modificado las listas originales la importancia de este test es
		        // garantizar que los métodos no muten los parámetros recibidos, ya que las entradas
		        // deben considerarse inmutables para evitar errores inesperados
		        verify(lista1, never()).add(any());
		        verify(lista1, never()).remove(any());
		        verify(lista2, never()).add(any());
		        verify(lista2, never()).remove(any());
		    }
		  
		  
  
		  //Comprobamos que, si alguna lista contiene valores inválidos, el metodo lanza excepción
		  @Test
		  public void testValoresInvalidosLanzarExcepcion() {
			  
		        List<Integer> listaInvalida = List.of(1, -2, 3);
		        List<Integer> listaValida = List.of(3, 2, 1);
		        
		        // Verificamos que se lanza IllegalArgumentException al pasar una lista con valores inválidos
		        assertThrows(IllegalArgumentException.class, () -> {
		            SumaListasDigitos.sumaDosListasDeDigitos(listaInvalida, listaValida);
		        });
		        
		        //Este test es fundamental validar las precondiciones de entrada y para evitar cálculos incorrectos

		    }
		  

		  //Comprobamos que el método invoca al menos una vez al método size() de las listas de entrada
		  @Test
		  public void testInvocarSize() {
			  
			  	// Usamos spy para controlar las interacciones de las listas
		        List<Integer> lista1 = spy(List.of(1,2,3));
		        List<Integer> lista2 = spy(List.of(3,2,1));

		        SumaListasDigitos.sumaDosListasDeDigitos(lista1, lista2);

		        // Verificamos que se ha llamado al método size() al menos una vez en cada lista, esto es importante
		        // para asegurar que el algoritmo considera la longitud de las listas al realizar la suma y pueda
		        // implementar correctamente la lógica de suma digito a digito
		        verify(lista1, atLeastOnce()).size();
		        verify(lista2, atLeastOnce()).size();
		    }


		  	//Comprobamos que el método invoca al menos una vez al método get() de las listas de entrada
		    @Test
		    public void testInvocarGet() {
		    	
		    	// Usamos spy para controlar las interacciones de las listas
		        List<Integer> lista1 = spy(List.of(1,2,3));
		        List<Integer> lista2 = spy(List.of(3,2,1));

		        SumaListasDigitos.sumaDosListasDeDigitos(lista1, lista2);
		        
		        // Verificamos que se ha llamado al método get() al menos una vez en cada lista, esto es importante
		        // para asegurar que el algoritmo accede a los dígitos individuales de las listas para 
		        // realizar la suma correctamente
		        verify(lista1, atLeastOnce()).get(anyInt());
		        verify(lista2, atLeastOnce()).get(anyInt());
		    }

		  
		  
		  
		  
		  
		  
}
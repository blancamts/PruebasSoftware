package suma.listas.digitos;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;



public class SumaListasDigitosTestMockito {
	   
		  @Test
		    public void testNoMutaEntrada(){
		        List<Integer> lista1 = spy(List.of(1, 2, 3));
		        List<Integer> lista2 = spy(List.of(3, 2, 1));

		        List<Integer> resultado = SumaListasDigitos.sumaDosListasDeDigitos(lista1, lista2);

		        assertEquals(List.of(4, 4, 4), resultado);

		        verify(lista1, never()).add(any());
		        verify(lista1, never()).remove(any());
		        verify(lista2, never()).add(any());
		        verify(lista2, never()).remove(any());
		    }
		  
		  @Test
		  public void testValoresInvalidosLanzarExcepcion() {
			  
		        List<Integer> listaInvalida = List.of(1, -2, 3);
		        List<Integer> listaValida = List.of(3, 2, 1);
		        
		        
		        assertThrows(IllegalArgumentException.class, () -> {
		            SumaListasDigitos.sumaDosListasDeDigitos(listaInvalida, listaValida);
		        });

		    }
		  
		  @Test
		  public void testInvocarSize() {
			  
		        List<Integer> lista1 = spy(List.of(1,2,3));
		        List<Integer> lista2 = spy(List.of(3,2,1));

		        SumaListasDigitos.sumaDosListasDeDigitos(lista1, lista2);

		        verify(lista1, atLeastOnce()).size();
		        verify(lista2, atLeastOnce()).size();
		    }

		   
		    @Test
		    public void testInvocarGet() {
		    	
		        List<Integer> lista1 = spy(List.of(1,2,3));
		        List<Integer> lista2 = spy(List.of(3,2,1));

		        SumaListasDigitos.sumaDosListasDeDigitos(lista1, lista2);

		        verify(lista1, atLeastOnce()).get(anyInt());
		        verify(lista2, atLeastOnce()).get(anyInt());
		    }

		  
		  
		  
		  
		  
		  
}
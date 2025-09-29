package calc.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import calc.Producto;

public class ProductoTest {

	@Test
	public void testProducto() {
		Producto producto = new Producto();
		double resultado = producto.getProducto(2.0, 3.0);
		assertEquals(6, resultado, "Al multiplicar 2 por 3 debería dar 6");
	}
	
	@Test
	public void testMultiplica() 
	{
		Producto producto = new Producto(2.0);
		double resultado = producto.multiplica(3.0);
		assertEquals(6, resultado, "Al multiplicar 2 por 3 debería dar 6");
	}
}

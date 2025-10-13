package calc.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import calc.Division;

public class DivisionTest {
	
	@Test
	public void testDivision() {
		Division division = new Division();
		double resultado = division.getDivision(6.0, 3.0);
		assertEquals(2, resultado, "Al dividir 6 por 3 debería dar 2");
	}
	
	@Test
	public void testDivide() 
	{
		Division division = new Division(6.0);
		Double resultado = division.divide(3.0);
		assertEquals(2, resultado, "Al dividir 6 por 3 debería dar 2");
	}

}

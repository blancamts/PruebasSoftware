package web.driver.test;

import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static org.junit.jupiter.api.Assertions.*;

public class Apartado5 {

    private Calculator calc;
    private double result;
    @Dado("que la calculadora está encendida")
    public void init() { calc = new Calculator(); }

    @Cuando("sumo {int} y {int}")
    public void sumo(int a, int b) { result = calc.add(a, b); }
    
    //...
    
    @Entonces("el resultado debe ser {double}")
    public void testAssertResultado(double esperado) { assertEquals(esperado, result); }
}

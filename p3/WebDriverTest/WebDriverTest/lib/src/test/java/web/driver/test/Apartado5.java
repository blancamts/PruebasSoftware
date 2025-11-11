package web.driver.test;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static org.junit.jupiter.api.Assertions.*;

public class Apartado5 {

    private Calculator calc;
    private double result;
    private Exception error;
    
 
    @Dado("que la calculadora está encendida")
    public void init() { 
	    calc = new Calculator();
	    error = null;
    }

    @Cuando("sumo {int} y {int}")
    public void sumo(int a, int b) { result = calc.add(a, b); }
    
    @Cuando("resto {int} y {int}")
    public void resto(int a, int b) {
        try {
            result = calc.subtract(a, b);
        } catch (Exception e) {
            error = e;
        }
    }

    @Cuando("multiplico {int} y {int}")
    public void multiplico(int a, int b) {
        try {
            result = calc.multiply(a, b);
        } catch (Exception e) {
            error = e;
        }
    }

    @Cuando("divido {double} y {double}")
    public void divido(double a, double b) {
        try {
            result = calc.divide(a, b);
        } catch (Exception e) {
            error = e;
        }
    }

    @Cuando("elevo {double} a {double}")
    public void elevo(double base, double exp) {
        try {
            result = calc.power(base, exp);
        } catch (Exception e) {
            error = e;
        }
    }

    @Cuando("hago el módulo de {int} y {int}")
    public void modulo(int a, int b) {
        try {
            result = calc.mod(a, b);
        } catch (Exception e) {
            error = e;
        }
    }

    @Cuando("calculo la raíz cuadrada de {double}")
    public void raizCuadrada(double a) {
        try {
            result = calc.sqrt(a);
        } catch (Exception e) {
            error = e;
        }
    }
    
    @Entonces("el resultado debe ser {double}")
    public void testAssertResultado(double esperado) {
    	assertEquals(esperado, result); }
    
    @Entonces("debe producirse un error")
    public void testAssertError() { assertNotNull(error); }
}

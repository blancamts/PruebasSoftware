package web.driver.test;

public class Calculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    
    
    //MODIFICADO
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return (double)a / b;
    }
    
    //METODOS ADICIONALES PARA COMPLETAR
    public double power(double base, double exp) {return Math.pow(base, exp); }
    
    public int mod (int a, int b) {
    	if (b == 0) {
			throw new IllegalArgumentException("El divisor no puede ser cero");
		}
    	return a % b; 
    }
    public double sqrt(double a) {
		if (a < 0) {
			throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
		}
		return Math.sqrt(a);
		
    }
		
}
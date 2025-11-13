package web.driver.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Apartado4 {
	private static Duration shortTimeout = Duration.ofSeconds(30);
	private static Duration longTimeout = Duration.ofSeconds(90);
	
	@BeforeAll
	public static void setUp() {
		WebTesting.initSystemProperties();
	}
	
	@AfterAll
	public static void tearDownAll() {
		if (WebTesting.getDriver() != null) {
			WebTesting.quitDriver();
		}
	}

	@AfterEach
	public void tearDown() {
		if (WebTesting.getDriver() != null) {
			WebTesting.quitDriver();
		}
	}
	
	@Test
	public void testCalculatorExplicitly() {
		ChromeDriver driver = (ChromeDriver) WebTesting.launchDriver("https://www.google.com", "chrome");
		try {
			Thread.sleep(Duration.ofSeconds(3));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (driver == null) {
			fail("Driver not created.");
		}
		
		WebDriverWait shortWait = new WebDriverWait(driver, shortTimeout);
		WebDriverWait longWait = new WebDriverWait(driver, longTimeout);
		
		try {
			shortWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		} catch (TimeoutException ex) {
			fail("No se encuentra la barra de búsqueda.");
		}
						
		driver.findElement(By.name("q")).sendKeys("calculator" + Keys.RETURN);
		
		try {
			shortWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tyYmIf")));
		} catch (TimeoutException ex) {
			fail("No se encuentra la calculadora.");
		}
		
		WebElement calculatorText = driver.findElement(By.id("cwos"));
		
		/* #1: (introduce 1 y comprueba si el valor se ha introducido en el campo de texto)                   *
         * SUGERENCIA: El botón "1" es un div con jsname="N10B9"                                                   */
		driver.findElement(By.cssSelector("div[jsname='N10B9']")).click();

		try {
		    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "1"));
		} catch (TimeoutException ex) {
		    fail("El número 1 no se introdujo correctamente en la calculadora.");
		}

		String resultado_uno = calculatorText.getText();
		if (!"1".equals(resultado_uno)) {
		    fail("El resultado esperado era '1' pero se obtuvo: " + resultado_uno);
		}

		
		/* #2: (introduce "+" y comprueba si el valor se ha introducido en el campo de texto)                 *
         * SUGERENCIA: El botón "+" es un div con jsname="XSr6wc"                                                  */
		driver.findElement(By.cssSelector("div[jsname='XSr6wc']")).click();

		try {
		    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "1 +"));
		} catch (TimeoutException ex) {
		    fail("El + no se introdujo correctamente en la calculadora.");
		}

		String resultado_mas = calculatorText.getText();
		if (!"1 +".equals(resultado_mas)) {
		    fail("El resultado debia contener '+' pero se obtuvo: " + resultado_mas);
		}
		
		/* #3: (introduce "-" y comprueba si el valor se ha introducido correctamente en el campo de texto)   *
		 * SUGERENCIA: El botón "-" es un div con jsname="pPHzQc"                                                  */
		driver.findElement(By.cssSelector("div[jsname='pPHzQc']")).click();

		try {
		    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "1 -"));
		} catch (TimeoutException ex) {
		    fail("El - no se introdujo correctamente en la calculadora.");
		}

		String resultado_menos = calculatorText.getText();
		if (!"1 -".equals(resultado_menos)) {
		    fail("El resultado debia contener '-' pero se obtuvo: " + resultado_menos);
		}
		
		/* #4: (introduce "2" y comprueba si el valor se ha introducido en el campo de texto)                 *
         * SUGERENCIA: el botón "2" es un div con jsname="lVjWed"                                                  */
		driver.findElement(By.cssSelector("div[jsname='lVjWed']")).click();

		try {
		    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "1 - 2"));
		} catch (TimeoutException ex) {
		    fail("El número 2 no se introdujo correctamente en la calculadora.");
		}

		String resultado_dos = calculatorText.getText();
		if (!"1 - 2".equals(resultado_dos)) {
		    fail("El resultado debia contener '2' pero se obtuvo: " + resultado_dos);
		}
		
		/* #5: (pulsa "=" y comprueba si el valor se ha resuelto correctamente)                               *
		 * SUGERENCIA: el botón "=" es un div con jsname="Pt8tGc"                                                  */
		driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();

		try {
		    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "-1"));
		} catch (TimeoutException ex) {
		    fail("El = no se introdujo correctamente en la calculadora.");
		}

		String resultado_igual = calculatorText.getText();
		if (!"-1".equals(resultado_igual)) {
		    fail("El resultado esperado era '-1' pero se obtuvo: " + resultado_igual);
		}
		
		/* #6: (pulsa el botón "AC" y comprueba si se ha borrado el valor)                                    *
		 * SUGERENCIA: el botón de borrar es un div con jsname="SLn8gc"                                            */
		driver.findElement(By.cssSelector("div[jsname='SLn8gc']")).click();

		try {
		    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0"));
		} catch (TimeoutException ex) {
		    fail("No se reinició correctamente en la calculadora.");
		}

		String resultado_AC = calculatorText.getText();
		if (!"0".equals(resultado_AC)) {
		    fail("El resultado esperado era '0' pero se obtuvo: " + resultado_AC);
		}
		
		/* #7: (resuelve "87 + 52" con el uso correcto de WebDriverWait)                                      */
		driver.findElement(By.cssSelector("div[jsname='T7PMFe']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "8"));
		
		driver.findElement(By.cssSelector("div[jsname='rk7bOd']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "87"));

		
		driver.findElement(By.cssSelector("div[jsname='XSr6wc']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "87 +"));

		driver.findElement(By.cssSelector("div[jsname='Ax5wH']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "87 + 5"));

		driver.findElement(By.cssSelector("div[jsname='lVjWed']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "87 + 52"));
	    
		driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();

	    try {
	        shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "139"));
	    } catch (TimeoutException ex) {
	        fail("El resultado de la operación 87 + 52 no se mostró correctamente.");
	    }
	    
		String resultado_final = calculatorText.getText();
		if (!"139".equals(resultado_final)) {
		    fail("El resultado esperado era '139' pero se obtuvo: " + resultado_final);
		}
		
		driver.findElement(By.cssSelector("div[jsname='SLn8gc']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0"));
		
		/* #8: (resuelve "63 * 21" con el uso correcto de WebDriverWait)                                      */
		driver.findElement(By.cssSelector("div[jsname='abcgof']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "6"));
		
		driver.findElement(By.cssSelector("div[jsname='KN1kY']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "63"));

		
		driver.findElement(By.cssSelector("div[jsname='YovRWb']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "63 ×"));

		driver.findElement(By.cssSelector("div[jsname='lVjWed']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "63 × 2"));

		driver.findElement(By.cssSelector("div[jsname='N10B9']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "63 × 21"));
	    
		driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();

	    try {
	        shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "1323"));
	    } catch (TimeoutException ex) {
	        fail("El resultado de la operación 63 * 21 no se mostró correctamente.");
	    }
	    
		String resultado_final2 = calculatorText.getText();
		if (!"1323".equals(resultado_final2)) {
		    fail("El resultado esperado era '139' pero se obtuvo: " + resultado_final2);
		}
		
		driver.findElement(By.cssSelector("div[jsname='SLn8gc']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0"));
		
		/* #9: (resuelve "45 / 9" con el uso correcto de WebDriverWait)                                        */
		driver.findElement(By.cssSelector("div[jsname='xAP7E']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "4"));
		
		driver.findElement(By.cssSelector("div[jsname='Ax5wH']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "45"));

		
		driver.findElement(By.cssSelector("div[jsname='WxTTNd']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "45 ÷"));

		driver.findElement(By.cssSelector("div[jsname='XoxYJ']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "45 ÷ 9"));
	    
		driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();

	    try {
	        shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "5"));
	    } catch (TimeoutException ex) {
	        fail("El resultado de la operación 45 / 9 no se mostró correctamente.");
	    }
	    
		String resultado_final3 = calculatorText.getText();
		if (!"5".equals(resultado_final3)) {
		    fail("El resultado esperado era '4' pero se obtuvo: " + resultado_final3);
		}
		
		driver.findElement(By.cssSelector("div[jsname='SLn8gc']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0"));
		
		/* #10: (resuelve "72 / 10" con el uso correcto de WebDriverWait)                                     */
		driver.findElement(By.cssSelector("div[jsname='rk7bOd']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "7"));
		
		driver.findElement(By.cssSelector("div[jsname='lVjWed']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "72"));

		
		driver.findElement(By.cssSelector("div[jsname='WxTTNd']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "72 ÷"));

		driver.findElement(By.cssSelector("div[jsname='N10B9']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "72 ÷ 1"));
	    
	    driver.findElement(By.cssSelector("div[jsname='bkEvMb']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "72 ÷ 10"));
	    
		driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();

	    try {
	        shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "7.2"));
	    } catch (TimeoutException ex) {
	        fail("El resultado de la operación 72 / 10 no se mostró correctamente.");
	    }
	    
		String resultado_final4 = calculatorText.getText();
		if (!"7.2".equals(resultado_final4)) {
		    fail("El resultado esperado era '7.2' pero se obtuvo: " + resultado_final4);
		}
		
		driver.findElement(By.cssSelector("div[jsname='SLn8gc']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0"));
		
		/* #11: (Resuelve "log(58 * 6 / 2 - 74)" con el uso correcto de WebDriverWait)                         */
		/* SUGERENCIA: no se necesita el último paréntesis */
		driver.findElement(By.cssSelector("div[jsname='DfiOAc']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log("));
		
		driver.findElement(By.cssSelector("div[jsname='Ax5wH']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(5"));

		
		driver.findElement(By.cssSelector("div[jsname='T7PMFe']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58"));

		driver.findElement(By.cssSelector("div[jsname='YovRWb']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58 ×"));
	    
	    driver.findElement(By.cssSelector("div[jsname='abcgof']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58 × 6"));
	    
		driver.findElement(By.cssSelector("div[jsname='WxTTNd']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58 × 6 ÷ "));
	    
	    driver.findElement(By.cssSelector("div[jsname='lVjWed']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58 × 6 ÷ 2"));
	    
	    driver.findElement(By.cssSelector("div[jsname='pPHzQc']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58 × 6 ÷ 2 -"));
	    
	    driver.findElement(By.cssSelector("div[jsname='rk7bOd']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58 × 6 ÷ 2 - 7"));
	    
	    driver.findElement(By.cssSelector("div[jsname='xAP7E']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58 × 6 ÷ 2 - 74"));
	    
	    driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();

	    try {
	        shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2"));
	    } catch (TimeoutException ex) {
	        fail("El resultado de la operación log(58 * 6 / 2 - 74) no se mostró correctamente.");
	    }
	    
		String resultado_final5 = calculatorText.getText();
		if (!"2".equals(resultado_final5)) {
		    fail("El resultado esperado era '2' pero se obtuvo: " + resultado_final5);
		}
		
		driver.findElement(By.cssSelector("div[jsname='SLn8gc']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0"));
		
		/* #12: (Resuelve "2 - √(36) + 95 / 5" )                                                               */
		driver.findElement(By.cssSelector("div[jsname='lVjWed']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2"));
		
		driver.findElement(By.cssSelector("div[jsname='pPHzQc']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2 -"));

		
		driver.findElement(By.cssSelector("div[jsname='oQcVc']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2 - √("));

		driver.findElement(By.cssSelector("div[jsname='KN1kY']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2 - √(3"));
	    
	    driver.findElement(By.cssSelector("div[jsname='abcgof']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2 - √(36"));
	    
		driver.findElement(By.cssSelector("div[jsname='qCp9A']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2 - √(36)"));
	    
	    driver.findElement(By.cssSelector("div[jsname='XSr6wc']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2 - √(36) +"));
	    
	    driver.findElement(By.cssSelector("div[jsname='XoxYJ']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2 - √(36) + 9"));
	    
	    driver.findElement(By.cssSelector("div[jsname='Ax5wH']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2 - √(36) + 95"));
	    
	    driver.findElement(By.cssSelector("div[jsname='WxTTNd']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2 - √(36) + 95 ÷"));
	    
	    driver.findElement(By.cssSelector("div[jsname='Ax5wH']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2 - √(36) + 95 ÷ 5"));
	    
	    driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();

	    try {
	        shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "15"));
	    } catch (TimeoutException ex) {
	        fail("El resultado de la operación 2 - √(36) + 95 / 5 no se mostró correctamente.");
	    }
	    
		String resultado_final6 = calculatorText.getText();
		if (!"15".equals(resultado_final6)) {
		    fail("El resultado esperado era '15' pero se obtuvo: " + resultado_final6);
		}
		
		driver.findElement(By.cssSelector("div[jsname='SLn8gc']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0"));
		
		/* #13: (Resuelve "2 * 10^4" )                                                                          */
		driver.findElement(By.cssSelector("div[jsname='lVjWed']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2"));
		
		driver.findElement(By.cssSelector("div[jsname='YovRWb']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2 ×"));

		
		driver.findElement(By.cssSelector("div[jsname='N10B9']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2 × 1"));

		driver.findElement(By.cssSelector("div[jsname='bkEvMb']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2 × 10"));
	    
	    driver.findElement(By.cssSelector("div[jsname='AN4cgb']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2 × 10E"));
	    
		driver.findElement(By.cssSelector("div[jsname='xAP7E']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2 × 10E4"));
	    
	    driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();

	    try {
	        shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "200000"));
	    } catch (TimeoutException ex) {
	        fail("El resultado de la operación 2 * 10^4 no se mostró correctamente.");
	    }
	    
		String resultado_final7 = calculatorText.getText();
		if (!"200000".equals(resultado_final7)) {
		    fail("El resultado esperado era '200000' pero se obtuvo: " + resultado_final7);
		}
		
		driver.findElement(By.cssSelector("div[jsname='SLn8gc']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0"));
		
		/* #14: (Resuelve "41 / 13" )                                                                          */
		driver.findElement(By.cssSelector("div[jsname='xAP7E']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "4"));
		
		driver.findElement(By.cssSelector("div[jsname='N10B9']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "41"));

		
		driver.findElement(By.cssSelector("div[jsname='WxTTNd']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "41 ÷"));

		driver.findElement(By.cssSelector("div[jsname='N10B9']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "41 ÷ 1"));
	    
	    driver.findElement(By.cssSelector("div[jsname='KN1kY']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "41 ÷ 13"));
	    
		driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();

	    try {
	        shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "3.15384615385"));
	    } catch (TimeoutException ex) {
	        fail("El resultado de la operación 41 / 13 no se mostró correctamente.");
	    }
	    
		String resultado_final8 = calculatorText.getText();
		if (!"3.15384615385".equals(resultado_final8)) {
		    fail("El resultado esperado era '3.15384615385' pero se obtuvo: " + resultado_final8);
		}
		
		driver.findElement(By.cssSelector("div[jsname='SLn8gc']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0"));
		
		/* #15: (Resuelve "58 / 23" )                                                                           */
		driver.findElement(By.cssSelector("div[jsname='Ax5wH']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "5"));

		
		driver.findElement(By.cssSelector("div[jsname='T7PMFe']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "58"));

		
		driver.findElement(By.cssSelector("div[jsname='WxTTNd']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "58 ÷"));

		driver.findElement(By.cssSelector("div[jsname='lVjWed']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "58 ÷ 2"));
	    
	    driver.findElement(By.cssSelector("div[jsname='KN1kY']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "58 ÷ 23"));
	    
		driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();

	    try {
	        shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2.52173913043"));
	    } catch (TimeoutException ex) {
	        fail("El resultado de la operación 58 / 23 no se mostró correctamente.");
	    }
	    
		String resultado_final9 = calculatorText.getText();
		if (!"2.52173913043".equals(resultado_final9)) {
		    fail("El resultado esperado era '2.52173913043' pero se obtuvo: " + resultado_final9);
		}
		
		driver.findElement(By.cssSelector("div[jsname='SLn8gc']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0"));
		
		/* #16: (Resolver "log(37 * 9 / 7 - 83)")                                                               */
		driver.findElement(By.cssSelector("div[jsname='DfiOAc']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log("));
		
		driver.findElement(By.cssSelector("div[jsname='KN1kY']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(3"));

		
		driver.findElement(By.cssSelector("div[jsname='rk7bOd']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(37"));

		driver.findElement(By.cssSelector("div[jsname='YovRWb']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(37 ×"));
	    
	    driver.findElement(By.cssSelector("div[jsname='XoxYJ']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(37 × 9"));
	    
		driver.findElement(By.cssSelector("div[jsname='WxTTNd']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(37 × 9 ÷ "));
	    
	    driver.findElement(By.cssSelector("div[jsname='rk7bOd']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(37 × 9 ÷ 7"));
	    
	    driver.findElement(By.cssSelector("div[jsname='pPHzQc']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(37 × 9 ÷ 7 -"));
	    
	    driver.findElement(By.cssSelector("div[jsname='T7PMFe']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(37 × 9 ÷ 7 - 8"));
	    
	    driver.findElement(By.cssSelector("div[jsname='KN1kY']")).click();
	    shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(37 × 9 ÷ 7 - 83"));
	    
	    driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();

	    try {
	        shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "Error"));
	    } catch (TimeoutException ex) {
	        fail("El resultado de la operación log(37 * 9 / 7 - 83) no se mostró correctamente.");
	    }
	    
		String resultado_final10 = calculatorText.getText();
		if (!"Error".equals(resultado_final10)) {
		    fail("El resultado esperado era 'Error' pero se obtuvo: " + resultado_final10);
		}
		
		driver.findElement(By.cssSelector("div[jsname='SLn8gc']")).click();
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0"));
	}
}

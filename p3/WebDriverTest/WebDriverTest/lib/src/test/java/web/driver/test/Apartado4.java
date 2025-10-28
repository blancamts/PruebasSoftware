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
	private static Duration shortTimeout = Duration.ofSeconds(10);
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
		
		/* #1: TODO (introduce 1 y comprueba si el valor se ha introducido en el campo de texto)                   *
         * SUGERENCIA: El botón "1" es un div con jsname="N10B9"                                                   */
		
		/* #2: TODO (introduce "+" y comprueba si el valor se ha introducido en el campo de texto)                 *
         * SUGERENCIA: El botón "+" es un div con jsname="XSr6wc"                                                  */
		
		/* #3: TODO (introduce "-" y comprueba si el valor se ha introducido correctamente en el campo de texto)   *
		 * SUGERENCIA: El botón "-" es un div con jsname="pPHzQc"                                                  */
		
		/* #4: TODO (introduce "2" y comprueba si el valor se ha introducido en el campo de texto)                 *
         * SUGERENCIA: el botón "2" es un div con jsname="lVjWed"                                                  */

		/* #5: TODO (pulsa "=" y comprueba si el valor se ha resuelto correctamente)                               *
		 * SUGERENCIA: el botón "=" es un div con jsname="Pt8tGc"                                                  */

		/* #6: TODO (pulsa el botón "AC" y comprueba si se ha borrado el valor)                                    *
		 * SUGERENCIA: el botón de borrar es un div con jsname="SLn8gc"                                            */

		/* #7: TODO (resuelve "87 + 52" con el uso correcto de WebDriverWait)                                      */

		/* #8: TODO (resuelve "63 * 21" con el uso correcto de WebDriverWait)                                      */

		/* #9: TODO (resuelve "45 / 9" con el uso correcto de WebDriverWait)                                        */

		/* #10: TODO (resuelve "72 / 10" con el uso correcto de WebDriverWait)                                     */

		/* #11: TODO (Resuelve "log(58 * 6 / 2 - 74)" con el uso correcto de WebDriverWait)                         *
		 * SUGERENCIA: no se necesita el último paréntesis

		/* #12: TODO (Resuelve "87 + 52" )                                                                          */

		/* #13: TODO (Resuelve "63 * 21" )                                                                          */

		/* #14: TODO (Resuelve "41 / 13" )                                                                           */

		/* #15: TODO (Resuelve "58 / 23" )                                                                           */

		/* #16: TODO (Resolver "log(37 * 9 / 7 - 83)")                                                               */
	}
}

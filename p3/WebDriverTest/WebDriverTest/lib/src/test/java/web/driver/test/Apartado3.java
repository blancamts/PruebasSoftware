package web.driver.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;


public class Apartado3 {
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
	public void testGoogleSpeedTestExplicitly() throws InterruptedException {
		ChromeDriver driver = (ChromeDriver) WebTesting.launchDriver("https://www.google.com", "chrome");

		try {
			Thread.sleep(Duration.ofSeconds(3));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (driver == null) {
			fail("No se ha creado el driver.");
		}

		/* Puedes cambiar estos valores de tiempo de espera según lo que consideres adecuado para tu sistema */
		WebDriverWait shortWait = new WebDriverWait(driver, shortTimeout);
		WebDriverWait longWait = new WebDriverWait(driver, longTimeout);

		/* #1: Se accede a la barra de búsqueda */
		try {
			shortWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
			System.out.println("Paso 1 conseguido.");
		} catch (TimeoutException ex) {
			System.out.println("Paso 1 no conseguido.");
			fail("No se encontró la barra de búsqueda.");
		}

		/* #2: Se introduce el texto "internet speed test" en la barra de búsqueda y se pulsa la tecla "intro" */
		driver.findElement(By.name("q")).sendKeys("internet speed test" + Keys.RETURN);
		System.out.println("Paso 2 conseguido.");

		/* #3: se comprueba que el botón "run speed test" (EJECUTAR PRUEBA DE VELOCIDAD) esta visible */
		try {
			longWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("knowledge-verticals-internetspeedtest__test_button")));
			System.out.println("Paso 3 conseguido.");
		} catch (TimeoutException ex) {
			System.out.println("Paso 3 no conseguido.");
			fail("No se encuentra el botón de \"run speed test\".");
		}

		/* #4: se selecciona el botón "run speed test" (EJECUTAR PRUEBA DE VELOCIDAD) */
		driver.findElement(By.id("knowledge-verticals-internetspeedtest__test_button")).click();

		System.out.println("Paso 4 conseguido.");

		// #5: se asegura de que el botón «CANCELAR» se pueda pulsar directamente después de esto
		// El botón es una etiqueta <g-raised-button> con el atributo jsaction="dArJMd".
		try {
			shortWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//g-raised-button[@jsaction='dArJMd']")));
		} catch (TimeoutException ex) {
			fail("No se encuentra el botón de \"cancel\".");
		}
		System.out.println("Paso 5 conseguido.");

		// #6: espera a que termine el test
		// Es decir a que se habilite el botón de cancel y se seleccione
		try {
			longWait.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(By.xpath("//g-raised-button[@jsaction='dArJMd']"))));
		} catch (TimeoutException ex) {
			fail("El test de veolcidad no terminó.");
		}
		System.out.println("Paso 6 conseguido.");

	}
}

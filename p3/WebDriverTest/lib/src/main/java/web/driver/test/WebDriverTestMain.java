package web.driver.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class WebDriverTestMain {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
	}
}

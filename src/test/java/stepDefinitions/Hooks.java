package stepDefinitions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;

	@Before
	public void openBrowser() {
		System.setProperty("webdriver.gecho.driver", "src/test/resources/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@After
	public void tearDown() {

		driver.quit();

	}

}

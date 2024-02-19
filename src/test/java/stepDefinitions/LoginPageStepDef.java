package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	
	 public WebDriver driver;
	 
	 public LoginPageStepDef() {
		    driver = Hooks.driver;
		  }
	  
	

@Given("I am on login page")
public void i_am_on_login_page() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
}


@When("I provide username {string} and password {string}")
public void i_provide_username_and_password(String uname, String pswd) {
	 WebElement username=driver.findElement(By.name("username"));
	 WebElement password=driver.findElement(By.name("password"));
	 username.click();
	 username.sendKeys(uname);
	 password.click();
	 password.sendKeys(pswd); 
}


@When("click on login button")
public void click_on_login_button() {
	 WebElement LoginBtn=driver.findElement(By.xpath("//button[@type='submit']"));
	 LoginBtn.click();
   
}
@Then("Home page should be displayed")
public void home_page_should_be_displayed() {
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
	WebElement Dashboard=driver.findElement(By.xpath("//h6[text()='Dashboard']"));
	wait.until(ExpectedConditions.visibilityOf(Dashboard));
	Assert.assertTrue(Dashboard.isDisplayed());
}

@Given("I have logged into HRM portal with valid creds and navigated to home page")
public void i_have_logged_into_hrm_portal_with_valid_creds_and_navigated_to_home_page() {
	i_am_on_login_page();
	i_provide_username_and_password("Admin", "admin123");
	click_on_login_button();	
	home_page_should_be_displayed();	
    
}




}

package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminPageStepDef {
 public WebDriver driver;
	 
	 public AdminPageStepDef() {
		    driver = Hooks.driver;
		  }


@When("I click on Admin Menu Option and navigated to Jobs")
public void i_click_on_admin_menu_option_and_navigated_to_jobs() throws InterruptedException {
	Thread.sleep(3000);
	WebElement AdminMenuItem=driver.findElement(By.xpath("//a/span[text()='Admin']"));
	AdminMenuItem.click();
	Thread.sleep(3000);
	WebElement Jobs=driver.findElement(By.xpath("//li/span[contains(text(),'Job')]"));
	Jobs.click();
	Thread.sleep(2000);
	WebElement JobTitles=driver.findElement(By.xpath("//a[text()='Job Titles']"));
	JobTitles.click();
	Thread.sleep(3000);

}
@Then("QA Eng job title should be displayed")
public void qa_eng_job_title_should_be_displayed() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,800)", "");
	Thread.sleep(2000);
	WebElement QAEngChkBx=driver.findElement(By.xpath("//div[div[div[text()='QA Engineer']]]/div[1]/div/div"));
	Assert.assertTrue(QAEngChkBx.isDisplayed());
	QAEngChkBx.click();

}

}

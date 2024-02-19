package runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumbertest.html"},
		features = {"src/test/java/features"},
		glue={"stepDefinitions"}
		)

public class TestRunner {

}


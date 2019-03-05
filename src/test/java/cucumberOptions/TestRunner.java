package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features", plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"} , 
		glue = "stepDefinitions",
		tags = {"@RegressionTests"})

public class TestRunner extends AbstractTestNGCucumberTests {

}

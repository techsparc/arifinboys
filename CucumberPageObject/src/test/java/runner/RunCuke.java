package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features={"src/test/resources/features"}, 
		glue="steps", 
		tags={"@Search-Cars"}
		)
	
public class RunCuke extends AbstractTestNGCucumberTests {

}

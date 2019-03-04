package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features_api", 
					glue = { "steps_api" },					
					tags = {"@api"},
					plugin= {"pretty", "html:target/cucumber"},
					monochrome = false)
public class TestRunnerAPI {

}
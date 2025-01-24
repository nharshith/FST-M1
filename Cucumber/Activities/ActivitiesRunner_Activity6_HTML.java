package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features",
		glue = {"stepDefinitions"},
		tags = "@activity5",
		plugin = {"html:target/cucumber-reports/index.html"},
	    monochrome = true
	)
public class ActivitiesRunner_Activity6_HTML {

}

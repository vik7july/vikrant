package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/Shopping.feature", glue = { "stepDefination" }
//,tags= {"@SmokeTests"}
		//, plugin = { "pretty", "html:target/cucumber-reports" }
        //, plugin = {"json:target/cucumber-reports/Cucumber.json"}
, plugin = {"pretty", "junit:target/cucumber-reports/Cucumber.xml",
		"json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports"}

// ,plugin= {"usage"},
// ,monochrome = true
// ,dryRun= true
)
public class TestRunner {

}

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "C:\\automation\\software\\Mavendummyproject\\src\\test\\resources\\features\\OrangeHRM.feature" }, // feature file or folder name
glue = {"stepdefinition"}
//,tags= "@SmokeTest" // from all feature files you want to execute a particular test cases use tags
,plugin = {"pretty","html:target/cucumber-reports.html"}
,monochrome = true
,publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}


package mx.sidlors.test.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Feature"
		,glue={"mx.sidlors.test.cucumber.step"}
		,monochrome = true
		,format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
		)
public class Runner {
 

}

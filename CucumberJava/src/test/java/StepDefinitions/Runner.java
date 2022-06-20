package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue = {"StepDefinitions"},
monochrome= true, plugin= {"pretty","html:target/HtmlReport","json:target/JSON reports/report.json","junit:target/JUnit reports/report.xml"}
,tags="@Smoketest"
		)
public class Runner {

}

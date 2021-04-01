package runnerPkg;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/Feature/"},
		glue ={"stepDefnition"},
		monochrome = true,
		tags = {},
		dryRun = false,
		plugin ={"pretty","html:target/cucumber1"}
		)

public class MainRunner {
	

}
//"jason:target/cucumber1.json","com.cucumber.listener.ExtentCucumberFromatter:target/report.html"
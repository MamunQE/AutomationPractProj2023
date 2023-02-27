package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/FeatureFile",
		monochrome=true,
		glue ={"StepDefination"},
		tags = "~@datadriven or ~@smoke or @register",
		plugin= {"pretty","json:target/cucumber-report.json","html:target/cucumber-report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class runTest extends AbstractTestNGCucumberTests{

}
	
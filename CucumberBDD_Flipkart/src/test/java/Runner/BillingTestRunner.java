package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/CucumberWorkspace/CucumberBDD_Flipkart/src/test/java/features/Billing.feature", // the path of the feature file
        glue = { "stepdefinition" }, // the path of the step def file
        plugin = { "pretty", "json:target/MyReports/report.json", "junit:target/MyReports/report.xml" } // test report
)
public class BillingTestRunner {

}

package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/CucumberWorkspace/CucumberBDD_Flipkart/src/test/java/features/Registeration.feature", // the path of the feature file
        glue = { "stepdefinition" }, // the path of the step def file
        plugin = { "pretty", "json:target/MyReports/report.json", "junit:target/MyReports/report.xml" }, // test report
        // publish = true
        monochrome = true, // display the console output in a proper readable format: NOT REQUUIRED FROM CUCUMBER 6
//        strict = true, // (default value= false)   Will fail execution if there are undefined or pending steps = DONT USE ANYMORE FROM CUCUMBER 6
        dryRun = false // (default value= false) Checks if all the steps have the step definition
)

public class UserRegisterationTestRunner {

}

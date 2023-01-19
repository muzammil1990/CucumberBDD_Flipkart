package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/CucumberWorkspace/CucumberBDD_Flipkart/src/test/java/features/Uber.feature", // the path of the feature file
        glue = { "stepdefinition" }, // the path of the step def file
        tags =   "@Smoke and @Regression",  
        plugin = { "pretty", "json:target/MyReports/report.json", "junit:target/MyReports/report.xml" }, //test report
//        publish = true
        monochrome = true, // display the console output in a proper readable format: NOT REQUUIRED FROM CUCUMBER 6
        strict = true, // (default value= false)   Will fail execution if there are undefined or pending steps = DONT USE ANYMORE FROM CUCUMBER 6
        dryRun = true // (default value= false) Checks if all the steps have the step definition
         )

public class UberTestRunner {
    // OR- tags = {"@Smoke , @Regression"} executes test/scenarios which are tagged as @SmokeTest or @RegressionTest or BOTH
//                  "@Regression or @Smoke"  =this syntax worked for naveen automation
    
 // AND- tags = {"@Smoke" , "@Regression"} executes test/scenarios which are tagged as @SmokeTest AND @RegressionTest
//                   "@Regression and @Smoke"  =this syntax worked for naveen automation
    
 // IGNORE(not)- tags = { ~@Smoke}
//                        "not @Smoke"  =this syntax worked for naveen automation
}                  

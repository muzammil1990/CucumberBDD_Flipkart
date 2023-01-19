package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\CucumberWorkspace\\CucumberBDD_Flipkart\\src\\test\\java\\features\\tagging.feature", // the path of the feature file
        glue = { "stepdefinition", "Hooks" }, // the path of the step def file, configured hooks package to run hooks before every scenario
        plugin = { "pretty", "html:test-output", "json:json-output/testreport.json", "junit:junit-output/testreport.xml" }, // to generate diff types of
        
//     plugin = { "pretty" } Prints the Gherkin source with additional colors and stack traces for errors
//      format = earlier used instead of plugin                                                                                                                    // reporting
//      publish = true
        
        monochrome = true, // display the console output in a proper readable format = NOT REQUUIRED FROM CUCUMBER 6
        strict = true, // (default value= false)   Will fail execution if there are undefined or pending steps = DONT USE ANYMORE FROM CUCUMBER 6
        dryRun = true, // (default value= false) Checks if all the steps have the step definition
//        tags = { "~@SmokeTest" ,"~@RegressionTest", "~@EndtoEnd" })
        tags = { "~@SmokeTest" ,"@RegressionTest" })                  //output ??
//      tags = { "@RegressionTest" } )                                //output ??
//      tags = { "~@SmokeTest" ,"~@RegressionTest", "@EndtoEnd" })    //output ??
public class TestRunner {
 
}

// OR : tags = {"@SmokeTest , @RegressionTest"} executes test/scenarios which are tagged as @SmokeTest or @RegressionTest or BOTH
// AND: tags = {"@SmokeTest" , "@RegressionTest"} executes test/scenarios which are tagged as @SmokeTest AND @RegressionTest

// IGNORE: tags = { ~@SmokeTest}

//IGNORE(not)- tags = { ~@Smoke}
//"not @Smoke"  =this syntax worked for naveen automation
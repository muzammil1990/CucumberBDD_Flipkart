/**
 * 
 */
package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 1. To create precondition only for first scenario; To create post condition only for first scenario
 * 
 * 2. tagged hooks: if you want to create precondition or post condition only for specific scenario we can use tagged hooks
 * 
 * 
 */
public class TaggedHooksStepDefinition {
    
    //multiple hooks can be associated.
    // Global Hooks- This is applicable for all the scenarios
    @Before(order = 0)  //first preference in global hooks
    public void launchBrowser() {
        System.out.println("launch chrome browser");
        System.out.println("Enter the URL for Free CRM webapp\n");
    }

    // Global Hooks- This is applicable for all the scenarios
    @After(order = 0)  //first preference in global hooks
    public void closeBrowser() {
        System.out.println("close the chrome browser");
    }

    // Global Hooks - This is applicable for all the scenarios
    @Before(order = 1)
    public void launchBrowser1() {
        System.out.println("launch firefox browser");
        System.out.println("Enter the URL for flipkart\n");
    }

    // Global Hooks - This is applicable for all the scenarios
    @After(order = 1)
    public void closeBrowser1() {
        System.out.println("close the firefox browser");
    }

    // local tagged hooks- only for first scenario
    // compare to TestNG- @BeforeMethod
    @Before("@First")
    public void beforeFirstScenario() {
        System.out.println("only for the first scenario- pre condition");
    }

    // local tagged hooks- only for first scenario
    // compare to TestNG- @AfterMethod
    @After("@First")
    public void afterFirstScenario() {
        System.out.println("only for the first scenario- post condition");
    }

    @Before("@Third")
    public void beforeThirdScenario() {
        System.out.println("only for the Third scenario- pre condition");
    }

    @After("@Third")
    public void afterThirdScenario() {
        System.out.println("only for the Third scenario- post condition");
    }

    @Given("^this is first step- first test case$")
    public void this_is_first_step_first_test_case() {
        System.out.println("first step");
    }

    @When("^this is second step- first test case$")
    public void this_is_second_step_first_test_case() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("2nd step");
    }

    @Then("^this is thirs step- first test case$")
    public void this_is_thirs_step_first_test_case() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("third step");
    }

}

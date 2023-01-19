
package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// * 1. Hooks are used in cucumber to define precondition and post conditions
//   2. Hooks can be defined in step defintion class , 
//    or can be written separately in configuration class.
//   3. Not a part of feature file
//   4. Will be executed before each scenario = @Before
//   5. Will be executed after each scenario = @After


public class HooksStepDefinition {
    // execution order :-
    
    // @Before = 
//    executes before scenario > Given, When, Then > @After all test steps scenario
    // if we have X scenarios then for every X scenarios , @Before annotation > Given When Then > @After annotation will run.

    


  @Before
  public void launchBrowser() {
      System.out.println("launch chrome browser");
      System.out.println("Enter the URL for Free CRM webapp\n");
  }

  @After
  public void closeBrowser() {
      System.out.println("close the browser");
  }

    @Given("^user is on deal page$")
    public void user_is_on_deal_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is on deal page");
    }

    @When("^user fills the deals form$")
    public void user_fills_the_deals_form() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user completed filling the deals form");
    }

    @Then("^deal is created$")
    public void deal_is_created() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Finally deal is created");
    }

    @Given("^user is on contact page$")
    public void user_is_on_contact_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is on contact page");
    }

    @When("^user fills contact details/form$")
    public void user_fills_contact_details_form() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user completes filling the contact forms");
    }

    @Then("^contact is created$")
    public void contact_is_created() {
        System.out.println("Finally contact is created");
    }

    @Given("^user is in mail page$")
    public void user_is_in_mail_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is in mail page");
    }

    @When("^user fills the mail page$")
    public void user_fills_the_mail_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters all details for the mail to be sent");
    }

    @Then("^mail is sent$")
    public void mail_is_sent() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Finally the mail is sent");
    }

}

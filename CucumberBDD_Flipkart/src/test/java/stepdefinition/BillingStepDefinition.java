package stepdefinition;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BillingStepDefinition {

    int billingAmount;
    double taxAmount;
    double finalAmount;

    @Given("^user is on billing amount$")
    public void user_is_on_billing_amount() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user enters billing amount (\\d+)$")
    public void user_enters_billing_amount(int billingAmount) {
        this.billingAmount = billingAmount;

    }

    @When("^user enters tax amount (\\d+)$")
    public void user_enters_tax_amount(double taxAmount) {

        this.taxAmount = taxAmount;
    }

    @When("^user clicks on calculate button$")
    public void user_clicks_on_calculate_button() {

    }

    @Then("^it gives the final amount (\\d+)$")
    public void it_gives_the_final_amount(double finalAmount) {
        this.finalAmount = this.billingAmount + this.taxAmount;
        Assert.assertTrue(this.finalAmount == finalAmount);
    }

}

package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UberBookingStepDefinition {

    @Given("^User wants to select a car type \"([^\"]*)\" from uber app$")
    public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User wants to select a car type " + carType);
    }

    @When("^user selects car \"([^\"]*)\" and pick up point \"([^\"]*)\" and drop location \"([^\"]*)\"$")
    public void user_selects_car_and_pick_up_point_and_drop_location(String carType, String pickup, String dropLocation) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user selects car" + carType + " " + pickup + " " + dropLocation);
    }

    @Then("^driver starts journey$")
    public void driver_starts_journey() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("driver starts journey");
    }

    @Then("^driver ends journey$")
    public void driver_ends_journey() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("driver ends journey");
    }

    @Then("^user pays (\\d+) USD$")
    public void user_pays_USD(int price) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user pays" + price);
    }

}

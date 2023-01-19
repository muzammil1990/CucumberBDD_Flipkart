package stepdefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// where to use datatable                                 Ans: Below line
//This step def file is to show datatable concept asList    = can be used where we need to fill some forms or maintain testdata
//Also datatable concepts asMaps                            = can be used where we need to fill some forms or maintain testdata
public class UserRegistrationStepDefinition {

    @Given("^user is on registration page$")
    public void user_is_on_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on registration page");
    }

    
 //datatable concept asList
    @When("^user enter the following data$")
    public void user_enter_the_following_data(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        
//        List<List<Object>> user= dataTable.asLists(Object.class);
        List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> e : userList) {
            System.out.println(e);
        }

    }
    
    
//  datatable concepts asMaps  
    @When("^user enter the following data with columns$")
    public void user_enter_the_following_data_with_columns(DataTable dataTable)  {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        
        List<Map<String, String>> userList=  dataTable.asMaps(String.class, String.class);
        
//            System.out.println(userList);
//            System.out.println(userList.get(1).get("Email"));
        
//        Set<Map.entry<K,V>> entry: map.entrySet(); for comparing now
        for(Map<String, String> e: userList){
            System.out.println(e.get("Firstname"));
            System.out.println(e.get("Lastname"));
            System.out.println(e.get("Email"));
            System.out.println(e.get("Phone"));
            System.out.println(e.get("City"));
            System.out.println();
        }
    }

    @Then("^user registration should be successful\\.$")
    public void user_registration_should_be_successful() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("user registration is successful");
    }
}

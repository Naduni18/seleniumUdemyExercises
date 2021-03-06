package StepDefinitions;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
 
	@Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() {
       System.out.println("abc");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) {
    	System.out.println(strArg1 + " and "+strArg2);
    }

  
    @When("User login into application2 with name1 and {int}")
    public void user_login_into_application2_with_name1_and(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    	 System.out.println(int1);
    }

    @When("User login into application2 with name2 and {int}")
    public void user_login_into_application2_with_name2_and(Integer int2) {
        // Write code here that turns the phrase above into concrete actions
    	 System.out.println(int2);
    }


   
    @Then("Cards are displayed false")
    public void cards_are_displayed_false() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(false);
    }

    @Then("Cards are displayed true")
    public void cards_are_displayed_true() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(true);
    }


    @Then("^Home page is populated$")
    public void home_page_is_populated() {
    	 System.out.println("abc");
    }
    

    @Then("^Cards are displayed$")
    public void cards_are_displayed() {
    	 System.out.println("abc");
    }

    @Then("^Cards are not displayed$")
    public void cards_are_not_displayed()  {
    	 System.out.println("abc");
    }


}

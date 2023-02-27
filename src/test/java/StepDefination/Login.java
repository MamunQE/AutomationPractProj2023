package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	@Given("User navigate to facebook home page")
	public void user_navigate_to_facebook_home_page() {
	 System.out.println("@Given--- User navigate to facebook home page");   
	}
	
	@When("User validate title of facebook home page")
	public void user_validate_title_of_facebook_home_page() {
		System.out.println("@When--- User validate title of facebook home page");    
	}

	@Then("User enter the {string} email or phone number")
	public void user_enter_the_email_or_phone_number(String username) {
		System.out.println("@Then---- User enter the "+username+" email or phone number");   
	}

	@Then("user enter the {string} password")
	public void user_enter_the_password(String password) {
		System.out.println("@Then ---user enter the "+password+" password");   
	}

	@Then("User click on logon button")
	public void user_click_on_logon_button() {
		System.out.println("@Then ---- User click on logon button");   
	}

	@And("User will be successfully loging to facebook website.")
	public void user_will_be_successfully_loging_to_facebook_website() {
		System.out.println("@And --User will be successfully loging to facebook website.");   
	}
	@And("User will be get the error message")
	public void user_will_be_get_the_error_message() {
		System.out.println("@And --User will be get the error message");   
	}
	
}

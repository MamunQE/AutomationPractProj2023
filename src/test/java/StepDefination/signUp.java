package StepDefination;
import static org.testng.Assert.fail;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import helper.loggerHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class signUp {
	//static Logger log=Logger.getLogger(signUp.class);
	
	 
	Logger log = loggerHelper.getLogger(signUp.class);
	
	@Then("Click on create new account link")
	public void click_on_create_new_account_link() throws Throwable {
     log.info("Before new link click");
     System.out.println("Test case passed");
     log.info("After new link click");
	}

	@Then("^User need to enter firstname and lastname$")
	public void user_need_to_enter_firstname_and_lastname() throws Throwable {
		
	}

	@And("^User need to enter email or mobile number$")
	public void user_need_to_enter_email_or_mobile_number() throws Throwable {

	}

	@And("^User need to enter new password$")
	public void user_need_to_enter_new_password() throws Throwable {
		throw new SkipException("Skiping the test case");
	}

	@And("^User need to select Dob$")
	public void user_need_to_select_dob() throws Throwable {

	}

	@And("^User need to select Gender$")
	public void user_need_to_select_gender() throws Throwable {
		
	}

	@Then("^Click on sign up link$")
	public void click_on_sign_up_link() throws Throwable {

	}

	@And("^verify user successfully regeistrated$")
	public void verify_user_successfully_regeistrated() throws Throwable {

	}

}

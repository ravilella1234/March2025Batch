package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{
	@Given("^The user navigates to the login page$")
	public void the_user_navigates_to_the_login_page() {
	   System.out.println(">> User has navigated to Login Page");
	}

	@When("The user enters valid email credentials (.+)")
	public void the_user_enters_valid_email_credentials(String userEmail) {
	    System.out.println(">> User has entered valid email credientials :" +  userEmail);
	}
	
	@When("The user enters valid email credentials {string}")
	public void the_user_enters_valid_email_credential(String userEmail) {
	    System.out.println(">> User has entered valid email credientials :" +  userEmail);
	}

	@And("Enter valid password (.+)")
	public void enter_valid_password(String userPassword) {
	    System.out.println(">> User has entered valid password :" + userPassword);
	}
	
	@And("Enter valid password {string}")
	public void enter_valid_passwords(String userPassword) {
	    System.out.println(">> User has entered valid password :" + userPassword);
	}

	@When("Clicks the login button")
	public void clicks_the_login_button() {
	   System.out.println(">> User has clicked on Login Button");
	}

	@Then("The user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
	   System.out.println(">> user has redirected to the dashboard");
	}

	@When("The user enters invalid email {string}")
	public void the_user_enters_invalid_email(String string) {
	   System.out.println(">> user has entered invalid email");
	   //int c = 9/0;
	}

	@When("Enter invalid password {string}")
	public void enter_invalid_password(String string) {
	    System.out.println(">> User has Entered invalid password");
	}

	@Then("An error message {string} should be displayed")
	public void an_error_message_should_be_displayed(String string) {
	   System.out.println(">> An error message has Displayed");
	}

	@Then("user should get proper warning message")
	public void user_should_get_proper_warning_message() {
	    System.out.println(">> user has got proper warning message ");
	}
}

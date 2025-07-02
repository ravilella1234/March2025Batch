package com.project;

import io.cucumber.java.en.Given;

public class ForgotPassword 
{
	@Given("The user navigates to the login page")
	public void the_user_navigates_to_the_login_page() {
	   System.out.println(">> User has navigated to Login Page from forgotpassword");
	}

}

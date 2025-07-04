package com.project;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class Registration 
{
	
	/*@Before("@register")
	public void setup()
	{
		System.out.println("++ Starting setup Before Hook");
	}
	
	@After("@register")
	public void killUp()
	{
		System.out.println("++ Ending killup After Hook");
	}*/
	
	
	/*@BeforeStep("@register")
	public void beforeStepSetup()
	{
		System.out.println("++ BeforeStep of each Step");
	}
	
	@AfterStep("@register")
	public void afterStepTeardown()
	{
		System.out.println("-- AfterStep of each Step");
	}*/
	
	
	/*@Before(value="@register or @login",order = 0)
	public void setupone()
	{
		System.out.println("++ BeforHook for SetUpOne");
	}
	
	@Before(value="@register or @login",order = 1)
	public void setuptwo()
	{
		System.out.println("++ BeforeHook for SetUpTwo");
	}
	
	@Before(value="@register or @login",order = 2)
	public void setupthree()
	{
		System.out.println("++ BeforeHook for SetUpThree");
	}
	
	@After(value="@register or @login",order = 2)
	public void teardownone()
	{
		System.out.println("-- AferHook for teardownOne");
	}
	
	@After(value="@register or @login",order = 1)
	public void teardownTwo()
	{
		System.out.println("-- AfterHook for teardownTwo");
	}
	
	@After(value="@register@login",order = 0)
	public void teardownThree()
	{
		System.out.println("-- AfterHook for teardownThree");
	}*/
	
	
	
	@Before("@all")
	public void setup(Scenario scenario)
	{
		System.out.println("++ Starting setup Before Hook :"+ scenario.getName());
	}
	
	@After("@all")
	public void killUp(Scenario scenario)
	{
		System.out.println("-- Ending killup After Hook :" +  scenario.getStatus());
	}
	
	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
	   System.out.println(">> User has navigated to Register Account page");
	}


	@When("Enters lastname {string} into the Last Name field")
	public void enters_lastname_into_the_last_name_field(String string) {
	    System.out.println(">> User has Entered lastname into the Last Name field");
	}

	@When("Enters email address {string} into the Email field")
	public void enters_email_address_into_the_email_field(String string) {
	   System.out.println("User has Entered email address  into the Email field");
	}

	@When("Enters telephone {string} into the Telephone field")
	public void enters_telephone_into_the_telephone_field(String string) {
	   System.out.println(">> User has Entered telephone into the Telephone field");
	}

	@When("Enters password {string} into the Password field")
	public void enters_password_into_the_password_field(String string) {
	    System.out.println(">> User has Entered password into the Password field");
	}

	@When("Enters password {string} into the Password Confirm field")
	public void enters_password_into_the_password_confirm_field(String string) {
	  System.out.println(">> User has Enters password into the Password Confirm field");
	}

	@When("Selects Privacy Policy field")
	public void selects_privacy_policy_field() {
	    System.out.println(">> User has allowd to Select Privacy Policy field");
	}

	@When("Click on Continue button")
	public void click_on_continue_button() {
		System.out.println(">> User has allowd to Click on Continue button");   
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
	   System.out.println(">> Account has successfully created");
	}

	@When("User enters first name {string} into the First Name field")
	public void user_enters_first_name_into_the_first_name_field(String string) {
	    System.out.println(">> User has entered first name into the First Name field");
	}

	@When("Selects Yes for Newsletter")
	public void selects_yes_for_newsletter() {
	    System.out.println(">> User allowed to Selects Yes for Newsletter");
	}

	
	@When("User don’t enter details into any fields")
	public void user_don_t_enter_details_into_any_fields() {
	    System.out.println(">> User don’t enter details into any fields");
	}

	@Then("Warning messages should be displayed for all the mandatory fields")
	public void warning_messages_should_be_displayed_for_all_the_mandatory_fields() {
	    System.out.println(">> Warning messages is displayed for all the mandatory fields");
	}


}

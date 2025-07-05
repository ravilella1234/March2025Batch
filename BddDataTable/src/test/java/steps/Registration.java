package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration 
{
	
	
	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
	   System.out.println(">> User has navigated to Register Account page");
	}

	@When("User enters below details into fields")
	public void user_enters_below_details_into_fields(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap(String.class,String.class);
		
		System.out.println("User has entered the firstname : " + map.get("firstname"));
		System.out.println("User has entered the lastname : " + map.get("lastname"));
		System.out.println("User has entered the email : " + map.get("email"));
		System.out.println("User has entered the telephone : " + map.get("telephone"));
		System.out.println("User has entered the password : " + map.get("password"));
		System.out.println("User has entered the confirm password : " + map.get("password"));
	}
	

	@When("User enters below details into fields without columns")
	public void user_enters_below_details_into_fields_without_columns(DataTable dataTable) {
		List<List<String>> userlist = dataTable.asLists(String.class);
		for(List<String> ul : userlist)
		{
			System.out.println(ul);
		}
	}

	@When("User enters below details into fields with columns")
	public void user_enters_below_details_into_fields_with_columns(DataTable dataTable) {
		List<Map<String, String>> userlist = dataTable.asMaps(String.class,String.class);
		
		//System.out.println(userlist);
		//System.out.println(userlist.get(0).get("firstname"));
		
		for(Map<String, String> e:userlist)
		{
			System.out.println(e.get("firstname"));
			System.out.println(e.get("lastname"));
			System.out.println(e.get("email"));
			System.out.println(e.get("telephone"));
			System.out.println(e.get("password"));
		}
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

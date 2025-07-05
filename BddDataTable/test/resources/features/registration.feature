@all
Feature: User Registration


Scenario: Register with mandatory fields
	Given User navigates to Register Account page
	When User enters below details into fields
	|firstname|ravikanth|
	|lastname|lella|
	|email|ravilella@gmail.com|
	|telephone|9876543210|
	|password|123456|
	And Selects Privacy Policy field
	And Click on Continue button
	Then Account should get successfully created


Scenario: Register with mandatory fields
	Given User navigates to Register Account page
	When User enters below details into fields without columns
	|ravikanth1|lella1|ravilella1@gmail.com|9876543210|123456|
	|ravikanth2|lella2|ravilella2@gmail.com|9876543210|223457|
	|ravikanth3|lella3|ravilella3@gmail.com|9876543210|323458|
	
	And Selects Privacy Policy field
	And Click on Continue button
	Then Account should get successfully created
	
	
Scenario: Register with mandatory fields
	Given User navigates to Register Account page
	When User enters below details into fields with columns
	|firstname |lastname|email               |telephone |password|
	|ravikanth1|lella1  |ravilella1@gmail.com|9876543210|123456  |
	|ravikanth2|lella2  |ravilella2@gmail.com|9876543210|223457  |
	|ravikanth3|lella3  |ravilella3@gmail.com|9876543210|323458  |
	
	And Selects Privacy Policy field
	And Click on Continue button
	Then Account should get successfully created
	

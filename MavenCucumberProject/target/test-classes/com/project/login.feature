@all
Feature: User Login
  As a user, I want to log in to the application so that I can access my account.
  
Background:
	Given The user navigates to the login page   


 #Scenario: Successful login with valid credentials   
  #  When The user enters valid email credentials "ravilella@gmail.com"
   # And Enter valid password "123456"
    #And Clicks the login button
    #Then The user should be redirected to the dashboard

@login @validcredentials @smoke @regression @wip
 Scenario Outline: Successful login with valid credentials   
    When The user enters valid email credentials "<user>"
    And Enter valid password "<password>"
    And Clicks the login button
    Then The user should be redirected to the dashboard
    
Examples:
|user   |password|
|user1  |pass1   |
|user2  |pass2   |
|user3  |pass3   |

@login @invalidcredentials  @smoke @regression
  Scenario: Login attempt with invalid credentials  
    When The user enters invalid email "ravilella@gmail.com"
    And Enter invalid password "123456"
    And Clicks the login button  
    Then An error message "Invalid username or password" should be displayed  

@login @invaliduserandvalidpassword @regression @dev
  Scenario: Login with invalid user and valid password credentials    
    When The user enters invalid email "ravilella@gmail.com"
    And Enter valid password "123456"
    And Clicks the login button  
    Then user should get proper warning message

@login @validuserandinvalidpassword @regression
  Scenario: Login with valid user and invalid password credentials  
    When The user enters valid email credentials "ravilella@gmail.com"
    And Enter invalid password "123456"
    And Clicks the login button  
    Then user should get proper warning message
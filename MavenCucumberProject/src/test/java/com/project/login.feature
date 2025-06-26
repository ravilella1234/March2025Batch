Feature: User Login
  As a user, I want to log in to the application so that I can access my account.
  
Background:
	Given The user navigates to the login page   

Scenario: Successful login with valid credentials   
    When The user enters valid email credentials "ravilella@gmail.com"
    And Enter valid password "123456"
    And Clicks the login button  
    Then The user should be redirected to the dashboard  

  Scenario: Login attempt with invalid credentials  
    When The user enters invalid email "ravilella@gmail.com"
    And Enter invalid password "123456"
    And Clicks the login button  
    Then An error message "Invalid username or password" should be displayed  

  Scenario: Login with invalid user and valid password credentials    
    When The user enters invalid email "ravilella@gmail.com"
    And Enter valid password "123456"
    And Clicks the login button  
    Then user should get proper warning message

  Scenario: Login with valid user and invalid password credentials  
    When The user enters valid email credentials "ravilella@gmail.com"
    And Enter invalid password "123456"
    And Clicks the login button  
    Then user should get proper warning message
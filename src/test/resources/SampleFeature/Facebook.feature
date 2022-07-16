Feature: Validation of login page in Facebook Web Application

@Smoketest
Scenario: TC01_Valication of Error message in Facebook login page when user enter invalid credentials
Given user launch Facebook Web Application
When user enter invalid username and invalid password 
And clicks login button
Then user verify error message is displayed or not


Scenario: TC02_Validation of create new account block
Given user launch Facebook Web Application
When user clicks create new account button
Then user verify sign up text is displayed


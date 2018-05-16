@loginTest
Feature: To test login functions are working
I want to run login tests.

@validTest
Scenario: Valid Login

Given navigate to assignforce page
When user logged in with credentials
Then home page should be displayed

@invalidTest
Scenario: Invalid Login

Given navigate to login page
When user logged in with incorrect credentials
Then error message appears

@forgotTest
Scenario: Forgot Password

Given navigate to login
When user click forgot password button
Then redirects to forgot password page
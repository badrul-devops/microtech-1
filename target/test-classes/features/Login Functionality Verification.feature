Feature: Login Functionality Verification

Scenario: Login as a Customer 
Given I am in Landing Home Page
When I Click on Login
Then I will be in Login Page
And Click Customer Login
Then I enter User Id "david@gmail.com"
And I enter Password "1234"
When I click Login Button
Then I will see Customer Home Page
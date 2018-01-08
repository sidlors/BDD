Feature: Login feature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to ExecuteAutomation Web Site login page
    And I enter username as "admin" and password as "adminpass"
    And I click login button
    And I should see the userform page

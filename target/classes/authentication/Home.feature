@HOME
Feature: Free CRM Application Test

  @Login_Test
  Scenario: Validate Free CRM Home Page Test
    Given user opens browser
    Then user is on login page
    Then user enters username and password
    Then user clicks on login button
    Then home page is displayed

@login
Feature: Test login functionality

  @connexion_ok
  Scenario: Check login is successful with valid credentials
    Given browser is open
    When user enters username  "Raghav"
    And user enters password "12345"
    And Je clique sur le bouton login
    Then Je me redirige vers la page home

    
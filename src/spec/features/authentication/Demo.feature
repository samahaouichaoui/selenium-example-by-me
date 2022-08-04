
Feature: Registration in MecuryFlight site

  Background: 
    Given I've a valid set of data and access

  @Registration
  Scenario: Single User Registration process
    When Registration page Display
    Then enter valid Data
    Then Click on Submit
    Then Click signoff
    And Close

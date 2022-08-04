@UATTesting2
Feature: Youtube Channel name validation

  Scenario: Youtube Channel name validations
    Given Open Chrome browser with URL
    When Search selenium tutorial
    And Click on channel name
    Then Validate channel name

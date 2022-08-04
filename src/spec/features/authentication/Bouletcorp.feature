@Auth
Feature: feature to connect to website Bouletcorp

  @Connexion
  Scenario: Validate Bouletcorp  is working
    Given I connect to website
    When I click buton aleatoire
    Then check link facebook
    And check link twitter
    And check link tumblr

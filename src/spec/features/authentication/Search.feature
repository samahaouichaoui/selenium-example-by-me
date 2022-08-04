@Search
Feature: Ebay Search

  @Search_ok
  Scenario: Search a Product
    Given I have a search field on Ebay Page
    When I search for a product with name "Apple MacBook Pro"
    Then Click on button Search

Feature: Amazon Search

@amazon
  Scenario: TC01_users search the products
    Given user goes to the amazon page
    And user writes iphone to the search box
    Then user writes the result number to the screen
Feature: Search Page

  Scenario Outline: User can search product
    Given Navigate search bar
    When I input keyword <product>
    And I click button search
    Then I have search result

    Examples: 
      | product  | 
      | ball |
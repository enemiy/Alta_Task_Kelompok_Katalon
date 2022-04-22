Feature: Detail Product

  Scenario Outline: As a User i want to see the detail product
    Given Navigate to product
    When I click the product
    Then I can see the detail product
    
    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
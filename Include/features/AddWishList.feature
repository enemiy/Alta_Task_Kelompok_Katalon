Feature: Add Wishlist

  Scenario Outline: User can add product to wishlist
    Given Navigate to detail product
    When I select material 
    And I click color
    And I click button add to wishlist
    Then I can successfuly add product to wishlist

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |

Feature: Delete Wishlist

  Scenario Outline: Success delete wishlist
    Given User navigate to wishlist page
    When User click delete icon
    Then User can see empty wishlist

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |

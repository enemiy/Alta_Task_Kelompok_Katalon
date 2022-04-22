Feature: Email Your Wishlist to A Friend

  Scenario Outline: Success sent wishlist to friend email
    Given User go to to wishlist page
    When User click view wishlist button
    And User click email a friend button
    And User enter friend email <friendemail>
    And User enter personal message <personalmsg>
    And Click on send button
    Then User can see success sent message

    Examples: 
      | friendemail   | personalmsg                |
      | bia@gmail.com | Hi bia, here's my wishlist |

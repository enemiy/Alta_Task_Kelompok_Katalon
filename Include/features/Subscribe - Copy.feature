Feature: Subscribe Feature

  Scenario Outline: User can subscribe newsletter
    Given User on Home page
    When User fill <email> subscribing newsletter
    And user click subscribe and submit
    Then User success to subscribe newsletter

    Examples: 
      | email           |
      | ihsan@gmail.com |

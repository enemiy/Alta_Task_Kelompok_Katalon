Feature: Unsubscribe Feature

  Scenario Outline: User can unsubscribe Newsletter
    Given User on Home Page
    When User fill <email> unsubscribing newsletter
    And user click unsubscribe and submit
    Then User success to unsubscribe newsletter

    Examples: 
      | email           |
      | ihsan@gmail.com |

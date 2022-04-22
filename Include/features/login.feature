Feature: Login Page

  Scenario Outline: User can Login with valid data
    Given Navigate to login page
    When I input valid username <username>
    And I input valid password <password>
    And I click button login
    Then I can successfully login

    Examples: 
      | username  | password |
      | hhh | Hahahi_123 |
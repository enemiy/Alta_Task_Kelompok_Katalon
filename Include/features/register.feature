Feature: Register akun

  Scenario Outline: User can create new account with register
    Given I am on login page
    When I click register button
    And I check female on gender
    And I fill first name <f_name>
    And I fill last name <last_name>
    And I select day birth <day_birth>
    And I select month birth <month>
    And I select years <years>
    And I fill email <email>
    And I fill username <username>
    And I fill pass <pass>
    And I fill confirmpass <confirmpass>
    And I fill company <company>
    And I click submit register
    Then I successfully register

    Examples: 
      | f_name  | last_name | day_birth | month  | years | email  | username | pass | confirmpass  | company | 
      | nanda | Ra | 15 | 12 | 2001 | hah@heh.com  | hahehoo | haheho_123  | haheho_123 | alta |

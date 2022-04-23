Feature: Change Password

  Scenario Outline: Success change password
    Given User navigate to myaccount page
    When User click change password menu
    And User enter old password <oldpassword>
    And User enter new password <newpassword>
    And User enter confirm password <confirmpassword>
    And Click on change password button
    Then User can see password changed message

    Examples: 
      | oldpassword | newpassword | confirmpassword |
      | Hahahi_123   | Salsa123!   | Salsa123!       |

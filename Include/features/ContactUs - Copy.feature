Feature: ContactUs Feature

  Scenario Outline: User can send enquiry to admin
    Given User on home page
    And User click menu contact us
    When User input <name> and <email> and <enquiry>
    And click Submit button
    Then User success to send enquery form

    Examples: 
      | name  | email           | enquiry       |
      | ihsan | ihsan@gmail.com | test eenquery |

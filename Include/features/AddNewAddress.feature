Feature: Add New Address Feature

  Scenario Outline: Add new address with valid data
    Given User navigate to my account page
    When User click addresses menu
    And User click add new
    And User enter first name <firstname>
    And User enter last name <lastname>
    And User enter address1 <address1>
    And User enter city <city>
    And User enter postal code <postalcode>
    And User select country <country>
    And User enter phone number <phonenumber>
    And Click on save button
    Then User can see list of addresses

    Examples: 
      | firstname | lastname | address1 | city     | postalcode | country   | phonenumber  |
      | salsa     | bila     | semarang | semarang |      11223 | Indonesia | 085226554334 |

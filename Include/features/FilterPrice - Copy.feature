Feature: Filter Price Feature

  Scenario: User can filter items with the price filter
    Given User in home page
    And User click Soccer Category
    When User click Filter UpTo100
    Then The shop showing item with the price UpTo100


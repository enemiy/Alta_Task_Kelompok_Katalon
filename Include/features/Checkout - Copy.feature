Feature: Checkout Feature

  Scenario Outline: Test Add product to checkout
    Given user selects item
    When User click product 
    And Click on Add To Cart button
    Then Click on Checkout button

  Examples:
			| username | password |
			| Riqah 	 | Suga123  |
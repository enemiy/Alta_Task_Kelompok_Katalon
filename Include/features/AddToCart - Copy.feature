Feature: Add To Cart Feature

	Scenario Outline: Test Add product to cart
		Given User click items
		When User selects the item type
		And Click on color button
		Then Click on button Add To Cart
		
		Examples:
			| username | password |
			| Riqah 	 | Suga123  |
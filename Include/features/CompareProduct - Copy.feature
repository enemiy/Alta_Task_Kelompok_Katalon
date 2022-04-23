Feature: Compare Product Feature

	Scenario Outline: Test Add product to compare
		When User click item
		And Click on compare button
		Then User is navigated to compare product

	Examples:
			| username | password |
			| Riqah 	 | Suga123  |
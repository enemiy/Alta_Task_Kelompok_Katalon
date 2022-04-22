Feature: FilterAvailability Feature
  
  Scenario Outline: Test Filter with Availability 
		Given User on the click Fashion Category
		When User click dropdown availability
		And Click include out of stock
		Then User is navigated to filter by stock availability
		
	Examples:
			| username | password |
			| chezta88 | Bandung2022	|
	

	

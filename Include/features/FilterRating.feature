Feature: FilterRating Feature
  
  Scenario Outline: Test Filter with Rating 
		Given User on the click Book Category
		When Click filter rating stars
		And User click view show product
		Then User is navigated to filter rating
		
	Examples:
			| username | password |
			| chezta88 | Bandung2022	|
	

	

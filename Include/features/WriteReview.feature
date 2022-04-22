Feature: WriteReview Feature
  
  Scenario Outline: Write Review with Text 
		Given Navigate watches category
		When User click select product watches
		And Click tab review
		And Click write review
		And I input review product watches
		And Click submit review
		Then User has write review product
		
	Examples:
			| username | password |
			| chezta88 | Bandung2022	|
	

	

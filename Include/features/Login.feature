Feature: Login Feature
	
	Scenario Outline: Test login with valid credentials
		Given User navigate to login page 
		When User enters <username> and <password>
		And Click on login button
		Then User is navigated to homepage

	Examples:
			| username | password |
			| chezta88 | Bandung2022	|

Feature: Edit Profile Feature

  Scenario Outline: Test Edit to profile 
    Given User click profile button 
    When Click My Account button
    And User field Firstname
    And User field Lastname
    And User checklist Newsletter
    Then Click on Submit button
    
    Examples:
			| username | password |
			| Riqah 	 | Suga123  |
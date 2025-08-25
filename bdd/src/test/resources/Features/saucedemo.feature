Feature: End to End Functionality
 
 
 @regression
 
 Scenario: Login and End To End validation
 
 	Given User is on the login page
	 
	When user enters the username
	
	When user enters the password

	And user clicks on the login button
	
	And user is naqvigated to home page
	
	And user select product and adds to cart
	
	And user clicks on add to cart icon
	
	And user clicks on the checkout button
	
	And user enter firstname
	
	And user enter lastname
	
	And user enters the zip code
	
	And user clicks on the continue button
	
	Then user clicks on the finish button
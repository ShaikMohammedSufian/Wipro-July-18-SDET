Feature: Login Functionality

 

    
#Background: Given User is on the login page
 

 
@regression
  
Scenario: Verify the login functionality for valid credentials
  Given User is on the login page
   
  When user enters the username
   
  And user enters the password
  
  And user clicks on the login button
  
  Then user is naqvigated to home page 
  
  
  
 #@Regression
 #Scenario: Login fail with wrong details
   
  #  When user enters the username
    
   # And user enter invalid password
    
    #And user clicks on the login button
    
    #Then error message Invalid credentials will show

#@sanity

#Scenario Outline: Verify the login functionality for valid credentials using parameters


	#Given User is on the login page
	 
	#When user enters the "<username>" and "<password>"

	#And user clicks on the login button	

	#Then user is naqvigated to home page 

	#Examples:

	#|username| password |

	#|Admin | admin123 |

	#|Admin | admin123 |

	#|Admin | admin1234 |
 
    
    
  #  @Sanity
#Scenario: Login with multiple users
	# Given User is on the login page
	# When user enters credentials
     # | username | password  |
     # | Admin    | admin123  |  
     #And user clicks on the login button	
	#Then user is naqvigated to home page
	
	
	
	
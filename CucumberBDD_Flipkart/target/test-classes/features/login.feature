Feature: Flipkart Login 

#Scenario: Flipkart LoginTest scenario

#Given User is already present in login page
#When title of the page is Online shopping site for mobiles, electronics, Furniture, Grocery, Lifestyle Books & More
#Then user enters username and password
#Then user clicks on login button
#Then user is in home page



#with Examples keyword- Data Driven Testing is achieved
Scenario Outline: Flipkart LoginTest scenario 

	Given User is already present in login page 
	When title of the page is Online shopping site for mobiles, electronics, Furniture, Grocery, Lifestyle Books & More 
	Then user enters "<username>" and "<password>" 
	Then user clicks on login button 
	Then user is in home page 
	Then close the browser 
	
	Examples: 
		|username|password|
		|muzammilchoudhury@yahoo.com|sonulove143|
		|shahnazyasmin98@gmail.com|@@@shona@@@|
		
		
	
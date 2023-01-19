Feature: Select Mobile 

#with Examples keyword- Data Driven Approach
Scenario Outline: Select motorola G10 Power mobile 

	Given User is already present in login page 
	When title of the page is Online shopping site for mobiles, electronics, Furniture, Grocery, Lifestyle Books & More 
	Then user enters "<username>" and "<password>" 
	Then user clicks on login button 
	Then user is in home page 
	Then user selects mobile in menu option 
	Then user clicks on motorolla phone ad 
	Then user selects specific model 
	Then close the browser 
	
	Examples: 
		|username|password|
		|muzammilchoudhury@yahoo.com|sonulove143|
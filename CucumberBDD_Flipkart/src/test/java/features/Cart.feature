Feature: Cart 

#with Datatables as maps - Data Driven Approach
Scenario: To add the address in cart 

	Given User is already present in login page 
	When title of the page is Online shopping site for mobiles, electronics, Furniture, Grocery, Lifestyle Books & More 
	Then user enters username and password 
		|muzammilchoudhury@yahoo.com|sonulove143|
	Then user clicks on login button 
	Then user is in home page 
	Then user selects mobile in menu option 
	Then user clicks on motorolla phone ad 
	Then user selects specific model 
	Then click on buy now to add model in cart 
	Then add the new address in cart 
	Then close the browser 

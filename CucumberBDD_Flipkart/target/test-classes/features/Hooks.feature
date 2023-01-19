Feature: Free CRM App Test 

Scenario: Test the Deal page 
	Given user is on deal page 
	When user fills the deals form 
	Then deal is created 
	
Scenario: Create contact test 
	Given user is on contact page 
	When user fills contact details/form 
	Then contact is created 
	
Scenario Outline: Send the mail test 

	Given user is in mail page 
	When user fills the mail page 
	Then mail is sent 
	
	Examples: 
		|To|Subject|Body|
		|muzammil.1990@hotmail.com|Test the mail feature|Hello am a mail body|
		|muzammil.c1990@gmail.com|Test the mail feature in gmail|Hello am a mail body for gmail|
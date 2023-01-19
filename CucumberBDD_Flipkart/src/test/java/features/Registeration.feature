#This feature file is to show datatable concept asList
# Also datatable concepts asMaps

Feature: User Registrtion

Scenario: user registation with different data
Given user is on registration page
When user enter the following data
|muzammil|choudhury|muzammil.1990@hotmail.com|9880|Bangalore|
|ruhul|choudhury|ruhulamin@gmail.com|8888|Pune|
|sonu|yasmin|sonu@gmail.com|6666|Masoorie|
Then user registration should be successful.

#====================================================================================================
#Given user on the user registration page
#And valid e-mail address 
#And valid password 
#And valid confirmation password 
#And valid Birth-date 
#And valid Gender 
#And valid phone number 
#Then user registration should be successful 


#In the above feature file, we can see that it looks a bit complex at first glance due to using "And" multiple times.
# So, to reduce such type of complexity, we can use "Data Table."
#======================================================================================================

# Also Datatable concepts asMaps
Scenario: user registation with different data with column
Given user is on registration page
When user enter the following data with columns
|Firstname|Lastname|Email|Phone|City|
|muzammil|choudhury|muzammil.1990@hotmail.com|9880|Bangalore|
|ruhul|choudhury|ruhulamin@gmail.com|8888|Pune|
|sonu|yasmin|sonu@gmail.com|6666|Masoorie|
Then user registration should be successful.
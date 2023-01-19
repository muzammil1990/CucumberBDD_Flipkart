#this feature is used for tagging functionality
@All
Feature: Uber Booking Feature

@Smoke
Scenario: Booking cab sedan
Given User wants to select a car type "sedan" from uber app
When user selects car "sedan" and pick up point "Bangalore" and drop location "Pune"
Then driver starts journey
And driver ends journey
Then user pays 1000 USD

@Regression
Scenario: Booking cab suv
Given User wants to select a car type "suv" from uber app
When user selects car "suv" and pick up point "Bangalore" and drop location "Hyderabad"
Then driver starts journey
And driver ends journey
Then user pays 1000 USD

@EndToEnd
Scenario: Booking cab mini
Given User wants to select a car type "mini" from uber app
When user selects car "mini" and pick up point "Mumbai" and drop location "Agra"
Then driver starts journey
And driver ends journey
Then user pays 1000 USD

@Regression @Smoke
Scenario: Booking cab suv2
Given User wants to select a car type "suv2" from uber app
When user selects car "suv2" and pick up point "kanpur" and drop location "chennai"
Then driver starts journey
And driver ends journey
Then user pays 1000 USD
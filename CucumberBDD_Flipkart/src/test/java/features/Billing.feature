#Data driven testing with scenario outline and examples keyword.

Feature: Calculate billing amount

Scenario Outline: Billing Amount
Given user is on billing amount
When user enters billing amount <billingamount>
When user enters tax amount <taxamount>
And user clicks on calculate button
Then it gives the final amount <finalamount>

Examples:
	|billingamount|taxamount|finalamount|
	|1000|10|1010|
	|500|20|520|
	|100|5.5|105.5|
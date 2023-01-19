@FunctionalTest 
Feature: Free Crm Testing 

@SmokeTest @RegressionTest 
Scenario: Login with valid username and password 
	Given This is a valid login test 
	
@RegressionTest 
Scenario: Login with invalid username and password 
	Given This is a invalid login test 
	
@SmokeTest 
Scenario: Create a contact 
	Given This is a contact test case 
	
@SmokeTest @RegressionTest 
Scenario: Create a deal 
	Given This is a deal test case 
	
@RegressionTest 
Scenario: Create a task 
	Given This is a task test case 
	
@SmokeTest 
Scenario: Create a case 
	Given This is a case test case 
	
@SmokeTest 
Scenario: Search a deal 
	Given This is a Search deal test case 
	
@SmokeTest @RegressionTest 
Scenario: Search a contact 
	Given This is a search contact test case 
	
@SmokeTest @RegressionTest 
Scenario: Search a case 
	Given This is a Search case test case 
	
@SmokeTest @RegressionTest 
Scenario: Search a task 
	Given This is a Search task test case 
	
@SmokeTest @EndtoEnd 
Scenario: Search a call 
	Given This is a Search call test case 
	
@SmokeTest @EndtoEnd 
Scenario: Search a email 
	Given This is a Search email test case 
	
@SmokeTest @EndtoEnd 
Scenario: Search a docs 
	Given This is a Search docs test case 
	
@SmokeTest @EndtoEnd 
Scenario: Search a forms 
	Given This is a Search forms test case 
	
@EndtoEnd 
Scenario: Search a company 
	Given This is a Search company test case 
	
@EndtoEnd 
Scenario: Application logout 
	Given This is a logout test case 
	
Scenario: Close browser 
	Given This is a clsoing the browser test case 
	
	
	

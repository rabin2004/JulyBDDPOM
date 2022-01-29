#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login functionality
Registered user should be able to login by providing valid credentials.

Scenario Outline: Positive login functionality test
Given user is in homepage
When user enters valid "<username>" and valid "<password>"
And click submit button
Then user should be able to login

Examples:
|username|password|
|test|123|
|test12|123|
|test123|123|

Scenario Outline: Negative login functionality test with invalid username and invalid password
Given user is in homepage
When user enters invalid "<username>" and invalid "<password>"
And click submit button
Then user should not be able to login

Examples:
|username|password|
|tommy123|12345|
|danny12|123|
|mike123|1234|




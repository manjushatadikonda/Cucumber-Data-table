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
@tag
Feature: Data Table example
  @tag1
  Scenario: Form filling with Data Table
    Given user is on form filling page
    And fill the form with below user details
   |Firstname	  |Firstname1     |			      
   |Middlename	|Middlename1    |
   |Lastname	  |Lastname1      |
   |Course	    |BBA	          |
   |Gender      |male	          |
   |Phone	      |9876543210     |
   |Address	    |Address1       |
   |Email	      |email1@gmail.com|
   |Password  	|Password1      |
   |Re-Password |Password1      |
    When I click on submit
    Then it return to thank you page
    


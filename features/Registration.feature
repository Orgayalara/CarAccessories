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
Feature: User Registration

@tag1
  Scenario: new user registration with valid information
    Given a potential customer visits the car accessories sales and installation application
    When the user wishes to create a new account
    And the user provides the following valid information:
      | Full Name     | AYA AWWAD       |
      | Email Address | AYA@example.com |
      | Password      | securePassword  |
      | Contact Number| 521-476-5689    |
      | Shipping Address | 123 Main St, City, Country |
    And submits the registration form
    Then the system should Display a success message
    
    @tag2
    Scenario: New user registration with invalid information
    Given a potential customer visits the car accessories sales and installation application
    When the user wishes to create a new account
    And the user provides the following invalid information:
      | Full Name     | aya        |
      | Email Address | aya.com |
      | Password      | securePassword  |
      | Contact Number| 1-456-78  |
      | Shipping Address |  Main St, City|
    And submits the registration form
    Then the system should Display an error message
    
    @tag3
     Scenario: Registration with an Already Registered Email
    Given a potential customer visits the car accessories sales and installation application
    When the user wishes to create a new account
    And the user provides the following information:
      | Full Name     | ahmed waleed   |
      | Email Address | ahmed@example.com |
      | Password      | strongPassword  |
    And there is an existing user account with the email "ahmed@example.com"
    And submits the registration form
    Then the system should Display an error message indicating that the email address is already registered
     
    

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
Feature: Application login

  @tag1
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "username" and "password"
    Then Home page is populated
    And Cards are displayed

  @tag1
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "username" and "password"
    Then Home page is populated
    And Cards are not displayed

     @tag2
  Scenario Outline: Home page default login
    Given User is on NetBanking landing page 
    When User login into application2 with <username1> and <password1>
    Then Cards are displayed <status> 

    Examples: 
      | username1  | password1 | status |
      | name1      |      5555 | true   |
      | name2      |      7777 | false  |
      
      
      
      
      
      
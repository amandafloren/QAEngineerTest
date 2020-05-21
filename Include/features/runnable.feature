#Author: amandafloren11@gmail.com

@tag
Feature: User can use Gist Features

@tag1
  Scenario: As a user i want to create public Gist
    Given User access Git
    When User add new Public Gist
    Then Back to page overview
    
@tag2
  Scenario: As a user, I want to edit an existing gist
    When User edit an existing Gist
    Then Back to page overview
    
@tag
  Scenario: As a user, I want to delete an existing Gist
    When User delete an existing Gist
    Then Gist deleted successfully
    
@tag   
  Scenario: As a user, I want to see my list of Gists
    When User see lists of their Gists
    Then Show all Gists
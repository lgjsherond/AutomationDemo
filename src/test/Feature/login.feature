#This is my fire practival BDD
#
Feature: Check the login functionalities

  @regression
  Scenario: Check the login redirect to home page

    Given user is on login page
    When user enter username and password
    And click on login button
    Then user is navigate to home page

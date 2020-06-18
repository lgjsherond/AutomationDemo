Feature: Test login functionality
  Scenario Outline: Check the login is succesful
    Given Chrome is open
    And user is on test login page
    When user is enters <username> and <password>
    Then user is on home page


    Examples:
    |username|password|
    |Sheron|12345|
    |Niresh|12345|
    |Deva  |12345|

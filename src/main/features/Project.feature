Feature: Login

  Background: user open the web
    Given user open the application
    When user click Don't Allow button
    And user click Continue with more options menu
    And user click Login with Email button
    Then user click none of the above button
    When user input email "pador54207@iturchia.com"
    And user input password "pador54207!"
    Then user click on login button

  Scenario: User create project with valid credential
    Given user click three row icon
    When user click add project icon
    And user enter "project satu" for project name
    And user click Done button
    Then the project name is display

  Scenario: User create Project and Mark as Favorite
    Given user click three row icon
    When user click add project icon
    And user enter "project satu" for project name
    And user swipe the favorite button
    And user click Done button
    Then the project name is display

  Scenario: User create Project with Parent Project
    Given user click three row icon
    When user click add project icon
    And user enter "project satu" for project name
    Then user click parent project option
    And user select parent project
    And user click Done button
    Then the project name is display

  Scenario: User create Project with Unique name
    Given user click three row icon
    When user click add project icon
    And user enter "˚₊‧꒰ა ☆ ໒꒱ ‧₊˚" for project name
    And user click Done button
    Then the project name is display

  Scenario: User changing Parent Project After Creation
    Given user click three row icon
    When user select the existing project
    And user click dotted three icon
    Then user click edit project button
    And user click parent project option
    And user select another parent project
    And user click Done button
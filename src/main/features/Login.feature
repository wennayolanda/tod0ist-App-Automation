Feature: Login

  Background: user open the web
    Given user open the application
    When user click Don't Allow button
    And user click Continue with more options menu
    And user click Login with Email button
    Then user click none of the above button

  Scenario: User login into Todoist app using valid credential
    Given user input email "pador54207@iturchia.com"
    When user input password "pador54207!"
    Then user click on login button

  Scenario: User leave the email and password field empty
    Given user click on login button

  Scenario: User enter an invalid password
    Given user input email "pador54207@iturchia.com"
    When user input password "pador"
    Then user click on login button

  Scenario: User enter an invalid email
    Given user input email "pador54207@gmail.com"
    When user input password "pador54207!"
    Then user click on login button

  Scenario: Verify that user successful Login with Case-Insensitive Email Comparison
    Given user input email "Pador54207@iturchia.com"
    When user input password "pador54207!"
    Then user click on login button
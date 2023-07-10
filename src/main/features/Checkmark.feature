Feature: Login

  Background: user open the web
    Given user open the application
    When user click Don't Allow button
    And user click Continue with more options menu
    And user click Login with Email button
    Then user click none of the above button
    When user input email "pador54207@iturchia.com"
    And user input password "pador54207!"
    And user click on login button
    And user click three row icon
    Then user select the existing project

  Scenario: Verify that user can mark task as complete
    Given user click complete button
    Then verify that complete label is display

    Scenario: User undo task completion
      Given user click complete button
      Then user click undo button
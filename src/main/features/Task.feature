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

  Scenario: User add task to project
    Given user click add task button
    When user enter "task satu" for task name
    And user click save task button
    Then the task label is display

  Scenario: User create task with due date
    Given user click add task button
    When user enter "task dua" for task name
    And user click due date button
    And user select date
    When user click ok button
    And user click save task button
    Then the task label is display

  Scenario: User editing the Task name
    Given user select the existing task
    When user click overflow menu button
    And user click edit task button
    And user enter "change task name" in edit task
    Then user click save edit task button

  Scenario: Verify that user can delete the task
    Given user select the existing task
    When user click overflow menu button
    And user click delete task button
    Then user click YES button

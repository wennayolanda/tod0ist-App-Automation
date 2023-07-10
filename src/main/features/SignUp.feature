Feature: SignUp

  Background: user open the web
    Given user open the application
    When user click Don't Allow button
    And user click Continue with more options menu
    And user click "Sign up with Email" button

  Scenario: User Signup into Todoist app using valid credential
    Given user input email "akunsignup2@todoist.com"
    And user input password "akunsignup2!!"
    When user click on signup button
    Then the plan label is displayed

  Scenario: User enter an email address that is already associated with an existing Todoist account
    Given user input email "akunsignup2@todoist.com"
    And user input password "akunsignup2!!"
    When user click on signup button
#    Then error message is display

  Scenario: User enter an invalid email format
    Given user input email "akunsignup2.com"
    And user input password "akunsignup2!!"
    When user click on signup button
#   Then error message is display

  Scenario: User enter a weak password that does not meet the complexity requirements
    Given user input email "akunsignup2@todoist.com"
    And user input password "signup"
    When user click on signup button
#   Then error message is display

  Scenario: User leave the email field empty
    Given user input password "akunsignup2!!"
    And user click on signup button
#   Then error message is display

  Scenario: User leave the password field empty
    Given user input email "akunsignup2@todoist.com"
    And user click on signup button
#   Then error message is display


Feature: Plan

  Background: user open the web
    Given user open the application
    When user click Don't Allow button
    And user click Continue with more options menu
    And user click "Sign up with Email" button
    Given user input email "akunketiga03@todoist.com"
    And user input password "akunketiga3!"
    When user click on signup button

  Scenario: User successful set the personal plan
    Given user select personal checklist
    When user click continue button
    And user  select beginner checklist
    And user click continue button
    When user input the "wenna" for account name
    Then user click Launch Todoist button

  Scenario: User selects multiple plan selection
    Given user select personal checklist
    When user select work checklist
    And user select education checklist
    And user click continue button
#    Then verify the plan is success

  Scenario: Plan Selection and Navigation Validation
    Given user select personal checklist
    When user click continue button
    And user click back button
    Then the plan label is displayed
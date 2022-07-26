@librarian
Feature: Librarian login feature

 @userStory @B26G17-99 @testPlan @B26G17-114 @testExecution @B26G17-115
 Scenario: Login as a librarian
    Given librarian is on the login page
    Then verify that the title is "Login-Library"
    When librarian enters valid email address and password
    And librarian clicks sign in button
    Then verify that there are 3 models on the page
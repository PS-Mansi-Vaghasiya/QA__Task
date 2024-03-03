Feature: Recruitment page

  Background: 
    Given User is on LoginPage
    When User enter valid username and password
    And click on Login button
    Then User is redirected to Homepage of OrangeHRM

  @recruit
  Scenario: User perform recruit action
    Given I am on Dashboard page
    When I click on Recruitment module and clicking on add button
    When I enter valid candidate details and click on save button
    When I click on Shortlist button and save button to schedule interview
    And I enter valid schedule interview details,click on save button,click on mark interview detials passed option,click on save button
    And click on offer job button , save button ,click on hire button and then click on save button

  @recruit
  Scenario: Attempting to add a candidate with an invalid email format and contact number
    Given I am on the Add Candidate page in the recruitment module
    When I fill in the Email with john.doe and contact number with cjsdnwdknda
    And I fill in the other required fields with valid data
    And I click the Save button
    Then I should see an error message stating Expected format: admin@example.com in email field and Allows numbers and only + - / ( ) in contact number



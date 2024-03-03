Feature: Reject page

  Background: 
    Given User is on LoginPage
    When User enter valid username and password
    And click on Login button
    Then User is redirected to Homepage of OrangeHRM

  @reject
  Scenario: User perform recruit action
    Given I am on Dashboard pagee
    When I click on Recruitment module and clicking on add buttonn
    When I enter valid candidate details and click on save buttonn
    When I click on Shortlist button and save buttonn to schedule interview
    And I enter valid schedule interview details,click on save button,click on mark interview detials passed option,click on save buttonn
    And click on offer job button , save button , click on Reject buttonn

  @reject
  Scenario: Validation error when adding a candidate with improperly formatted email and phone number
    Given I am on the Candidate Addition page within the recruitment section
    When I input an invalid email format and an incorrect phone number format
    And I fill out the remaining required fields with appropriate data
    And I submit the candidate information
    Then I should receive error messages regarding the email and phone number format

  @reject3
  Scenario: Validation error when adding a candidate with improperly interview title and interviewer name
    Given I am on the Dashboard page
    When I navigate to the Recruitment module and begin adding a candidate
    When I submit valid candidate details and save it 
    When I shortlist the candidate and schedule an interview
    And interview title and interviewer name is kept empty and fill remaining details  
    Then I should receive error messages regarding interview title and interviewer name
    

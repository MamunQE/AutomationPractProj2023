@smoke
Feature: Login Feature
  In order to perform sucessful login as a user!

  Background: 
    Given User navigate to facebook home page
    When User validate title of facebook home page

  Scenario: Loging to facebook website with valid crediential
    Then User enter the "valid" email or phone number
    Then user enter the "valid" password
    Then User click on logon button
    And User will be successfully loging to facebook website.

  Scenario: Loging to facebook website with the invalid crediential
    Then User enter the "invalid" email or phone number
    Then user enter the "invalid" password
    Then User click on logon button
    And User will be get the error message

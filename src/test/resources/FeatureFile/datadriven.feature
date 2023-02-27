@datadriven
Feature: Login Feature
  In order to perform sucessful login as a user!

  Scenario Outline: verify facebook loging with multiple crediential
    Given User navigate to facebook home page
    When User validate title of facebook home page
    Then User enter the "<username>" email or phone number
    Then user enter the "<password>" password
    Then User click on logon button
    And User will be successfully loging to facebook website.

Examples: 
|username| password|
|valid   | valid   |
|invalid | valid   |
|valid   | invalid |
|invalid | invalid |

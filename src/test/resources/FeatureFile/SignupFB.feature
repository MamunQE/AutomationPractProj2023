@register
Feature: Sign up Feature
  In order to perform sucessful sign up as a user!

  Scenario: SignUp for facebook
    Given User navigate to facebook home page
    When User validate title of facebook home page
    Then Click on create new account link
    Then User need to enter firstname and lastname
    And User need to enter email or mobile number
    And User need to enter new password
    And User need to select Dob
    And User need to select Gender
    Then Click on sign up link
    And verify user successfully regeistrated

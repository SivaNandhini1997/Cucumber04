@Forgot
Feature: To validate forgot password page in facebook

  Background: 
    Given User login facebook application through chrome browser

  @sanity
  Scenario: To validate forgot passwrord
    When User clicks forgot password link
    Then user searches the account linked with mobilenumber
      | username | Siva           |
      | mailid   | siva@gmail.com |
      | phno     |    98745214741 |
    And user click search
    And user should close the browser

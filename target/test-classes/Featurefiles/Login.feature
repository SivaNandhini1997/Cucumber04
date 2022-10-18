@Login @Forgot
Feature: To validate login functionality of facebook application

  Background: 
    Given User login facebook application through chrome browser

  @smoke @sanity
  Scenario: To validate login funtionality
    When User enter valid email and invalid password
      | username   | email                   | password    |
      | selenium   | selenium07.98@yahoo.com |       87451 |
      | siva       | siva@gmail.com          | sivas874210 |
      | automation | automationsel@gmail.com |        1234 |
    Then User is in invalid credentials page
    And user should close the browser

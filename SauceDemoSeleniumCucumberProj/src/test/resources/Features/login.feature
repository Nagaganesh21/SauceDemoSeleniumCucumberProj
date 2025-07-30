Feature: Login page automation of SauceDemo application

  Background:
    Given I open the login page

  Scenario: check login page with valid credentials
    When I enter valid username and password
    And I click on login button
    Then I should see the Home page
    And Close the browser
    
  Scenario: check login page with not a valid credentials
    When I enter not valid username and password
    And I click on login button
    Then I should see the Home page
    And Close the browser
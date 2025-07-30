Feature: Login page automation of SauceDemo application
  Scenario: check login page with valid credentials
    Given I open the login page
    When I enter valid username and password
    And I click on login button
    Then I should see the Home page
    And Close the browser
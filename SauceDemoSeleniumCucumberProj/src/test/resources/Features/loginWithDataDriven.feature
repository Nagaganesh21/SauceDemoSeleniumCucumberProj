Feature: Login page automation of SauceDemo application
  Scenario Outline: check login page with valid credentials
    Given I open the login page
    When I enter valid "<username>" and "<password>"
    And I click on login button
    Then I should see the Home page
    And Close the browser

    Examples:
    |username                |password      |
    |standard_user           |secret_sauce  |
    |locked_out_user         | secret_sauce |
    |problem_user            | secret_sauce |
    |performance_glitch_user |secret_sauce  |
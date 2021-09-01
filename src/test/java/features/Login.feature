Feature: Application Login

  Scenario: Home page after login
    Given User is in landing page
    When User enter correct credendials "abc" and "ff"
    And Click on Login
    Then Home page is displayed
    And Home page components are displayed

Feature: Login

  Scenario: Login with valid data
    When I fill username
    And I fillpassword
    And I click to login button
    Then I am on the Products page

Feature: Login

  Scenario: Login with valid data
    When I fill  username
    And I fill password
    And I click to login button
    Then I am on the Products page



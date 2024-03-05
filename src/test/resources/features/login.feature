Feature: Login

  @success_login
  Scenario: Login with valid data
    When I fill username "standard_user"
    And I fill password "secret_sauce"
    And I click to login button
    Then I am on the Products page

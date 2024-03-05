Feature: Login

  Scenario: Login with valid data
    When I fill username "standart_user"
    And I fill password "secret_sause
    And I click to login button
    Then I am on the Products page

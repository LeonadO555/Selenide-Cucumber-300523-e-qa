Feature: Login

@success_login
  Scenario: Login with valid data
    When I fill  username "standard_user"
    And I fill password "secret_sauce"
    And I click to login button
    Then I am on the Products page

  @invalid_login
  Scenario Outline: Login <testCase>
    When I fill  username "<username>"
    And I fill password "<password>"
    And I click to login button
    Then I am get error message with text "<errorMessage>"
    Examples:
    | username | password | errorMessage | testCase |
    | standard_error | blablabal |  Epic sadface: Username and password do not match any user in this service|
    | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out                     |
    | standard_user   | bla1231123   | Epic sadface: Username and password do not match any user in this service   |
    | blablabla       | secret_sauce  | Epic sadface: Username and password do not match any user in this service   |






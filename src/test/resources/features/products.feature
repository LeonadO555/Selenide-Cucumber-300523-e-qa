Feature: Products
  @user_can_add_product
  Scenario: Add product
    When I fill  username "standard_user"
    And I fill password "secret_sauce"
    And User click to login button
    Then I am on the Products page
    Then User can add product
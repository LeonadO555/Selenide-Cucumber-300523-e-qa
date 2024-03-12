Feature: Products
  @user_can_add_product
  Scenario: Add product
    When I add username "error_user"
    And I fill password "secret_sauce"
    And User click to login button
    Then I am click to shopping button
    And  I am remote product
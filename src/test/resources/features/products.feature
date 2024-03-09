Feature: Products
@user_can_add_product
  Scenario: Add products
    When Login as user "standard_user"
    And  password "secret_sauce"
    And  click to login button
    And I choose a product
    Then I click to shopping button
    And I remote product

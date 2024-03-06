Feature: Products
@user_can_add_product
  Scenario: Add products
    When Login as user "standard_user"
    And  password "secret_sauce"
    And  click to login button
    And I am on the Products page
    And I choose a product
    Then I click to shopping button

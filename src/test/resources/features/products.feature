Feature: Products
@user_can_add_product
  Scenario: Add products
    When Login as user "standard_user"
    And  password "secret_sauce"
    Given I am on the Products page
    And I
    Then
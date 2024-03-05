Feature: Products
  @user_can_add_product
  Scenario:  Add products
    When  Login as user "standard_user"
    Then I add product

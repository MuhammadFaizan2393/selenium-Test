@addtocart
Feature: Add to Cart
  As a customer
  I want to add products to my shopping cart
  So that I can purchase them later

  Scenario: Add a single product to the cart
    Given I am on the product page
    When I click "Add to Cart" for a product
    Then the product should appear in my cart
    And the cart count should increase by 1

  Scenario: Add multiple products to the cart
    Given I am on the product listing page
    When I add two different products to the cart
    Then both products should appear in my cart
    And the cart count should reflect 2 items

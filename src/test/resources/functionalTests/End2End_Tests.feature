Feature: E2E Test MidtransDemo
  Description: To buy pillow with valid and invalid card details

Scenario Outline: User purchase item with "<cardType>" card details
    Given User is on Home Page
    When User add items to cart
    And User proceed to payment with "<ccardNumber>" and "<expiryDate>"
    And User Enter OTP

Examples:
 |cardType|ccardNumber|expiryDate|
 |valid|4811111111111114|1224|
 |Invalid|4811111111111113|0220|

Feature: Notifications

  Scenario: Send order confirmation to customers
    Given a customer has placed an order
    When the order is confirmed
    Then the customer receives an order confirmation notification
    
    
    
  Scenario: Notify customers about order status
    Given a customer has placed an order
    When there is a change in the order status
    Then the customer receives a notification about the updated order status

  Scenario: Notify installers about new requests
    Given there is a new installation request
    When installers are notified
    Then installers receive a notification about the new request

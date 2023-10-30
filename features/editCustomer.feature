
Feature: Update User Profile Customer.

  Scenario: Customer Updates Their Email
   
    Given a logged-in customer on the car accessories 
   When the customer enter <1> to update your email address
    Then customer email address should be updated to <"newemail@example.com">

    
    Scenario: Customer Updates Their contactNumber
    When the customer enter <2> to update your contactNumber
    Then customer contactNumber should be updated to <"4589622541">
    
    
    Scenario: Customer Updates Their shippingAddress 
      When the customer enter <3> to update your shippingAddress
    Then customer shippingAddress should be updated to <"Nablus-Rafidia">
    
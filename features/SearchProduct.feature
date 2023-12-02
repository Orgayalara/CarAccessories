
Feature: Search for the product.


  Scenario: when the customer searches for the product.
    Given The customer gives the first syllable of the product name.
    Then Finds all products that start with the entered clip.
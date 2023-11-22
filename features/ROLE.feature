Feature: User Roles in the System

  Scenario: Admin manages products, categories, and user accounts
    Given an admin user is logged in
    Then they should see the admin menu

  
  Scenario: Customer browses products, makes purchases, and views orders
    Given a customer is logged in
   Then they should see the Customer menu

   

  Scenario: Installer views installation requests and schedules appointments
    Given an installer is logged in
  Then they should see the Installer menu    
  
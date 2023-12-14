Feature: Edit User Profile

  Scenario: User edits their profile
    Given the user "AYAAWWAD" is logged in
    When the user updates their profile with new information
    Then the user's profile should be updated successfully
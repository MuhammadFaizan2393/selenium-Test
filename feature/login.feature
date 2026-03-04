@login
Feature: Daraz.pk Login Functionality
  As a registered Daraz user
  I want to log in to my account
  So that I can access my profile and place orders

  Background:
    Given the user is on the Daraz Pakistan homepage
    When the user clicks on the Login button
    Then the login modal or page should be displayed

  # ------------------ Positive Scenario ------------------


  Scenario: Login with valid credentials
    And the user enters a valid email or phone number
    And the user enters a valid password
    And the user clicks the Login submit button
    Then the user should be redirected to the dashboard
    And the user name should be visible on the header
    And the user should logged in

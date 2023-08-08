@DemoBlaze
Feature: End-to-End Feature Checking for www.demoblaze.com

  Background: 
    Given User navigates to https
    And User logs in with valid credentials
    And User should be able to see "Welcome Pranta"

  Scenario: Add MacBook Pro to Cart and Complete Checkout
    When User clicks on Laptops from categories
    And User clicks on MacBook Pro
    And User clicks on Add to cart button
    And User accepts the popup message

  Scenario: cart varification
    When User clicks on Cart option
    Then User should see "MacBook Pro" added in the products
    When User clicks on Place order button
    And User enters the required credentials Name, Country, City, Credit Card, Month, Year
    And User clicks on Purchase button
    Then User should see the message "Thank you for your purchase!"
    And User clicks on the OK button

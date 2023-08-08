@qaf
Feature: placing order of a product

  Background: 
    Given User Navigates to Qafox website
    When User clicks on My account tab
    And User clicks on Login button
    And user enters email id ,password
    And User clicks Login
    And User clicks on home button1
   # Then User should able to see the title of the page

  @iphone
  Scenario: Placing order of iphone
    When USer clicks on macbook mobile
    And User CLicks on Addto cart
    Then User should able to see the success message
    When User clicks on cart icon
    Then User can see the product with name
    When User clicks on view cart
    Then USer should able to see the cart page title
    When User clicks on checkout icon
    And USer clicks on continue at billing details
    And User clicks on continue at Delivery details
    And User clicks on continue at delievry method
    And User checks the checkbox of terms and condition
    And User clicks on continue at payment method
    And User clicks on Confirm order button
    Then User can able to see the message that order placed successfully
	 @camera
  Scenario: Placing order of camera
    When User clicks on cameras icon on tab
    And User selects Nikon D300 camera
    And clicks on add to cart
    Then User should able to see the success message
    When User clicks on cart icon
    And User clicks on view cart
    Then USer should able to see the cart page title
    When User clicks on checkout icon
    And USer clicks on continue at billing details
    And User clicks on continue at Delivery details
    And User clicks on continue at delievry method
    And User checks the checkbox of terms and condition
    And User clicks on continue at payment method
    And User clicks on Confirm order button
    Then User can able to see the message that order placed successfully
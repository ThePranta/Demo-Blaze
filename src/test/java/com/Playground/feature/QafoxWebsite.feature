
@qafoxweb
 Feature: User add the item to the cart in Qafox website
 
 Background: User Login to Account in Qafox webbsite
 Given User navigates to the Qafox shopping website
 When User clicks on the Login
 And User enters the credentials
 Then User should see MyAccount page
 
 @items
 Scenario: User adds the item in cart in Qafox website
 When User click on Qafox Main page
 And User search for iMac and adds to wishlist
 And User search for Palm Treo Pro and adds to wishlist
 And User updates the wishlist
 Then User should see the updated wishlist
 When User adds the item to the cart
 Then User should see the item added to the cart
 When User clicks on the View Cart
 And User clicks on Checkout
 Then User should see checkout page
 When User clicks on Logout button
 Then User should see the Logout page
 
 @accountinfo
 Scenario: User updates the Account information in Qafox website
 When User clicks on MyAccount
 Then User should see the MyAccount page
 When User Clicks on Edit your information
 Then User should see My Account information page
 When User updates the information
 Then User should see the information updated
 When User clicks on Logout
 Then User should see Logout page
 
 @currencycheck
 Scenario: User updates the Currency value 
 When User clicks on ViewCart
 And User updates the Currency value to Euro
 Then Currency value must change to Euro
 When User updates the Currency value to Pound
 Then Currency value must change to Pound
 When User updates the Currency value to USDollar
 Then Currency value must change to UsDollar
 When User clicks on the checkout button
 Then User should see the Checkout page
 When User clicks on the Logout button
 Then User should see the LogoutPage
 
 @reviews
 Scenario: User write a review for a product and reorder 
 When User search for Apple brand iPod
 And User review the product
 Then User should see the response Message
 When User updates the quantity of iPod
 And User place the order
 Then User should see Your order has been placed!Message
 
         
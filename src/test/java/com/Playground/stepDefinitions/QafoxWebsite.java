package com.Playground.stepDefinitions;

import com.Playground.pages.QafoxWebsitepages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QafoxWebsite {
QafoxWebsitepages obj= new QafoxWebsitepages();
	
	@Given("User navigates to the Qafox shopping website")
	public void user_navigates_to_the_qafox_shopping_website() {
	   obj.openurl();
	}

	@When("User clicks on the Login")
	public void user_clicks_on_the_login() {
	    obj.myAcc();
	}
	@When("User enters the credentials")
	public void user_enters_the_credentials() {
	   obj.enterEmail();
	   obj.enterPassword();
	}
	@Then("User should see MyAccount page")
	public void user_should_see_my_account_page() {
	    obj.loginvalidation();
	}

	@When("User click on Qafox Main page")
	public void user_click_on_qafox_main_page() {
	   obj.Homepage();
	}

	@When("User search for iMac and adds to wishlist")
	public void user_search_for_i_mac_and_adds_to_wishlist() throws Throwable {
	 obj.iMac();
	}

	@When("User search for Palm Treo Pro and adds to wishlist")
	public void user_search_for_palm_treo_pro_and_adds_to_wishlist() {
	    obj.Phone();
	}


	@When("User updates the wishlist")
	public void user_updates_the_wishlist() {
	   obj.Update1_wishlist();
	}
	
	@Then("User should see the updated wishlist")
	public void user_should_see_the_updated_wishlist() {
	   obj.update2_wishlist();

	}

	@When("User adds the item to the cart")
	public void user_adds_the_item_to_the_cart() {
	    obj.add_to_cart();
	}

	@Then("User should see the item added to the cart")
	public void user_should_see_the_item_added_to_the_cart() {
	    obj.response_add_to_cart();

	}


	@When("User clicks on the View Cart")
	public void user_clicks_on_the_view_cart() {
	    obj.view_cart();
	}



	@When("User clicks on Checkout")
	public void user_clicks_on_checkout() {
	  obj.Check_out();
	}

	@Then("User should see checkout page")
	public void user_should_see_checkout_page() {
	   obj.Checkout_page();
	}

	@When("User clicks on Logout button")
	public void user_clicks_on_logout_button() {
	   obj.log_out();;
	}

	@Then("User should see the Logout page")
	public void user_should_see_the_logout_page() {
	    obj.Log_out_page();
	}

	@When("User clicks on MyAccount")
	public void user_clicks_on_my_account() {
	    obj.my_acc();
	}

	@Then("User should see the MyAccount page")
	public void user_should_see_the_my_account_page() {
	   obj.my_acc_page();
	}

	@When("User Clicks on Edit your information")
	public void user_clicks_on_edit_your_information() {
	    obj.edit();
	}

	@Then("User should see My Account information page")
	public void user_should_see_my_account_information_page() {
	   obj.edit_info();
	}

	@When("User updates the information")
	public void user_updates_the_information() {
	   obj.updateinfo();
	}

	@Then("User should see the information updated")
	public void user_should_see_the_information_updated() {
	   obj.infoupdated();
	}
	@When("User clicks on Logout")
	public void user_clicks_on_logout() {
		   obj.log_out();;

	}

	@Then("User should see Logout page")
	public void user_should_see_logout_page() {
	    obj.Log_out_page();

	}
	
	@When("User clicks on ViewCart")
	public void user_clicks_on_view_cart() {
		
	 obj.view_cart();
	}
	@When("User updates the Currency value to Euro")
	public void user_updates_the_currency_value_to_euro() {
		obj.currency();
	   obj.eurocurrency();
	}

	@Then("Currency value must change to Euro")
	public void currency_value_must_change_to_euro() {
	    obj.euro_curr();
	}

	@When("User updates the Currency value to Pound")
	public void user_updates_the_currency_value_to_pound() {
		obj.currency();
	    obj.poundcurrency();
	}

	@Then("Currency value must change to Pound")
	public void currency_value_must_change_to_pound() {
	   obj.pound_curr();
	}

	@When("User updates the Currency value to USDollar")
	public void user_updates_the_currency_value_to_us_dollar() {
	    // Write code here that turns the phrase above into concrete actions
		obj.currency();
	    obj.uscurrency();
	}

	@Then("Currency value must change to UsDollar")
	public void currency_value_must_change_to_us_dollar() {
		obj.us_curr();
	}

	
	@When("User clicks on the checkout button")
	public void user_clicks_on_the_checkout_button() {
	  obj.Check_out();
	}

	@Then("User should see the Checkout page")
	public void user_should_see_the_checkout_page() {
	    obj.Checkout_page();
	}

	@When("User clicks on the Logout button")
	public void user_clicks_on_the_logout_button() {
	  obj.log_out();
	}
	@Then("User should see the LogoutPage")
	public void user_should_see_the_logoutpage() {
	    // Write code here that turns the phrase above into concrete actions
	obj.Log_out_page();
	}
	
	@When("User search for Apple brand iPod")
	public void user_search_for_apple_brand_i_pod() {
	   obj.applebrand();
	}

	@When("User review the product")
	public void user_review_the_product() {
	    obj.review();
	}

	@Then("User should see the response Message")
	public void user_should_see_the_response_message() {
	   obj.reviewresponse();
	}

	@When("User updates the quantity of iPod")
	public void user_updates_the_quantity_of_i_pod() throws Exception {
	   obj.updatequantity();
	   
	}

	

	@When("User place the order")
	public void user_place_the_order() {
	    obj.orderconfirmation();
	}

	@Then("User should see Your order has been placed!Message")
	public void user_should_see_your_order_has_been_placed_message() {
	    obj.ordersuccess();
	}
	
}

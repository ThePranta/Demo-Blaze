package com.Playground.stepDefinitions;

import com.Playground.pages.QAfoxPages;

import io.cucumber.java.en.*;

public class QAfoxStepDefinitions {

	QAfoxPages qaf=new QAfoxPages();
	@Given("User Navigates to Qafox website")
	public void user_navigates_to_qafox_website() {
	   qaf.openurl();
	}
	@When("User clicks on My account tab")
	public void user_clicks_on_my_account_tab() {
	   qaf.myaccounts();
	}
	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
	   qaf.login();
	   }

	@When("user enters email id ,password")
	public void user_enters_email_id_password() {
	    qaf.email();
	    qaf.password();
	    
	}

	@And("User clicks Login")
	public void user_clicks_login() {
	    qaf.login1();
	}

@When("User clicks on home button1")
public void user_clicks_on_home_button1() {
   qaf.home();
}

	
	@Then("User checks the title of the page")
	public void user_checks_the_title_of_the_page() {
	    qaf.title();
	}

	@When("USer clicks on macbook mobile")
	public void u_ser_clicks_on_iphone_mobile() {
	    qaf.phone();
	}

	@When("User CLicks on Addto cart")
	public void user_c_licks_on_addto_cart() {
	    qaf.addtocart();
	}

	@Then("User should able to see the success message")
	public void user_should_able_to_see_the_success_message() {
	    qaf.successmsg();
	}

	@When("User clicks on cart icon")
	public void user_clicks_on_cart_icon() {
	   qaf.carttotal();
	}

	@Then("User can see the product with name")
	public void user_can_see_the_product_with_name() {
	   qaf.verifyproduct();
	}

	@When("User clicks on view cart")
	public void user_clicks_on_view_cart() {
	   qaf.viewcart();
	}

	@Then("USer should able to see the cart page title")
	public void u_ser_should_able_to_see_the_cart_page_title() {
	   qaf.verifycartpage();
	}
	
	

	@When("User clicks on checkout icon")
	public void user_clicks_on_checkout_icon() {
	    qaf.checkout();
	}

	@When("USer clicks on continue at billing details")
	public void u_ser_clicks_on_continue_at_billing_details() {
	  qaf.continuebilling();
	}

	@When("User checks the checkbox of terms and condition")
	public void user_checks_the_checkbox_of_terms_and_condition() {
		qaf.checkbox();
	}
	
	
	@When("User clicks on continue at payment method")
	public void user_clicks_on_continue_at_payment_method() {
	  qaf.continuepayment();
	}
	//Placing an order of camera
	
		@When("User clicks on cameras icon on tab")
		public void user_clicks_on_cameras_icon_on_tab() {
		    qaf.cameras();
		}

		@When("User selects Nikon D300 camera")
		public void user_selects_nikon_d300_camera() {
		   qaf.nikoncamera();
		}

		@When("clicks on add to cart")
		public void clicks_on_add_to_cart() {
		 qaf.addtocartnikon();
		}

	@When("User clicks on continue at Delivery details")
	public void user_clicks_on_continue_at_delivery_details() {
	  qaf.deliverydetails();
	}

	@When("User clicks on continue at delievry method")
	public void user_clicks_on_continue_at_delievry_method() {
	    qaf.delieverymethod();
	}

	@Then("User can able to see the product details at confirm order page")
	public void user_can_able_to_see_the_product_details_at_confirm_order_page() {
	    qaf.confirmorderverify();
	}

	@When("User clicks on Confirm order button")
	public void user_clicks_on_confirm_order_button() {
	  qaf.confirmorder();
	}
	@Then("User can able to see the message that order placed successfully")
	public void user_can_able_to_see_the_message_that_order_placed_successfully() {
	    
	}

	
}

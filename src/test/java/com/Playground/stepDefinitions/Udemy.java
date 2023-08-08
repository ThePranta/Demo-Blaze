package com.Playground.stepDefinitions;
import com.Playground.pages.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Udemy {
	UdemyPage up= new UdemyPage();
	@Given("User navigates to the udemy page")
	public void user_navigates_to_the_udemy_page() {
	    // Write code here that turns the phrase above into concrete actions
		up.openurl();
	    throw new io.cucumber.java.PendingException();
	}

	@When("User logins with the valid credentials")
	public void user_logins_with_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		up.enterUsername();
		up.enterPassword();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User validates the udemy home page")
	public void user_validates_the_udemy_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on my learning")
	public void user_clicks_on_my_learning() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User shoud see able to see the contents")
	public void user_shoud_see_able_to_see_the_contents() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}

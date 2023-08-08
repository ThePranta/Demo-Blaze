package com.Playground.stepDefinitions;

import com.Playground.pages.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo {
	Demopage demoobj = new Demopage();
	
	@Given("^User navigates to the Orange HRM page$")
    public void user_navigates_to_the_orange_hrm_page() throws Throwable {
		demoobj.openurl();
    }

    @When("^User logins with the valida credentials$")
    public void user_logins_with_the_valida_credentials() throws Throwable {
    	demoobj.enterUsername();
    	demoobj.enterPassword();
    }

    @Then("^User validates the Orange HRm home page$")
    public void user_validates_the_orange_hrm_home_page() throws Throwable {
    	demoobj.homeValidation();
    }
    @When("^User clicks on leave$")
    public void user_clicks_on_leave() throws Throwable {
    	demoobj. Leave();
    }
    @Then("^User shoud see Leave page displayed$")
    public void user_shoud_see_leave_page_displayed() throws Throwable {
    	demoobj.VerifyLeavePage();
    }
	    
}

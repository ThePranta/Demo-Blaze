package com.Playground.stepDefinitions;

import org.testng.Assert;

import com.Playground.pages.DemoBlazePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoBlazeStep {
	private DemoBlazePage demoBlazePage = new DemoBlazePage();

	@Given("User navigates to https")
	public void userNavigatesTo() {
		demoBlazePage.navigateToDemoBlazeWebsite();
	}

	@And("User logs in with valid credentials")
	public void userLogsInWithValidCredentials() {
		demoBlazePage.loginWithValidCredentials();
	}

	@And("User should be able to see {string}")
	public void userShouldBeAbleToSee(String welcomeMessage) {
		String welcome = demoBlazePage.verifyLandingPage();
		Assert.assertEquals(welcomeMessage, welcome);
	}

	@When("User clicks on Laptops from categories")
	public void userClicksOnFromCategories() {
		demoBlazePage.clickOnLaptopsCategory();
	}

	@And("User clicks on MacBook Pro")
	public void userClicksOn() {
		demoBlazePage.clickOnMacBookPro();
	}

	@And("User clicks on Add to cart button")
	public void userClicksOnAddToCartButton() {
		demoBlazePage.clickAddToCartButton();
	}

	@And("User accepts the popup message")
	public void userAcceptsThePopupMessage() {
		demoBlazePage.acceptPopupMessage();
	}

	@When("User clicks on Cart option")
	public void userClicksOnCartOption() {
		demoBlazePage.clickOnCartOption();
	}

	@Then("User should see {string} added in the products")
	public void userShouldSeeAddedInTheProducts(String product) {
		String ProductAdded = demoBlazePage.isProductInCart();
		Assert.assertEquals(product, ProductAdded);
	}

	@When("User clicks on Place order button")
	public void userClicksOnPlaceOrderButton() {
		demoBlazePage.clickPlaceOrderButton();
	}

	@And("User enters the required credentials Name, Country, City, Credit Card, Month, Year")
	public void userEntersTheRequiredCredentialsNameCountryCityCreditCardMonthYear() {
		// Retrieve credentials from DataTable and pass them to the page class method
		demoBlazePage.enterCredentials();
	}

	@And("User clicks on Purchase button")
	public void userClicksOnPurchaseButton() {
		demoBlazePage.clickPurchaseButton();
	}

	@Then("User should see the message {string}")
	public void userShouldSeeTheMessage(String message) {
		String PurchaseMessageDisplayed = demoBlazePage.PurchaseMessageDisplayed();
		Assert.assertEquals(message, PurchaseMessageDisplayed);
	}

	@And("User clicks on the OK button")
	public void userClicksOnTheOKButton() {
		demoBlazePage.clickOKButton();
	}
}

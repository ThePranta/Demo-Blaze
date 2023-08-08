package com.Playground.pages;

import org.openqa.selenium.By;
import com.Playground.utilities.ConfigReader;
import com.Playground.ccl.WebActions;

public class DemoBlazePage {

	private WebActions actions = new WebActions();

	private By lnk_login = By.xpath("//a[@id='login2']");
	private By fld_username = By.xpath("//input[@id='loginusername']");
	private By fld_password = By.xpath("//input[@id='loginpassword']");
	private By btn_login = By.xpath("//button[normalize-space()='Log in']");
	private By lnk_welcome = By.xpath("//a[@id='nameofuser']");
	private By lnk_laptops = By.xpath("(//a[@class='list-group-item'])[3]");
	private By lnk_macBookPro = By.xpath("//a[text()='MacBook Pro']");
	private By btn_addToCart = By.xpath("//a[@class='btn btn-success btn-lg']");
   // private By btn_acceptPopup = By.xpath("//button[text()='OK']");
	private By lnk_cart = By.xpath("//a[@id='cartur']");
	private By lbl_productInCart = By.xpath("//tbody/tr[1]/td[2]");
	private By lbl_totalPrice = By.xpath("//h3[@id='totalp']");
	private By btn_placeOrder = By.xpath("//button[@class='btn btn-success']");
	private By fld_name = By.xpath("//input[@id='name']");
	private By fld_country = By.xpath("//input[@id='country']");
	private By fld_city = By.xpath("//input[@id='city']");
	private By fld_creditCard = By.xpath("//input[@id='card']");
	private By fld_month = By.xpath("//input[@id='month']");
	private By fld_year = By.xpath("//input[@id='year']");
	private By btn_purchase = By.xpath("//button[text()='Purchase']");
	private By lbl_purchaseMessage = By.xpath("//h2[text()='Thank you for your purchase!']");
	private By btn_ok = By.xpath("//button[text()='OK']");

	public void navigateToDemoBlazeWebsite() {
		actions.openURL(ConfigReader.getValue("DemoBlaze.url"));
	}

	public void loginWithValidCredentials() {
		actions.Click(lnk_login, "clicks on Log in");
		actions.sendKeys(fld_username, ConfigReader.getValue("DemoBlaze.Username"));
		actions.sendKeys(fld_password, ConfigReader.getValue("DemoBlaze.Password"));
		actions.Click(btn_login, "click on login button");

	}

	public String verifyLandingPage() {
		return actions.getElmText(lnk_welcome);
	}

	public void clickOnLaptopsCategory() {
		actions.Click(lnk_laptops, "Laptops Link");
	}

	public void clickOnMacBookPro() {
		actions.Click(lnk_macBookPro, "MacBook Pro Link");
	}

	public void clickAddToCartButton() {
		actions.Click(btn_addToCart, "Add to cart Button");
	}

	public void acceptPopupMessage() {
		actions.alerthandling();
	}

	public void clickOnCartOption() {
		actions.Click(lnk_cart, "Cart Option");
	}

	public String isProductInCart() {
		return actions.getElmText(lbl_productInCart);
	}

	public String getTotalPrice() {
		return actions.getElmText(lbl_totalPrice);
	}

	public void clickPlaceOrderButton() {
		actions.Click(btn_placeOrder, "Place Order Button");
	}

	public void enterCredentials() {
		actions.sendKeys(fld_name, ConfigReader.getValue("db.name"));
		actions.sendKeys(fld_country,ConfigReader.getValue("db.country") );
		actions.sendKeys(fld_city, ConfigReader.getValue("db.city"));
		actions.sendKeys(fld_creditCard,ConfigReader.getValue("db.creditcard"));
		actions.sendKeys(fld_month, ConfigReader.getValue("db.month"));
		actions.sendKeys(fld_year, ConfigReader.getValue("db.year"));
	}

	public void clickPurchaseButton() {
		actions.Click(btn_purchase, "Purchase Button");
	}

	public String PurchaseMessageDisplayed() {
		return actions.getElmText(lbl_purchaseMessage);
	}

	public void clickOKButton() {
		actions.Click(btn_ok, "OK Button");
	}
}

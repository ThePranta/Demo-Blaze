package com.Playground.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.Playground.ccl.WebActions;
import com.Playground.utilities.ConfigReader;

public class QAfoxPages {
WebActions actions = new WebActions();
	
	
	By btn_Myaccouunt=By.xpath("//span[text()='My Account']");
	By btn_Login=By.xpath("//a[text()='Login']");
	By txt_email=By.id("input-email");
	By txt_password=By.id("input-password");
	By btn_login1=By.xpath("//input[@value='Login']");
	By btn_home=By.xpath("//a[@href='https://tutorialsninja.com/demo/index.php?route=common/home']");
	By tle_home=By.xpath("//a[text()='Qafox.com']");
	
	By pdt_phone=By.xpath("//div[@class='caption']//a[contains(text(),'MacBook')]");
	By btn_addtocart=By.xpath("//button[text()='Add to Cart']");
	By msg_success=By.xpath("//div[@class='alert alert-success alert-dismissible']");
	
	By btn_carttotal=By.xpath("(//button[@data-toggle='dropdown'])[2]");
	By pdt_cart=By.xpath("(//a[contains(text(),'MacBook')])[1]");
	
	By btn_viewcart=By.xpath("//strong[normalize-space()='View Cart']");
	By vfy_carttitle=By.xpath("//h1[contains(text(),'Shopping Cart')]");
	By btn_checkout=By.xpath("//a[@class='btn btn-primary']");
	By btn_continue=By.xpath("//input[@id='button-payment-address']");
	By chkbx_paymentmode=By.xpath("//input[@name='agree']");
	By btn_contonue=By.xpath("//input[@id='button-payment-method']");
	
	By btn_camers=By.xpath("//a[text()='Cameras']");
	By slt_camera=By.xpath("//div[@class='caption']//a[contains(text(),'Nikon D300')]");
	By btn_nikonatc=By.id("button-cart");
	By btn_continuedeliveryD=By.id("button-shipping-address");
	By btn_condeliverymethod=By.id("button-shipping-method");
	By vfy_productcco=By.xpath("//td[text()='$400.00']");
	By btn_confirmorder=By.id("button-confirm");
	By msg_orderplaced=By.xpath("//h1[text()='Your order has been placed!']");
	
	
	public void openurl() {
		actions.openURL(ConfigReader.getValue("url5"));
	}
	
	public void myaccounts() {
		actions.Click(btn_Myaccouunt, "My accounts");
	}
	public void login() {
		actions.Click(btn_Login, "Login");
	}
	public void email() {
		actions.sendKeys(txt_email, ConfigReader.getValue("email"));
	}
	public void password() {
		actions.sendKeys(txt_password, ConfigReader.getValue("password"));
	}
	public void login1() {
		actions.Click(btn_login1, "Login");
	}
	public void home() {
		actions.Click(btn_home, "Home");
	}
	public void title() {
		String title=actions.getElmText(tle_home);
		Assert.assertEquals("Qafox.com", title);
	}
	
	public void phone() {
		actions.Click(pdt_phone, "Iphone");
	}
	public void addtocart() {
		actions.Click(btn_addtocart, "Add to cart");
	}
	public void successmsg() {
		String success=actions.getElmText(msg_success);
	}
	public void carttotal() {
		actions.Click(btn_carttotal, "Cart total");
	}
	public void verifyproduct() {
		String phone=actions.getElmText(pdt_cart);
		Assert.assertEquals("MacBook", phone);
	}
	public void viewcart() {
		actions.Click(btn_viewcart, "View cart");
	}
	public void verifycartpage() {
		String carttitle=actions.getElmText(vfy_carttitle);
		Assert.assertEquals("Shopping Cart  (0.00kg)", carttitle );
	}
	
	public void checkout() {
		actions.Click(btn_checkout, "Checkout");
	}
	public void continuebilling() {
		actions.Click(btn_continue, "Continue");
	}
	public void checkbox() {
		actions.Click(chkbx_paymentmode, "checkbox");
	}
	public void continuepayment() {
		actions.Click(btn_contonue, "continue");
	}
	public void cameras() {
		actions.Click(btn_camers, "Cameras");
	}
	public void nikoncamera() {
		actions.Click(slt_camera, "Nikon D300");
	}
	public void addtocartnikon() {
		actions.Click(btn_nikonatc, "Add to Cart");
	}
	public void deliverydetails() {
		actions.Click(btn_continuedeliveryD, "Continue");
	}
	public void delieverymethod() {
		actions.Click(btn_condeliverymethod, "Continue");
	}
	public void confirmorderverify() {
		String confirm_order=actions.getElmText(vfy_productcco);
		Assert.assertEquals("$400.00", confirm_order);
	}
	public void confirmorder() {
		actions.Click(btn_confirmorder, "Confirm order");
	}
	public void orderplaced() {
		String success_order=actions.getElmText(msg_orderplaced);
		Assert.assertEquals("", success_order);
	}
}

package com.Playground.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.Playground.ccl.WebActions;
import com.Playground.utilities.ConfigReader;

public class QafoxWebsitepages {
	WebActions actions = new WebActions();
	By MyAcc= By.xpath("//span[text()='My Account']");
	By Login= By.xpath("//a[text()='Login']");
	By Email = By.xpath("//input[@id='input-email']");
	By Password = By.xpath("//input[@id='input-password']");
	By signin_btn = By.xpath("//input[@value='Login']");
	By Tab_Myacc= By.xpath("//h2[text()='My Account']");
	By btn_MyAcc= By.xpath("//span[text()='My Account']");
	
	By home_validation = By.xpath("//a[text()='Qafox.com']");
	By Desktop= By.xpath("//a[text()='Desktops']");
	By Drop_Mac=By.xpath("//a[text()='Mac (1)']");
	By iMAc= By.xpath("//img[@src='https://tutorialsninja.com/demo/image/cache/catalog/demo/imac_1-228x228.jpg']");
	By iMac_page= By.xpath("//h1[text()='iMac']");
	By wishlist1= By.xpath("//button[@data-original-title='Add to Wish List']");
	
	By Phones= By.xpath("//a[text()='Phones & PDAs']");
	By PalmPhone= By.xpath("//img[@src='https://tutorialsninja.com/demo/image/cache/catalog/demo/palm_treo_pro_1-228x228.jpg']");
	By Palmpage= By.xpath("//h1[text()='Palm Treo Pro']");
	By wishlist2= By.xpath("//button[@data-original-title='Add to Wish List']");
	By wishlist_total= By.xpath("//a[@id='wishlist-total']");
	By wishlist=  By.xpath("//span[text()='Wish List (2)']");

	By out_of_stock= By.xpath("//td[text()='Out Of Stock']");
	//continue= //a[text()='Continue']
	//td[text()='In Stock']
	By alert= By.xpath("//div[@class='alert alert-success alert-dismissible']");
	By Remove= By.xpath("//a[@href='https://tutorialsninja.com/demo/index.php?route=account/wishlist&remove=41']");
	By remove_response= By.xpath("//div[@class='alert alert-success alert-dismissible']");
	By add_to_cart= By.xpath("//button[@data-original-title='Add to Cart']");
	By cart_response= By.xpath("//div[@class='alert alert-success alert-dismissible']");
	By Cart= By.xpath("//span[@id='cart-total']");
	By View_Cart= By.xpath("//strong[text()='View Cart']");
	By View_cart_response=  By.xpath("//a[text()='Shopping Cart']");
	
	
	By check_Out=By.xpath("//a[text()='Checkout']");
	By check_Out_Page=By.xpath("//h1[text()='Checkout']");
	By Log_out= By.xpath("//a[text()='Logout']");
	By Logout_Page= By.xpath("//h1[text()='Account Logout']");
	
	By Edit_accinfo= By.xpath("//a[text()='Edit your account information']");
	By MyAccinfo= By.xpath("//a[text()='Edit Information']");
	By First_name=By.xpath("//input[@name='firstname']");
	By Last_name =By.xpath("//input[@name='lastname']");
	By Continue= By.xpath("//input[@value='Continue']");
	By My_acc= By.xpath("//a[text()='Account']");
	By Currency= By.xpath("//button[@class='btn btn-link dropdown-toggle']");
	By Euro= By.xpath("//button[text()='€Euro']");
	By Pound= By.xpath("//button[text()='£Pound Sterling']");
	By Us= By.xpath("//button[text()='$US Dollar']");
	By Euro_curr= By.xpath("//span[text()='1 item(s) - 219.68€']");
	By Pound_curr=By.xpath("//span[text()='1 item(s) - £171.49']");
	By Us_curr=By.xpath("//span[text()='1 item(s) - $279.99']");
	
	By Brands=By.xpath("//a[text()='Brands']");
	By Apple_products= By.xpath("//a[text()='Apple']");
	By iPod= By.xpath("//img[@alt='iPod Classic']");
	By Write_review= By.xpath("//a[text()='Write a review']");
	By Reviewer_Name= By.xpath("//input[@id='input-name']");
	By Text_review= By.xpath("//textarea[@id='input-review']");
	By Rating =By.xpath("//input[@type='radio' and @name='rating'] "); //vlue= 1to 5
	By Submit_review= By.xpath("//button[@id='button-review']");
	By Review_response= By.xpath("//div[@class='alert alert-success alert-dismissible']");
	By Reorder_quantity= By.xpath("//input[@id='input-quantity']");
	By iPod_Addtocart = By.xpath("//button[text()='Add to Cart']");

	By Billing_details= By.xpath("//input[@id='button-payment-address']");
	By Shipping_address =By.xpath("//input[@id='button-shipping-address']");
	By Order_textarea= By.xpath("//textarea[@name='comment']");
	//"Suprise"
	By Order_textcontinue= By.xpath("//input[@id='button-shipping-method']");
	By Payment_checkbox= By.xpath("//input[@type='checkbox']");
	By Payment_continue= By.xpath("//input[@id='button-payment-method']");
	By Confirm_order=  By.xpath("//input[@id='button-confirm']");
	By Orderplaced= By.xpath("//h1[text()='Your order has been placed!']");
	// Thank you for your review. It has been submitted to the webmaster for approval.
	//Your order has been placed!
	
	public void openurl() {
		actions.openURL(ConfigReader.getValue("url"));
	}
	public void myAcc()
	{
		actions.Click(MyAcc, "MyAccount");
		actions.Click(Login, "Login");
	}
	public void enterEmail() {
		
		actions.sendKeys(Email, ConfigReader.getValue("email"));
	}
	public void enterPassword() {
		actions.sendKeys(Password, ConfigReader.getValue("password"));
		actions.Click(signin_btn, "Login");
	}
	public void loginvalidation() {
		String text=actions.getElmText(home_validation);
		actions.Click(Tab_Myacc, "My Account");
	}
	
	public void Homepage()
	{
		actions.Click(home_validation, "Qafox");
	}
	public void iMac() throws Throwable
	{
		actions.Click(Desktop, "Deskop");;
		actions.Click(Drop_Mac, "Mac(1)");
		actions.Click(iMAc, "iMac Monitor");
		actions.isDisplayed(iMac_page, "iMAc");
		actions.Click(wishlist1, "wish list added");
	}
	public void Phone() {
		actions.Click(Phones, "Phones tab");
		actions.Click(PalmPhone, "Palm Phone");
		actions.isDisplayed(Palmpage, "Palm phone page");
		actions.Click(wishlist2, null);
	}
	
	public void Update1_wishlist()
	
	{
		actions.Click(wishlist, "Wish list");
		if(actions.isDisplayed(out_of_stock, "Out of stock"))
		{
			actions.Click(Remove, "Remove item");
			
	}
	}
	public void update2_wishlist()
	{
		String wishlist_update= actions.getElmText(cart_response);
		//Assert.assertEquals("Success: You have modified your wish list! "+"�", wishlist_update);
		String wishlist_alert= actions.getElmText(alert);
		Assert.assertEquals(wishlist_update,wishlist_alert );
	}
	public void add_to_cart()
	{
		actions.Click(add_to_cart,"Item added");
		
	}
	public void response_add_to_cart()
	{
		String cart_added= actions.getElmText(cart_response);
		//Assert.assertEquals("", cart_added);
		String wishlist_alert1= actions.getElmText(alert);

		Assert.assertEquals(cart_added, wishlist_alert1);
		
	}
	
	public void view_cart()
	{
		actions.Click(Cart, "cart");
		actions.Click(View_Cart, "View_cart");
	}
	
	public void Check_out()
	{
		actions.scrollDownUsingJS();
		actions.Click(check_Out, "Checkout");
	}
	public void Checkout_page()
	{
		actions.isDisplayed(check_Out_Page, "Checkout page");
	}
	public void log_out()
	{
		actions.Click(MyAcc, "My Account");
		actions.Click(Log_out, "Logout");
	}
	public void Log_out_page()
	{
		actions.isDisplayed(Logout_Page, "Log out success");
	}
	public void my_acc()
	{
		actions.Click(btn_MyAcc, "My Account button");
	}
	public void my_acc_page()
	{
		String text= actions.getElmText(My_acc);
		Assert.assertEquals(text, "Account");
	}
	public void edit()
	{
		actions.Click(Edit_accinfo, "Edit my info");
	}
	public void edit_info()
	{
		String text= actions.getElmText(MyAccinfo);
		Assert.assertEquals(text, "Edit Information");
	}
	public void updateinfo()
	{
		actions.sendKeys(First_name, ConfigReader.getValue("firstname"));
		actions.sendKeys(Last_name, ConfigReader.getValue("lastname"));
		actions.Click(Continue, "Continue");
	}
	public void infoupdated()
	{
		String text= actions.getElmText(alert);
		Assert.assertEquals(text, "Success: Your account has been successfully updated.");
	}
	public void currency()
	{
		actions.Click(Currency, "Currency button");
		
	}
	public void eurocurrency()
	{
		actions.Click(Euro, "Euro Currency");
	}
	public void euro_curr()
	{
		actions.isDisplayed(Euro_curr, "Euro currency");
		String text= actions.getElmText(Euro_curr);
	}
	public void poundcurrency()
	{
		actions.Click(Pound, "Pound Currency");
	}
	public void pound_curr()
	{
		actions.isDisplayed(Pound_curr, "Pound currency");
		String text= actions.getElmText(Pound_curr);
	}
	public void uscurrency()
	{
		actions.Click(Us, "Us dollar");
	}
	public void us_curr()
	{
		actions.isDisplayed(Us_curr, "Us dollar");
		String text=actions.getElmText(Us_curr);
	}
	public void applebrand()
	{
		actions.scrollDownUsingJS();
		actions.Click(Brands, "clicking on Brands");
		actions.Click(Apple_products, "Clicking on Apple Products");
		actions.Click(iPod, "Clicking on iPod");
		
	}
	public void review()
	{
		actions.Click(Write_review, "write a review");
		actions.scrollDownUsingJS();
		actions.sendKeys(Reviewer_Name, ConfigReader.getValue("reviewer_name"));
		actions.sendKeys(Text_review, ConfigReader.getValue("review_text"));
		actions.Click(Rating, ConfigReader.getValue("rating"));
		actions.Click(Submit_review, "review submit");
	}
	public void reviewresponse()
	{
		String text=actions.getElmText(Review_response);
		Assert.assertEquals(text, "Thank you for your review. It has been submitted to the webmaster for approval.");
	}
	public void updatequantity() throws Exception
	{
//		actions.scrollup();
		actions.clearAndSendKeys(Reorder_quantity, ConfigReader.getValue("reorder_quantity"));
		actions.Click(iPod_Addtocart, "Adding to cart");
		actions.Click(Cart, "Cart");
		actions.Click(View_Cart, "View cart");
		actions.Click(check_Out, "checkout");
	}
	public void orderconfirmation()
	{
		actions.Click(Billing_details, "Billing details confirmation");
		actions.Click(Shipping_address, "Shipping address confirmation");
		actions.scrollDownUsingJS();
		actions.sendKeys(Order_textarea, ConfigReader.getValue("order_text"));
		actions.Click(Order_textcontinue, "text continue");
		actions.Click(Payment_checkbox, "check box");
		actions.Click(Payment_continue, "payment confirmation");
		actions.Click(Confirm_order, "order confirm");
	}
	public void ordersuccess()
	{
		String text= actions.getElmText(Orderplaced);
		Assert.assertEquals(text, "Your order has been placed!");
	}
}

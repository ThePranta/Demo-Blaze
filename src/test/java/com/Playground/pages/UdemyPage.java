package com.Playground.pages;

import org.openqa.selenium.By;

import com.Playground.ccl.WebActions;
import com.Playground.utilities.ConfigReader;

public class UdemyPage {
	WebActions actions = new WebActions();
	By username1 = By.xpath("//input[@name='username']");
	By password1 = By.xpath("//input[@name='password']");
	By login_btn = By.xpath("//button[@type='submit']");

	public void openurl() {
		actions.openURL(ConfigReader.getValue("url"));
	}
	public void enterUsername() {
		actions.sendKeys(username1, ConfigReader.getValue("username1"));
	}
	public void enterPassword() {
		actions.sendKeys(password1, ConfigReader.getValue("password1"));
		actions.Click(login_btn, "login_btn");
	}
	

}

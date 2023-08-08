package com.Playground.pages;

import org.openqa.selenium.By;

import com.Playground.utilities.*;

import junit.framework.Assert;

import com.Playground.ccl.*;
public class Demopage {
     
	WebActions actions = new WebActions();
	
	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By signin_btn = By.xpath("//button[@type='submit']");
	By home_validation = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
	By leave = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']");
	By Leavepage= By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
	
	public void openurl() {
		actions.openURL(ConfigReader.getValue("url"));
	}
	public void enterUsername() {
		actions.sendKeys(username, ConfigReader.getValue("username"));
	}
	public void enterPassword() {
		actions.sendKeys(password, ConfigReader.getValue("password"));
		actions.Click(signin_btn, "signin");
	}
	public void homeValidation() {
		String text=actions.getElmText(home_validation);
	}
	public void Leave() {
		
		actions.Click(leave, "Leave");
	}
	public void VerifyLeavePage() {
		String text=actions.getElmText(Leavepage);
	}
	
	
}

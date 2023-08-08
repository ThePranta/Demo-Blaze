package com.Playground.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.Playground.utilities.ConfigReader;
import com.Playground.ccl.WebActions;

public class ComputerPage {
	private WebActions actions = new WebActions();

	private By searchField = By.xpath("//input[@id='searchbox']");
	private By filterButton = By.xpath("//input[@id='searchsubmit']");
	private By filterComputername = By.xpath("//tbody/tr[1]/td[1]");
	private By addButton = By.xpath("//a[@id='add']");
	private By computerNameField = By.xpath("//input[@id='name']");
	private By introducedDateField = By.xpath("//input[@id='introduced']");
	private By DiscontinueDateField = By.xpath("//input[@id='discontinued']");
	private By companyDropdown = By.xpath("//select[@id='company']");
	private By createButton = By.xpath("//input[@value='Create this computer']");

	private By computerLink(String name) {
		return By.linkText(name);
	}

	private By saveButton = By.xpath("//input[@value='Save this computer']");
	private By deleteButton = By.xpath("//input[@value='Delete this computer']");
	private By successMessage = By.xpath("//div[@class='alert-message warning']");
	private By confirmationMessage = By.id("confirmationMessage");

	public void navigateToHomePage() {

		actions.openURL(ConfigReader.getValue("Computer.url"));
	}

	public void searchComputer(String keyword) {
		actions.sendKeys(searchField, keyword);
		actions.Click(filterButton, "Filter by name button");

	}
	public void clickComputerLink(String name) {
		actions.Click(computerLink(name), " computer link");
	}

	public String ComputerDisplayed() {
		// TODO Auto-generated method stub
		return actions.getElmText(filterComputername);
	}

	public void clickAddNewComputer() {
		actions.Click(addButton, "Add a new computer button");

	}

//	public void editComputer(String name) {
//		searchComputer(name);
//		
//	}
	

	public void updateComputerName(String newName) {
		actions.clear(computerNameField);
		actions.sendKeys(computerNameField, newName);
	}

	public void saveComputer() {
		actions.Click(saveButton, "Save this computer button");
	}

	public void deleteComputer(String name) {
		searchComputer(name);
		actions.Click(computerLink(name), name + " computer link");
		actions.Click(deleteButton, "Delete this computer button");
	}

	public String getSuccessMessage() {
		return actions.getElmText(successMessage);
	}

	public String getComputerName() {
		return actions.getAttributeValue(computerNameField, "value");
	}

	public String getConfirmationMessage() {
		return actions.getElmText(confirmationMessage);
	}

	public void enterComputerName(String name) {
		actions.sendKeys(computerNameField, name);

	}

	public void enterIntroducedDate(String introducedDate) {
		actions.sendKeys(introducedDateField, introducedDate);

	}

	public void enterMemory(String memory) {
		actions.sendKeys(DiscontinueDateField, memory);
	}

	public void selectCompany(String company) {
		actions.selectByVisibleText(companyDropdown, company);

	}

	public void clickCreateComputer() {
		actions.Click(createButton, "Create this computer button");

	}

	

}

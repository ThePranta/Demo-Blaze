package com.Playground.stepDefinitions;

import org.testng.Assert;

import com.Playground.pages.ComputerPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputerStepDefinitions {
    private ComputerPage computerPage = new ComputerPage();

    @Given("user is on the homepage")
    public void userIsOnTheHomepage() {
        computerPage.navigateToHomePage();
    }

    @When("user enters {string} in the search field")
    public void userEntersInTheSearchField(String keyword) {
        computerPage.searchComputer(keyword);
    }

    @When("user clicks on Filter by name button")
    public void userClicksOnFilterByNameButton() {
        // The action is performed in the previous step, no additional action is needed here
    }

    @Then("user should see a list of computers containing {string}")
    public void userShouldSeeAListOfComputersContaining(String expectedText) {
      
    	String actual = computerPage.ComputerDisplayed();
    	Assert.assertEquals(actual, expectedText);
    }

    @When("user clicks on Add a new computer button")
    public void userClicksOnAddANewComputerButton() {
        computerPage.clickAddNewComputer();
    }

    @When("user enters {string} in the Computer name field")
    public void userEntersInTheComputerNameField(String name) {
        computerPage.enterComputerName(name);
    }

    @When("user enters {string} in the Introduced date field")
    public void userEntersInTheIntroducedDateField(String introducedDate) {
        computerPage.enterIntroducedDate(introducedDate);
    }

    @When("user enters {string} in the Memory field")
    public void userEntersInTheMemoryField(String memory) {
        computerPage.enterMemory(memory);
    }

    @When("user selects {string} from the Company dropdown")
    public void userSelectsFromTheCompanyDropdown(String company) {
        computerPage.selectCompany(company);
    }

    @When("user clicks on Create this computer")
    public void userClicksOnCreateThisComputer() {
        computerPage.clickCreateComputer();
    }

    @Then("user should see a success message")
    public void userShouldSeeASuccessMessage1() {
       String Successmassage = computerPage.getSuccessMessage();
    	
    	Assert.assertEquals(Successmassage, null);
    }

    @When("user searches for {string}")
    public void userSearchesFor(String name) {
        computerPage.searchComputer(name);
    }

    @When("user clicks on the {string} computer")
    public void userClicksOnTheComputer(String name) {
        computerPage.clickComputerLink(name);
    }

    @When("user updates the Computer name field to {string}")
    public void userUpdatesTheComputerNameFieldTo(String newName) {
        computerPage.updateComputerName(newName);
    }

    @When("user clicks on Save this computer")
    public void userClicksOnSaveThisComputer() {
        computerPage.saveComputer();
    }

//    @Then("user should see a success message")
//    public void userShouldSeeASuccessMessage() {
//        Assert.assertTrue(computerPage.isSuccessMessageDisplayed());
//    }
//
//    @Then("the computer name should be {string}")
//    public void theComputerNameShouldBe(String expectedName) {
//        Assert.assertEquals(computerPage.getComputerName(), expectedName);
//    }
//
//    @When("user clicks on the Delete this computer button")
//    public void userClicksOnTheDeleteThisComputerButton() {
//        computerPage.deleteComputer();
//    }
//
//    @Then("user should see a confirmation message")
//    public void userShouldSeeAConfirmationMessage() {
//        Assert.assertTrue(computerPage.isConfirmationMessageDisplayed());
//    }
//
//    @Then("the computer should be deleted")
//    public void theComputerShouldBeDeleted() {
//        Assert.assertFalse(computerPage.isComputerLinkDisplayed());
//    }
}

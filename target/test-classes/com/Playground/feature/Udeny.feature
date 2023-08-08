
@tag
Feature: This is a demo feature file for udemy

  Background: Background steps
    Given User navigates to the udemy page
    When User logins with the valid credentials
    Then User validates the udemy home page
Scenario: Positive scenario
    When User clicks on my learning
    Then User shoud see able to see the contents
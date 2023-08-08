@tag
Feature: This is a demo feature file for Orange HRM

  Background: Background steps
    Given User navigates to the Orange HRM page
    When User logins with the valida credentials
    Then User validates the Orange HRm home page

  Scenario: Positive scenario
    When User clicks on leave 
    Then User shoud see Leave page displayed
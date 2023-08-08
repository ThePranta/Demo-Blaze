@Computer
Feature: Manage Computers



Scenario: Search for a computer
    Given user is on the homepage
    When user enters "MacBook" in the search field
    And user clicks on Filter by name button
    Then user should see a list of computers containing "MacBook"

Scenario: Add a new computer
    Given user is on the homepage
    When user clicks on Add a new computer button
    And user enters "MacBook Pro" in the Computer name field
    And user enters "2021-06-14" in the Introduced date field
    And user enters "2026-06-14" in the Memory field
    And user selects "Apple Inc." from the Company dropdown
    And user clicks on Create this computer
    Then user should see a success message

Scenario: Edit a computer
    Given user is on the homepage
    When user searches for "MacBook Pro"
    And user clicks on the "MacBook Pro" computer
    And user updates the Computer name field to "MacBook Pro 2023"
    And user clicks on Save this computer
    Then user should see a success message
    #And the computer name should be "MacBook Pro 2023"

Scenario: Delete a computer
    Given user is on the homepage
    When user searches for "MacBook Pro 2023"
    And user clicks on the "MacBook Pro 2023" computer
 #   And user clicks on the Delete this computer button
  #  Then user should see a confirmation message
   # And the computer should be deleted

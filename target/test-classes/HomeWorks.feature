##  - Create feature file steps for below scenarios :
####            1) Verify that "Get Quote" button  is navigating application ?
####            2) Verify that in finance detail you should be able to select only one option.
####            3) Verify that when you complete application you should be able to see "Let us call you" button

Feature: Functional Testing on RenasTech Practice

  @HomeworksLab1
  Scenario: Verify that "Get Quote" button  is navigating application ?
    Given The user wants to go to Renastech Practice Website
    When The user wants to click Insurance Button
    And The user wants to click Get a Quote Button
    Then The user wants to be make sure Navigated

  @HomeworksLab1
  Scenario: Verify that in finance detail you should be able to select only one option.
    Given The user wants to go to Renastech Practice Website
    When The user wants to click Insurance Button
    And The user wants to click Get a Quote Button
    And The user wants to click Finance Details
    Then The user wants to select only one option

  @HomeworksLab1
  Scenario: Verify that when you complete application you should be able to see "Let us call you" button
    Given The user wants to go to Renastech Practice Website
    When The user wants to click Insurance Button
    And The user wants to click Get a Quote Button
    And The user wants to select vehicle year,make and model
    Then The user wants to select only one option
    And The user wants to enter "25"
    And The user wants to click annual distance
    And The user wants to choose a "1/2/2023"
    And The user wants to decide for winter tires
    And The user wants to decide for saving program
    And The user wants to enter driver license number
    And The user wants to select does he have a another driver license
    Then The user wants to click Submit button
    And The user wants to verify that "Let us call you" button is displayed




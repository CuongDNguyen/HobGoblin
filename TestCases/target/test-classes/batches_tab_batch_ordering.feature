#Author: Michael Sikorski
#Feature: Ordering of batches in the Batches tab
@BatchesTabOrderingTest
Feature: Ordering of batches in Batches tab
  
  I want to order batches according to start date,
  end date, room, building, location, trainer/cotrainer, 
  focus, curriculum, or name (ascending and descending order).

  Scenario: Logging in
    Given I have just logged in(batches)
    And I clicked on the Batches tab
    Then Browser should land on the batches page

  Scenario: Redirected to batches page
    Given I just landed on the Batches page
    Then batches should be in ascending order according to start date

  Scenario: Click start date column once
    Given I am on the Batches page
    And I clicked on start date column(batches)
    Then batches should be in descending order according to start date

  Scenario: Click start date column again
    Given I have already clicked on start date once
    And I clicked on start date column(batches)
    Then batches should be in ascending order according to start date

  Scenario: Click end date column
    Given I am on the Batches page
    And I click on end date column(batches)
    Then batches should be in ascending order according to end date

  Scenario: Click end date column again
    Given I am on the Batches page
    And I click on end date column(batches) again
    Then batches should be in descending order according to end date

  Scenario: Click room column once
    Given I am on the Batches page
    And I click on room column(batches)
    Then batches should be in ascending order according to room

  Scenario: Click room column again
    Given I am on the Batches page
    And I click on room column(batches) again
    Then batches should be in descending order according to room

  Scenario: Click building column once
    Given I am on the Batches page
    And I click on building column(batches)
    Then batches should be in ascending order according to building

  Scenario: Click building column again
    Given I am on the Batches page
    And I click on building column(batches) again
    Then batches should be in descending order according to building

  Scenario: Click location column once
    Given I am on the Batches page
    And I click on location column(batches)
    Then batches should be in ascending order according to location

  Scenario: Click location column again
    Given I am on the Batches page
    And I click on location column(batches) again
    Then batches should be in descending order according to location

  Scenario: Click trainer/cotrainer column once
    Given I am on the Batches page
    And I click on trainer/cotrainer column(batches)
    Then batches should be in ascending order according to trainer/cotrainer

  Scenario: Click trainer/cotrainer column again
    Given I am on the Batches page
    And I click on trainer/cotrainer column(batches) again
    Then batches should be in descending order according to trainer/cotrainer

  Scenario: Click focus column once
    Given I am on the Batches page
    And I click on focus column(batches)
    Then batches should be in ascending order according to focus

  Scenario: Click focus column again
    Given I am on the Batches page
    And I click on focus column(batches) again
    Then batches should be in descending order according to focus

  Scenario: Click curriculum column once
    Given I am on the Batches page
    And I click on curriculum column(batches)
    Then batches should be in ascending order according to curriculum

  Scenario: Click curriculum column again
    Given I am on the Batches page
    And I click on curriculum column(batches) again
    Then batches should be in descending order according to curriculum

  Scenario: Click name column once
    Given I am on the Batches page
    And I click on name column(batches)
    Then batches should be in ascending order according to name

  Scenario: Click name column again
    Given I am on the Batches page
    And I click on name column(batches) again
    Then batches should be in descending order according to name

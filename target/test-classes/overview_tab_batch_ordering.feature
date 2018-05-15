#Author: Michael Sikorski
#Feature: Ordering of batches in the Overview tab
@OverviewTabOrderingTest
Feature: Ordering of batches in Overview tab
  
  I want to order batches according to start date,
  end date, room, building, location, trainer/cotrainer, 
  curriculum, or name (ascending and descending order).

  Scenario: Default ordering
    Given I have just logged in
    And I have landed on the overview tab
    Then batches should be in ascending order according to start date

  Scenario: Click start date column once
    Given I am on the overview tab
    And I clicked on start date column(overview)
    Then batches should be in descending order according to start date

  Scenario: Click start date column again
    Given I have already clicked on start date once
    And I clicked on start date column(overview)
    Then batches should be in ascending order according to start date

  Scenario: Click end date column
    Given I am on the overview page
    And I click on end date column(overview)
    Then batches should be in ascending order according to end date

  Scenario: Click end date column again
    Given I am on the overview page
    And I click on end date column(overview) again
    Then batches should be in descending order according to end date

  Scenario: Click room column once
    Given I am on the overview page
    And I click on room column(overview)
    Then batches should be in ascending order according to room

  Scenario: Click room column again
    Given I am on the overview page
    And I click on room column(overview) again
    Then batches should be in descending order according to room

  Scenario: Click building column once
    Given I am on the overview page
    And I click on building column(overview) 
    Then batches should be in ascending order according to building

  Scenario: Click building column again
    Given I am on the overview page
    And I click on building column(overview) again
    Then batches should be in descending order according to building

  Scenario: Click location column once
    Given I am on the overview page
    And I click on location column(overview)
    Then batches should be in ascending order according to location

  Scenario: Click location column again
    Given I am on the overview page
    And I click on location column(overview) again
    Then batches should be in descending order according to location

  Scenario: Click trainer/cotrainer column once
    Given I am on the overview page
    And I click on trainer/cotrainer column(overview)
    Then batches should be in ascending order according to trainer/cotrainer

  Scenario: Click trainer/cotrainer column again
    Given I am on the overview page
    And I click on trainer/cotrainer column(overview) again
    Then batches should be in descending order according to trainer/cotrainer

  Scenario: Click curriculum column once
    Given I am on the overview page
    And I click on curriculum column(overview)
    Then batches should be in ascending order according to curriculum

  Scenario: Click curriculum column again
    Given I am on the overview page
    And I click on curriculum column(overview) again
    Then batches should be in descending order according to curriculum

  Scenario: Click name column once
    Given I am on the overview page
    And I click on name column(overview)
    Then batches should be in ascending order according to name

  Scenario: Click name column again
    Given I am on the overview page
    And I click on name column(overview) again
    Then batches should be in descending order according to name

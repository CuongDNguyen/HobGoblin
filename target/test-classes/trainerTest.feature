
@trainerTest
Feature: To test trainer tab
  I want to test functionality of trainer tab

@defaultTrainer
Scenario: Default Look of Trainer Tab

Given navigate to trainer tab
When trainer tab is clicked
Then trainer tables should show

@viewPTO
Scenario: view PTO calendar

Given navigate to trainer
When tab is clicked
And calendar button clicked
Then Calender shows

@newTrainer
Scenario: add new trainer

Given navigate to vp trainer
When add trainer button clicked
And add trainer form filled
Then new trainer added

@trainerResume
Scenario: download trainer resume
Given navigate to vp trainer tab
When download resume button clicked
Then download resume




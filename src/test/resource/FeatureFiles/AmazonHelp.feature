@regression @smoke @Amazon-09 @E2E
Feature: Amazon Help Functionality

Background: 
	Given Open Amazon Homepage

	Scenario: Amazon Help Functionality
		When Click on Help
		And Click on Track Your Package
		And Play Video 
		And Close The Video
		Then Help and Customer Service Page Should Appear
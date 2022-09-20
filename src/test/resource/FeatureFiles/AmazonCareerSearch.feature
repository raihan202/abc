@regression @smoke @Amazon-10 @E2E
Feature: Amazon Career Search Functionality

	Scenario: Amazon Career Search Functionality
		Given Open Amazon Homepage
		When Click on Career
		And Search for Job
		And Search for Location
		And Click on Search
		Then Job Search Result Should Appear
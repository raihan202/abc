@regression @smoke @Amazon-08 @E2E
Feature: Amazon Logo is Clickable Functionality

Background: 
	Given Open Amazon Homepage
	
	Scenario: Amazon Logo is Clickable 
		When Search for Laptop
		And Verify Laptop Page
		And Click on Amazon Logo
		Then Amazon Homepage Should Appear
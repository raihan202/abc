@regression @smoke @Amazon-07 @E2E
Feature: Amazon All Menu Button Functionally

	Scenario: Amazon All Menu Button Functionally
		
		Given Open Amazon Homepage
		When Open All Menu
		And Select Amazon Fresh
		And Select All Amazon Fresh
		Then Item List Should Show Amazon Fresh Products
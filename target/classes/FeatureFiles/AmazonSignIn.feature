@regression @smoke @Amazon-06 @E2E
Feature: Amazon Sign In Functionality

	Scenario: Amazon Sign In Functionality
		Given Open Amazon Homepage
		When Mousehover to Account List
		And Click on Sign In
		And Enter Email or Mobile Phone Number
		And Click on Continue
		And Enter  Wrong Password
		And Click Sign-In
		Then Wrong Password Alert Page Should Appear
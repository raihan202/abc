@regression @smoke @Amazon-03 @E2E
Feature: Amazon Cart Functionality 

Descreption: User should able to add items in Functionality

Background: 
	Given Open Amazon Homepage
	
Scenario: Amazon Cart Functionality 
	Given Search for Shirt
	When Select the first shirt on item list
	And Select Material Type
	And Select Color
	And Select Size
	And Select Quantity
	Then Add to Cart
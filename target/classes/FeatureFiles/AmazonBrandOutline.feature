@regression @smoke @Amazon-02 @E2E
Feature: Amazon Band Outline


Descreption: User should able to filter items by Brand

Background: 
	Given Open Amazon Homepage
	
Scenario Outline: Filter items by Brand 
	Given Search for "<Items>"
	When Filter by "<Brand>"
	Then Item list should have products of "<Brand>"
	
	Examples:
		|Items			|Brand			|
		|Shoes			|Adidas			|
		|Shirts			|Under Armour	|
		|Pants			|Hanes			|
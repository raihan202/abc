package upskill.amazon.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.AmazonSearchResultActions;

public class AmazonSearchResultSteps {
	
	AmazonSearchResultActions AmazonSearchResultActionsObj = new AmazonSearchResultActions();
	
	
	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		AmazonSearchResultActionsObj.verifyShoes();
	}

	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		AmazonSearchResultActionsObj.filterBrand(brand);
		
	}

	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
		AmazonSearchResultActionsObj.verifyBrandItems(brand);
	}
	@When("^Select the first shirt on item list$")
	public void select_the_first_shirt_on_item_list() throws Throwable {
		AmazonSearchResultActionsObj.selectShirt();
	}
	
	@Then("^Item List Should Show Amazon Fresh Products$")
	public void item_List_Should_Show_Amazon_Fresh_Products() throws Throwable {
		AmazonSearchResultActionsObj.selectFresh();
	}
	@When("^Enter Email or Mobile Phone Number$")
	public void enter_Email_or_Mobile_Phone_Number() throws Throwable {
		AmazonSearchResultActionsObj.enterEmailPhone();
	}

	@When("^Click on Continue$")
	public void click_on_Continue() throws Throwable {
		AmazonSearchResultActionsObj.clickContinue();
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
		AmazonSearchResultActionsObj.enterPassword();
	}

	@When("^Click Sign-In$")
	public void click_Sign_In() throws Throwable {
		AmazonSearchResultActionsObj.clickSignIn();
	}

	@Then("^User Should Able to Sign-in and Homepage Appear$")
	public void user_Should_Able_to_Sign_in_and_Homepage_Appear() throws Throwable {
		AmazonSearchResultActionsObj.signInHomepage();
	}

	
	
	
	
	//Ama-10 Search Job
	@When("^Search for Job$")
	public void search_for_Job() throws Throwable {
		AmazonSearchResultActionsObj.searchJob();  
	}
	//Search Location
	@When("^Search for Location$")
	public void search_for_Location() throws Throwable {
		AmazonSearchResultActionsObj.searchLocation();
	}
	//Ama-10-Click 
	@When("^Click on Search$")
	public void click_on_Search() throws Throwable {
		AmazonSearchResultActionsObj.clickJobSearch();
	}
	// Ama-10-Job Search Result Appear
	@Then("^Job Search Result Should Appear$")
	public void job_Search_Result_Should_Appear() throws Throwable {
		AmazonSearchResultActionsObj.jobSearchPage();
	}
	//---
	//Ama-09-Click Track Your Package
	@When("^Click on Track Your Package$")
	public void click_on_Track_Your_Package() throws Throwable {
		AmazonSearchResultActionsObj.trackYourPackage();
	}
	//Ama-09-Play Video
	@When("^Play Video$")
	public void play_Video() throws Throwable {
		AmazonSearchResultActionsObj.switchNewWindow();
		AmazonSearchResultActionsObj.playVideo();
	}
	//Ama-09-Close the Video
	@When("^Close The Video$")
	public void close_The_Video() throws Throwable {
		AmazonSearchResultActionsObj.closeVideo();
	}
	//Ama-09-Help & Customer Page
	@Then("^Help and Customer Service Page Should Appear$")
	public void help_and_Customer_Service_Page_Should_Appear() throws Throwable {
		AmazonSearchResultActionsObj.helpAndCustomer();
	}

	//---------
	//Ama-08-Verify Laptop
	@When("^Verify Laptop Page$")
	public void verify_Laptop_Page() throws Throwable {
		AmazonSearchResultActionsObj.verifyLaptop();
	}

	@When("^Click on Amazon Logo$")
	public void click_on_Amazon_Logo() throws Throwable {
		AmazonSearchResultActionsObj.clickLogo();
	}
	//----
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}












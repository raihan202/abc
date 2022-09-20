package upskill.amazon.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.AmazonHomepageActions;

public class AmazonHomepageSteps {

	AmazonHomepageActions AmazonHomepageActionsObj = new AmazonHomepageActions();
	
//------Ama-01-Shoes	
	@Given("^Open Amazon Homepage$")
	public void open_Amazon_Homepage() throws Throwable {
		
	}

	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		AmazonHomepageActionsObj.searchShoes();	
	}
//------Ama-02-BrandOutline
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		AmazonHomepageActionsObj.searchItems(items);
	}
	
	@Given("^Search for Shirt$")
	public void search_for_Shirt() throws Throwable {
		AmazonHomepageActionsObj.searchShirt();
	}
//-------Ama-04-Mousehover	
	@When("^Mousehover to Prime$")
	public void mousehover_to_Prime() throws Throwable {
		AmazonHomepageActionsObj.mousehoverPrime();
	}

	@Then("^Click on Try Prime$")
	public void click_on_Try_Prime() throws Throwable {
		AmazonHomepageActionsObj.clickTryPrime();
	}
//------Ama-07-AllMenu
	@When("^Open All Menu$")
	public void open_All_Menu() throws Throwable {
		AmazonHomepageActionsObj.openAllMenu();
	}

	@When("^Select Amazon Fresh$")
	public void select_Amazon_Fresh() throws Throwable {
		AmazonHomepageActionsObj.amazonFresh();
	}

	@When("^Select All Amazon Fresh$")
	public void select_All_Amazon_Fresh() throws Throwable {
		AmazonHomepageActionsObj.allAmazonFresh();
	}
//-------Ama-06-SignIn
	@When("^Mousehover to Account List$")
	public void mousehover_to_Account_List() throws Throwable {
		AmazonHomepageActionsObj.mousehoverAccountList();
	}

	@When("^Click on Sign In$")
	public void click_on_Sign_In() throws Throwable {
		AmazonHomepageActionsObj.signIn();
	}
//------Ama-10-Career	

	@When("^Click on Career$")
	public void click_on_Career() throws Throwable {
		AmazonHomepageActionsObj.searchCareer();
	}
//-----Ama-09-Help
	
	@When("^Click on Help$")
	public void click_on_Help() throws Throwable {
		AmazonHomepageActionsObj.clickHelp();
	}
//------Ama-08-LogoClickable
	
	@When("^Search for Laptop$")
	public void search_for_Laptop() throws Throwable {
		AmazonHomepageActionsObj.searchLaptop();
	}
	
	@Then("^Amazon Homepage Should Appear$")
	public void amazon_Homepage_Should_Appear() throws Throwable {
		AmazonHomepageActionsObj.logoHomepage();
	}
//-----
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}

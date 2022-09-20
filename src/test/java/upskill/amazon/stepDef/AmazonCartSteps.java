package upskill.amazon.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.AmazonCartActions;

public class AmazonCartSteps {

	AmazonCartActions AmazonCartActionsObj = new AmazonCartActions();
	
	@When("^Select Material Type$")
	public void select_Material_Type() throws Throwable {
	AmazonCartActionsObj.selectMaterialType();
	}

	@When("^Select Color$")
	public void select_Color() throws Throwable {
		AmazonCartActionsObj.selectColour();
	}

	@When("^Select Size$")
	public void select_Size() throws Throwable {
		AmazonCartActionsObj.selectSizeDD();
	}

	@When("^Select Quantity$")
	public void select_Quantity() throws Throwable {
		AmazonCartActionsObj.selectQuantityDD();
	}

	@Then("^Add to Cart$")
	public void add_to_cart() throws Throwable {
		AmazonCartActionsObj.addToCart();
	}
}

package upskill.amazon.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.amazon.pageElements.AmazonCartLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class AmazonCartActions {

	AmazonCartLocators AmazonCartLocatorsObj;
	
	public AmazonCartActions(){
		AmazonCartLocatorsObj = new AmazonCartLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonCartLocatorsObj);
	}

	public void selectMaterialType() throws Exception {
		AmazonCartLocatorsObj.btnMaterialType.click();
		Thread.sleep(5000);
	}

	public void selectColour() throws Exception {
		AmazonCartLocatorsObj.btnColor.click();
		Thread.sleep(2000);
	}

	public void selectSizeDD() throws Exception {
		Select dropDown = new Select(AmazonCartLocatorsObj.ddSize);
		dropDown.selectByVisibleText(ReadExcelSheet.getMapData("AmaCart-01"));
		Thread.sleep(2000);
	}

	public void selectQuantityDD() throws Exception {
		Select dropDown = new Select(AmazonCartLocatorsObj.ddQty);
		dropDown.selectByVisibleText(ReadExcelSheet.getMapData("AmaCart-02"));
		Thread.sleep(2000);
	}
	public void addToCart() throws Exception {
		AmazonCartLocatorsObj.btnAddCart.click();
		Thread.sleep(2000);
	}


}

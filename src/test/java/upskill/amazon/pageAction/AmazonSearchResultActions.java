package upskill.amazon.pageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import upskill.amazon.pageElements.AmazonHomepageLocators;
import upskill.amazon.pageElements.AmazonSearchResultLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class AmazonSearchResultActions {

	AmazonSearchResultLocators AmazonSearchResultLocatorsObj;


	public AmazonSearchResultActions() {
		AmazonSearchResultLocatorsObj = new AmazonSearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonSearchResultLocatorsObj);
		
	}

	public void verifyShoes(){
	AmazonSearchResultLocatorsObj.txtShoes.isDisplayed();
	
	}

	public void filterBrand(String brand){
		if(brand.equals("Adidas")){
		AmazonSearchResultLocatorsObj.cbxBrandAdidas.click();
		} else if(brand.equals("Under Armour")){
			AmazonSearchResultLocatorsObj.cbxBrandUnderArmour.click();
		} else if(brand.equals("Hanes")){
			AmazonSearchResultLocatorsObj.cbxBrandHanes.click();
		} else {
		System.out.println(" Brand not found, please implement");
		}
		}	

	public void verifyBrandItems(String brand){
		if(brand.equals("Adidas")){
			AmazonSearchResultLocatorsObj.txtShoes.isDisplayed();
			} else if(brand.equals("Under Armour")){
				AmazonSearchResultLocatorsObj.txtShirts.isDisplayed();
			} else if(brand.equals("Hanes")){
				AmazonSearchResultLocatorsObj.txtPants.isDisplayed();
			} else {
			System.out.println(" Brand not found, please implement");
			}
		
	}
	public void selectShirt(){
		AmazonSearchResultLocatorsObj.linkShirt.click();
	}
	public void selectFresh() throws Exception {
		AmazonSearchResultLocatorsObj.btnClickFresh.click();
		Thread.sleep(2000);
	}

	public void enterEmailPhone(){
		AmazonSearchResultLocatorsObj.linkUserID.sendKeys("imtiaz.anu@gmail.com");
		
	}
	
	public void clickContinue(){
		AmazonSearchResultLocatorsObj.btnContinue.click();
	}
	
	public void enterPassword(){
		AmazonSearchResultLocatorsObj.linkPassword.sendKeys("abcd");
	}
	
	public void clickSignIn(){
		AmazonSearchResultLocatorsObj.clickSignIn.click();
	}
	
	public void signInHomepage(){
		AmazonSearchResultLocatorsObj.appHomepage.isDisplayed();
	}
	//Ama-10-Job Search
	public void searchJob() throws Exception {
		AmazonSearchResultLocatorsObj.txtJobSearch.sendKeys(ReadExcelSheet.getMapData("AmaCareer-01"));
		Thread.sleep(2000);
	}
		
	public void searchLocation() throws Exception{
		AmazonSearchResultLocatorsObj.txtJobLocation.sendKeys(ReadExcelSheet.getMapData("AmaCareer-02"));
		Thread.sleep(2000);
	}
	
	public void clickJobSearch() throws Exception {
		AmazonSearchResultLocatorsObj.btnJobSearch.click();	
		Thread.sleep(2000);
	}
	public void jobSearchPage(){
		AmazonSearchResultLocatorsObj.jobHomepage.isDisplayed();
	}
	
	//-----
	//Ama-09-Click Your Page
	public void trackYourPackage() throws Exception{
		AmazonSearchResultLocatorsObj.btnTrackPage.click();
		Thread.sleep(2000);
	}
	
	public void switchNewWindow(){
		for(String winhandle : SetupDrivers.driver.getWindowHandles()){
			SetupDrivers.driver.switchTo().window(winhandle);	
		}		
	}
	//Play Video
	public void playVideo() throws Exception{
		AmazonSearchResultLocatorsObj.btnPlay.click();
		Thread.sleep(2000);
	}
	//Close Video
	public void closeVideo() throws Exception {
//		AmazonSearchResultLocatorsObj.btnCloseVideo.click();
//		for(String winhandle : SetupDrivers.driver.getWindowHandles()){
//			SetupDrivers.driver.switchTo().window(winhandle);	
//		}
//		SetupDrivers.driver.switchTo().frame("vidContainer");
		JavascriptExecutor js = (JavascriptExecutor) SetupDrivers.driver;
		js.executeScript("AmazonSearchResultLocatorsObj.btnCloseVideo.click()");
	}
	//Ama-09-Help & Customer Page Appear
	public void helpAndCustomer(){
		AmazonSearchResultLocatorsObj.helpHomepage.isDisplayed();
	}
	//--------
	//Ama-08-Verify Laptop
	public void verifyLaptop(){
		AmazonSearchResultLocatorsObj.vfyLaptop.isDisplayed();	
	}
	//AMa-08-Click Amazon Logo
	public void clickLogo(){
		AmazonSearchResultLocatorsObj.btnLogo.click();
	}
	
	

}

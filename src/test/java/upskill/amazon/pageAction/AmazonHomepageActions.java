package upskill.amazon.pageAction;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.amazon.pageElements.AmazonHomepageLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class AmazonHomepageActions {

	AmazonHomepageLocators AmazonHomepageLocatorsObj;

	public AmazonHomepageActions() {
		AmazonHomepageLocatorsObj = new AmazonHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonHomepageLocatorsObj);
	}
	public void searchShoes() throws Exception{
		AmazonHomepageLocatorsObj.txtbxSearch.sendKeys(ReadExcelSheet.getMapData("AmaSearch"));
		Thread.sleep(3000);
		AmazonHomepageLocatorsObj.btnSearch.click();	
		
//		AmazonHomepageLocatorsObj.txtbxSearch.sendKeys("Shoes");
//		JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver;
//		js.executeScript("AmazonHomepageLocatorsObj.btnSearch.click();");
//		
	}
	
	public void searchItems(String items){
		AmazonHomepageLocatorsObj.txtbxSearch.sendKeys(items);
		AmazonHomepageLocatorsObj.btnSearch.click();
		
	}
	
	public void seleniumWaits(){
		
		System.out.println("Page Title  : " + SetupDrivers.driver.getTitle());							
		
		SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);					
		
		WebDriverWait wait = new WebDriverWait(SetupDrivers.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(AmazonHomepageLocatorsObj.txtbxSearch)); 	
		
		FluentWait fluentWait = new FluentWait(SetupDrivers.driver);									
						fluentWait.withTimeout(10, TimeUnit.SECONDS);
						fluentWait.pollingEvery(2, TimeUnit.SECONDS);
						fluentWait.ignoring(NoSuchElementException.class);
						fluentWait.withMessage("Fluent Wait Time exceeded");
	}
	
	
	public void searchShirt(){
		AmazonHomepageLocatorsObj.txtbxSearch.sendKeys("Shirt");
		AmazonHomepageLocatorsObj.btnSearch.click();
	}
	
	public void mousehoverPrime() throws Exception {
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(AmazonHomepageLocatorsObj.linkPrime);
		actions.perform();
		Thread.sleep(3000);
	}
	
	public void clickTryPrime() throws Exception{
		AmazonHomepageLocatorsObj.linkTryPrime.isEnabled();
		AmazonHomepageLocatorsObj.linkTryPrime.click();	
		Thread.sleep(3000);
	}
	
	public void openAllMenu() throws Exception{
		AmazonHomepageLocatorsObj.btnClickMenu.isEnabled();
		AmazonHomepageLocatorsObj.btnClickMenu.click();
		Thread.sleep(2000);
	}
	public void amazonFresh() throws Exception{
		AmazonHomepageLocatorsObj.linkAmazonFresh.isEnabled();
		AmazonHomepageLocatorsObj.linkAmazonFresh.click();
		Thread.sleep(2000);
	}
	public void allAmazonFresh() throws Exception{
		AmazonHomepageLocatorsObj.linkAllFresh.isEnabled();
		AmazonHomepageLocatorsObj.linkAllFresh.click();
		Thread.sleep(2000);
	}

	public void mousehoverAccountList() throws Exception{
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(AmazonHomepageLocatorsObj.linkSignIn);
		actions.perform();
		Thread.sleep(3000);	
	}
	
	public void signIn(){
		AmazonHomepageLocatorsObj.btnSignIn.isEnabled();
		AmazonHomepageLocatorsObj.btnSignIn.click();	
	}
	
	
	//Ama-10 Job Search
	public void searchCareer(){
		AmazonHomepageLocatorsObj.btnCareer.click();	
	}
	//------
	//Ama-09-
	public void clickHelp(){
		AmazonHomepageLocatorsObj.btnHelp.click();
	}
	//---Ama-08-Logo
	
	public void searchLaptop() throws Exception{
		AmazonHomepageLocatorsObj.txtbxSearch.sendKeys(ReadExcelSheet.getMapData("AmaLogo"));
		Thread.sleep(3000);
		AmazonHomepageLocatorsObj.btnSearch.click();
		
	}
	public void logoHomepage(){
		AmazonHomepageLocatorsObj.homepageAppear.isDisplayed();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

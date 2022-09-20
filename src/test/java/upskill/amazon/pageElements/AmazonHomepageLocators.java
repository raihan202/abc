package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomepageLocators {

	//Search Text Box
	@FindBy (xpath="//input[@aria-label='Search']")
	public WebElement txtbxSearch;
	
	//Search Button
	@FindBy (xpath="//input[@type='submit']")
	public WebElement btnSearch;
	
	//Prime Link
	@FindBy (xpath="//a[@id='nav-link-amazonprime']") 		
	public WebElement linkPrime;
	

	//Prime Try Link
	@FindBy (xpath="//a[contains(text(),'Try Prime')]")
	public WebElement linkTryPrime;

	//Open All Menu
	@FindBy (xpath="//a[@id='nav-hamburger-menu']")
	public WebElement btnClickMenu;

	
	//Select Amazon Fresh
	@FindBy (xpath="//div[contains(text(),'Amazon Fresh')]")
	public WebElement linkAmazonFresh;
	
	//Select All Amazon Fresh
	@FindBy (xpath="//a[contains(text(),'All Amazon Fresh')]")
	public WebElement linkAllFresh;
	
	
//	@FindBy (xpath="")
//	public WebElement abc;
	
	//Mouseover Account list
	@FindBy (xpath="//a[@id='nav-link-accountList']")
	public WebElement linkSignIn;
	
	//Select Sign In
	@FindBy (xpath="//a[@data-nav-ref='nav_signin']")
	public WebElement btnSignIn;
	
	
	@FindBy (xpath="//div[@id='pageContent']")
	public WebElement displayHomepage;
		
	//Ama-10 Click on Career
	@FindBy (xpath="//a[contains(text(),'Careers')]")
	public WebElement btnCareer;
	
	//-----
	//Ama-09-Click on Help
	@FindBy (xpath="//a[contains(text(),'Help')]")
	public WebElement btnHelp;
	//----
	//Ama-08-Search For Laptop
	@FindBy (xpath="(//span[contains(text(),'Laptop')])[1]")
	public WebElement txtLaptop;
	
	//Amazon Homepage Appear
	@FindBy (xpath="//div[@id='pageContent']")
	public WebElement homepageAppear;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

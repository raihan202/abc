package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchResultLocators {

	
	//Validate Shoes Items
	@FindBy (xpath="//span[contains(text(),'shoes')]")
	public WebElement txtShoes;

	//Validate Shirts Items
	@FindBy (xpath="(//span[contains(text(),'shirts')])[1]")
	public WebElement txtShirts;
	
	//Validate Pants Items
	@FindBy (xpath="(//span[contains(text(),'pants')])[1]")
	public WebElement txtPants;
	
	//Checkbox Brand Adidas
	@FindBy (xpath="//li[@aria-label='adidas']")
	public WebElement cbxBrandAdidas;
	
	//Checkbox Brand Nike
	@FindBy (xpath="//li[@aria-label='Under Armour']")
	public WebElement cbxBrandUnderArmour;
		
	//Checkbox Brand Hanes
	@FindBy (xpath="//li[@aria-label='Hanes']")
	public WebElement cbxBrandHanes;
	
	//Link Shirt
	@FindBy (xpath="(//span[contains(text(),'Regular-Fit Quick-Dry Golf Polo Shirt')])[1]")
	public WebElement linkShirt;
	
	//Amazon Fresh Products
	@FindBy (xpath="//a[@aria-label='Amazon Fresh Logo']")
	public WebElement btnClickFresh;

//	@FindBy (xpath="")
//	public WebElement abc;
	
	//Enter Email or Mobile Phone 
	@FindBy (xpath="//input[@id='ap_email']")
	public WebElement linkUserID;
	
	//Click on Continue
	@FindBy (xpath="//input[@id='continue']")
	public WebElement btnContinue;
	
	//Enter Password
	@FindBy (xpath="//input[@id='ap_password']")
	public WebElement linkPassword;
	
	//Click Sign In
	@FindBy (xpath="//input[@id='signInSubmit']")
	public WebElement clickSignIn;
	
	// User Sign In and Homepage Appear
	@FindBy (xpath="//span[contains(text(),'Hello, Anu')]")
	public WebElement appHomepage;
	
	//-------------------------------------------
//	//Search Text Box
//	@FindBy (xpath="//input[@aria-label='Search']")
//	public WebElement txtbxSearch;
//		
//	//Search Button
//	@FindBy (xpath="//input[@type='submit']")
//	public WebElement btnSearch;
	
	//Ama-08 Search for Laptop
	@FindBy (xpath="(//span[contains(text(),'Laptop')])[1]")
	public WebElement txtLaptop;
	
	//Ama-08Click on Logo
	@FindBy (xpath="//a[@aria-label='Amazon']")
	public WebElement btnClickLogo;
	
	
	//Ama-10 Search Job
	@FindBy (xpath="(//input[@placeholder='Search for jobs by title or keyword'])[2]")
	public WebElement txtJobSearch;
	
	//Ama-10 Search Location
	@FindBy (xpath="(//input[@id='location-typeahead'])[2]")
	public WebElement txtJobLocation;
	
	//Ama-10 Click
	@FindBy (xpath="//button[@id='search-button']")
	public WebElement btnJobSearch;
		
	//Ama-10 Job Search Page Appear
	@FindBy (xpath="(//div[@class='container'])[1]")
	public WebElement jobHomepage;
	
//-----
	
	//Ama-09-Click Track Your Package
	@FindBy (xpath="(//div[contains(text(),'Track your package')])[1]")
	public WebElement btnTrackPage;
		
	//Ama-09-Play Video
	//@FindBy (xpath="//div[@class='vidContainer']")
	@FindBy (xpath="//div[@class='playBox']")
	public WebElement btnPlay;
	
	//Ama-09-Close Video
	//@FindBy (xpath="//a[@onclick='cVid()']")
	@FindBy (xpath="//a[@id='close-btn']")
	public WebElement btnCloseVideo;
		
	//Ama-09-Help & Customer Page
	@FindBy (xpath="(//div[@class='inner'])[1]")
	public WebElement helpHomepage;
	////a[contains(text(),'Help & Customer Service')]
	//-----
	//Ama-08-Verify Laptop Page
	@FindBy (xpath="(//span[contains(text(),'Laptop')])[1]")
	public WebElement vfyLaptop;
	
	//Click on Amazon Logo	
	@FindBy (xpath="//a[@aria-label='Amazon']")
	public WebElement btnLogo;
	//---------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	











}

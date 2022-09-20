package upskill.amazon.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.amazon.pageElements.RahulHomepageLocators;
import upskill.utilities.SetupDrivers;

public class RahulHomepageActions {

	RahulHomepageLocators RahulHomepageLocatorsObj;
	
	public RahulHomepageActions(){
		
		RahulHomepageLocatorsObj = new RahulHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, RahulHomepageLocatorsObj);
	}
	
	public void loadRahulHomepage() throws Exception {
		Thread.sleep(2000);
		SetupDrivers.class.g.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(4000);
		
		
	}
}

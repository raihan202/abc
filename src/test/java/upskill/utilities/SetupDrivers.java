package upskill.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {
	
	public static WebDriver driver;							
	
	public static void setupDriver(){
//		System.setProperty("webdriver.chrome.driver", "C:\\UpSkillSoftware\\chromeDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();				
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("--start-maximized");			
		options.addArguments("--disable-notifications");	
//		options.addArguments("--headless");					
		driver = new ChromeDriver(options);					
		driver.get("https://www.amazon.com/");				
		//SetupDrivers.driver.switchTo().alert().dismiss();
		//System.out.println(driver.getTitle());	
		
	}
	
	public static WebDriver getDriver(){
		return driver;										
	}
	
	public static void tearDownDriver(){
		driver.close();										
		driver.quit();										
	}
}

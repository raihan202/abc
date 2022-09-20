package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonCartLocators {

	//Material Type
		@FindBy (xpath="//p[contains(text(),'Recycled Polyester')]")
		public WebElement btnMaterialType;
	
	//Shirt Colour
		@FindBy (xpath="//img[@alt='Red']")
		public WebElement btnColor;
			
	//Shirt Size
		//@FindBy (xpath="//span[contains(text(),'Small')]")
	
		@FindBy (xpath="//select[@id = 'native_dropdown_selected_size_name']")
		public WebElement ddSize;
		

	//Shirt Quantity
		//@FindBy (xpath="//span[contains(text(),'Qty')]")
		
		@FindBy (xpath = "//select[@id = 'quantity']")
		public WebElement ddQty;
	

	//Add to Cart
		@FindBy (xpath="//input[@id='add-to-cart-button']")
		public WebElement btnAddCart;
	
}

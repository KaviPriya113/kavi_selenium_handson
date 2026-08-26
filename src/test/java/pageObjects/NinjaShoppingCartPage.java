package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NinjaShoppingCartPage extends basePage {

	public NinjaShoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
	
		@FindBy(xpath="//*[@id=\"checkout-cart\"]/div[1]")
		WebElement cartErrorMessage;
		
		public String getCartMessage() 
		{
			try {
			return (cartErrorMessage.getText());
		}
		catch (Exception e) {
			return (e.getMessage());
		}
	}
		
		@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]")
		WebElement removecart;
		
		public void selectremovecart()
		{
			removecart.click();
		}
		
		@FindBy(xpath ="//*[@id=\"content\"]/p")
		WebElement emptymessage;
		
		public String getemptymessage()
		{
			try {
				return (emptymessage.getText());
			}
			catch (Exception e) {
				return (e.getMessage());
			}
		}
		
		@FindBy(xpath="//*[@id=\"content\"]/div/div/a")
		WebElement continuebtn;
		
		public void clickcontinuebtn()
		{
			continuebtn.click();
		}
}



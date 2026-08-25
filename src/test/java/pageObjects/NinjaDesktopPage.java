package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NinjaDesktopPage extends basePage {

	public NinjaDesktopPage(WebDriver driver) {
		super(driver);
	}
	
@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]/span")
WebElement macToCart;

public void clickMacCart()
{
	macToCart.click();
}

@FindBy(xpath="//*[@id=\"product-category\"]/div[1]")
WebElement cartMessage;

public String getCartMessage()
{
	try {
		return (cartMessage.getText());
	}
	catch (Exception e) {
		return (e.getMessage());
	}
	
}

}

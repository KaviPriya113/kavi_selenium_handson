package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NinjaWishListPage extends basePage {

	public NinjaWishListPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath="//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/a")
	WebElement removewishList;
	
	public void clickremoveWLbtn()
	{
		removewishList.click();
	}
	
	@FindBy (xpath="//*[@id=\"account-wishlist\"]/div[1]")
	WebElement msgreceived;
	
	public String getmsgreceived()
	{
		try {
			return (msgreceived.getText());
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

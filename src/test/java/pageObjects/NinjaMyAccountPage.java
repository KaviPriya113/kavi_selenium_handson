package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NinjaMyAccountPage extends basePage {

	public NinjaMyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//*[@id=\"content\"]/h2[1]")
	WebElement myaccount;
	
	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[13]")
	WebElement logout;
	
	public boolean isNinjaMyAccountPageExists()
	{
		try
		{
		return (myaccount.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void clickLogout() {
		logout.click();
	}
	
}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NinjaLogoutpage extends basePage {

	public NinjaLogoutpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[13]")
	WebElement logoutBtn;
	
	public void clicklogotbtn()
	{
		logoutBtn.click();
	}
	

}

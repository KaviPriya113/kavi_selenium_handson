package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NinjaMonitorPage extends basePage
{
	
	public NinjaMonitorPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div")
	WebElement monitorelement;
	
	public void clickmonitorelement()
	{
		monitorelement.click();	
	}
	
	

}

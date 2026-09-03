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
	
	@FindBy(xpath="//*[@id=\"input-option223\"]/div[1]/label/input")
	WebElement checkbox1;
	
	@FindBy(xpath="//*[@id=\"input-option223\"]/div[2]/label/input")
	WebElement checkbox2;
	
	public void selectcheck1()  {
		if(!checkbox1.isSelected()) {
			checkbox1.click();
		}
	}
	
	public void selectcheck2() {
		if(!checkbox2.isSelected()) {
			checkbox2.click();
		}
	}
	

}

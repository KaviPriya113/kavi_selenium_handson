package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NinjaLoginPage extends basePage {

	public NinjaLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement emailAddress;
	
	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement passwordd;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement loginbutton;
	
	public void setemailaddress(String email) {
	emailAddress.sendKeys(email);
	}
	public void setpassword(String pwd) {
		passwordd.sendKeys(pwd);
		}
	public void clickLogin() {
		loginbutton.click();
		}
}

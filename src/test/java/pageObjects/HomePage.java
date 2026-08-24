package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends basePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
WebElement user;

@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
WebElement pw;

@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
WebElement loginnn;

@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")
WebElement title;

public void setPageUserName(String username)
{
	user.sendKeys(username);
	}

public void setPagepassword(String password) 
{
	pw.sendKeys("password");
}

public void Pagelogin()
{
	loginnn.click();
}

public String gethomepagetitle() {
	try {
		return (title.getText());
	} catch (Exception e) {
		return (e.getMessage());
	}
	
}




}
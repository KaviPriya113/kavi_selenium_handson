package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NinjaHomePage extends basePage{

	public NinjaHomePage(WebDriver driver) {
		super(driver);
	}

@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
WebElement myaccount;


@FindBy(linkText="Register")
WebElement registerlink;

@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
WebElement loginlink;

public void clickMyAcc()
{
	myaccount.click();
}
public void clickMyRegister()
{
	registerlink.click();
}
public void clickLoginButton()
{
	loginlink.click();
}



}

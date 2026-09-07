package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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

@FindBy(linkText = "Desktops")
WebElement desktopdropdown;

@FindBy(linkText = "PC (0)")
WebElement pc;

@FindBy(linkText = "Mac (1)")
WebElement mac;

@FindBy(linkText ="Show AllDesktops")
WebElement showDesktop;

@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[4]/a/span")
WebElement shoppingcart;

@FindBy(xpath="//*[@id=\"wishlist-total\"]")
WebElement wishlistbtn;

@FindBy(linkText="Components")
WebElement componentbtn;

@FindBy(linkText="Monitors (2)")
WebElement monitorbtn;

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

public void selectpc()
{
	Actions act = new Actions(driver);
	act.moveToElement(desktopdropdown).perform();
	pc.click();
}

public void selectmac()
{
	Actions act = new Actions(driver);
	 act.moveToElement(desktopdropdown).perform();
	 mac.click();
}

public void selectShoppingCart()
{
	shoppingcart.click();
}

public void clickAllDesktop()
{
	Actions act = new Actions(driver);
	 act.moveToElement(desktopdropdown).perform();
	 showDesktop.click();
}

public void clickwishlist()
{
	wishlistbtn.click();
}

public void selectmonitor()
{
	Actions act = new Actions(driver);
	act.moveToElement(componentbtn).perform();
	monitorbtn.click();
}




}

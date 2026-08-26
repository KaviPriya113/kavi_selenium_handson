package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.NinjaDesktopPage;
import pageObjects.NinjaHomePage;
import pageObjects.NinjaLoginPage;
import pageObjects.NinjaLogoutpage;
import pageObjects.NinjaWishListPage;
import testBase.BaseClass;

public class NinjaWishlist_TC005 extends BaseClass {
	
	@Test(groups="regression")
	public void verify_Wishlist() throws InterruptedException {	
	NinjaHomePage nhp = new NinjaHomePage(driver);
	nhp.clickAllDesktop();
	
	Thread.sleep(3000);
	NinjaDesktopPage ndp=new NinjaDesktopPage(driver);
	ndp.clickingWishList();
	
	nhp.clickwishlist();
	
	NinjaLoginPage acp =new NinjaLoginPage(driver);
	acp.setemailaddress(p.getProperty("email"));
	acp.setpassword(p.getProperty("Password"));
	acp.clickLogin();
	
	NinjaWishListPage nwp=new NinjaWishListPage(driver);
	nwp.clickremoveWLbtn();
	 String successmessage = nwp.getmsgreceived();
	    Assert.assertNotEquals(successmessage, "Success: You have modified your wish list!");
	    Thread.sleep(3000);
	  nwp.clickcontinuebtn();  
	  
	  NinjaLogoutpage nlop=new NinjaLogoutpage(driver);
	  nlop.clicklogotbtn();
			  
	  
	
	}

}

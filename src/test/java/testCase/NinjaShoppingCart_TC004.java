package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.NinjaDesktopPage;
import pageObjects.NinjaHomePage;
import pageObjects.NinjaShoppingCartPage;
import testBase.BaseClass;

public class NinjaShoppingCart_TC004 extends BaseClass{
	@Test(groups ="regression")
	public void shoppingcart() throws InterruptedException {
		
		NinjaHomePage nhp = new NinjaHomePage(driver);
		nhp.selectmac();
		
		
		NinjaDesktopPage ndp = new NinjaDesktopPage (driver);
		ndp.clickMacCart();
		Thread.sleep(3000);
		
		String msg = ndp.getCartMessage();
	    Assert.assertNotEquals(msg, "Success: You have added iMac to your shopping cart!");
	    
	    nhp.selectShoppingCart();
	    
	    NinjaShoppingCartPage nsp= new NinjaShoppingCartPage(driver);
	    
	    String cartmsg = nsp.getCartMessage();
	    Assert.assertNotEquals(nsp, "Products marked with *** are not available in the desired quantity or not in stock!");
	    Thread.sleep(3000);
	    nsp.selectremovecart();
	    Thread.sleep(3000);
	    
	    String cartemptymessage = nsp.getemptymessage();
	    Assert.assertEquals(cartemptymessage, "Your shopping cart is empty!");
	    Thread.sleep(3000);
	    
	    nsp.clickcontinuebtn();
	    
		}
	
	
		
	
	
	
}



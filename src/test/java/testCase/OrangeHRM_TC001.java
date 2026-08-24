package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class OrangeHRM_TC001 extends BaseClass {

	@Test
	public void logins() throws InterruptedException {
		HomePage hp = new HomePage(driver);
        String pagetile=hp.gethomepagetitle();
        Assert.assertNotEquals(pagetile, "orange hrm");
        logger.info("Page title validated it is not equal.....");
        
		hp.setPageUserName("Admin");
		logger.info("UserName entered correctly...");
		
		hp.setPagepassword("admin123");
		logger.info("Password entered correctly...");
		
		hp.Pagelogin();
		logger.info("clicked on login page successfully...");
		
        }

}

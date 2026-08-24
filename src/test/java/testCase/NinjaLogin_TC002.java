package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.NinjaHomePage;
import pageObjects.NinjaLoginPage;
import pageObjects.NinjaMyAccountPage;
import testBase.BaseClass;

public class NinjaLogin_TC002 extends BaseClass {
	@Test(groups="regression")
	public void verify_login() 
	    {
		logger.info("Starting TC002");
		try
		{
		NinjaHomePage nhhp =new NinjaHomePage(driver);
		nhhp.clickMyAcc();
		nhhp.clickLoginButton();
		
		NinjaLoginPage acp =new NinjaLoginPage(driver);
		acp.setemailaddress(p.getProperty("email"));
		acp.setpassword(p.getProperty("Password"));
		acp.clickLogin();
		
		NinjaMyAccountPage nmp=new NinjaMyAccountPage(driver);
		boolean targetpage=nmp.isNinjaMyAccountPageExists();
		
		Assert.assertTrue(targetpage);
	    }
	    catch(Exception e)
		{
	    	Assert.fail();
		}
		logger.info("ENd of the TESTCASE");
	}

}

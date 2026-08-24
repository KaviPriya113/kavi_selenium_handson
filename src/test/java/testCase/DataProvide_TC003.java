 package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.NinjaHomePage;
import pageObjects.NinjaLoginPage;
import pageObjects.NinjaMyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class DataProvide_TC003 extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass=DataProviders.class, groups="datadriven")
	public void Verify_Login(String email, String pwd, String exp) throws InterruptedException
	{
		NinjaHomePage nhhp =new NinjaHomePage(driver);
		//Thread.sleep(3000);
		nhhp.clickMyAcc();
		//Thread.sleep(3000);
		nhhp.clickLoginButton();
		
		NinjaLoginPage acp =new NinjaLoginPage(driver);
		acp.setemailaddress(email);
		acp.setpassword(pwd);
		acp.clickLogin();
		
		NinjaMyAccountPage nmp=new NinjaMyAccountPage(driver);
		boolean targetpage=nmp.isNinjaMyAccountPageExists();
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetpage==true)
			{
				nmp.clickLogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if (exp.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				nmp.clickLogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}		
	}
}

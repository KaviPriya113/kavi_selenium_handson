package testCase;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccRegistrationPage;
import pageObjects.NinjaHomePage;
import testBase.BaseClass;


public class NinjaRegistration_TC001 extends BaseClass {
	
	
	@Test(groups="regression")
	public void registration() throws InterruptedException {
	NinjaHomePage nhp=new NinjaHomePage(driver);
	Thread.sleep(3000);
	nhp.clickMyAcc(); 
	Thread.sleep(2000);
	nhp.clickMyRegister();
	
	AccRegistrationPage accreg=new AccRegistrationPage(driver);
	
	accreg.setFirstName(randomeString().toUpperCase());
	accreg.setLastName(randomeString().toUpperCase());
	accreg.setEmailID(randomeString()+"@gmail.com");
	accreg.setPhone(randomeNumber());
	
	String password=randomAlphaNumeric();
	
	accreg.setPassword(password);
	accreg.setConfirmPassword(password);
	
	accreg.setCheckboxPolicy();
	accreg.clickContinueButton();
	
	String confmsg=accreg.getConfirmationMessage();
	Assert.assertEquals(confmsg, "Your Account Has Been Created!");
	}
	public String randomeString()
	{
		String generatedstring= RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}
	public String randomeNumber()
	{
		String generatednumber= RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
	public String randomAlphaNumeric()
	{
		String generatedstring= RandomStringUtils.randomAlphabetic(3);
		String generatednumber= RandomStringUtils.randomNumeric(3);
		return (generatedstring+generatednumber);
	}
}
	
	
	



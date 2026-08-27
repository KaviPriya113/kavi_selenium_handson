package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.NinjaHomePage;
import pageObjects.NinjaMonitorPage;
import pageObjects.NinjaproductReviewPage;
import testBase.BaseClass;

public class NinjaReview_TC006 extends BaseClass{
	
	@Test(groups="regression")
	public void Verify_Review() throws InterruptedException
	{
		NinjaHomePage nhp=new NinjaHomePage(driver);
		
		nhp.selectmonitor();
		
		NinjaMonitorPage nmp=new NinjaMonitorPage(driver);
		nmp.clickmonitorelement();
		
		NinjaproductReviewPage nrp=new NinjaproductReviewPage(driver);
		
		nrp.clickOnReview();
		nrp.EnterName(p.getProperty("reviewerName"));
		nrp.EnterInput(p.getProperty("inputreviewcontent"));
		Thread.sleep(3000);
		
		nrp.selectRating(5);
		Assert.assertTrue(nrp.isRatingSelected(5), "5Star rating was not selcted");
		Thread.sleep(2000);
		
		nrp.selectContinuebtn();
		
		/*String msg = nrp.getcompletemsg();
	    Assert.assertEquals(msg, "Thank you for your review. It has been submitted to the webmaster for approval.");
	    Thread.sleep(3000);*/
	  
		
		
		
		
		
		
		
	}
	
	
	
	

}

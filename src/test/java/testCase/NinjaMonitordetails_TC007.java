package testCase;

import org.testng.annotations.Test;

import pageObjects.NinjaHomePage;
import pageObjects.NinjaMonitorPage;
import testBase.BaseClass;

public class NinjaMonitordetails_TC007 extends BaseClass {
	
	@Test
	public void monitorclass() {
		
		NinjaHomePage nhp = new NinjaHomePage(driver);
		nhp.selectmonitor();
		
		
		NinjaMonitorPage nmp = new NinjaMonitorPage(driver);
		nmp.clickmonitorelement();
		
		nmp.selectcheck1();
		nmp.selectcheck2();
		
		
	}

}

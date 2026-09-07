package testCase;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.NinjaHomePage;
import pageObjects.NinjaMonitorPage;
import testBase.BaseClass;

public class NinjaMonitordetails_TC007 extends BaseClass {
	
	@Test(groups ="regression")
	public void monitorclass() {
		
		NinjaHomePage nhp = new NinjaHomePage(driver);
		nhp.selectmonitor();
		
		
		NinjaMonitorPage nmp = new NinjaMonitorPage(driver);
		nmp.clickmonitorelement();
		
		nmp.selectcheck1();
		nmp.selectcheck2();
		nmp.textInput("Testing");
		nmp.SelectColour("Red (+$4.80)");
		nmp.SelectColour("Blue (+$3.60)");
		nmp.SelectColour("Green (+$1.20)");
		nmp.EnterContent("Hi, I need red colour Monitor. With 256GB RAM.");
	    }
		
		
	}


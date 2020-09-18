package com.acti.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_ACTE extends TC00_BaseTest {
	
	@Test
	public void testVerifyMainMenu()
	{
		lp.login("admin", "manager");	
		 boolean flag1 = etp.verifyactilogoDisplayed();
	     Assert.assertTrue(flag1);
	     boolean flag2 = etp.verifyreportMenu();
	     Assert.assertTrue(flag2);
	     boolean flag3 = etp.verifyswitchToactiPlans();
	     Assert.assertTrue(flag3);
	     boolean flag4 = etp.verifyTaskMenuDisplayed();
	     Assert.assertTrue(flag4);
	     boolean flag5 = etp.verifytimeTrackMenu();
	     Assert.assertTrue(flag5);
	     boolean flag6 = etp.verifyuserMenu();
	     Assert.assertTrue(flag6);
	     boolean flag7 = etp.verifyusername();
	     Assert.assertTrue(flag7);
	     boolean flag8 = etp.verifylogoutLink();
	     Assert.assertTrue(flag8);
	     etp.ClicklogoutLink();
//if u don't want to wright 2 line of code as above you have to use bellow code
//known as code 
//	Assert.assertTrue(etp.verifyactilogoDisplayed());     
	
	
	}
}

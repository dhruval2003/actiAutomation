package com.acti.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

  public class TC01_ACTLP2 extends TC00_BaseTest {
	
	@Test(priority=1)
	
	public void testVerifyactilogo()
	{
	   	     boolean flag = lp.logoDisplayed();
	     Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void testValidateLogin() throws Exception
	{
	  lp.login("admin", "manager");	
	  Thread.sleep(2000);
	  Assert.assertTrue(driver.getTitle().contains("Enter"));
	}
	
}

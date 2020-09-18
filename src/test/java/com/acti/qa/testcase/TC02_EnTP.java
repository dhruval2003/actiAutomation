package com.acti.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_EnTP extends TC00_BaseTest {
	
	@Test
	public void testVerifyTaskMenu()
	{
		lp.login("admin", "manager");	
		boolean flag = etp.verifyTaskMenuDisplayed();
		Assert.assertTrue(flag);
		etp.ClicklogoutLink();
	}
}

package com.acti.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.acti.qa.base.DriverScript;
import com.acti.qa.pages.EnterTimePage;
import com.acti.qa.pages.LoginPage;

  public class TC00_BaseTest extends DriverScript {
	
	 LoginPage lp;
	 EnterTimePage etp;
	
 public  TC00_BaseTest()
 {
	 super();
 }
	
 @BeforeMethod
	public void pretest()
	{
	  initBrowser();
	  lp = new LoginPage();
	  etp = new EnterTimePage();
	   
	}
	
 @AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}

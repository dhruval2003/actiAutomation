package com.acti.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.qa.base.DriverScript;

	public class EnterTimePage extends DriverScript {
		/* Tester= Dhruval Rao
	    Date Created=9/9/20		
	    Verified by= Shantosh
	    Description=Login Page Object 
		*/
	//**************************** Page Elements*********************************//	
       @FindBy(id="logo_aT")WebElement actilogo; 
	   @FindBy(xpath="//div[@class='logoSwitcherIcon']")WebElement switchToactiPlans;
	   @FindBy(xpath="//div[text()='Time-Track']")WebElement timeTrackMenu;
	   @FindBy(xpath="//div[text()='Tasks']")WebElement taskMenu;
	   @FindBy(xpath="//div[text()='Reports']")WebElement reportMenu;
	   @FindBy(xpath="//div[text()='Users']")WebElement userMenu;
	   @FindBy(xpath="//a[@class='userProfileLink username ']")WebElement username;
	   @FindBy(id="logoutLink")WebElement logoutLink;
	   
	//**************************** Page Initialization*********************************//		
		
	 public EnterTimePage()
	 {
		 PageFactory.initElements(driver, this);
	 }
	//**************************** Page Action*********************************//
	 
       public boolean verifyactilogoDisplayed()
       {
    	  return actilogo.isDisplayed(); 
       }
       
       public boolean verifyswitchToactiPlans()
       {
    	 return switchToactiPlans.isDisplayed();   
       }
       
       public void ClickswitchToactiPlans()
       {
    	   switchToactiPlans.click();
       }
       
       public boolean verifytimeTrackMenu()
       {
    	   return timeTrackMenu.isDisplayed();
       }
       
       public void ClicktimeTrackMenu()
       {
    	   timeTrackMenu.click();
       }
       
	   public boolean verifyTaskMenuDisplayed()
	   {
		   return taskMenu.isDisplayed();
	   }
	   
	   public void ClickTaskMenu()
	   {
		   taskMenu.click();
	   }
	
	   public boolean verifyreportMenu()
	   {
		   return reportMenu.isDisplayed();
	   }
	   
	   public void ClickreportMenu()
	   {
		   reportMenu.click();
	   }
		
	   public boolean verifyuserMenu()
	   {
		   return userMenu.isDisplayed();
	   }
	   
	   public void ClickuserMenu()
	   {
		   userMenu.click();
	   }
	
	   public boolean verifyusername()
	   {
		   return username.isDisplayed();
	   }
	   
	   public void Clickusername()
	   {
		   username.click();
	   }
	
	   public boolean verifylogoutLink()
	   {
		   return logoutLink.isDisplayed();
	   }
	   
	   public void ClicklogoutLink()
	   {
		   logoutLink.click();
	   }
	
	

}

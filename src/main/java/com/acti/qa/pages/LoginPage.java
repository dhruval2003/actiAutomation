package com.acti.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.qa.base.DriverScript;

public class LoginPage extends DriverScript {
	/* Tester= Dhruval Rao
    Date Created=9/9/20		
    Verified by= Shantosh
    Description=Login Page Object 
	*/
//**************************** Page Elements*********************************//	

	 @FindBy(xpath="//div[@class='atLogoImg'")WebElement actiLogo;
	 @FindBy(id="username")WebElement usernameTb;
	 @FindBy(name="pwd")WebElement passwordTb;
	 @FindBy(id="loginButton")WebElement loginBtn;
//**************************** Page Initialization*********************************//		
	
 public LoginPage()
 {
	 PageFactory.initElements(driver, this);
 }
//**************************** Page Action*********************************//			

 public boolean logoDisplayed()
 {
	return actiLogo.isDisplayed();  
 }
 
  public void login(String username,String password)
  { 
	 
	  usernameTb.sendKeys(username);
	  passwordTb.sendKeys(password);
	  loginBtn.click();
  }
	
	
	

}

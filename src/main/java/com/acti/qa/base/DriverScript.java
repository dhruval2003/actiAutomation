package com.acti.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
   
        /* Tester= Dhruval Rao
           Date Created=9/9/20		
           Verified by= Shantosh
           Description=Parent Script */


public class DriverScript {
	public static WebDriver driver;
	public static Properties prop; 
    public DriverScript()
    {
    	try
    	{
    	   //first create an object of  fileinputstrime 
    		File src = new File("./acti-config/Config.properties");
    		FileInputStream fis = new FileInputStream(src); 
    	    prop = new Properties();
    		prop.load(fis);
    	}
    	catch(Exception e)
    	{
    		System.out.println("File  not found:"+e.getMessage());
    	}
    }
    
    public static void initBrowser()
    {
    	String browser = prop.getProperty("browser");
    	if (browser.equalsIgnoreCase("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver","./acti-browsers/chromedriver.exe");
    		driver=new ChromeDriver();
    	}
    	else if (browser.equalsIgnoreCase("ff"))
    	{
    		System.setProperty("webdriver.gecko.driver","./acti-browsers/geckodriver.exe");
    		driver=new FirefoxDriver();
    	}
    		else if (browser.equalsIgnoreCase("ie"))
        	{
        		System.setProperty("webdriver.ie.driver","./acti-browsers/IEdriverServer.exe");
        		driver=new InternetExplorerDriver();
    	    }
    		else
    		{
    			System.out.println("NOT A VALID BROWSER NAME");
    		}
    	   driver.manage().window().maximize();
    	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
    	   driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
    	   driver.manage().deleteAllCookies();
    	   driver.get(prop.getProperty("qaurl"));
    		
    }
}

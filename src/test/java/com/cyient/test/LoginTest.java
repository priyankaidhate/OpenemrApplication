package com.cyient.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cyient.page.DashboardPage;
import com.cyient.page.LoginPage;
import com.cyient.utilities.DataProviderUtils;

public class LoginTest {

	
	private static final WebDriver driver = null;




	@Test
	public void invalidCredentialTest(String username,String password,String languageText,String expectedvalue)
	{
		LoginPage login=new LoginPage(driver);
		login.sendUsername(username);
		login.sendPassword(password);
		login.selectlanguageByText(languageText);
		login.clickOnLogin();
		
		String actualValue= login.getErrorMessage();
                
		
	/*	System.setProperty("webdriver.Chrome.driver", "src/main/resources/drive/chromedriver.exe");
	    WebDriver.driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get("https://demo.openemr.io/b/openemr");
          driver.findElement(By.id("authUser")).sendKeys("admin123");
	       driver.findElement(By.id("clearPass")).sendKeys("pass234");
	   Select selectlanguage= new Select(driver.findElement(By.name("languageChoice")));
	  selectlanguage.selectByVisibleText("English (Indian)");
	       driver.findElement(By.xpath("//button[@class='btn btn-login btn-lg']")).click();
	                   
	//	System.out.println("Invalid Credential automation !!!");
	}*/
	}
	
	
	
	@Test(dataProvider="validCredentialData",dataProviderClass=DataProviderUtils.class)
	public void validCredentialTest(String username,String password,String languageText,String expectedvalue)
	{
	
	LoginPage login=new LoginPage(driver);
	login.sendUsername(username);
	login.sendPassword(password);
	login.selectlanguageByText(languageText);
	login.clickOnLogin();
	
	
	DashboardPage dashboard=new DashboardPage(driver);
	String actualvalue = dashboard.getDashboardPageTitle();
	
	Assert.assertEquals(actualvalue, expectedvalue);
	}
	
	       
	       // System.setProperty("webdriver.chrome.driver","src/main/resources/drive/chromedriver.exe");
	        //WebDriver driver=new ChromeDriver();
	        
	        
	    //     driver.manage().window().maximize();
	     //   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	     //   driver.get("https://demo.openemr.io/b/openemr");
	           
	           
	       // driver.findElement(By.id("authUser")).sendKeys("admin123");
	      //  driver.findElement(By.id("clearPass")).sendKeys("pass234");
	           
	          
	         
	         
	                   
	         
	         
	    
		
		
	

	@Test
	public void validateUITest()
	{
	
	    
	}
}
	
	
	


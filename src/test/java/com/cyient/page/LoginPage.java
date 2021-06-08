package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	    
	    private By usernamelocator= By.id("authUser");
	    private By passwordlocator =By.id("clearPass");
	    private By languagelocator=By.name("languageChoice");
	    private By loginlocator=By.xpath("//button[@class='btn btn-login btn-lg']");
	    private By errorlocator=By.xpath("//div[contains(text(),'Invalid')]");
		private WebDriver driver;
		
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
		}
		public void sendUsername(String username)
		{
			driver.findElement(usernamelocator).sendKeys(username);
		}
		public void sendPassword(String password)
		{
			driver.findElement(passwordlocator).sendKeys(password);
		
		}
		
		public void selectlanguageByText(String languageText)
		{
			Select selectlanguage= new Select(driver.findElement(languagelocator));
	         selectlanguage.selectByVisibleText(languageText);
		}
		
		public void clickOnLogin()
		{
			driver.findElement(loginlocator).click();
		}
		
		public String getErrorMessage()
		{
			return driver.findElement(errorlocator).getText();
	    }
	 

	}



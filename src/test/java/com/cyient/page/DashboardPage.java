package com.cyient.page;

import org.openqa.selenium.WebDriver;

public class DashboardPage {
	//private By patientClientLocator=
	//private By patientsLocator
	
	
	
	private WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	
public String getDashboardPageTitle()
{
	return driver.getTitle().trim();
}
}

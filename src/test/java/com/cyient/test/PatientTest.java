package com.cyient.test;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PatientTest {

	private By driver;

	@Test
	public void addPatientTest() throws InterruptedException {
	   /*     driver.findElement(By.id("authUser")).sendKeys("admin");
	        driver.findElement(By.id("clearPass")).sendKeys("pass");
	        Select selectLanguage = new Select(driver.findElement(By.name("languageChoice")));
	        selectLanguage.selectByVisibleText("English (Indian)");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();

	        Actions action = new Actions(driver);
	        action.moveToElement(driver.findElement(By.xpath("//div[text()='Patient/Client']"))).perform();

	        driver.findElement(By.xpath("//div[text()='Patients']")).click();

	        driver.switchTo().frame("fin");
	        driver.findElement(By.id("create_patient_btn1")).click();
	        driver.switchTo().defaultContent();

	        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='pat']")));
	        driver.findElement(By.id("form_fname")).sendKeys("Mak");
	        driver.findElement(By.id("form_lname")).sendKeys("jack");
	        driver.findElement(By.id("form_DOB")).sendKeys("2021-06-07");
	        Select selectGender = new Select(driver.findElement(By.id("form_sex")));
	        selectGender.selectByVisibleText("Male");
	        driver.findElement(By.id("create")).click();
	        driver.switchTo().defaultContent();
	        Thread.sleep(5000);
	        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='modalframe']")));
	        driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']")).click();
	        Thread.sleep(5000);
	        String alerttest = driver.switchTo().alert().getText();
	        System.out.println(alerttest);
	        driver.switchTo().alert().accept();
	        driver.findElement(By.className("closeDlgIframe")).click();

	        driver.switchTo().defaultContent();
	        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='pat']")));
	        String name = new String(
	                        driver.findElement(By.xpath("//h2[contains(text(),'Medical Record Dashboard')]")).getText());
	        System.out.println(name);
	        Assert.assertEquals(name, "Medical Record Dashboard - Mak Jack");



}
*/
	}
}


package com.cyient.test;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
	
	public class PatientTest {
	
	        public static void main(String[] args) throws Exception {
	                WebDriver driver= new ChromeDriver();
	                driver.manage().window().maximize();
	        driver.get("http://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.findElement(By.id("authUser")).sendKeys("admin");
	        driver.findElement(By.id("clearPass")).sendKeys("pass");
	        Select select= new Select(driver.findElement(By.name("languageChoice")));
	        select.selectByValue("18");
	        driver.findElement(By.xpath("//button[@onclick='transmit_form(this)']")).click();
	        Actions act= new Actions(driver);
	        act.moveToElement(driver.findElement(By.xpath("//div[@role='button']"))).perform();
	        driver.findElement(By.xpath("//div[contains(text(),'Patients')]")).click();
	        Thread.sleep(3000);
	        driver.switchTo().frame("fin");
	        driver.findElement(By.id("create_patient_btn1")).click();
	        driver.switchTo().defaultContent();
	        driver.switchTo().frame("pat");
	        Select select1= new Select(driver.findElement(By.id("form_title")));
	        select1.selectByValue("Mr.");
	        driver.findElement(By.id("form_fname")).sendKeys("priyanka");
	        driver.findElement(By.id("form_lname")).sendKeys("idhate");
	        driver.findElement(By.id("form_DOB")).sendKeys("1995-09-01");
	        
	        Select select2= new Select(driver.findElement(By.id("form_sex")));
	        select2.selectByValue("Female");
	        
	        driver.findElement(By.id("create")).click();
	        driver.switchTo().defaultContent();  
	        Thread.sleep(5000);
	        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='modalframe']")));
	                driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']")).click();
	                                        
	        }
	        }

	        





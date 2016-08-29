package com.columbia;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	private static WebDriver driver;
	 
	  @DataProvider(name = "Authentication")
	  public static Object[][] credentials() {
	 
	        return new Object[][] { { "spanda", "test123" }, { "psingh", "Gspann123" }};
	 
	  }
	  
	  // Here we are calling the Data Provider object with its Name
	  
	  @Test(dataProvider = "Authentication")
	 	  public void test(String sUsername, String sPassword) {
	 
		  System.setProperty("webdriver.chrome.driver",
					"C://Program Files (x86)//Google//Chrome//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://author-columbiasc-qa-a.adobecqms.net/sites.html/content");
			driver.manage().window().maximize();
			System.out.println("Site is hitted");
			
			driver.findElement(By.id("username")).sendKeys(sUsername);
			driver.findElement(By.id("password")).sendKeys(sPassword);
			driver.findElement(By.id("submit-button")).click();
			System.out.println("Login done");
				

			}
	  
	  @AfterTest
	  public void end()
	  {
		  driver.quit();
	  }
		
	
	}



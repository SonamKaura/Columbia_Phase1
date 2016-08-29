package com.columbia;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	
	public static WebDriver driver;

	@Parameters("browser")
	@BeforeClass
		 public void beforeTest(String browser) {
		 		  // If the browser is Firefox, then do this
		 		  if(browser.equalsIgnoreCase("firefox")) {
		 			  driver = new FirefoxDriver();
		 		  // If browser is IE, then do this	  
		 		  }
		  else if (browser.equalsIgnoreCase("chrome")) { 
		 			  // Here I am setting up the path for my IEDriver
		 				System.setProperty("webdriver.chrome.driver",
						"C://Program Files (x86)//Google//Chrome//chromedriver.exe");
		 				driver = new ChromeDriver();
		 		  } 
		 		 		 		 driver.get("https://author-columbiasc-qa-a.adobecqms.net/sites.html/content");
	}
	
@Test
	public void login() {
		System.out.println("Before Test");
		driver.findElement(By.id("username")).sendKeys("spanda");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("submit-button")).click();
		System.out.println("Login done");
			}

@AfterClass
public void afterTest() {
	 
	driver.quit();

}


}

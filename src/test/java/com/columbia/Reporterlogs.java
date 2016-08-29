package com.columbia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Reporterlogs {
 	private static WebDriver driver;
	 
		@Test
		public void setup() 
		{

			System.setProperty("webdriver.chrome.driver",
					"C://Program Files (x86)//Google//Chrome//chromedriver.exe");
			driver = new ChromeDriver();
			Reporter.log("Driver Invocked");
			driver.manage().deleteAllCookies();
			Reporter.log("Cookies Deleted");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Reporter.log("Implicit Wait");
			driver.get("https://author-columbiasc-qa-a.adobecqms.net/sites.html/content");
			Reporter.log("Site Launched");
			driver.manage().window().maximize();
			Reporter.log("Window Maximized");
			login();
			System.out.println("Site is hitted");
		}

		public void login() {
			System.out.println("Before Test");
			driver.findElement(By.id("username")).sendKeys("spanda");
			driver.findElement(By.id("password")).sendKeys("test123");
			driver.findElement(By.id("submit-button")).click();
			Reporter.log("Login Done");
			//System.out.println("Login done");
				}
}
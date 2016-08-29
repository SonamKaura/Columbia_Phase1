package com.columbia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Initiate {

	public static WebDriver driver;

	@BeforeSuite(alwaysRun=true)
	public void setup() {

		System.out.println("setUp Method");
		System.setProperty("webdriver.chrome.driver",
				"C://Program Files (x86)//Google//Chrome//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://author-columbiasc-qa-a.adobecqms.net/sites.html/content");
		driver.manage().window().maximize();
		login();
		System.out.println("Site is hitted");
		
	}

	private void login() {
		System.out.println("Before Test");
		driver.findElement(By.id("username")).sendKeys("spanda");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("submit-button")).click();
		System.out.println("Login done");
		

	}
	
	/*@AfterSuite(alwaysRun=true)
	private void logout()
	{
		driver.quit();
	}
	*/
	
}

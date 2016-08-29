package com.columbia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameter {
	
	private static WebDriver driver;
	 
	  @Test
	  @Parameters({"sUsername", "sPassword" })
	  
	  public void setup( String sUsername, String sPassword)
	  {
	 /*
		  driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("http://www.store.demoqa.com");
	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	      driver.findElement(By.id("log")).sendKeys(sUsername);
	      driver.findElement(By.id("pwd")).sendKeys(sPassword);
	      driver.findElement(By.id("login")).click();
	      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	      driver.quit();*/
	      
	      
	      System.setProperty("webdriver.chrome.driver",
					"C://Program Files (x86)//Google//Chrome//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://author-columbiasc-qa-a.adobecqms.net/sites.html/content");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys(sUsername);
			driver.findElement(By.id("password")).sendKeys(sPassword);
			driver.findElement(By.id("submit-button")).click();
			System.out.println("Login done");
	 	  }
	 
	}



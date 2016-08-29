package com.columbia;

import java.util.concurrent.TimeUnit;


import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class assertions {
	public static WebDriver driver;
	

	@BeforeTest
	public void setup()
	{
		System.out.println("Super constructor");
		System.out.println("setUp Method");
		System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//Google//Chrome//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://author-columbiasc-qa-a.adobecqms.net/sites.html/content");
		driver.manage().window().maximize();
		login();
		System.out.println("Site is hitted");
	}

	public void login() 
	{
		System.out.println("Before Test");
		driver.findElement(By.id("username")).sendKeys("spanda");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("submit-button")).click();
		System.out.println("Login done");
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	
	@Test
	public void sorel() throws InterruptedException
	{
		  //WebElement site=driver.findElement(By.xpath("//div[2]/div[1]/div/div/nav[17]/div/a[2]/div[contains(text(),'Sites')]"));
		  WebElement site=driver.findElement(By.xpath("//div[@class='endor-Panel-header foundation-layout-mode2']/nav[1]/div[2]/span/button[1]/span"));
		 //Test will only continue, if the below statement is true, this is to check whether the link is displayed or not
	 	  //Assert.assertTrue(site.isDisplayed());
	 	  Assert.assertFalse(true);
	      site.click();
	      System.out.println("Sites");
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      Thread.sleep(10000);
	      
	      WebElement listview=driver.findElement(By.xpath("//div[@class='endor-Panel-header foundation-layout-mode2']/nav[1]/div[2]/span/button[1]/span"));
	      Assert.assertTrue(listview.isDisplayed());
	      listview.click();
	      System.out.println("Listview");
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      Thread.sleep(10000);
	      
	      WebElement sorel=driver.findElement(By.xpath(" //div[@class='grid-0']/article[7]/a/div/div[1]/h4"));
	      Assert.assertTrue(sorel.isDisplayed());
	      sorel.click();
	      System.out.println("Sorel");
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      Thread.sleep(10000);
	      
	      WebElement sorel_us=driver.findElement(By.xpath("//div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[1]/article[1]/a/span/img"));
	      sorel_us.click();
	      System.out.println("Sorel Us clicked");
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      Thread.sleep(10000);
	      
	      WebElement English=driver.findElement(By.xpath("//div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[1]/article/a/span/img"));
	      English.click();
	      System.out.println("English is clicked");
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      Thread.sleep(10000);
	      
	      
	      WebElement Content=driver.findElement(By.xpath("//div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[1]/article/a/span/img"));
	      Content.click();
	      System.out.println("Content is clicked");
	      Thread.sleep(10000);
	      
	      WebElement Create=driver.findElement(By.xpath("//div[@class='foundation-content-current']/div[1]/nav[1]/div[1]/a/span"));
	      Create.click();
	      System.out.println("Create button is clicked");
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      Thread.sleep(10000);
	      
	      
	      WebElement Createpage=driver.findElement(By.xpath("//div[@id='coral-50']/div/a[1]"));
	      Createpage.click();
	      System.out.println("Create page is clicked");
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      Thread.sleep(10000);
	      

	      WebElement colhomepage=driver.findElement(By.xpath("//h4[contains(text(),'columbia Home Page')]"));
	      colhomepage.click();
	      System.out.println("colhomepage is clicked");
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      Thread.sleep(10000);
	        
	      
	      WebElement next=driver.findElement(By.xpath("//nav[@class='coral-Wizard-nav coral--dark js-coral-Wizard-nav']/button"));
	      next.click();
	      System.out.println("next is clicked");
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      Thread.sleep(10000);
	      
	      WebElement name=driver.findElement(By.xpath("//div[@class='coral-TabPanel-content']/div/section/div/div[1]/div/input"));
	      name.sendKeys("categorystrip");
	      System.out.println("Name Entered");
	      Thread.sleep(10000);
	      
	      WebElement title=driver.findElement(By.xpath("//div[@class='coral-TabPanel-content']/div/section/div/div[2]/input"));
	      title.sendKeys("categorystrip");
	      System.out.println("Title Entered");
	      Thread.sleep(10000);
	      
	      WebElement create=driver.findElement(By.xpath("//nav[@class='coral-Wizard-nav coral--dark js-coral-Wizard-nav']/button[2]"));
	      create.click();
	      System.out.println("Create button is clicked");
	      Thread.sleep(10000);
	         		      	
	}
    


}

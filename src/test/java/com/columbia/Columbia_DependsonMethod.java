package com.columbia;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Columbia_DependsonMethod {
	
	public static WebDriver driver;
	private By site=By.xpath("//div[2]/div[1]/div/div/nav[17]/div/a[2]/div");
	private By listview=By.xpath("//div[@class='endor-Panel-header foundation-layout-mode2']/nav[1]/div[2]/span/button[1]/span");
	private By sorel= By.xpath(" //div[@class='grid-0']/article[7]/a/div/div[1]/h4");
	private By columbia=By.xpath("//div[@class='grid-0']/article[6]/a/div/div[1]/h4");
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//Google//Chrome//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://author-columbiasc-qa-a.adobecqms.net/sites.html/content");
		driver.manage().window().maximize();
		System.out.println("Site is hitted");
	}
	    
    @Test(dependsOnMethods = { "login" })
    public void sorel() throws InterruptedException
	{
				      
    	driver.findElement(site).click();
		System.out.println("Sites");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(10000);

		driver.findElement(listview).click();
		System.out.println("Listview");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		driver.findElement(sorel).click();
		System.out.println("Sorel");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
	         		      	
	}
    
      @Test
       public void login() throws InterruptedException {
    	System.out.println("Inside Test");
		driver.findElement(By.id("username")).sendKeys("spanda");
	    driver.findElement(By.id("password")).sendKeys("test123");
	    driver.findElement(By.id("submit-button")).click();
	    System.out.println("login done");
	    Thread.sleep(10000);

	}
    
    @Test (dependsOnMethods = { "sorel" })
     public void columbia() throws InterruptedException
    
    {
    	driver.findElement(site).click();
		System.out.println("columbia=Sites clicked");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(10000);

		/*driver.findElement(listview).click();
		System.out.println("columbia=Listview clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
		*/
		driver.findElement(columbia).click();
	    System.out.println("Columbia is clicked");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(10000);
	  
    }
}
	



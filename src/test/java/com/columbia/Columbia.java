package com.columbia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Columbia extends Initiate

{
	

	//public static RemoteControlConfiguration rc;

	//	public static WebDriver driver;
	//static WebDriver driver;
		//WebElement site=driver.findElement(By.xpath("//div[2]/div[1]/div/div/nav[17]/div/a[2]/div[contains(text(),'Sites')]"));

	WebElement site;
	WebElement listview;
	WebElement sorel;
	WebElement sorel_us;
	WebElement English;
	WebElement Content;
	WebElement Create;
	WebElement Createpage;
	WebElement colhomepage;
	WebElement next;
	WebElement name;
	WebElement title;
	WebElement create;
	WebElement Openpage;
	WebElement button;
	WebElement components;
	WebElement Source;
	WebElement Destination;
	WebElement editcategorystrip;
	WebElement Edit;
	WebElement Assets;
	WebElement Browse;
	WebElement sorelassets;
	WebElement sorelUs;
	WebElement Confirm;
	WebElement Search;
	WebElement Source1;
	WebElement Destination1;
	WebElement columbia;


	public Columbia() {

		site=driver.findElement(By.xpath("//div[2]/div[1]/div/div/nav[17]/div/a[2]/div"));

		listview=driver.findElement(By.xpath("//div[@class='endor-Panel-header foundation-layout-mode2']/nav[1]/div[2]/span/button[1]/span"));
		sorel=driver.findElement(By.xpath(" //div[@class='grid-0']/article[7]/a/div/div[1]/h4"));
		sorel_us=driver.findElement(By.xpath("//div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[1]/article[1]/a/span/img"));
		English=driver.findElement(By.xpath("//div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[1]/article/a/span/img"));
		Content=driver.findElement(By.xpath("//h4[contains(text(),'Content')]"));
		Create=driver.findElement(By.xpath("//div[@class='foundation-content-current']/div[1]/nav[1]/div[1]/a/span"));
		Createpage=driver.findElement(By.xpath("//div[@id='coral-50']/div/a[1]"));
		colhomepage=driver.findElement(By.xpath("//h4[contains(text(),'columbia Home Page')]"));
		next=driver.findElement(By.xpath("//nav[@class='coral-Wizard-nav coral--dark js-coral-Wizard-nav']/button"));
		name=driver.findElement(By.xpath("//div[@class='coral-TabPanel-content']/div/section/div/div[1]/div/input"));
		title=driver.findElement(By.xpath("//div[@class='coral-TabPanel-content']/div/section/div/div[2]/input"));
		create=driver.findElement(By.xpath("//nav[@class='coral-Wizard-nav coral--dark js-coral-Wizard-nav']/button[2]"));
		Openpage=driver.findElement(By.xpath("//button[contains(text(),'Open page')]"));
		button=driver.findElement(By.xpath("//div[@class='editor-GlobalBar-leftContainer']/button[1]/i"));
		components=driver.findElement(By.xpath("//a[contains(text(),'Components')]"));
		Source=driver.findElement(By.xpath("//article[@data-title='Category Strip']/a/div/h4"));
		Destination=driver.findElement(By.xpath("//div[@data-text='Drag components here']"));
		editcategorystrip=driver.findElement(By.xpath("//div[@draggable='true']"));
		Edit=driver.findElement(By.xpath("//button[@data-action='CONFIGURE']/i"));
		Assets=driver.findElement(By.xpath("//a[contains(text(),'Assets')]"));
		Browse=driver.findElement(By.xpath("//div[@id='assetfinder-filter']/div[2]/span/span/span/button/i"));
		sorelassets=driver.findElement(By.xpath("//div[contains(text(),'Sorel')]"));
		sorelUs=driver.findElement(By.xpath("  //div[contains(text(),'US')]"));
		Confirm=driver.findElement(By.xpath("//div[@id='mod-guid-5']/div[1]/button[1]/i"));
		Search=driver.findElement(By.xpath("//input[@id='assetsearch']"));
		Source1=driver.findElement(By.xpath("//div[@class='grid-1']/article[1]/div/span/img"));
		Destination1=driver.findElement(By.xpath("//div[@id='coral-671']/div/div/div[1]/span/span[1]/input"));
		columbia=driver.findElement(By.xpath("//div[@class='grid-0']/article[6]/a/div/div[1]/h4"));
		//driver.findElement(By.linkText("Sites"));
	}



	/*@BeforeTest
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//Google//Chrome//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://author-columbiasc-qa-a.adobecqms.net/sites.html/content");
		driver.manage().window().maximize();
		System.out.println("Site is hitted");
		Thread.sleep(10000);

		 driver.findElement(By.id("username")).sendKeys("spanda");
	     driver.findElement(By.id("password")).sendKeys("test123");
	     driver.findElement(By.id("submit-button")).click();
	     // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      Thread.sleep(10000);

	}*/

	@Test
	public void sorel() throws InterruptedException
	{
		site.click();
		System.out.println("Sites");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(10000);

		listview.click();
		System.out.println("Listview");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		sorel.click();
		System.out.println("Sorel");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		sorel_us.click();
		System.out.println("Sorel Us clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		English.click();
		System.out.println("English is clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		Content.click();
		System.out.println("Content is clicked");
		Thread.sleep(10000);

		Create.click();
		System.out.println("Create button is clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		Createpage.click();
		System.out.println("Create page is clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		colhomepage.click();
		System.out.println("colhomepage is clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		next.click();
		System.out.println("next is clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		name.sendKeys("categorystrip");
		System.out.println("Name Entered");
		Thread.sleep(10000);

		title.sendKeys("categorystrip");
		System.out.println("Title Entered");
		Thread.sleep(10000);

		create.click();
		System.out.println("Create button is clicked");
		Thread.sleep(10000);

		Openpage.click();
		System.out.println("Page is opened");
		Thread.sleep(10000);

		String parentHandle = driver.getWindowHandle(); // get the current window handle
		System.out.println("ParrentTitle: "+driver.getTitle());

		for (String winHandle : driver.getWindowHandles()) 
		{
			driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle that's your newly opened window)
			System.out.println("Title After Window is switched:"+driver.getTitle());// gives the title of the window after switch
			if(driver.getTitle().equalsIgnoreCase("categorystrip"))
			{
				break;
			}
		}

		Thread.sleep(10000);

		button.click();
		System.out.println("Button is clicked");
		Thread.sleep(10000);

		components.click();
		System.out.println("Components is clicked");
		Thread.sleep(10000);

		// Dragging the category strip
		Actions action = new Actions(driver);
		action.dragAndDrop(Source, Destination).build().perform();
		System.out.println("Drag and Drop done");
		Thread.sleep(10000);

		/*String actualText=driver.findElement(By.xpath("//div[@data-text='Drag components here']")).getText();
		      System.out.println("value of actual text is "+actualText);*/

		/*String text=driver.findElement(By.xpath("//div[@draggable='true']")).getAttribute("data-type");
		      String text=driver.findElement(By.xpath("//div[@draggable='true']")).getAttribute("value");
		      System.out.println("Text is" +text );
		 */

		editcategorystrip.click();
		System.out.println("Category strip is clicked");
		Thread.sleep(10000);

		Edit.click();
		System.out.println("Edit Button is clicked");
		Thread.sleep(10000);

		Assets.click();
		System.out.println("Assets is clicked");
		Thread.sleep(10000);

		Browse.click();
		System.out.println("Browse is clicked");
		Thread.sleep(10000);

		sorelassets.click();
		System.out.println("sorelassets is clicked");
		Thread.sleep(10000);

		sorelUs.click();
		System.out.println("sorelUs is clicked");
		Thread.sleep(10000);

		Confirm.click();
		System.out.println("Confirm is clicked");
		Thread.sleep(10000);

		sorelassets.click();
		System.out.println("sorel assets is clicked");
		Search.sendKeys("categorystrip");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='assetsearch']")).sendKeys(Keys.ENTER);
		System.out.println("Enter is clicked");

		//Dragging
		Actions action1 = new Actions(driver);
		System.out.println("Source ");
		//For setting the focus or Mouse Over
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[@id='coral-101']/div[1]/div[1]/div[1]"))).perform(); 
		Thread.sleep(10000);
		System.out.println("Focus done");
		action.dragAndDrop(Source1, Destination1).build().perform();
		System.out.println("Drag and Drop of image done");
		Thread.sleep(10000);

	}

}


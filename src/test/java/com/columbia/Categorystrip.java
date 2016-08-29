package com.columbia;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Categorystrip {
	
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	public static WebDriver driver;

	private By site = By.xpath("//div[2]/div[1]/div/div/nav[17]/div/a[2]/div");
	private By listview = By
			.xpath("//div[@class='endor-Panel-header foundation-layout-mode2']/nav[1]/div[2]/span/button[1]/span");
	private By sorel = By
			.xpath(" //div[@class='grid-0']/article[7]/a/div/div[1]/h4");

	private By sorel_us = By
			.xpath("//div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[1]/article[1]/a/span/img");
	private By english = By
			.xpath("//div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[1]/article/a/span/img");
	private By content = By.xpath("//h4[contains(text(),'Content')]");
	private By create = By
			.xpath("//div[@class='foundation-content-current']/div[1]/nav[1]/div[1]/a/span");
	private By createpage = By.xpath("//div[@id='coral-50']/div/a[1]");
	private By colhomepage = By
			.xpath("//h4[contains(text(),'columbia Home Page')]");
	private By next = By
			.xpath("//nav[@class='coral-Wizard-nav coral--dark js-coral-Wizard-nav']/button");
	private By name = By
			.xpath("//div[@class='coral-TabPanel-content']/div/section/div/div[1]/div/input");
	private By title = By
			.xpath("//div[@class='coral-TabPanel-content']/div/section/div/div[2]/input");
	private By create1 = By
			.xpath("//nav[@class='coral-Wizard-nav coral--dark js-coral-Wizard-nav']/button[2]");
	private By openpage = By.xpath("//button[contains(text(),'Open page')]");
	private By button = By
			.xpath("//div[@class='editor-GlobalBar-leftContainer']/button[1]/i");
	private By components = By.xpath("//a[contains(text(),'Components')]");
	private By source = By
			.xpath("//article[@data-title='Category Strip']/a/div/h4");
	private By destination = By
			.xpath("//div[@data-text='Drag components here']");
	private By editcategorystrip = By.xpath("//div[@draggable='true']");
	private By edit = By.xpath("//button[@data-action='CONFIGURE']/i");
	private By assets = By.xpath("//a[contains(text(),'Assets')]");
	private By browse = By
			.xpath("//div[@id='assetfinder-filter']/div[2]/span/span/span/button/i");
	private By sorelassets = By.xpath("//div[contains(text(),'Sorel')]");
	private By sorelUs = By.xpath(" //div[contains(text(),'US')]");
	private By confirm = By.xpath("//div[@id='mod-guid-5']/div[1]/button[1]/i");
	private By search = By.xpath("//input[@id='assetsearch']");
	private By columbia = By
			.xpath("//div[@class='grid-0']/article[6]/a/div/div[1]/h4");
	private By maximize=By.xpath("//div[@class='cq-dialog-actions u-coral-pullRight']/button[2]/i");
	//private By toppaddingcheckbox=By.xpath("//div[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large']/div/div[1]/div/div/div[3]/label/span[1]");


	@BeforeTest
	public void setup() {
		
		//DOMConfigurator.configure("log4j.xml");
		Log.info("in set up");

		System.setProperty("webdriver.chrome.driver",
				"C://Program Files (x86)//Google//Chrome//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://author-columbiasc-qa-a.adobecqms.net/sites.html/content");
		driver.manage().window().maximize();
		login();
		System.out.println("Site is hitted");
	}

	public void login() {
		System.out.println("Before Test");
		driver.findElement(By.id("username")).sendKeys("spanda");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("submit-button")).click();
		System.out.println("Login done");
			}

	@Test
	public void sorel() throws InterruptedException {
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

		driver.findElement(sorel_us).click();
		System.out.println("Sorel Us clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		driver.findElement(english).click();
		System.out.println("English is clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		driver.findElement(content).click();
		System.out.println("Content is clicked");
		Thread.sleep(10000);

		driver.findElement(create).click();
		System.out.println("Create button is clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		driver.findElement(createpage).click();
		System.out.println("Create page is clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		driver.findElement(colhomepage).click();
		System.out.println("colhomepage is clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		driver.findElement(next).click();
		System.out.println("next is clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		// private By
		// name=By.xpath("//div[@class='coral-TabPanel-content']/div/section/div/div[1]/div/input");
		WebElement name = driver
				.findElement(By
						.xpath("//div[@class='coral-TabPanel-content']/div/section/div/div[1]/div/input"));
		// driver.findElement(name).click();
		name.sendKeys("categorystrip");
		System.out.println("Name Entered");
		Thread.sleep(10000);

		WebElement title = driver
				.findElement(By
						.xpath("//div[@class='coral-TabPanel-content']/div/section/div/div[2]/input"));
		// driver.findElement(title).click();
		title.sendKeys("categorystrip");
		System.out.println("Title Entered");
		Thread.sleep(10000);

		driver.findElement(create1).click();
		System.out.println("Create button is clicked");
		Thread.sleep(10000);

		driver.findElement(openpage).click();
		System.out.println("Page is opened");
		Thread.sleep(30000);

		String parentHandle = driver.getWindowHandle(); // get the current
														// window handle
		System.out.println("ParrentTitle: " + driver.getTitle());

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle); // switch focus of WebDriver to
													// the next found window
													// handle that's your newly
													// opened window)
			System.out.println("Title After Window is switched:"
					+ driver.getTitle());// gives the title of the window after
											// switch
			if (driver.getTitle().equalsIgnoreCase("categorystrip")) {
				break;
			}
		}

		Thread.sleep(30000);

		driver.findElement(button).click();
		System.out.println("Button is clicked");
		Thread.sleep(10000);

		driver.findElement(components).click();
		System.out.println("Components is clicked");
		Thread.sleep(10000);

		// Dragging the category strip
		Actions action = new Actions(driver);
		WebElement Source = driver.findElement(By
				.xpath("//article[@data-title='Category Strip']/a/div/h4"));
		WebElement Destination = driver.findElement(By
				.xpath("//div[@data-text='Drag components here']"));
		action.dragAndDrop(Source, Destination).build().perform();
		System.out.println("Drag and Drop done");
		Thread.sleep(10000);

		/*
		 * String actualText=driver.findElement(By.xpath(
		 * "//div[@data-text='Drag components here']")).getText();
		 * System.out.println("value of actual text is "+actualText);
		 */

		/*
		 * String text=driver.findElement(By.xpath("//div[@draggable='true']")).
		 * getAttribute("data-type"); String
		 * text=driver.findElement(By.xpath("//div[@draggable='true']"
		 * )).getAttribute("value"); System.out.println("Text is" +text );
		 */

		driver.findElement(editcategorystrip).click();
		System.out.println("Category strip is clicked");
		Thread.sleep(10000);

		driver.findElement(edit).click();
		System.out.println("Edit Button is clicked");
		Thread.sleep(10000);

		driver.findElement(assets).click();
		System.out.println("Assets is clicked");
		Thread.sleep(10000);

		driver.findElement(browse).click();
		System.out.println("Browse is clicked");
		Thread.sleep(10000);

		driver.findElement(sorelassets).click();
		System.out.println("sorelassets is clicked");
		Thread.sleep(10000);

		driver.findElement(sorelUs).click();
		System.out.println("sorelUs is clicked");
		Thread.sleep(10000);

		driver.findElement(confirm).click();
		System.out.println("Confirm is clicked");
		Thread.sleep(10000);

		driver.findElement(search).click();
		
		driver.findElement(search).sendKeys("categorystrip");
		System.out.println("sorel assets is clicked");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='assetsearch']")).sendKeys(
				Keys.ENTER);
		System.out.println("Enter is clicked");
		Thread.sleep(15000);
		
		// Dragging the image
		WebElement Source1 = driver	.findElement(By.xpath("//div[@class='grid-1']/article[1]/div/span/img"));
		System.out.println("Source is found");
		WebElement Destination1 = driver.findElement(By.xpath("//form/div/div/div[1]/div/div/div[1]/span[1]"));
		System.out.println("Destination is found");
		Actions image = new Actions(driver);
		System.out.println("Action Object created");
		try
		{
		
	/*	image.clickAndHold(Source1).release(Destination1).build().perform();*/	
			image.clickAndHold(Source1);
		System.out.println("Dragging of the image done");
		Thread.sleep(10000);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception is "+e);
		}
		
		driver.findElement(maximize).click();
		System.out.println("Maximize done");
		Thread.sleep(10000);
		
		WebElement toppaddingcheckbox=driver.findElement(By.xpath("//div[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large']/div/div[1]/div/div/div[3]/label/span[1]"));
		System.out.println("checkbox found");
		if(!toppaddingcheckbox.isSelected())
		{
			toppaddingcheckbox.click();
			System.out.println("Top paddingc heckbox clicked");
		}
		
		WebElement disablesidecheckbox=driver.findElement(By.xpath("//div[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large']/div/div[1]/div/div/div[4]/label/span[1]"));
		System.out.println("checkbox found");
		if(!disablesidecheckbox.isSelected())
		{
			disablesidecheckbox.click();
			System.out.println("Top paddingc heckbox clicked");
		}
		
		Thread.sleep(10000);
		
		Catstriptab ob1=new Catstriptab();
		ob1.tabdeatils();
		
		
		 
	}

}

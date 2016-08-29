package com.columbia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testnggroups  extends Initiate 
{

/*	public void  test1() 
	{
				
		System.setProperty("webdriver.chrome.driver",
				"C://Program Files (x86)//Google//Chrome//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://author-columbiasc-qa-a.adobecqms.net/sites.html/content");

		driver.manage().window().maximize();
		Thread.sleep(10000);

		driver.findElement(By.id("username")).sendKeys("spanda");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("submit-button")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(10000);

		WebElement site = driver
				.findElement(By
						.xpath("//div[2]/div[1]/div/div/nav[17]/div/a[2]/div[contains(text(),'Sites')]"));
		site.click();
		System.out.println("Sites");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(10000);
	}*/

	@Test(groups = { "Sorel" })
	public void Test() throws InterruptedException {

		System.out.println("Iam in group Sorel");
		//WebElement site = driver.findElement(By.xpath("//div[2]/div[1]/div/div/nav[17]/div/a[2]/div[contains(text(),'Sites')]"));
		//site.click();
		System.out.println("Sites");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(10000);

		WebElement listview = driver
				.findElement(By
						.xpath("//div[@class='endor-Panel-header foundation-layout-mode2']/nav[1]/div[2]/span/button[1]/span"));
		// WebElement
		// listview=driver.findElement(By.className("coral-CycleButton-button coral-Button coral-Button--quiet coral-Button--graniteActionBar foundation-layout-control is-active"));
		listview.click();
		System.out.println("Listview");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		WebElement sorel = driver.findElement(By
				.xpath(" //div[@class='grid-0']/article[7]/a/div/div[1]/h4"));
		sorel.click();
		System.out.println("Sorel");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		/*
		 * WebElement sorel_us=driver.findElement(By.xpath(
		 * "//div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[1]/article[1]/a/span/img"
		 * )); sorel_us.click(); System.out.println("Sorel Us clicked");
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * Thread.sleep(10000);
		 * 
		 * WebElement English=driver.findElement(By.xpath(
		 * "//div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[1]/article/a/span/img"
		 * )); English.click(); System.out.println("English is clicked");
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * Thread.sleep(10000);
		 * 
		 * WebElement Content=driver.findElement(By.xpath(
		 * "//div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[1]/article/a/span/img"
		 * )); Content.click(); System.out.println("Content is clicked");
		 * Thread.sleep(10000);
		 * 
		 * WebElement Create=driver.findElement(By.xpath(
		 * "//div[@class='foundation-content-current']/div[1]/nav[1]/div[1]/a/span"
		 * )); Create.click(); System.out.println("Create button is clicked");
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * Thread.sleep(10000);
		 * 
		 * 
		 * WebElement
		 * Createpage=driver.findElement(By.xpath("//div[@id='coral-50']/div/a[1]"
		 * )); Createpage.click(); System.out.println("Create page is clicked");
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * Thread.sleep(10000);
		 * 
		 * 
		 * WebElement colhomepage=driver.findElement(By.xpath(
		 * "//h4[contains(text(),'columbia Home Page')]")); colhomepage.click();
		 * System.out.println("colhomepage is clicked");
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * Thread.sleep(10000);
		 * 
		 * 
		 * WebElement next=driver.findElement(By.xpath(
		 * "//nav[@class='coral-Wizard-nav coral--dark js-coral-Wizard-nav']/button"
		 * )); next.click(); System.out.println("next is clicked");
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * Thread.sleep(10000);
		 * 
		 * WebElement name=driver.findElement(By.xpath(
		 * "//div[@class='coral-TabPanel-content']/div/section/div/div[1]/div/input"
		 * )); name.sendKeys("categorystrip");
		 * System.out.println("Name Entered"); Thread.sleep(10000);
		 * 
		 * WebElement title=driver.findElement(By.xpath(
		 * "//div[@class='coral-TabPanel-content']/div/section/div/div[2]/input"
		 * )); title.sendKeys("categorystrip");
		 * System.out.println("Title Entered"); Thread.sleep(10000);
		 * 
		 * WebElement create=driver.findElement(By.xpath(
		 * "//nav[@class='coral-Wizard-nav coral--dark js-coral-Wizard-nav']/button[2]"
		 * )); create.click(); System.out.println("Create button is clicked");
		 * Thread.sleep(10000);
		 * 
		 * WebElement Openpage=driver.findElement(By.xpath(
		 * "//button[contains(text(),'Open page')]")); Openpage.click();
		 * System.out.println("Page is opened"); Thread.sleep(10000);
		 * 
		 * 
		 * String parentHandle = driver.getWindowHandle(); // get the current
		 * window handle System.out.println("ParrentTitle: "+driver.getTitle());
		 * 
		 * for (String winHandle : driver.getWindowHandles()) {
		 * driver.switchTo().window(winHandle); // switch focus of WebDriver to
		 * the next found window handle that's your newly opened window)
		 * System.out
		 * .println("Title After Window is switched:"+driver.getTitle());//
		 * gives the title of the window after switch
		 * if(driver.getTitle().equalsIgnoreCase("categorystrip")) { break; } }
		 * 
		 * Thread.sleep(10000); WebElement button=driver.findElement(By.xpath(
		 * "//div[@class='editor-GlobalBar-leftContainer']/button[1]/i"));
		 * button.click(); System.out.println("Button is clicked");
		 * Thread.sleep(10000);
		 */

	}

	@Test(groups = { "Columbianew" })
	public void test5() throws InterruptedException

	{
		System.out.println("Iam in group Columbianew");
		WebElement site = driver
				.findElement(By
						.xpath("//div[2]/div[1]/div/div/nav[17]/div/a[2]/div[contains(text(),'Sites')]"));
		site.click();
		System.out.println("Sites");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(10000);

		WebElement listview = driver
				.findElement(By
						.xpath("//div[@class='endor-Panel-header foundation-layout-mode2']/nav[1]/div[2]/span/button[1]/span"));
		// WebElement
		// listview=driver.findElement(By.className("coral-CycleButton-button coral-Button coral-Button--quiet coral-Button--graniteActionBar foundation-layout-control is-active"));
		listview.click();
		System.out.println("Listview");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		WebElement columbia = driver.findElement(By
				.xpath("//div[@class='grid-0']/article[6]/a/div/div[1]/h4"));
		columbia.click();
		System.out.println("Columbia is clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

	}

	@Test(groups = { "MHW" })
	public void test6() throws InterruptedException {
		WebElement site = driver
				.findElement(By
						.xpath("//div[2]/div[1]/div/div/nav[17]/div/a[2]/div[contains(text(),'Sites')]"));
		site.click();
		System.out.println("Sites");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(10000);

		WebElement listview = driver
				.findElement(By
						.xpath("//div[@class='endor-Panel-header foundation-layout-mode2']/nav[1]/div[2]/span/button[1]/span"));
		// WebElement
		// listview=driver.findElement(By.className("coral-CycleButton-button coral-Button coral-Button--quiet coral-Button--graniteActionBar foundation-layout-control is-active"));
		listview.click();
		System.out.println("Listview");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

		WebElement MHW = driver.findElement(By
				.xpath("//div[@class='grid-0']/article[8]/a/div/div[1]/h4"));
		MHW.click();
		System.out.println("Sorel");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);

	}
}

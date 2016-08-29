package com.columbia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Subherocomplex extends Initiate

{

	private By site = By.xpath("//div[2]/div[1]/div/div/nav[17]/div/a[2]/div");
	//private By site = By.xpath("//div[@class='coral-ColumnView coral-ColumnView--single']/nav[18]/div/a[2]/div");
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
	private By sorelhomepage = By
			.xpath("//h4[contains(text(),'Sorel Home Page')]");
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
	/*private By editsubhero1 = By
			.xpath("//div[@id='OverlayWrapper']/div[3]/div[7]");*/
	private By editsubhero2 = By
			.xpath("//div[@id='OverlayWrapper']/div[3]/div[6]");
	
	private By editsubhero1=By.xpath("//div[@id='OverlayWrapper']/div[3]/div[6]");

	private By edit = By.xpath("//button[@data-action='CONFIGURE']/i");

	@Test
	public void sorel() throws InterruptedException {

		driver.findElement(site).click();
		System.out.println("Sites");
		
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(listview));
	
		 driver.findElement(listview).click();
		 System.out.println("Listview");
		
		driver.findElement(sorel).click();
		System.out.println("Sorel");
		
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		 WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(sorel_us));
	
		driver.findElement(sorel_us).click();
		System.out.println("Sorel Us clicked");
	
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		 WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(english));
		driver.findElement(english).click();
		System.out.println("English is clicked");
	
		WebDriverWait wait3 = new WebDriverWait(driver, 30);
		 WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(content));
		driver.findElement(content).click();
		System.out.println("Content is clicked");
		
		
		WebDriverWait wait4 = new WebDriverWait(driver, 30);
		 WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(create));
		driver.findElement(create).click();
		System.out.println("Create button is clicked");
	
		WebDriverWait wait5 = new WebDriverWait(driver, 30);
		 WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(createpage));
		driver.findElement(createpage).click();
		System.out.println("Create page is clicked");
	

		WebDriverWait wait6 = new WebDriverWait(driver, 30);
		 WebElement element6 = wait.until(ExpectedConditions.elementToBeClickable(sorelhomepage));
		driver.findElement(sorelhomepage).click();
		System.out.println("colhomepage is clicked");
	
		driver.findElement(next).click();
		System.out.println("next is clicked");
	
		// private By
		// name=By.xpath("//div[@class='coral-TabPanel-content']/div/section/div/div[1]/div/input");
		WebElement name = driver
				.findElement(By
						.xpath("//div[@class='coral-TabPanel-content']/div/section/div/div[1]/div/input"));
		// driver.findElement(name).click();
		name.sendKeys("subherocomplex");
		System.out.println("Name Entered");
		

		WebElement title = driver
				.findElement(By
						.xpath("//div[@class='coral-TabPanel-content']/div/section/div/div[2]/input"));
		// driver.findElement(title).click();
		title.sendKeys("subherocomplex");
		System.out.println("Title Entered");
		
		WebDriverWait wait7 = new WebDriverWait(driver, 30);
		 WebElement element7 = wait.until(ExpectedConditions.elementToBeClickable(create1));
		driver.findElement(create1).click();
		System.out.println("Create button is clicked");
		
		WebDriverWait wait8 = new WebDriverWait(driver, 30);
		 WebElement element8 = wait.until(ExpectedConditions.elementToBeClickable(openpage));
		driver.findElement(openpage).click();
		System.out.println("Page is opened");
		
		
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
			if (driver.getTitle().equalsIgnoreCase("subherocomplex")) {
				break;
			}
		}


		WebDriverWait wait9 = new WebDriverWait(driver, 30);
		 WebElement element9= wait.until(ExpectedConditions.elementToBeClickable(button));
		driver.findElement(button).click();
		System.out.println("Button is clicked");
		
		driver.findElement(components).click();
		System.out.println("Components is clicked");
		Thread.sleep(10000);
		
		// Dragging the 2column 

		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By
				.xpath("//article[@data-title='2 Columns - Sightly']/a/div/h4"));
		WebElement destination = driver.findElement(By
				.xpath("//div[@data-text='Drag components here']"));
		action.dragAndDrop(source, destination).build().perform();
		System.out.println("Drag and Drop of 2 column done");
		Thread.sleep(10000);
		
				
		// Dragging the subhero complex
		Actions action1 = new Actions(driver);
		WebElement source1 = driver.findElement(By
				.xpath("//article[@data-title='Sub Hero']/a/div/h4"));
		WebElement destination1 = driver.findElement(By
				.xpath("//div[@id='OverlayWrapper']/div/div[4]"));
		action1.dragAndDrop(source1, destination1).build().perform();
		System.out.println("Drag and Drop of subhero complex1 done");
		Thread.sleep(10000);
	
		
	
		Actions action2 = new Actions(driver);
		WebElement source2 = driver.findElement(By
				.xpath("//article[@data-title='Sub Hero']/a/div/h4"));
		WebElement destination2 = driver.findElement(By
				.xpath("//div[@id='OverlayWrapper']/div/div[3]"));
		action2.dragAndDrop(source2, destination2).build().perform();
		System.out.println("Drag and Drop of subhero complex2 done");
		Thread.sleep(10000);
		

		
				
		subherocomplex1 obj=new subherocomplex1();
		obj.subherodetails();
		/*driver.findElement(editsubhero2).click();
		System.out.println("Category strip is clicked");
		
		*/
		
	}
}

package com.columbia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class subherocomplex1 extends Subherocomplex

{
	
	//private By editsubhero1=By.xpath("//div[@id='EditableToolbar']/button[1]/i");
	//private By editsubhero2=By.xpath("//div[@id='OverlayWrapper']/div[3]/div[6]");
	private By editsubhero1=By.xpath("//div[@id='OverlayWrapper']/div[3]/div[6]");

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
	
	
	public void subherodetails() throws InterruptedException 
	
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(editsubhero1).click();
		System.out.println("Category strip is clicked");
		
		

		driver.findElement(edit).click();
		System.out.println("Edit Button is clicked");
		
		
		WebDriverWait wait2 = new WebDriverWait(driver, 50);
		 WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(assets));
		 System.out.println("element found");
		driver.findElement(assets).click();
		System.out.println("Assets is clicked");
	

		driver.findElement(browse).click();
		System.out.println("Browse is clicked");
	

		driver.findElement(sorelassets).click();
		System.out.println("sorelassets is clicked");
		

		driver.findElement(sorelUs).click();
		System.out.println("sorelUs is clicked");
		
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		 WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(confirm));

		driver.findElement(confirm).click();
		System.out.println("Confirm is clicked");
		WebDriverWait wait3 = new WebDriverWait(driver, 30);
		 WebElement element3 = wait1.until(ExpectedConditions.elementToBeClickable(search));
		
		driver.findElement(search).click();
		
		driver.findElement(search).sendKeys("subhero");
		System.out.println("sorel assets is clicked");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='assetsearch']")).sendKeys(
				Keys.ENTER);
		System.out.println("Enter is clicked");
		
		

		// Dragging the image
		WebElement source = driver	.findElement(By.xpath("//div[@class='grid-1']/article[1]/div/span/img"));
		System.out.println("Source image is found");
		//WebElement destination = driver.findElement(By.xpath("//section[@id='coral-145']/div/section/div/div[1]/span"));
		WebElement destination = driver.findElement(By.xpath("//div[@class='cq-FileUpload-thumbnail']"));
		
		System.out.println("Destination image is found");
		Actions image = new Actions(driver);
		System.out.println("Action Object created");
		try
		{
		
		image.clickAndHold(source).release(destination).build().perform();	
		System.out.println("Dragging of the image done");
		
		}
		
		catch(Exception e)
		{
			System.out.println("Exception is "+e);
		}
		
		driver.findElement(maximize).click();
		System.out.println("Maximize done");
		Thread.sleep(10000);
		
		Select linkoption=new Select(driver.findElement(By.xpath("//section[@id='coral-99']/div/section/div/div[3]/span/select")));
		linkoption.selectByIndex(1);
		System.out.println("linkoption done");
		Thread.sleep(10000);
		
		Select linktype=new Select(driver.findElement(By.xpath("//section[@id='coral-99]/div/section/div/div[4]/span/select")));
		linktype.selectByIndex(1);
		System.out.println("linktype done");
		

		Thread.sleep(10000);
		WebElement id =driver.findElement(By.xpath("//section[@id='coral-99']/div/section/div/div[5]/input"));
		id.sendKeys("men");
		
		
		WebElement allignleft =driver.findElement(By.xpath("/section[@id='coral-99']/div/section/div/div[8]/label/span[1]"));
		allignleft.isSelected();
		System.out.println("allegned left");
		
		WebElement headline=driver.findElement(By.xpath("//section[@id='coral-99']/div/section/div/div[9]/textarea"));
		headline.sendKeys("HeadlineTest");
		System.out.println("Headline done");
		
		WebElement headlinesize=driver.findElement(By.xpath("//section[@id='coral-99']/div/section/div/div[10]/label/span[1]"));
		headlinesize.isSelected();
		System.out.println("Headlinesize done");
		
		
		Select headlinecolor=new Select(driver.findElement(By.xpath("//section[@id='coral-99']/div/section/div/div[11]/span/select")));
		headlinecolor.selectByIndex(0);
		System.out.println("headlinecolor  done");
		
		/*WebElement add=driver.findElement(By.xpath("//section[@id='coral-103']/div/section/div/div[12]/div/button"));
		add.click();
		System.out.println("add button done");
				*/
		Genericclass.addfield(driver, "//section[@id='coral-139']/div/section/div/div[12]/div/button");
		
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("i : " + i);
			WebElement textlinktitle=driver.findElement(By.xpath("//section[@id='coral-139']/div/section/div/div[12]/div/ol/li[" + i+ "]/section/div/div[1]/input"));
			textlinktitle.sendKeys("Textlink1");
			System.out.println("Textlink1 done");
			
			
			Select textlinkcolor=new Select(driver.findElement(By.xpath("//section[@id='coral-139']/div/section/div/div[12]/div/ol/li[" + i+ "]/section/div/div[2]/span/select")));
			textlinkcolor.selectByIndex(1);
			System.out.println("textlinkcolor done");
			
			
			Select linkoption1=new Select(driver.findElement(By.xpath("//section[@id='coral-139']/div/section/div/div[12]/div/ol/li[" + i+ "]/section/div/div[3]/span/select")));
			linkoption1.selectByIndex(1);
			System.out.println("linkoption done");
			
			Select linktype1=new Select(driver.findElement(By.xpath("//section[@id='coral-139']/div/section/div/div[12]/div/ol/li[" + i+ "]/section/div/div[4]/span/select")));
			linktype1.selectByIndex(1);
			System.out.println("linktype done");
			
			WebElement id1 =driver.findElement(By.xpath("//section[@id='coral-139']/div/section/div/div[12]/div/ol/li[" + i+ "]/section/div/div[5]/input"));
			id1.sendKeys("women");
			
			Genericclass.addfield(driver, "//section[@id='coral-139']/div/section/div/div[12]/div/button");
		}
	
		Thread.sleep(100000);
	
	}
		
	}


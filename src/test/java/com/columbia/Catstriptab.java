package com.columbia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Catstriptab extends Categorystrip
   {
	
	private By browse = By
			.xpath("//div[@id='assetfinder-filter']/div[2]/span/span/span/button/i");
	private By sorelassets = By.xpath("//div[contains(text(),'Sorel')]");
	private By sorelUs = By.xpath(" //div[contains(text(),'US')]");
	private By confirm = By.xpath("//div[@id='mod-guid-5']/div[1]/button[1]/i");
	private By search = By.xpath("//input[@id='assetsearch']");
	
		public void tabdeatils() throws InterruptedException 
		
		{
		
		tab1();
		tab2();
		tab3();
		tab4();
		
		}
		
		public void tab1() throws InterruptedException
		{
			
			WebElement tab1 =driver.findElement(By.xpath("//div[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large']/nav/a[2]"));
			tab1.click();
			System.out.println("tab1 is clicked ");
			Thread.sleep(10000);
			
			WebElement headline =driver.findElement(By.xpath("//div[@id='coral-102']/div/div/div[1]/textarea"));
			headline.click();
			headline.sendKeys("<i>Headline</i>");
			System.out.println("Headline done");
		
			//dropdown
			Select size=new Select(driver.findElement(By.xpath("//div[@id='coral-102']/div/div/div[2]/span/select")));
			size.selectByIndex(1);
			System.out.println("size done");
		   
			Select color=new Select(driver.findElement(By.xpath("//div[@id='coral-102']/div/div/div[3]/span/select")));
			color.selectByIndex(1);
			System.out.println("color done");
					
			Select linkoption=new Select(driver.findElement(By.xpath("//div[@id='coral-102']/div/div/div[4]/span/select")));
			linkoption.selectByIndex(1);
			System.out.println("linkoption done");
			
			Select linktype=new Select(driver.findElement(By.xpath("//div[@id='coral-102']/div/div/div[5]/span/select")));
			linktype.selectByIndex(1);
			System.out.println("linktype done");
			
			WebElement id =driver.findElement(By.xpath("//div[@id='coral-102']/div/div/div[6]/input"));
			id.sendKeys("men");
			
			Thread.sleep(100000);
		}
		
		
		public void tab2() throws InterruptedException
		{
			
			
			WebElement tab2 =driver.findElement(By.xpath("//div[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large']/nav/a[3]"));
			tab2.click();
			System.out.println("tab2 is clicked ");
			Thread.sleep(10000);
			
			WebElement button =driver.findElement(By.xpath("//div[@class='cq-dialog-actions u-coral-pullRight']/button[2]/i"));
			button.click();
			System.out.println("button is clicked ");
			Thread.sleep(10000);
			
			/*driver.findElement(browse).click();
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
			Thread.sleep(15000);*/
			
			// Dragging
			WebElement Source1 = driver	.findElement(By.xpath("//div[@class='grid-1']/article[1]/div/span/img"));
			WebElement Destination1 = driver.findElement(By.xpath("//div[@id='coral-103']/div/div/div[3]/span[1]"));
						
			Actions image = new Actions(driver);
			System.out.println("Action Object created");
			try
			{
			
			image.clickAndHold(Source1).release(Destination1).build().perform();	
			System.out.println("Dragging of the image done");
			Thread.sleep(10000);
			}
			
			catch(Exception e)
			{
				System.out.println("Exception is "+e);
			}
			
			
			Select linkoption=new Select(driver.findElement(By.xpath("//div[@id='coral-103']/div/div/div[4]/div[1]/span/select")));
			linkoption.selectByIndex(1);
			System.out.println("linkoption done");
			
			Select linktype=new Select(driver.findElement(By.xpath("//div[@id='coral-103']/div/div/div[4]/div[2]/span/select")));
			linktype.selectByIndex(1);
			System.out.println("linktype done");
			
			WebElement id =driver.findElement(By.xpath("//div[@id='coral-103']/div/div/div[4]/div[3]/input"));
			id.sendKeys("men");
			
			
			WebElement headline =driver.findElement(By.xpath("//div[@id='coral-103']/div/div/div[7]/textarea"));
			headline.click();
			headline.sendKeys("<i>HeadlineTab2</i>");
			System.out.println("Headline2 done");
			
			
			Select size=new Select(driver.findElement(By.xpath("//div[@id='coral-103']/div/div/div[8]/span/select")));
			size.selectByIndex(1);
			System.out.println("size done");
		   
			Select color=new Select(driver.findElement(By.xpath("//div[@id='coral-103']/div/div/div[9]/span/select")));
			color.selectByIndex(1);
			System.out.println("color done");
			
			Select headlineallign=new Select(driver.findElement(By.xpath("//div[@id='coral-103']/div/div/div[10]/span/select")));
			headlineallign.selectByIndex(2);
			System.out.println("headlineallign done");
			
			WebElement bodycopy =driver.findElement(By.xpath("//div[@id='coral-103']/div/div/div[11]/div/div[2]"));
			bodycopy.click();
			bodycopy.sendKeys("<i>Bodycopy</i>");
			System.out.println("bodycopy done");
			
			Select bodycopyalign=new Select(driver.findElement(By.xpath("//div[@id='coral-103']/div/div/div[9]/span/select")));
			bodycopyalign.selectByIndex(1);
			System.out.println("bodycopyalign done");
			
					
		}
		
		
		public void tab3() throws InterruptedException
		{
			WebElement tab3 =driver.findElement(By.xpath("//div[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large']/nav/a[4]"));
			tab3.click();
			System.out.println("tab3 is clicked ");
			Thread.sleep(10000);
			
			WebElement button =driver.findElement(By.xpath("//div[@class='cq-dialog-actions u-coral-pullRight']/button[2]/i"));
			button.click();
			System.out.println("button is clicked ");
			Thread.sleep(10000);
			
			/*driver.findElement(browse).click();
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
			Thread.sleep(15000);*/
			
			// Dragging
			WebElement Source1 = driver	.findElement(By.xpath("//div[@class='grid-1']/article[1]/div/span/img"));
			WebElement Destination1 = driver.findElement(By.xpath("//div[@id='coral-104']/div/div/div[3]/span[1]"));
			Actions image = new Actions(driver);
			System.out.println("Action Object created");
			try
			{
			
			image.clickAndHold(Source1).release(Destination1).build().perform();	
			System.out.println("Dragging of the image done");
			Thread.sleep(10000);
			}
			
			catch(Exception e)
			{
				System.out.println("Exception is "+e);
			}
			
			
			Select linkoption=new Select(driver.findElement(By.xpath("//div[@id='coral-104']/div/div/div[4]/div[1]/span/select")));//div[@id='coral-104']/div/div/div[4]/div[1]/span/select
			linkoption.selectByIndex(1);
			System.out.println("linkoption done");
			
			Select linktype=new Select(driver.findElement(By.xpath("//div[@id='coral-104']/div/div/div[4]/div[2]/span/select")));
			linktype.selectByIndex(1);
			System.out.println("linktype done");
			
			WebElement id =driver.findElement(By.xpath("//div[@id='coral-104']/div/div/div[4]/div[3]/input"));
			id.sendKeys("men");
			
			
			WebElement headline =driver.findElement(By.xpath("//div[@id='coral-104']/div/div/div[7]/textarea"));
			headline.click();
			headline.sendKeys("<i>HeadlineTab2</i>");
			System.out.println("Headline2 done");
			
			
			Select size=new Select(driver.findElement(By.xpath("//div[@id='coral-104']/div/div/div[8]/span/select")));
			size.selectByIndex(1);
			System.out.println("size done");
		   
			Select color=new Select(driver.findElement(By.xpath("//div[@id='coral-104']/div/div/div[9]/span/select")));
			color.selectByIndex(1);
			System.out.println("color done");
			
			Select headlineallign=new Select(driver.findElement(By.xpath("//div[@id='coral-104']/div/div/div[10]/span/select")));
			headlineallign.selectByIndex(2);
			System.out.println("headlineallign done");
			
			WebElement bodycopy =driver.findElement(By.xpath("//div[@id='coral-104']/div/div/div[11]/div/div[2]"));
			bodycopy.click();
			bodycopy.sendKeys("<i>Bodycopy</i>");
			System.out.println("bodycopy done");
			
			Select bodycopyalign=new Select(driver.findElement(By.xpath("//div[@id='coral-104']/div/div/div[9]/span/select")));
			bodycopyalign.selectByIndex(1);
			System.out.println("bodycopyalign done");
			
		}
		
		
		public void tab4() throws InterruptedException
		{
			WebElement tab4 =driver.findElement(By.xpath("//div[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large']/nav/a[4]"));
			tab4.click();
			System.out.println("tab3 is clicked ");
			Thread.sleep(10000);
			
			WebElement button =driver.findElement(By.xpath("//div[@class='cq-dialog-actions u-coral-pullRight']/button[2]/i"));
			button.click();
			System.out.println("button is clicked ");
			Thread.sleep(10000);
			
			/*driver.findElement(browse).click();
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
			Thread.sleep(15000);*/
			
			// Dragging
			WebElement Source1 = driver	.findElement(By.xpath("//div[@class='grid-1']/article[1]/div/span/img"));
			WebElement Destination1 = driver.findElement(By.xpath("//div[@id='coral-105']/div/div/div[3]/span[1]"));
			Actions image = new Actions(driver);
			System.out.println("Action Object created");
			try
			{
			
			image.clickAndHold(Source1).release(Destination1).build().perform();	
			System.out.println("Dragging of the image done");
			Thread.sleep(10000);
			}
			
			catch(Exception e)
			{
				System.out.println("Exception is "+e);
			}
			
			
			Select linkoption=new Select(driver.findElement(By.xpath("//div[@id='coral-105']/div/div/div[4]/div[1]/span/select")));//div[@id='coral-104']/div/div/div[4]/div[1]/span/select
			linkoption.selectByIndex(1);
			System.out.println("linkoption done");
			
			Select linktype=new Select(driver.findElement(By.xpath("//div[@id='coral-105']/div/div/div[4]/div[2]/span/select")));
			linktype.selectByIndex(1);
			System.out.println("linktype done");
			
			WebElement id =driver.findElement(By.xpath("//div[@id='coral-105']/div/div/div[4]/div[3]/input"));
			id.sendKeys("men");
			
			
			WebElement headline =driver.findElement(By.xpath("//div[@id='coral-105']/div/div/div[7]/textarea"));
			headline.click();
			headline.sendKeys("<i>HeadlineTab2</i>");
			System.out.println("Headline2 done");
			
			
			Select size=new Select(driver.findElement(By.xpath("//div[@id='coral-105']/div/div/div[8]/span/select")));
			size.selectByIndex(1);
			System.out.println("size done");
		   
			Select color=new Select(driver.findElement(By.xpath("//div[@id='coral-105']/div/div/div[9]/span/select")));
			color.selectByIndex(1);
			System.out.println("color done");
			
			Select headlineallign=new Select(driver.findElement(By.xpath("//div[@id='coral-105']/div/div/div[10]/span/select")));
			headlineallign.selectByIndex(2);
			System.out.println("headlineallign done");
			
			WebElement bodycopy =driver.findElement(By.xpath("//div[@id='coral-105']/div/div/div[11]/div/div[2]"));
			bodycopy.click();
			bodycopy.sendKeys("<i>Bodycopy</i>");
			System.out.println("bodycopy done");
			
			Select bodycopyalign=new Select(driver.findElement(By.xpath("//div[@id='coral-105']/div/div/div[9]/span/select")));
			bodycopyalign.selectByIndex(1);
			System.out.println("bodycopyalign done");
			
		}
		
		
		
		
	}

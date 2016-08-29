package com.columbia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Standardhero {
	
		
		public static WebDriver driver;

	    private By site = By.xpath("//div[2]/div[1]/div/div/nav[17]/div/a[2]/div");
	    private By listview = By
	            .xpath("//div[@class='endor-Panel-header foundation-layout-mode2']/nav[1]/div[2]/span/button[1]/span");
	    private By columbia = By
	            .xpath(" //div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div/article[6]/a/div/div[1]/h4");
	    private By columbia_us = By
	            .xpath("//div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div/article[2]/a/div/div[1]/h4");
	    private By english = By
	            .xpath("//div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[1]/article/a/span/img");
	    private By content = By
	            .xpath("//div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div/article[1]/a/div/div[1]/h4");
	    private By create = By
	            .xpath("//div[2]/div[2]/div[3]/div[2]/div/div[1]/nav[1]/div[1]/a");
	    private By createpage = By.xpath("//*[@id='coral-50']/div/a[1]");
	    private By colhp = By
	            .xpath("//div/div/div[1]/div/div[2]/article/a/span/img");
	    private By next = By
	            .xpath("(//button[@data-action='next'])[1]");
//	    private By pagename = By
//	            .xpath("//*[@id='coral-1']/section/div/div[1]/div/input");
	    private By pagecreate = By
	            .xpath("(//button[@data-action='next'])[1]");
	    private By openpage = By.xpath("//button[contains(text(),'Open page')]");
	    private By tool1 = By.xpath("//div[@class='editor-GlobalBar-leftContainer']/button[1]/i");
	    private By components = By.xpath("//*[@id='SidePanel']/div[2]/div[1]/nav/a[2]");
	    private By editcomponent = By.xpath("//*[@id='OverlayWrapper']/div[3]/div[2]");
	    private By tool2 = By.xpath("//*[@id='EditableToolbar']/button[1]");
	    private By assets = By.xpath("//*[@id='SidePanel']/div[2]/div[1]/nav/a[1]");
	    private By tool3 = By.xpath("//*[@id='assetfinder-filter']/div[2]/span/span/span/button");
	    private By tool4 = By.xpath("//div[@class='coral-ColumnView-column-content']/a[5]/div[2]");
	    private By tool5 = By.xpath("//div[@id='mod-guid-5']/div[2]/div[2]/div/nav[2]/div/a[1]/div[2]");
	    private By tool6 = By.xpath("//div[@id='mod-guid-5']/div[2]/div[2]/div/nav[3]/div/a[1]/div[2]");
	    private By tool7 = By.xpath("//*[@id='mod-guid-5']/div[1]/button[1]");
	    private By search = By.xpath("//*[@id='assetsearch']");
	    private By maxwindow = By.xpath("//div[@class='cq-dialog-actions u-coral-pullRight']/button[2]");
	    private By alttext = By.xpath("//div[@id='coral-100']/div/div/div[2]/input");
//	    private By linkoption = By.xpath("//div[@id='coral-100']/div/div/div[3]/span[1]");
	    private By copybodytab = By.xpath("//div[@class='cq-dialog-content coral-TabPanel coral-TabPanel--large']/nav/a[2]");
	    private By PHText = By.xpath("//div[@id='coral-101']/div/div/div[1]/textarea");
	    private By headlinetext = By.xpath("//div[@id='coral-101']/div/div/div[3]/textarea");
	    private By subheadlinetext = By.xpath("//div[@id='coral-101']/div/div/div[7]/textarea");
	    private By horirule = By.xpath("//div[@id='coral-101']/div/div/div[8]/label");
	   // private By submitform = By.xpath("//nav[@class='cq-dialog-header u-coral-clearFix coral--dark']/div/button[4]/i");
	    private By textinrte = By.xpath("//div[@id='coral-101']/div/div/div[9]/div/div[2]/p");
	    private By ttbadge = By.xpath("//div[@id='coral-101']/div/div/div[11]/label/span[1]");
	    
	    
	    
	    @BeforeTest
	    public void browser() {

	    	System.setProperty("webdriver.chrome.driver",
					"C://Program Files (x86)//Google//Chrome//chromedriver.exe");
	            driver = new ChromeDriver();
	    	
//	    	driver = new FirefoxDriver();
	    	driver.manage().deleteAllCookies();
	    	
	            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	            driver.get("https://author-columbiasc-qa-a.adobecqms.net/sites.html/content");
	            driver.manage().window().maximize();
	            login();
	            System.out.println("Browser invoked and navigating to the AEM site");
	    }
	    
	    
	        public void login() {
	        System.out.println("Before Test");
	        driver.findElement(By.id("username")).sendKeys("aanand");
	        driver.findElement(By.id("password")).sendKeys("abhi2905");
	        driver.findElement(By.id("submit-button")).click();
	        System.out.println("User Logged In");
	                }
	    
	    @Test
	    public void columbia() throws InterruptedException {
	    	
	    	 driver.findElement(site).click();
	         System.out.println("Sites Clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(listview).click();
	         System.out.println("listview Clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(columbia).click();
	         System.out.println("Columbia Clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(columbia_us).click();
	         System.out.println("Columbia_US Clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(english).click();
	         System.out.println("English Clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(content).click();
	         System.out.println("Content Clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(create).click();
	         System.out.println("Create Button Clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(createpage).click();
	         System.out.println("Createpage Button Clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(colhp).click();
	         System.out.println("Columbia HP Clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(next).click();
	         System.out.println("Next button Clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         WebElement pagename = driver
	                 .findElement(By.xpath("//*[@id='coral-1']/section/div/div[1]/div/input"));
	         
	         pagename.sendKeys("NewAutomation");
	         System.out.println("Page Name Entered");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         WebElement pagetitle = driver
	                 .findElement(By.xpath("//div[@class='coral-TabPanel-content']/div/section/div/div[2]/input"));
	         
	         pagetitle.sendKeys("PageTitle");
	         System.out.println("Page Title Entered");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(pagecreate).click();
	         System.out.println("Create button clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(openpage).click();
	         System.out.println("Open Page button clicked");
	         
	         Thread.sleep(10000);
	         
	      //   System.out.println("ParrentTitle: " + driver.getTitle());
	         
	         for (String winHandle : driver.getWindowHandles()) {
	             driver.switchTo().window(winHandle); // switch focus of WebDriver to
	                                                                                             // the next found window
	                                                                                             // handle that's your newly
	                                                                                             // opened window)
	             System.out.println("Title After Window is switched:"
	                             + driver.getTitle());// gives the title of the window after
	                                                                             // switch
	             if (driver.getTitle().equalsIgnoreCase("PageTitle")) {
	                     break;
	             }
	     }

	     Thread.sleep(30000);
	         
	         driver.findElement(tool1).click();
	         System.out.println("tool1 button clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(components).click();
	         System.out.println("components button clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	      // Dragging the category strip
	         Actions action = new Actions(driver);
	         WebElement Source = driver.findElement(By
	                         .xpath("//*[@id='coral-10']/div[2]/div[1]/div/article[8]"));
	         WebElement Destination = driver.findElement(By
	                         .xpath("//div[@data-text='Drag components here']"));
	         action.dragAndDrop(Source, Destination).build().perform();
	         System.out.println("Drag and Drop done");
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(editcomponent).click();
	         System.out.println("Edit components button clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(tool2).click();
	         System.out.println("tool2 button clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         driver.findElement(assets).click();
	         System.out.println("assets button clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(tool3).click();
	         System.out.println("tool3 Image browse button clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(tool4).click();
	         System.out.println("tool4 Image browse button clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(tool5).click();
	         System.out.println(" tool5 Image browse button clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(tool6).click();
	         System.out.println("tool6 Image browse button clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(tool7).click();
	         System.out.println("tool6 Image browse button clicked");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);             
	        
	         
	         
	         driver.findElement(search).click();         
	         driver.findElement(search).sendKeys("_D");
	         System.out.println("Search Key Entered");
	         Thread.sleep(10000);
	         driver.findElement(By.xpath("//input[@id='assetsearch']")).sendKeys(Keys.ENTER);
	         System.out.println("Enter is clicked");
	         Thread.sleep(15000);
	         
	               
	         
	         Actions image2 = new Actions(driver);
	         WebElement Source_image = driver.findElement(By.xpath("//div[@class='grid-1']/article[3]"));
	    
	         WebElement Destination_hero_image = driver
	           .findElement(By.xpath("//div[@id='coral-100']/div/div/div[1]/span[1]"));
	         Thread.sleep(20000);
	        image2.clickAndHold(Source_image).moveToElement(Destination_hero_image).release(Destination_hero_image).click().build().perform();
	         Thread.sleep(20000);
//	         dragAndDrop.perform();
	         
	         driver.findElement(maxwindow).click();
	         System.out.println("Maximizing the window");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);     
	         
	         driver.findElement(alttext).click();         
	         driver.findElement(alttext).sendKeys("Image Alt Text");
	         System.out.println("Alt text Entered");
	         Thread.sleep(10000);

	               
	         WebElement mySelectElm = driver.findElement(By.xpath("//div[@id='coral-100']/div/div/div[3]/span/select")); 
	         Select mySelect= new Select(mySelectElm);
	         mySelect.selectByIndex(2);
	         
	         Select linktype=new Select(driver.findElement(By.xpath("//div[@id='coral-100']/div/div/div[4]/span/select")));
	         linktype.selectByIndex(4);
	         System.out.println("linktype done");
	         
	         WebElement id =driver.findElement(By.xpath("//div[@id='coral-100']/div/div/div[5]/input"));
	         id.sendKeys("https://www.google.com");
	         
	         
	         WebElement trackid =driver.findElement(By.xpath("//div[@id='coral-100']/div/div/div[7]/input"));
	         trackid.sendKeys("Track ID");
	        	    
	         driver.findElement(copybodytab).click();
	         System.out.println("Switching to Copy Body Tab");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000); 
	         
	         driver.findElement(PHText).sendKeys("PRETEX");
	         System.out.println("PreHeader Text Entered");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000); 
	         
	         
	         Select phtextcolor=new Select(driver.findElement(By.xpath("//div[@id='coral-101']/div/div/div[2]/span/select")));
	         phtextcolor.selectByIndex(2);
	         System.out.println("PreHeader Text Color Selected");
	         
	         driver.findElement(headlinetext).sendKeys("HEADLINE TEXT");
	         System.out.println("Headline Text Entered");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000); 
	    
	         
	         Select headtextsize=new Select(driver.findElement(By.xpath("//div[@id='coral-101']/div/div/div[4]/span/select")));
	         headtextsize.selectByIndex(1);
	         System.out.println("Headline text size Selected");
	         
	         Select headtextcolor=new Select(driver.findElement(By.xpath("//div[@id='coral-101']/div/div/div[5]/span/select")));
	         headtextcolor.selectByIndex(1);
	         System.out.println("Headline text color Selected");
	         
	         
	         Select subheadtextcolor=new Select(driver.findElement(By.xpath("//div[@id='coral-101']/div/div/div[6]/span/select")));
	         subheadtextcolor.selectByIndex(1);
	         System.out.println("Sub Headline text color Selected");
	         
	         
	         driver.findElement(subheadlinetext).sendKeys("SUB HEAD TEXT");
	         System.out.println("SubHead Text Entered");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000);
	         
	         
	         driver.findElement(horirule).click();
	         System.out.println("Horizontal rule Enabled");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000); 
	         
	         
	         Actions action1 = new Actions(driver);
	         WebElement rte=driver.findElement(By.xpath("//div[@class='richtext-container']/div[2]"));
	         //setting focus
	         action1.moveToElement(rte).build().perform();
	         System.out.println("Rte element found");
	         rte.sendKeys("Test Rte");
	         System.out.println("Text written in RTE");
	         
	        /* rte.click();
	         System.out.println("Rte is clicked");
*/
	         
	         driver.findElement(ttbadge).click();
	         System.out.println("Tested Tough Badge Enabled");
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	         Thread.sleep(10000); 
	        

	    }
	    
	}



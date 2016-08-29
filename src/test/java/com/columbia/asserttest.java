package com.columbia;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;

public class asserttest {
	public static WebDriver driver;
	
	
	public class SeleniumAssertions extends SeleneseTestCase {
		@Before
		public void setUp() throws Exception {
			selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.sqajobs.com/");
			selenium.start();
			selenium.windowMaximize();
			
			System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//Google//Chrome//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://author-columbiasc-qa-a.adobecqms.net/sites.html/content");
		}

		@Test
		public void testAssertions() throws Exception {
			//change the below directory path to the one where you have unzipped the sample website files 
			selenium.open("file:///F:/Helios-Workspace/Sample%20Website/CreateAccount.htm");
			selenium.type("FirstName", "seetaram");
			selenium.type("Lname", "hegde");
			selenium.type("street", "HSR Layout");
			selenium.click("male");
			selenium.click("kannada");
			selenium.click("english");
			selenium.click("hindi");
			selenium.click("Save");
			assertEquals("New Account Created", selenium.getAlert());
			selenium.click("link=Click to View Customer Information");
			selenium.waitForPageToLoad("30000");
			Thread.sleep(200);
			assertTrue(selenium.isTextPresent("Below table contains the information about the Customer's transactions"));
			assertTrue(selenium.isTextPresent("Name of the Customer"));
			selenium.click("link=Go to Account Creation Screen");
			selenium.waitForPageToLoad("30000");
			Thread.sleep(200);
			assertEquals("Bangalore", selenium.getSelectedLabel("city"));
		}

		@After
		public void tearDown() throws Exception {
			//selenium.stop();
		}
	}

}

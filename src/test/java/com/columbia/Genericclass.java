package com.columbia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Genericclass {

	
	public static void addfield(WebDriver driver,String xpath)
	{
		WebElement add=driver.findElement(By.xpath(xpath));
		add.click();
		System.out.println("add button done");
				
	}
}

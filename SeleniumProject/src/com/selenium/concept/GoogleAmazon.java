package com.selenium.concept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GoogleAmazon {
	public static WebDriver driver;
	public static void absoluteXpath() throws AWTException {
		driver=BaseClass.browserLaunch();
		BaseClass.getUrl("https://www.google.com/");
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@type='text']"));
		searchBar.sendKeys("amazon");
		
		Actions ac = new Actions(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement logo = driver.findElement(By.xpath("(//img[@class='rISBZc M4dUYb'])[25]"));
		logo.click();
				
	}

	public static void main(String[] args) throws Exception {
		absoluteXpath();
	}

}

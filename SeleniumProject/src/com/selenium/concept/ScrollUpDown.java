package com.selenium.concept;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUpDown {
	
	public static WebDriver driver; 
	
	public static void pageDownUp() throws InterruptedException, IOException {
		driver = BaseClass.browserLaunch();
		BaseClass.getUrl("https://www.amazon.in/");
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
	//	logo.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].scrollIntoView();", logo);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,3000)");
		BaseClass.takeScreenShot("scrolldown");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-3000)");
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws Exception {
		pageDownUp();
	}

}

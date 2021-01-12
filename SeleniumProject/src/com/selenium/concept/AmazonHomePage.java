package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage extends BaseClass {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		driver = BaseClass.browserLaunch();
		BaseClass.getUrl("https://www.amazon.in/");
		
		WebElement amazonLogo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
	//	BaseClass.scrollDownUp(amazonLogo);
		
		scrollDownUp(amazonLogo);
		
		takeScreenShot("AmazonLogo");
		
	}

}

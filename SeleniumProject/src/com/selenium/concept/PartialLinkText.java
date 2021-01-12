package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PartialLinkText extends BaseClass{
	public static WebDriver driver;
	public static void homePage() {
		
		driver = BaseClass.browserLaunch();
		BaseClass.getUrl("https://www.amazon.in/");
			
		WebElement bestSeller = driver.findElement(By.partialLinkText("Best Sellers"));
		bestSeller.click();
		
		WebElement giftIdeas = driver.findElement(By.partialLinkText("Gift Ideas"));
		giftIdeas.click();
		
		
		WebElement newReleases = driver.findElement(By.partialLinkText("Releases"));
		newReleases.click();
		
		WebElement todayDeals = driver.findElement(By.partialLinkText("Deals"));
		todayDeals.click();
		
		WebElement coupons = driver.findElement(By.partialLinkText("Coupons"));
		coupons.click();
		
		WebElement amazonBasics = driver.findElement(By.partialLinkText("AmazonBasics"));
		amazonBasics.click();
		
		WebElement amazonPay = driver.findElement(By.partialLinkText("Pay"));
		amazonPay.click();
		
	}
	public static void main(String[] args) {
		homePage();
	}
}

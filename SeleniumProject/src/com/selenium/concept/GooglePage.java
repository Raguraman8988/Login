package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Browser Opened");
		
		driver.manage().window().maximize();
	//	driver.navigate().to("https://www.facebook.com/");

		
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys("facebook");
		
		WebElement searchButton = driver.findElement(By.name("btnK"));
		searchButton.click();
		
		WebElement fbLink = driver.findElement(By.xpath("//cite[text()='https://www.facebook.com']"));
		fbLink.click();
		
		WebElement emailId = driver.findElement(By.name("email"));
		emailId.sendKeys("ragusys@in.com");
		
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("airportragu");
		
		WebElement loginBtn = driver.findElement(By.id("u_0_b"));
		loginBtn.click();
		System.out.println("login success");
		
		WebElement accBtn = driver.findElement(By.id("userNavigationLabel"));
		accBtn.click();
		System.out.println("Acc clicked");
		
	}

}

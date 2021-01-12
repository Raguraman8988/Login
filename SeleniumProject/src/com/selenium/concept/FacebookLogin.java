package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		
		WebElement emailId = driver.findElement(By.name("email"));
		emailId.sendKeys("ragusys@in.com");
		
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("123456789");
		
		WebElement loginBtn = driver.findElement(By.id("u_0_b"));
		loginBtn.click();
		System.out.println("login success");
	}
}

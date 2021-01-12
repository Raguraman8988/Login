package com.selenium.concept;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://accounts.google.com/");
		
		WebElement emailId = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
		emailId.sendKeys("inforagu8988@gmail.com");
		Thread.sleep(2000);
		WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
		nextBtn.click();
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
		password.sendKeys("raguraman");
		
		WebElement pwdNextbtn = driver.findElement(By.xpath("//span[text()='Next']"));
		pwdNextbtn.click();
	}

}

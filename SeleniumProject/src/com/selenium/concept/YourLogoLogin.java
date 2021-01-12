package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YourLogoLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']   "));
		email.sendKeys("ragumca2012@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='passwd']"));
		pwd.sendKeys("abcde");
		
		WebElement login = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		login.click();
		
		Thread.sleep(2000);
		WebElement perInfo = driver.findElement(By.xpath("//span[text()='My personal information']"));
		perInfo.click();
		
		WebElement oldPwd = driver.findElement(By.xpath("//input[@id='old_passwd']"));
		oldPwd.sendKeys("abcde");
		
		WebElement newPwd = driver.findElement(By.xpath("//input[@id='passwd']"));
		newPwd.sendKeys("abcde");
		
		WebElement cormNewPwd = driver.findElement(By.xpath("//input[@id='confirmation']"));
		cormNewPwd.sendKeys("abcde");
		
		WebElement submit = driver.findElement(By.xpath("//button[@name='submitIdentity']"));
		submit.click();
		
		Thread.sleep(2000);
		
		WebElement home = driver.findElement(By.xpath("(//a[@class='btn btn-default button button-small'])[3]"));
		home.click();

	}

}

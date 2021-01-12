package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailProject {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement title = driver.findElement(By.xpath("//h1[text()='Create your Google Account']"));
		System.out.println(title);
		
		WebElement aboutGmail = driver.findElement(By.xpath("//figcaption[contains(text(),'All of Google working for you.')]"));
		System.out.println(aboutGmail);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstName.sendKeys("abc");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("xzy");
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='Username']"));
		userName.sendKeys("ragu123");
		
		WebElement pwdInt = driver.findElement(By.xpath("//div[contains(text(),'Use 8 or more characters')]"));
		System.out.println(pwdInt);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='Passwd']"));
		password.sendKeys("abcd@12334");
		
		WebElement confirmPwd = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		confirmPwd.sendKeys("abcd@12334");
		
		WebElement conEmail = driver.findElement(By.xpath("//button[@type='button']"));
		conEmail.click();
		
		WebElement nextBtn = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		nextBtn.click();
	}

}

package com.selenium.concept;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionProgram {
	public static WebDriver driver;

	public static void gmailLogin() throws InterruptedException, AWTException {
		driver = BaseClass.browserLaunch();
		BaseClass.getUrl("https://www.google.com/");

		Actions ac = new Actions(driver);
		Robot robot = new Robot();

		WebElement gmailTab = driver.findElement(By.xpath("//a[text()='Gmail']"));

		// ac.contextClick();
		// ac.contextClick(gmailTab).build().perform();
		ac.doubleClick(gmailTab).build().perform();

		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]"));
	//	ac.doubleClick(loginBtn).build().perform();
		ac.click(loginBtn).build().perform();
		Thread.sleep(2000);
		
		robot.mouseMove(1000, 100);

	}

	public static void main(String[] args) throws Exception, AWTException {
		gmailLogin();
	}

}

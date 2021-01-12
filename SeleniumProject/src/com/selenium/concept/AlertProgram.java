package com.selenium.concept;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertProgram {
	
	public static WebDriver driver;
	
	public static void alertOpp() throws InterruptedException, Exception {
		driver = BaseClass.browserLaunch();
		BaseClass.getUrl("http://demo.automationtesting.in/Alerts.html");
		
		WebElement analystic = driver.findElement(By.xpath("//a[@class='analystic']"));
		analystic.click();
		WebElement alertBox = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alertBox.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		
	//	BaseClass.takeScreenShot("Alert1");
		alert.accept();
		Thread.sleep(3000);
		
		
		WebElement okCance = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]"));
		okCance.click();
		Thread.sleep(3000);
		WebElement comfBtn = driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]"));
		comfBtn.click();
		Thread.sleep(3000);
	//	BaseClass.takeScreenShot("Ss2");
		alert.accept();
		Thread.sleep(3000);
		
		WebElement comfBtn1 = driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]"));
		comfBtn1.click();
		Thread.sleep(3000);
	//	BaseClass.takeScreenShot("Ss3");
		alert.dismiss();
		Thread.sleep(3000);
		
		
		
		WebElement alBox = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		alBox.click();
		
		WebElement proBox = driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]"));
		proBox.click();
		Thread.sleep(3000);
		alBox.sendKeys("ragu");
		alert.accept();
	//	BaseClass.takeScreenShot("Ss4");
	}
	public static void main(String[] args) throws Exception {
		alertOpp();
	}

}

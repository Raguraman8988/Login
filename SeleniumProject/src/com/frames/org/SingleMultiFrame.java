package com.frames.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ClearElement;

import com.baseclass.BaseClass;

public class SingleMultiFrame extends BaseClass {

	public static void main(String[] args) throws Exception {
		BaseClass.browserLaunch("chrome");
		getUrl("http://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		WebElement fTextBox = driver.findElement(By.xpath("html/body/section/div/div/div/input[@type='text']"));
		inputOnElement(fTextBox, "Hello Selenium");
		
		driver.switchTo().defaultContent();
		WebElement nestedFrameBtn = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		Thread.sleep(3000);
		clickOnElement(nestedFrameBtn);

		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerFrame);

		WebElement innerFrame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerFrame);

		WebElement oTextBox = driver.findElement(By.xpath("/html/body/section/div/div/div/input[1]"));
		inputOnElement(oTextBox, "Hello Again Selenium");
		
		driver.switchTo().parentFrame();
		
		
		WebElement singleFrameBtn = driver.findElement(By.xpath("analystic"));
		clickOnElement(singleFrameBtn);
		
		switchDefaultContent();
		
		switchFrame("singleframe");
		
		clickOnElement(fTextBox);
		
		inputOnElement(fTextBox, "Hai Again");
	
		

	}
}

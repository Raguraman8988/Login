package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.dynamic.scaffold.InstrumentedType.Frozen;

public class FrameClass {
	public static WebDriver driver;
	
	public static void frameWork() throws InterruptedException {
		driver = BaseClass.browserLaunch();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	//	driver.switchTo().frame(frame1);
	//	driver.switchTo().frame(2);
		driver.switchTo().frame("SingleFrame");
		Thread.sleep(3000);
		WebElement textBox = driver.findElement(By.xpath("/html/body/section/div/div/div/input[@type='text']"));
		textBox.sendKeys("Selenium");
		
	//	driver.switchTo().frame("aswift_1");
	//	driver.findElement(By.xpath(""));
	}

	public static void main(String[] args) throws Exception {
		frameWork();
	}

}

package com.selenium.concept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	 public static WebDriver driver;
	
	public static void takeShot() throws IOException {
		
		driver = BaseClass.browserLaunch();
		BaseClass.getUrl("https://www.amazon.in/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("D:\\Greens Workspace\\SeleniumProject\\ScreenShots\\AmazonScreen.png");
	//	FileUtils.copyFile(sourceFile, destFile);
		FileHandler.copy(sourceFile, destFile);
	}

	public static void main(String[] args) throws Exception {
		takeShot();

	}

}

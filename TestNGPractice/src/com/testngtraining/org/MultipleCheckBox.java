package com.testngtraining.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.BaseClass;

public class MultipleCheckBox extends BaseClass{
	public static WebDriver driver;
	
	public static void singleCheckBox() {
		driver = BaseClass.browserLaunch("chrome");
		getUrl("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		WebElement singleCheckBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		clickOnElement(singleCheckBox);
		System.out.println("Clicked");
	}
	
	public static void multipleCheckBox() throws InterruptedException {
	//   (html/body/div/div/div[2]/div[2]/div/div/label/input[@class='cb1-element'])[1]
		List<WebElement> listOFOptions = driver.findElements(By.className("cb1-element"));
	//	Thread.sleep(6000);
		System.out.println("listOFOptions: "+listOFOptions);
		
		for (WebElement options : listOFOptions) {
	//		System.out.println("for loop");
			System.out.println("value is: "+options.getAttribute("text"));
			if (options.getAttribute("value").equals("Option 2")||options.getAttribute("value").equals("Option 5")) {
	//		if (options.getText().equals("Option 2")||options.getText().equals("Option 5")) {
				Thread.sleep(6000);
				System.out.println("before click");
				clickOnElement(options);
				System.out.println("Success");
				
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		singleCheckBox();
		multipleCheckBox();
	}
}

package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
	
	WebDriver driver;
	
	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		WebElement element = driver.findElement(By.xpath(""));
		
		Select s=new Select(element);
		s.selectByIndex(0);
		
		boolean multiple = s.isMultiple();
		s.selectByIndex(0);
		s.selectByValue("1");
		s.selectByVisibleText("Feb");
		
		s.getFirstSelectedOption();
		s.getAllSelectedOptions();
		s.getOptions();
		
		element.isSelected();
		
	}
}

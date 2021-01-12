package com.frames.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;

public class MultiDropDown extends BaseClass {
	public static void main(String[] args) {
		browserLaunch("chrome");
		getUrl("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

		WebElement cities = driver.findElement(By.xpath("//select[@id='multi-select']"));
		

		List<WebElement> citiesList = getOptionsOnElement(cities);
		for (WebElement listOfCities : citiesList) {

			String citiesOrder = getTextOnElement(listOfCities);
			String attributeValues = getAttributeOnElementValue(listOfCities, "value");

		}
		
		Select s = new Select(cities);
		s.deselectByIndex(1);
		s.selectByValue("New York");
	//	WebElement firstSelButton = driver.findElement(By.xpath("//button[@value='Print First']"));

	}
}

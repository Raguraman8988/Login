package com.frames.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class MultipleCheckBox extends BaseClass {
	public static void main(String[] args) {
		browserLaunch("chrome");
		getUrl("https://www.ironspider.ca/forms/checkradio.htm#checkbox");

		List<WebElement> colorsList = driver
				.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement colors : colorsList) {
			if (colors.getAttribute("value").equals("red") || colors.getAttribute("value").equals("blue")) {
				clickOnElement(colors);
			}

		}
	}
}

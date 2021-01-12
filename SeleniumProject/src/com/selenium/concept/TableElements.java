package com.selenium.concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableElements {
	
	public static WebDriver driver;

	public static void allRecord() {
		
		driver =  BaseClass.browserLaunch();
		BaseClass.getUrl("https://www.toolsqa.com/automation-practice-table");

		System.out.println();
		System.out.println("********* All Element ********");
		List<WebElement> allElements = driver.findElements(By.xpath("//tbody/tr/td"));
		for (WebElement allWords : allElements) {
			System.out.println(allWords.getText());
		}

	}

	public static void singleRow(int row) {
		
		driver =  BaseClass.browserLaunch();
		BaseClass.getUrl("https://www.toolsqa.com/automation-practice-table");		

		System.out.println();
		System.out.println("********* Single Row ********");
		if (row <= 4) {
			// One Row
			List<WebElement> rowElements = driver.findElements(By.xpath("//tbody/tr[" + row + "]/td"));
			for (WebElement oneRow : rowElements) {
				System.out.println(oneRow.getText());
			}
		} else {
			System.out.println("You have entered worng row input");
		}
	}

	public static void singleElement(int row, int colm) {

		driver =  BaseClass.browserLaunch();
		BaseClass.getUrl("https://www.toolsqa.com/automation-practice-table");

		System.out.println();
		System.out.println("********* Single Element ********");
		if (row <= 4 && colm <= 6) {
			// one element
			WebElement singleElement = driver.findElement(By.xpath("//tbody/tr[" + row + "]/td[" + colm + "]"));
			System.out.println(singleElement.getText());
			System.out.println();

		} else {
			System.out.println("You have entered worng row or column input");
		}
	}

	public static void singleColm(int colm) {
		
		driver =  BaseClass.browserLaunch();
		BaseClass.getUrl("https://www.toolsqa.com/automation-practice-table");

		System.out.println();
		if (colm <= 6) {
			System.out.println("********* Single Column********");
			List<WebElement> oneColumn = driver.findElements(By.xpath("//tbody/tr/td[" + colm + "]"));
			for (WebElement colunmElement : oneColumn) {
				System.out.println(colunmElement.getText());

			}

		} else {
			System.out.println("You have entered worng column input");

		}
	}
}

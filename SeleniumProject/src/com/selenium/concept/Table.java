package com.selenium.concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	
	public static void accessTable(int i) {
		
		
	}
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table");
		driver.manage().window().maximize();
		
		// All elemenths
		 List<WebElement> allElements = driver.findElements(By.xpath("//tbody/tr/td"));
		 for (WebElement allWords : allElements) {
			 System.out.println(allWords.getText());			
		}
		System.out.println();
		
		// One Row
		List<WebElement> rowElements = driver.findElements(By.xpath("//tbody/tr[3]/td"));
		for (WebElement oneRow : rowElements) {
			System.out.println(oneRow.getText());
		}
		System.out.println();
		
		//one element
		WebElement singleElement = driver.findElement(By.xpath("//tbody/tr[3]/td[2]"));
		System.out.println(singleElement.getText());
		System.out.println();
		
		//one column
		List<WebElement> oneColumn = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		for (WebElement colunmElement : oneColumn) {
			System.out.println(colunmElement.getText());
			
		}
		
		
	}

}

package com.practice.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClass;

public class WebTable extends BaseClass {
	public static WebDriver driver;
	static int indexOf;
	static int x;
	static List<String> li=new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the header name");
		String header = sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	//	getUrl("https://www.toolsqa.com/automation-practice-table/");
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		String coloumnHeader;
		List<WebElement> countryInfo = driver.findElements(By.xpath("//*[@id=\"content\"]/table/thead/tr/th"));
		for (WebElement country : countryInfo) {
	      li.add(country.getText());
			}
System.out.println(li);
for (String title :li) {
	if(title.equalsIgnoreCase(header)) {
		 x=li.indexOf(title);
		System.out.println(x);
	}
	
	
}
List<WebElement> elements = driver.findElements(By.xpath("//table/tbody/tr/td["+x+"]"));
	for (WebElement data : elements) {
		String text = data.getText();
		System.out.println(text);
			/*
			 * int int1 = Integer.parseInt(text); if(int1>2005){ System.out.println(text); }
			 */
{
	
}
	}
	
	}

}

package com.practice.org;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownboxDemo {

	public static WebDriver driver;

	public static void dropdownUsingSelect() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Greens Workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver",System.getProperty("userdir")+"\\SeleniumProject\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement days = driver.findElement(By.xpath("//select[@id='day']"));

		Select select = new Select(days);
		select.selectByValue("17");
		Thread.sleep(3000);
		driver.close();
	}

	public static void dropdownOption() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Greens Workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		List<WebElement> month = driver.findElements(By.xpath("//*[@id=\"month\"]/option"));

		for (WebElement options : month) {
			/*
			 * if ("Sept".equals(options.getText())) { options.click(); }
			 */
			String text = options.getText();
			if (text.equalsIgnoreCase("sept")) {
				options.click();

			}

		}
		Thread.sleep(3000);
		driver.close();
	}

	public static void availableLikns() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Greens Workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for (WebElement allLinks : links) {
			String text = allLinks.getAttribute("href");
			System.out.println("Total links = "+text.length());
			System.out.println("BrokenLinks");
			
			//System.out.println(text);
			URL url=new URL(text);
			HttpURLConnection con=(HttpURLConnection)url.openConnection();
			int code=con.getResponseCode();
			if(code==200) {
				break;
			}else {
				System.out.println(text);
			}

		}
		Thread.sleep(3000);
		driver.close();
	}

	public static void main(String[] args) throws Exception {
		//dropdownUsingSelect();
		//dropdownOption();
		availableLikns();

	}

}

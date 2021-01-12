package com.testngtraining.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
 

public class CrossBrowserTest {
	public static WebDriver driver;
	@Test
	private static void chromeLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\Greens Workspace\\TestNGPractice\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		loginPage();
	}
	
	@Test
	private static void firefoxLaunch() {
		System.setProperty("webdriver.gecko.driver", "D:\\Greens Workspace\\TestNGPractice\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		loginPage();
	}
	
	@Test
	private static void ieLaunch() {
		System.setProperty("webdriver.ie.driver", "D:\\Greens Workspace\\TestNGPractice\\Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		loginPage();
	}
	
	@Test
	private static void loginPage() {
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("ragu1234");
				
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("ragu1234");
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
	}
	
}

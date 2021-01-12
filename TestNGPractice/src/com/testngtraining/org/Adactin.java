package com.testngtraining.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.adactin.pom.SearchHotelPage;

public class Adactin extends BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeTest
	public void browserLanunch() {
		BaseClass.browserLaunch("chrome");
	//	BaseClass.browserLaunch("firefox");
	//	BaseClass.browserLaunch("ie");
	}
	
	@BeforeClass
	public void enterAdactin() {
		BaseClass.getUrl("http://www.adactin.com/HotelApp/");
	}
	
	@BeforeMethod
	public void login() {
		wait= new WebDriverWait(driver, 30); 
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("ragu1234");
				
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("ragu1234");
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
	}
	
	@Test
	public static void bookHotel() {
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select sloc = new Select(location);
		sloc.selectByValue("Sydney");
		
		
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select sHtl = new Select(hotel);
		sHtl.selectByValue("Hotel Creek");
		
		WebElement roomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select srt = new Select(roomType);
		srt.selectByValue("Standard");
		
		WebElement roomNo = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select srNo = new Select(roomNo);
		srNo.selectByVisibleText("3 - Three");
		
		WebElement inDate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		inDate.clear();
	//	inDate.sendKeys("25/12/2019");  // (dd/mm/yyyy) 
		inDate.sendKeys("09/12/2019");  // (dd/mm/yyyy)
		
		WebElement outDate = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		outDate.clear();
	//	outDate.sendKeys("25/01/2020");  // (dd/mm/yyyy)
		outDate.sendKeys("15/12/2019");  // (dd/mm/yyyy)
		
		WebElement adultRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select saRoom = new Select(adultRoom);
		saRoom.selectByValue("2");
		
		WebElement childRoom = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select scRoom = new Select(childRoom);
		scRoom.selectByValue("3");
		
		WebElement submit = driver.findElement(By.xpath("//input[@id='Submit']"));
		submit.click();
	}
}

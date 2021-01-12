package com.selenium.concept;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdactIn {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static void logIn() {
		driver = BaseClass.browserLaunch();
		BaseClass.getUrl("http://www.adactin.com/HotelApp/");
		wait = new WebDriverWait(driver, 30);
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("ragu1234");
				
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("ragu1234");
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
		
	}
	
	public static void hotelSearch() throws InterruptedException {
		Thread.sleep(3000);
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
	
	public static void selectHotel() {
		WebElement checkRadio = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		checkRadio.click();
		
		WebElement goNext = driver.findElement(By.xpath("//input[@id='continue']"));
		goNext.click();
	}
	
	public static void bookRoom() throws IOException, InterruptedException {
		WebElement backBtn = driver.findElement(By.xpath("//a[text()='Back']"));
	//	backBtn.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='first_name']"));
		firstName.sendKeys("ragu");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastName.sendKeys("raman");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys("trichy");
		
		
		WebElement creditCard = driver.findElement(By.xpath("//input[@id='cc_num']"));
		creditCard.sendKeys("1234567891234567");
		
		
		WebElement ccType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select sctype = new Select(ccType);
		sctype.selectByValue("VISA");
		
		WebElement ccExpMon = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select scexpMon = new Select(ccExpMon);
		scexpMon.selectByValue("2");
		
		WebElement ccExpYr = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select scexpYr = new Select(ccExpYr);
		scexpYr.selectByValue("2021");
		
		//input[@id='cc_cvv']
		WebElement cardCvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cardCvv.sendKeys("567");
		
		
		
		WebElement bookNow = driver.findElement(By.xpath("//input[@id='book_now']"));
		bookNow.click();
		
		//BaseClass.enableElement(bookNow);
		 
	//	Thread.sleep(6000);
		
		// Newly Added navigated()
	//	BaseClass.navigateTo("http://www.adactin.com/HotelApp/BookingConfirm.php");
			
		//System.out.println(driver.getCurrentUrl());
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement myItinerary = driver.findElement(By.xpath("//input[@id='my_itinerary']")); 
		BaseClass.enableElement(myItinerary);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", myItinerary);
		wait.until(ExpectedConditions.visibilityOf(myItinerary));
		myItinerary.click();
		
		/*
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destiFile = new File("D:\\Greens Workspace\\SeleniumProject\\ScreenShots\\UserInfo.png");
		FileUtils.copyFile(sourceFile, destiFile);
		System.out.println("completed");
		*/
		BaseClass.takeScreenShot("BookingInfo");
		System.out.println("Room Booked");
		
//		BaseClass.navigateTo("https://www.google.com/");
//		System.out.println("Navigated");
	}
	public static void main(String[] args) throws Exception {
		logIn();
		hotelSearch();
		selectHotel();
		bookRoom();
	}
	
	
}

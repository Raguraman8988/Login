package com.adactin.runner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.adactin.pom.BookHotelPage;
import com.adactin.pom.BookedItineraryPage;
import com.adactin.pom.BookingConfirmPage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SelectHotelPage;
import com.baseclass.BaseClass;

public class AdactIn extends BaseClass{
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	public static void logIn() {		
		driver = BaseClass.browserLaunch("chrome");
		BaseClass.getUrl("http://www.adactin.com/HotelApp/");
		wait = new WebDriverWait(driver, 30);
		
		LoginPage lp = new LoginPage(driver);
		inputOnElement(lp.getUserName(), "ragu1234");
		inputOnElement(lp.getPassword(), "ragu1234");
		clickOnElement(lp.getLoginBtn());
		
	}
	
	public static void hotelSearch() throws InterruptedException {
		wait = new WebDriverWait(driver, 30);
		SearchHotelPage sh = new SearchHotelPage(driver);
		dropDownElement(sh.getLocation(), "value", "Sydney");
		dropDownElement(sh.getHotel(), "value", "Hotel Sunshine");
		dropDownElement(sh.getRoomType(), "value", "Standard");
		dropDownElement(sh.getNoOfRoom(), "value", "3");
		inputOnElement(sh.getInDate(), "22/12/2019");
		inputOnElement(sh.getOutDate(), "30/01/2020");
		dropDownElement(sh.getAdultRoom(), "value", "2");
		inputOnElement(sh.getChildRoom(), "3");
		clickOnElement(sh.getSubmit());
	}	
		
	
	public static void selectHotel() {
		SelectHotelPage hp = new SelectHotelPage(driver);
		clickOnElement(hp.getCheckRadio());
		
		clickOnElement(hp.getGoNext());
		System.out.println("selectHotel done");
	}
	
	public static void bookRoom() {
		BookHotelPage bp = new BookHotelPage(driver);
		
		inputOnElement(bp.getFirstName(),"ragu" );
		inputOnElement(bp.getLastName(), "raman");
		inputOnElement(bp.getAddress(), "Trichy");
		inputOnElement(bp.getCreditCard(), "1234567891234567");
		dropDownElement(bp.getCcType(), "value", "VISA");
		dropDownElement(bp.getCcExpMon(), "value", "2");
		dropDownElement(bp.getCcExpYr(), "value", "2021");
		inputOnElement(bp.getCardCvv(), "567");
		clickOnElement(bp.getBookNow());
		System.out.println("BookHotel done");
	}
	
	public static void bookingConfirm() throws InterruptedException, IOException {
		System.out.println("Entered to bookingConfirm()");
		wait = new WebDriverWait(driver, 50);
		BookingConfirmPage bc = new BookingConfirmPage(driver);
		Thread.sleep(6000);
		clickOnElement(bc.getMyItinerary());
		Thread.sleep(6000);
		BaseClass.takeScreenShot("BookedList");
	}
	
	public static void bookedItinerary() {
		BookedItineraryPage bi = new BookedItineraryPage(driver);
		clickOnElement(bi.getLogout());
	}
	public static void main(String[] args) throws Exception {
		logIn();
		hotelSearch();
		selectHotel();
		bookRoom();
		bookingConfirm();
		bookedItinerary();
	}
	
	
	
}

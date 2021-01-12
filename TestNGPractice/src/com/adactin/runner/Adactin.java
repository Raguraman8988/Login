package com.adactin.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotelPage;

public class Adactin extends BaseClass {

	public static WebDriver driver;

	@BeforeTest
	public void browserLanunch() {
		BaseClass.browserLaunch("chrome");
		BaseClass.browserLaunch("firefox");
		BaseClass.browserLaunch("ie");
	}

	@BeforeClass
	public void enterAdactin() {
		BaseClass.getUrl("http://www.adactin.com/HotelApp/");
	}

	@BeforeMethod
	public void login() {
		
		LoginPage lp = new LoginPage(driver);
		inputOnElement(lp.getUserName(), "ragu1234");
		inputOnElement(lp.getPassword(), "ragu1234");
		clickOnElement(lp.getLoginBtn());
		
	}

	@Test
	public static void bookHotel() {

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

}

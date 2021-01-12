package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	public static WebDriver driver;

	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotel;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomType;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement noOfRoom;

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement inDate;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement outDate;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultRoom;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childRoom;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement submit;

	public SearchHotelPage(WebDriver shDriver) {
		this.driver = shDriver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRoom() {
		return noOfRoom;
	}

	public WebElement getInDate() {
		return inDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSubmit() {
		return submit;
	}
}

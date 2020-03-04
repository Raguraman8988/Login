package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastName;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement creditCard;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement ccType;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement ccExpMon;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement ccExpYr;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cardCvv;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement bookNow;
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public BookHotelPage(WebDriver bpDriver) {
		this.driver=bpDriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcExpMon() {
		return ccExpMon;
	}

	public WebElement getCcExpYr() {
		return ccExpYr;
	}

	public WebElement getCardCvv() {
		return cardCvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	

	
	
}

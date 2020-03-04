package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement checkRadio;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement goNext;
	
	public SelectHotelPage(WebDriver selDriver) {
		this.driver=selDriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckRadio() {
		return checkRadio;
	}

	public WebElement getGoNext() {
		return goNext;
	}

	
	
	
}

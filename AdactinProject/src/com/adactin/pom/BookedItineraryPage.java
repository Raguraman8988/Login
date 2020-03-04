package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItineraryPage {
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logoutBtn;
	
	public BookedItineraryPage(WebDriver lodriver) {
		WebDriver driver=lodriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logoutBtn;
	}
	
	
}

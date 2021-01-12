package com.adactin.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.adactin.pom.LoginPage;
import com.baseclass.BaseClass;

public class HotelResRunner extends BaseClass {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = browserLaunch("Chrome");
		getUrl("https://www.adactin.com/HotelApp/index.php");
		Thread.sleep(3000);

//		WebElement go = driver.findElement(By.xpath("//a[text()='Go back to Login page']"));
//		go.click();

		LoginPage lp=new LoginPage(driver);
		inputOnElement(lp.getUserName(), "SowmiyaSri");
		inputOnElement(lp.getPassword(), "Sowmiya05");
		clickOnElement(lp.getLoginBtn());
		

		WebElement location = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
		dropDown(location, "text", "New York");

		WebElement hotel=driver.findElement(By.xpath("//select[@id='hotels']"));
		dropDown(hotel, "text", "Hotel Sunshine");

		Select room = new Select(driver.findElement(By.xpath("//select[@id='room_type']")));
		room.selectByVisibleText("Super Deluxe");

		Select nos = new Select(driver.findElement(By.xpath("//select[@id='room_nos']")));
		nos.selectByValue("4");

		WebElement in = driver.findElement(By.xpath("(//input[@class='date_pick'])[1]"));
		in.sendKeys("2/01/2020");
		Thread.sleep(2000);

		WebElement out = driver.findElement(By.xpath("(//input[@class='date_pick'])[2]"));
		out.sendKeys("4/01/2020");
		Thread.sleep(2000);

		Select adults = new Select(driver.findElement(By.xpath("//select[@id='adult_room']")));
		adults.selectByValue("1");

		Select child = new Select(driver.findElement(By.xpath("//select[@id='child_room']")));
		child.selectByValue("1");

		WebElement search = driver.findElement(By.xpath("//input[@name='Submit']"));
		search.click();

		WebElement select = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		select.click();

		WebElement conti = driver.findElement(By.xpath("//input[@id='continue']"));
		conti.click();

	}

}

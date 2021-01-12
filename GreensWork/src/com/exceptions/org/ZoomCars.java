package com.exceptions.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZoomCars {
	public static void carBooking() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Greens Workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.zoomcar.com/chennai/search/query?lat=13.0381896&lng=80.1565461&starts=2020-02-27%2022%3A30&ends=2020-03-03%2004%3A30&type=zoom_later&bracket=no_fuel");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver; WebElement knowMore =
		 * driver.findElement(By.xpath("(//div[@class='know-more-details'])[10]"));
		 * knowMore.click(); js.executeScript("arguments[0].scrollIntoView();",
		 * "//div[@class='policy']"); js.executeScript("arguments[1].scrollIntoView();",
		 * "//img[@src='/assets/component-images/logo.4cb15638598fde9bfdbd7d173f95d33c.svg']"
		 * );
		 */
		List<WebElement> carPrice = driver.findElements(By.xpath("//div[@class='price']"));
		for (WebElement price : carPrice) {
			// System.out.println(price.getText());
			String price1 = price.getText().substring(2);
			// System.out.println(price1);
			String replacePrice = price1.replace(",", "");
			// System.out.println(replacePrice);

			int priceList = Integer.parseInt(replacePrice);

			List<Integer> list = new ArrayList<Integer>();
			list.add(priceList);
			
		}

		driver.close();

	}

	public static void main(String[] args) {
		carBooking();
	}

}

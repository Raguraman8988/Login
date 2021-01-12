package com.practice.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightTicketBooking {
//	public static List<Integer> li = new ArrayList<>();
	public static Map<String, Integer> mp = new TreeMap<>();
	public static WebDriver driver;

	public static void bookTicket() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Greens Workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Robot robot = new Robot();

		driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();
		;
		// fromCity.sendKeys("TRZ");
		// fromCity.sendKeys("Tiruchirappalli");

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[text()='To']")).click();
		WebElement toCity = driver.findElement(By.xpath("//*[@id=\"toCity\"]"));
		toCity.sendKeys("SIN");
		// toCity.sendKeys("Singapore");

		// robot.keyPress(KeyEvent.VK_DOWN); robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement searchBtn = driver
				.findElement(By.xpath("//a[@class='primaryBtn font24 latoBlack widgetSearchBtn ']"));
		// wait.until(ExpectedConditions.invisibilityOf(searchBtn));
		searchBtn.click();

		WebElement filters = driver.findElement(By.xpath("//span[@class='filter-arw']"));
		filters.click();

		WebElement slider = driver.findElement(By.xpath("//div[@class='rc-slider-step']"));
		WebElement startPrice = driver.findElement(By.xpath("(//div[@aria-valuenow])[1]"));
		// startPrice.sendKeys("10000");
		WebElement endPrice = driver.findElement(By.xpath("(//div[@aria-valuenow])[2]"));
		// endPrice.sendKeys("20000");
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(slider, 10000, 20000);

		driver.close();
	}
	public static String text1;
	public static int parseInt;
	public static void clearTrip() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Greens Workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement fromCity = driver.findElement(By.xpath("//input[@id='FromTag']"));
		fromCity.sendKeys("Trichy, IN - Tiruchirapally Civil (TRZ)");

		WebElement toCity = driver.findElement(By.xpath("//input[@id='ToTag']"));
		toCity.sendKeys("Singapore, SG - Changi (SIN)");

		WebElement calender = driver.findElement(By.xpath("//i[@class='icon ir datePicker']"));
		calender.click();

		WebElement selectedDate = driver
				.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[6]/a"));
		selectedDate.click();

		List<WebElement> adultTicket = driver.findElements(By.xpath("//*[@id=\"Adults\"]/option"));
		for (WebElement adult : adultTicket) {
			if ("1".equals(adultTicket)) {
				adult.click();
			}
		}

		WebElement searchBtn = driver.findElement(By.xpath("//input[@id='SearchBtn']"));
		searchBtn.click();

		List<WebElement> allPrice = driver.findElements(By.xpath("//th[@class='price']"));
		
		for (WebElement price : allPrice) {
			String text = price.getText();
			String substring = text.substring(3);
			String replaceAll = substring.replaceAll(",", "");
			parseInt = Integer.parseInt(replaceAll);
		//	System.out.println(parseInt);
			/*
			 * if (parseInt >= 50000) { System.out.println(parseInt); }
			 */
			
			List<WebElement> allName = driver.findElements(By.xpath("//th[@class='vendor  count1 ']"));
			for (WebElement flightNames : allName) {
				text1 = flightNames.getText();
		
			mp.put(text1, parseInt);
		
			}
				
		}
		
		System.out.println(mp);
		
		
		// driver.navigate().refresh();
		// driver.close();
	}

	public static void main(String[] args) throws Exception {
		// bookTicket();
		clearTrip();
	}
}

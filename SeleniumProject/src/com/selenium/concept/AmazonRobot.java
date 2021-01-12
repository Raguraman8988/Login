package com.selenium.concept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonRobot {
	public static WebDriver driver;

	public static void tabs() throws AWTException {
		driver = BaseClass.browserLaunch();
		BaseClass.getUrl("https://www.amazon.in/");

		Actions action = new Actions(driver);
		Robot robot = new Robot();

		WebElement bestSelleres = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		action.contextClick(bestSelleres).build().perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement giftIdeas = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		action.contextClick(giftIdeas).build().perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement newRelease = driver.findElement(By.xpath("//a[text()='New Releases']"));
		action.contextClick(newRelease).build().perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement todayDeals = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		action.contextClick(todayDeals).build().perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement coupnes = driver.findElement(By.xpath("//a[text()='Coupons']"));
		action.contextClick(coupnes).build().perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement basics = driver.findElement(By.xpath("//a[text()='AmazonBasics']"));
		action.contextClick(basics).build().perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement pay = driver.findElement(By.xpath("//a[text()='Amazon Pay']"));
		action.contextClick(pay).build().perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement login = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
		action.contextClick(login).build().perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		/*
		ArrayList<String> tabView = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabView.get(1));
		 */
		
		String pId = driver.getWindowHandle();
		System.out.println(pId);

		Set<String> allId = driver.getWindowHandles();
		for (String id : allId) {
			System.out.println(id);
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}

		String actualTitle = "Amazon Sign In";

		for (String id : allId) {

			if (driver.switchTo().window(id).getTitle().equals(actualTitle)) {

				break;
			}

		}

	}

	public static void main(String[] args) throws Exception {
		tabs();
	}

}

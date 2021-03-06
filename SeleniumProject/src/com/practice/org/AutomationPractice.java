package com.practice.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.baseclass.BaseClass;

public class AutomationPractice extends BaseClass {
	
	
	
	public static void addKart() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		driver.get("http://automationpractice.com/index.php");
		driver.navigate().refresh();
		WebElement loginPage = driver.findElement(By.xpath("//a[@class='login']"));
		loginPage.click();
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("ragu@gmail.com");
		WebElement pwd = driver.findElement(By.id("passwd"));
		pwd.sendKeys("abcde");
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();
		
		WebElement userName = driver.findElement(By.xpath("//span[contains(text(),'Ragu P')]"));
		String loginUserName = userName.getText();
		System.out.println("Login UserName: "+loginUserName);
		String expectedUserName = "Ragu P";
		Assert.assertEquals(loginUserName, expectedUserName);
		System.out.println("Successfully Login");
		
		WebElement women = driver.findElement(By.xpath("//a[@class='sf-with-ul']"));
		action.moveToElement(women).build().perform();
		WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
		tshirt.click();
		
		WebElement product = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		action.moveToElement(product).build().perform();
		WebElement addCart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		addCart.click();
		WebElement proceedToCheckout = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		proceedToCheckout.click();
		Thread.sleep(7000);
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		addKart();
	}
	
}

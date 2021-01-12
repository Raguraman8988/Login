package com.selenium.concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourLogo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Greens Workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement loginBtn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		loginBtn.click();
		
		WebElement emailId = driver.findElement(By.xpath("//input[@id='email_create'] "));
		emailId.sendKeys("ragumca2012@gmail.com");
			
	    WebElement create = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
        create.click();
		
		System.out.println("Current Url: "+driver.getCurrentUrl());
		
		Thread.sleep(2000);
        
		WebElement gerder = driver.findElement(By.xpath("//div/label[@for='id_gender1']"));
		gerder.click();
		
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		firstName.sendKeys("ragu");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lastName.sendKeys("raman");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='passwd']"));
		pwd.sendKeys("abcde");
		
		WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
		Select selDays = new Select(days);
		selDays.selectByIndex(4);
		
		WebElement months = driver.findElement(By.xpath("//select[@id='months']"));
		Select selMnt = new Select(months);
		selMnt.selectByValue("2");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select selYrs = new Select(year);
		selYrs.selectByValue("1989");
		
		WebElement newsletter = driver.findElement(By.xpath("//input[@id='newsletter']"));
		newsletter.click();
		
		WebElement optn = driver.findElement(By.xpath("//input[@id='optin']"));
		optn.click();
		
		WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
		company.sendKeys("rr soft");
		
		WebElement address1 = driver.findElement(By.xpath("//input[@id='address1']"));
		address1.sendKeys("rr soft");
		
		WebElement address2 = driver.findElement(By.xpath("//input[@id='address2']"));
		address2.sendKeys("rr flat");
		
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("trichy");
		
		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select selState = new Select(state);
		selState.selectByValue("11");
		
		WebElement pincode = driver.findElement(By.xpath("//input[@id='postcode']"));
		pincode.sendKeys("00000");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select selCountry = new Select(country);
		selState.selectByValue("21");
		
		WebElement phoneNum = driver.findElement(By.xpath("//textarea[@id='other']"));
		phoneNum.sendKeys("970184134");
		
		WebElement homePhone = driver.findElement(By.xpath("//input[@id='phone']"));
		homePhone.sendKeys("970184134");
		
		WebElement mobilePhone = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		mobilePhone.sendKeys("970184134");
		
		
		WebElement alias = driver.findElement(By.xpath("//input[@id='alias']"));
		alias.clear();
		alias.sendKeys("main street");
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitAccount']"));
		submit.click();
		
	}
	

}

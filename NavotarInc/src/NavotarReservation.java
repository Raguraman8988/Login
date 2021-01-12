import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class NavotarReservation {
	
	public static void vanBooking1() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(
				"http://67.43.12.211/NavotarReservation/?clientid=321&mode=qa&AspxAutoDetectCookieSupport=1#/?lang=en");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.navigate().refresh();

		WebElement vechileType = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select select = new Select(vechileType);
		select.selectByVisibleText("Mini Van");

		WebElement pickUpDate = driver.findElement(By.xpath(
				"//input[@class='form-control ng-pristine ng-untouched ng-isolate-scope ng-valid-date ng-valid ng-valid-required']"));
		String pickDate = "02-March-2020";
		js.executeScript("arguments[0].setAttribute('value','" + pickDate + "');", pickUpDate);

		WebElement pickUpTime = driver
				.findElement(By.xpath("//select[@class='form-control ng-pristine ng-untouched ng-valid']"));
		Select selPickUpTime = new Select(pickUpTime);
		selPickUpTime.selectByVisibleText("11:30 AM");

		WebElement dropOffDate = driver.findElement(By.xpath(
				"(//input[@class='form-control ng-pristine ng-untouched ng-isolate-scope ng-valid-date ng-valid ng-valid-required'])[2]"));
		String dropDate = "04-March-2020";
		js.executeScript("arguments[0].setAttribute('value','" + dropDate + "');", dropOffDate);

		WebElement dropOffTime = driver
				.findElement(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']"));
		Select selDropOffTime = new Select(pickUpTime);
		selPickUpTime.selectByVisibleText("12:30 PM");

		WebElement location = driver.findElement(By.xpath("//select[@data-ng-model='search.checkedOutLocation']"));
		Select selLocation = new Select(location);
		selLocation.selectByVisibleText("Chennai, India ");

		WebElement diffDropOff = driver.findElement(By.xpath("//input[@name='test']"));
		diffDropOff.click();

		WebElement dropLocation = driver.findElement(By.xpath("//select[@data-ng-model='search.checkedInLocation']"));
		Select selDropLocation = new Select(dropLocation);
		selDropLocation.selectByVisibleText("Mumbai, India");

		WebElement search = driver.findElement(By.xpath("//span[text()='Search']"));
		search.click();

		WebElement vecType = driver.findElement(By.xpath("(//label[@class='css-label radGroup1 ng-scope'])[4]"));
		vecType.click();

		WebElement nextBtn = driver.findElement(By.xpath("//button[@class='btn-custom pull-right']"));
		nextBtn.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir") + "\\ScreenShots\\Booking1.png");
		FileHandler.copy(sourceFile, destFile);

		driver.close();

	}

	public static void vanBooking2() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(
				"http://67.43.12.211/NavotarReservation/?clientid=321&mode=qa&AspxAutoDetectCookieSupport=1#/?lang=en");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.navigate().refresh();

		WebElement vechileType = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[1]/div[2]"));
		Select select = new Select(vechileType);
		select.selectByVisibleText("Mini Van");

		WebElement pickUpDate = driver.findElement(By.xpath(
				"//input[@class='form-control ng-pristine ng-untouched ng-isolate-scope ng-valid-date ng-valid ng-valid-required']"));
		String pickDate = "02-March-2020";
		js.executeScript("arguments[0].setAttribute('value','" + pickDate + "');", pickUpDate);

		WebElement pickUpTime = driver
				.findElement(By.xpath("//select[@class='form-control ng-pristine ng-untouched ng-valid']"));
		Select selPickUpTime = new Select(pickUpTime);
		selPickUpTime.selectByVisibleText("09:00 AM");

		WebElement dropOffDate = driver.findElement(By.xpath(
				"(//input[@class='form-control ng-pristine ng-untouched ng-isolate-scope ng-valid-date ng-valid ng-valid-required'])[2]"));
		String dropDate = "04-March-2020";
		js.executeScript("arguments[0].setAttribute('value','" + dropDate + "');", dropOffDate);

		WebElement dropOffTime = driver
				.findElement(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']"));
		Select selDropOffTime = new Select(pickUpTime);
		selPickUpTime.selectByVisibleText("09:00 AM");

		WebElement location = driver.findElement(By.xpath("//select[@data-ng-model='search.checkedOutLocation']"));
		Select selLocation = new Select(location);
		selLocation.selectByVisibleText("Chennai, India ");

		WebElement search = driver.findElement(By.xpath("//span[text()='Search']"));
		search.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir") + "\\ScreenShots\\Booking2.png");
		FileHandler.copy(sourceFile, destFile);

		driver.close();
	}

	public static void main(String[] args) throws Exception {
		vanBooking1();
		vanBooking2();
	}

}

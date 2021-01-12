package com.autoit.org;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.BaseClass;

public class AutoItConcept extends BaseClass{
//	public static WebDriver driver = BaseClass.driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		browserLaunch("chrome");
		getUrl("http://www.tinyupload.com/");
		
		Thread.sleep(3000);
		WebElement chooseFileBtn = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]"));
		singleClick(chooseFileBtn);
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\AutoItScript\\AutoItAutomation.exe");
		
		Thread.sleep(3000);
		WebElement desct = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/textarea"));
		desct.sendKeys("My Resume");
		
		Thread.sleep(3000);
		WebElement uploadBtn = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/img"));
		singleClick(uploadBtn);
		
		Thread.sleep(3000);
		String wantClose = "File upload progress";
		
		Set<String> windowHandles = driver.getWindowHandles();
		 for (String windows : windowHandles) {
			 String title = driver.switchTo().window(windows).getTitle();
			 
			 if (wantClose.equals(title)) {
				 driver.close();
				
			}
		}
	}

}

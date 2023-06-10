package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	WebDriver driver;

	@Test
	public void TC1() throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Assert.assertTrue(false);

		
	}

	@Test
	public void TC2() throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		Assert.assertTrue(false);
		
	}
	
	@AfterMethod
	public void takeSCreenSHots(ITestResult result) throws IOException {
		
		String name = result.getName();
		
		if (result.getStatus()==result.FAILURE) {
			TakesScreenshot scrennshot = (TakesScreenshot) driver;
			File file = scrennshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("F:\\Afroz Study\\Jobberscafe\\com.Batch8\\TakeScreenShots\\"  +name+ ".jpg"));
		}
		
		driver.close();
	}

}

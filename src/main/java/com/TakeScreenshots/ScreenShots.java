package com.TakeScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShots {
	public WebDriver driver;

	@Test
	public void TC1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Assert.assertTrue(false);

	}

	@AfterMethod
	public void screenShot(ITestResult result) throws IOException {
		if (result.FAILURE==result.getStatus()) {
			TakesScreenshot scrennshot = (TakesScreenshot)driver; File
			 file=scrennshot.getScreenshotAs(OutputType.FILE); 
			 String name = result.getName();
			 FileUtils.copyFile(file, new File("F:\\Afroz Study\\Jobberscafe\\com.Batch8\\ScreenShots\\"  +name+  ".jpg"));
		}
		 
		
		driver.close();
	}
}

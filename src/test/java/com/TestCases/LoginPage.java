package com.TestCases;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.Pages.LoginPageLocater;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends BaseClass{

	
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		driver =  before();
	}


	@Test
	public void TC1() throws IOException {	
		Assert.assertTrue(true);	
	}

	@Test
	public void TC2() throws IOException, InterruptedException {
//		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
//		Assert.assertTrue(true);
		LoginPageLocater loginPage = new LoginPageLocater(driver);
		loginPage.creatButton();
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void afterMethod() {
		driver = takeSCreenSHots();
	}
	

}

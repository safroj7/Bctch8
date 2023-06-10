package com.Batch8;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationsTwo {
	int a,bc;


	@Test  (expectedExceptions = NoSuchElementException.class)
	public void TC3() {
		System.out.println("Third test case");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Afroz");
		
		driver.navigate().refresh();
		
		driver.findElement(By.id("email")).sendKeys("Afroz");
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
		driver.navigate().back();
		driver.findElement(By.id("email")).sendKeys("Afroz");
		
		driver.close();
	}
}

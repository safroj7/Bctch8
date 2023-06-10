package com.Batch8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDemo {
	
	
	
	@Test
	public void TC1() throws InterruptedException {
	
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
				
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		//Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//div[contains(text(),'Date of birth')]/..//div[2]//span//span//select[1]"));
		Thread.sleep(1000);
		
	   Select select  = new Select(day);
	   select.selectByIndex(0);
		
		Thread.sleep(3000);
		
		
		select.selectByVisibleText("25");
		Thread.sleep(3000);
		
		
		WebElement month = driver.findElement(By.xpath("//div[contains(text(),'Date of birth')]/..//div[2]//span//span//select[2]"));
		
		Select select1  = new Select(month);
		   select1.selectByIndex(10);
		
			Thread.sleep(3000);
		driver.close();

	}

}

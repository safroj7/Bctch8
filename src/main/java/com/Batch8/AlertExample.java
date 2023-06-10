package com.Batch8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		driver.get("https://www.guru99.com/alert-popup-handling-selenium.html");
		
		//driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		
		Alert alert =  driver.switchTo().alert();
		
		
		alert.accept();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}

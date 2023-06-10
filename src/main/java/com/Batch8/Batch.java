package com.Batch8;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Batch {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentWindow = driver.getWindowHandle();
		 System.out.println("My parent Id" + driver.getWindowHandle());
		driver.findElement(By.xpath("//button[contains(text(),'Open New Window')]")).click();

		Set<String> childs = driver.getWindowHandles();

		Iterator<String> iterator = childs.iterator();

		while (iterator.hasNext()) {
			
			String childWindow = iterator.next();
			
			if(!parentWindow.equals(childWindow)) {
				
				System.out.println("My child Id" +childWindow);
				driver.switchTo().window(childWindow);
				
				driver.findElement(By.id("firstName")).sendKeys("Afroz");
				
			}
		}
		
		//driver.switchTo().window(parentWindow);
		
		//driver.findElement(By.xpath("//button[contains(text(),'Open New Tab')]")).click();
		
		
		driver.close();

	}

}

package com.Batch8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement frame  = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']//p//iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.xpath("(//h5[contains(text(),'High Tatras')])[1]"));
		WebElement dest = driver.findElement(By.xpath("//span[contains(text(),'Trash')]/../.."));
		
		
		
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(source, dest).perform();
		
		Thread.sleep(3000);
		driver.close();
	}

}

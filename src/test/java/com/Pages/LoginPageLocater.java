package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPageLocater {
	
	WebDriver driver;
	
	By createAccountButton = By.xpath("//a[contains(text(),'Create new account')]");
	
	public LoginPageLocater(WebDriver driver) {
		this.driver=driver;
	}

	
	public void creatButton() {
		 driver.findElement(createAccountButton).click();
		
	}
	

}

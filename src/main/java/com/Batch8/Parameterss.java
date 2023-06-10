package com.Batch8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Parameterss {

	

	
	
	
	@Test
	@Parameters("browser")
	public void Tc1(String a) {
         System.out.println(a);
         
         
   
	}
}

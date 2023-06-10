package com.Batch8;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({ListnersClass.class})

public class Annotations {
	
	@Test 
	public void TC1() {
		System.out.println("First test case");
		
	}
	
	@Test 
	public void TC2() {
		System.out.println("Second test case");
		
	}
	
	@Test 
	public void TC3() {
		
		System.out.println("Third test case");
		
		
	}
	
	@Test 
	public void TC4() {
		
		System.out.println("4 test case");
		
		Assert.assertTrue(false);
		
	}
	
}

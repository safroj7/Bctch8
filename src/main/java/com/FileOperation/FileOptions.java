package com.FileOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class FileOptions {

	
	@Test
	public void TC1() throws IOException {
		Properties prop = new Properties();
		InputStream ip = new FileInputStream("F:\\Afroz Study\\Jobberscafe\\com.Batch8\\Configuration\\Config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("password"));
	}
}

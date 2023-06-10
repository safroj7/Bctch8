package com.FileOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class CofigLoad {

	
	@Test
	public void TC1() throws IOException {
		
		
		System.out.println(System.getProperty("user.dir"));
		
		String path  = System.getProperty("user.dir");
		
		Properties prop = new Properties();
		InputStream input = new FileInputStream(path + "\\SampleConfig\\SampleConfigFile.properties");
		prop.load(input);
		
		System.out.println(prop.getProperty("url"));
	
		
		
	}
}

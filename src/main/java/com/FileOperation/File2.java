package com.FileOperation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class File2 {
	
	@Test
	public void TC2() throws IOException {
		InputStream ip = new FileInputStream("F:\\Afroz Study\\Jobberscafe\\com.Batch8\\excel file\\demo2.xls");
		HSSFWorkbook workbok = new HSSFWorkbook(ip);
		HSSFSheet sheet = workbok.getSheet("Sheet1");
		System.out.println( sheet.getPhysicalNumberOfRows());
	}

}

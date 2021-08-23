package com.sunil.poi;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteDataIntoExcel {

	public static void main(String[] args) {
		
		try   
		{  
		//declare file name to be create   
		String filename = "C:\\Users\\sunil\\Documents//CricketScoreListTable.xlsx";  
		//creating an instance of HSSFWorkbook class  
		HSSFWorkbook workbook = new HSSFWorkbook();  
		//invoking creatSheet() method and passing the name of the sheet to be created   
		HSSFSheet sheet = workbook.createSheet("CricketScore");   
		//creating the 0th row using the createRow() method  
		HSSFRow rowhead = sheet.createRow((short)0);  
		//creating cell by using the createCell() method and setting the values to the cell by using the setCellValue() method  
		rowhead.createCell(0).setCellValue("Id");  
		rowhead.createCell(1).setCellValue("Name");  
		rowhead.createCell(2).setCellValue("Runs");  
		rowhead.createCell(3).setCellValue("Balls");  
		rowhead.createCell(4).setCellValue("Boundaries");  
		//creating the 1st row  
		HSSFRow row = sheet.createRow((short)1);  
		//inserting data in the first row  
		row.createCell(0).setCellValue("1");  
		row.createCell(1).setCellValue("RohitSharma");  
		row.createCell(2).setCellValue("65");  
		row.createCell(3).setCellValue("58");  
		row.createCell(4).setCellValue("7");  
		//creating the 2nd row  
		HSSFRow row1 = sheet.createRow((short)2);  
		//inserting data in the second row  
		row1.createCell(0).setCellValue("2");  
		row1.createCell(1).setCellValue("ViratKohli");  
		row1.createCell(2).setCellValue("122");  
		row1.createCell(3).setCellValue("98");  
		row1.createCell(4).setCellValue("12");  
		
		HSSFRow row2 = sheet.createRow((short)3);  
		//inserting data in the second row  
		row1.createCell(0).setCellValue("3");  
		row1.createCell(1).setCellValue("JosButtler");  
		row1.createCell(2).setCellValue("46");  
		row1.createCell(3).setCellValue("48");  
		row1.createCell(4).setCellValue("4");  
		
		HSSFRow row3 = sheet.createRow((short)4);  
		//inserting data in the second row  
		row1.createCell(0).setCellValue("4");  
		row1.createCell(1).setCellValue("DavidWarner");  
		row1.createCell(2).setCellValue("62");  
		row1.createCell(3).setCellValue("78");  
		row1.createCell(4).setCellValue("3");  
		HSSFRow row4 = sheet.createRow((short)5);  
		//inserting data in the second row  
		row1.createCell(0).setCellValue("5");  
		row1.createCell(1).setCellValue("Williamson");  
		row1.createCell(2).setCellValue("82");  
		row1.createCell(3).setCellValue("103");  
		row1.createCell(4).setCellValue("9");  
		FileOutputStream fileOut = new FileOutputStream(filename);  
		workbook.write(fileOut);  
		//closing the Stream  
		fileOut.close();  
		//closing the workbook  
		workbook.close();  
		//prints the message on the console  
		System.out.println("Excel file has been generated successfully.");  
		}   
		catch (Exception e)   
		{  
		e.printStackTrace();  
		}  
		}  
	

	}


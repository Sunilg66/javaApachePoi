package com.sunil.poi;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

   public static void main(String[] args) throws Exception {

      
      XSSFWorkbook workbook = new XSSFWorkbook();
      
      
      XSSFSheet spreadsheet = workbook.createSheet( " Score Sheet ");

 
      XSSFRow row;

      
      Map < String, Object[] > empinfo = new TreeMap < String, Object[] >();
      empinfo.put( "1", new Object[] { "Id", "Name", "Runs","Balls","Boundaries" });
      
      empinfo.put( "2", new Object[] {  "1","RohitSharma", "56", "63","5" });
      
      empinfo.put( "3", new Object[] {  "2","ViratKohli", "122", "103","14"  });
      
      empinfo.put( "4", new Object[] {  "3","JosButtler", "42", "89","3"  });
      
      empinfo.put( "5", new Object[] { "4","DavidWarner", "58", "76","6"  });
      
      empinfo.put( "6", new Object[] { "5","Williamson", "84", "91","9" });

 
      Set < String > keyid = empinfo.keySet();
      int rowid = 0;
      
      for (String key : keyid) {
         row = spreadsheet.createRow(rowid++);
         Object [] objectArr = empinfo.get(key);
         int cellid = 0;
         
         for (Object obj : objectArr){
            Cell cell = row.createCell(cellid++);
            cell.setCellValue((String)obj);
         }
      }
     
      FileOutputStream out = new FileOutputStream(
         new File("C:\\Users\\sunil\\Downloads\\CricketScore.xlsx"));
      
      workbook.write(out);
      out.close();
      System.out.println("Writesheet.xlsx written successfully");
   }


	}



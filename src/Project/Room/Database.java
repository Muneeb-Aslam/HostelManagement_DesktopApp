package com.mycompany.hostelmanagement.Room;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  


public class Database {

  public static void main(String [] args)throws IOException {
      
  
      String Path= ".\\src\\main\\java\\com\\mycompany\\hostelmanagement\\Room\\Database.xlsx"; // path of excel file
      
      FileInputStream input = new FileInputStream(Path); // open a file to read 
      
      XSSFWorkbook Book = new XSSFWorkbook(input); // creating a workbook 
      
      XSSFSheet Sheet = Book.getSheetAt(0); // creating a sheet 
      
      int rows = Sheet.getLastRowNum();
      
      int col = Sheet.getRow(1).getLastCellNum();
      
      for (int i=0;i<=rows;i++){
          
          XSSFRow row = Sheet.getRow(i);
          
          for (int j=0;j<col;j++){

              System.out.print(row.getCell(j).getStringCellValue()+"| ");
 
}
          System.out.println();
      
}
}
}
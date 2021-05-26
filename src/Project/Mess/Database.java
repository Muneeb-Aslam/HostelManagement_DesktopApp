/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hostelmanagement.Mess;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
/**
 *
 * @author Muneeb
 */
public class Database {

    public static void main(String [] args)throws IOException {
        
    
        String Path= ".\\src\\main\\java\\com\\mycompany\\hostelmanagement\\Mess\\Database.xlsx"; // path of excel file
        
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
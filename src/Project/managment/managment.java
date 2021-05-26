
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class managment {
  static{String name;
    name= "Bio";
    if(new File(name+".xls").exists()==false){
      try {
        FileOutputStream file = new FileOutputStream(new File(name+".xls"));
      }   catch (Exception e) {
             //TODO: handle exception
             System.out.println("File not created !");
             e.printStackTrace();
          } 
    }
    else{
      System.out.println("File already exists !");
    }}

    //for a new student entering
    protected  void create(){
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the student id as file name: ");
        name= in.nextLine();
        if(new File(name+".xls").exists()==false){
          try {
            FileInputStream inputStream = new FileInputStream(new File(name+".xls"));
            Workbook workbook = WorkbookFactory.create(inputStream);
          }   catch (Exception e) {
                 //TODO: handle exception
                 e.printStackTrace();
              } 
        }
  }

public void edit() throws IOException{

  
    /*Row row = sheet.getRow(5);
    Cell cms = row.createCell(0);
    cms.setCellValue("555");
    Cell email = row.createCell(0);
    cms.setCellValue("d");
    Cell name = row.createCell(0);
    cms.setCellValue("Daniyal");  
    Cell nod = row.createCell(0);
    cms.setCellValue("0");
    Cell eMess = row.createCell(0);
    cms.setCellValue("0");
    FileOutputStream edit = new FileOutputStream("Bio.xls");
    editwb.close();*/
}

    public static void main(String[] args) throws IOException {
      managment obj =new managment();
      try {
        obj.edit();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      obj.edit();
    }
}

//package student;
import java.util.Scanner;
import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public abstract class  Validate {
//sab se pahle ek bar isse run krna ha
    String pass;
    public String em;
    protected static  String [][] credentials = {{"ahmed","1"},{"ali","2"},{"abi","3"},{"ami","4"}};

    protected int input (Validate obj, Scanner input){
        boolean l=false;
        String em,pass;
        do{
         System.out.println("Enter Email address: ");
         obj.em = input.next();
         System.out.println("Enter Password address: ");
         obj.pass = input.next();
         l=obj.security(obj);
         System.out.println(l);
        }while(l==false);
        return 0;
    }

    public boolean security (Validate user){
        boolean result=false;
        for (int i=0;i<credentials.length;i++){
             if (credentials[i][0].equals(user.em)==true  &&  credentials[i][1].equals(user.pass)==true){
                   System.out.println("Sucess");
                   result=true;
                   break;
             }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }

    //interfaces
    protected abstract void update();    //veiw and edit
    protected abstract void veiwOnly();
    protected  void create(){
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the student id as file name: ");
        name= in.nextLine();
        try{
          HSSFWorkbook excelSheet = new HSSFWorkbook();
          FileOutputStream basicSheet = new FileOutputStream(name);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("File not created");
            e.printStackTrace();
          }
    }
}

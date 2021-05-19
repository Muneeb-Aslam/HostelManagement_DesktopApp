//package student;
import java.util.Scanner;
public abstract class Validate {
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
    //interfaces
    protected abstract void veiwAndEdit();
    protected abstract void veiwOnly();
    protected abstract void delete();
}

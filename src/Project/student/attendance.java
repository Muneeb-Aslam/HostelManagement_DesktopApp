//package student;
import java.util.Scanner;
public class attendance extends Validate{
    protected int nod=0;
    @Override
    protected void veiwAndEdit() {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void veiwOnly() {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void delete() {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    protected int input (Validate obj, Scanner input){
        boolean l=false;
        String em,pass;
        int count=0;
        do{
         System.out.println("Enter Email address: ");
         obj.em = input.next();
         System.out.println("Enter Password address: ");
         obj.pass = input.next();
         l=obj.security(obj);
         System.out.println(l);
        }while(l==false);
        count++;
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        attendance std = new attendance();
        std.nod=std.input(std,input);
    }

}
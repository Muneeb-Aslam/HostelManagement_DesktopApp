//package student;
import java.util.Scanner;
public class calculator extends Validate{
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

    {System.out.println("ACCOUNTIWYFE");}

    double limit,current,expense;
    String [][]expenserec = new String[50][2];

    public void setLimit(double limit) {
        this.limit = limit;
    }
    public double getLimit() {
        return limit;
    }
    public void setCurrent(double current) {
        this.current = current;
    }
    public double getCurrent() {
        return current;
    }
    public void setExpense(double expense) {
        this.expense = expense;
    }
    public double getExpense() {
        return expense;
    }

    public double expense (){
        double sum=0;
        for (int i=0;i<expenserec.length;i++){
            sum+=Double.parseDouble(expenserec[i][1]);
        }
        return sum;
    }
    public double calc (double limit){
        this.current = limit - this.expense();
        return this.current; 

    }

    public static void main(String[] args) {
        System.out.println("Enter your Budget: ");
        Scanner in= new Scanner(System.in);
        double limit = in.nextDouble();
        calculator c= new calculator();
        System.out.println(c.calc(limit));
        c.getCurrent();
        c.getExpense();

    }
}

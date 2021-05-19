import java.util.Scanner;

public class timetable extends Validate{
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
     private String [][]table= new String[8][9];
         public void setx(String k[][])
    {
        table[0][0]="DAY";
        table[1][0]="Monday";
        table[2][0]="Tuesday";
        table[3][0]="Wednesday";
        table[4][0]="Thursday";
        table[5][0]="Friday";
        table[6][0]="Saturday";
        table[7][0]="Sunday";
        for (int i=1;i<8;i++)
        {
            table[0][i]="slot"+(i+1);
        }
       
         Scanner sc=new Scanner(System.in);
        System.out.println("enter terms for odd days ");
          for (int j=1;j<9;j++)
	     {
	         k[1][j]=sc.nextLine();
	         table[1][j]=k[1][j];   
	     }
             System.out.println("enter terms for even days ");
          
	     for (int j=1;j<9;j++)
	     {
	         k[2][j]=sc.nextLine();
	         table[2][j]=k[2][j];   
	     }
             for(int j=1;j<9;j++)
             {
                for(int i=1;i<6;i=i+2)
                    {
                        table[i+2][j]=table[i][j];
                    }
            }
                 for(int j=1;j<9;j++)
                 {
                    for(int i=2;i<5;i=i+2)
                        {
                            table[i+2][j]=table[i][j];
                        }
                 }

	
    }
	 public String[][] getx()
	 {
	     return table;
	 }
    public String[][] modify(timetable obj)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER YOUR DAY NO ");
        int d=sc.nextInt();
        System.out.println("ENTER YOUR SLOT NO ");
        int s=sc.nextInt();
        obj.table[d][s]=sc.nextLine();
        return table;
    }
public static void main(String[] args) {
	    String [][]e=new String[8][9];
        timetable f= new  timetable();
	    f.setx(e);
	     String[][] r=f.getx();
	     for (int i=0;i<8;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }
             String[][] b=f.modify(f);
                 for (int i=0;i<8;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
	}
}

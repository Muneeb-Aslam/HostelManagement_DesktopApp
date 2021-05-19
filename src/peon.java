public class peon extends Employe {
    static {
        System.out.println("Welcome to the department, Please sanatize yourself");
    }

    peon(date pd2) {
        this.hireDate = pd2;
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        date pd2 = new date(28, 4, 2021);
        peon p2 = new peon(pd2);
        System.out.println(p2.getHireDate());
        System.out.println(p2.toString());

    }

}

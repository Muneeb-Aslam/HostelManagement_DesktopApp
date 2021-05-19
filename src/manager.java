public class manager extends Employe {
    static {
        System.out.println("Welcome to the Manage!");
    }
    final String dept;

    manager(String dept, int id, String name, date hireDate) {
        super(id, name, hireDate);
        this.dept = dept;
    }

}

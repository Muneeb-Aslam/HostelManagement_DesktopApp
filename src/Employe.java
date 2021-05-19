 public class Employe {
    private String name;
    private int id;
    private static String dept = "CS";
    protected date hireDate;

    public Employe(int id, String name, date hireDate) {
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
    }

    public Employe() {
        System.out.println("hey");
    }

    public Employe(date d1) {
        System.out.println(d1);
    }

    public String getDept() {
        return dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public date getHireDate() {
        return hireDate;
    }

    public void setHireDate(date hireDate) {
        this.hireDate = hireDate;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + this.name + "\n" + "id: " + this.id + "\nDepartment: " + dept + "\nHire Date: " + hireDate;

    }

    public static void main(String[] args) {
        date d1 = new date(26, 5, 2020);
        Employe e1 = new Employe(2, "ALI", d1);
        Employe e2 = new Employe(4, "Ahmed", d1);
        System.out.println(e1);
        System.out.println(e2.toString());
    }
}

public class person {
    int id;
    String email;
    person(String email,int id){
        setData(id,email);
        System.out.println("Constructor of person");
    }
    public void setData(int id, String email) {
        this.email = email;
        this.id = id;
    }
    public String getData(int id, String email){
        return id+email;
    }
}

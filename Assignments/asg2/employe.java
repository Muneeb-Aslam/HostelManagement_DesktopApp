public class employe extends person {
    employe(String email,int id){
        super(email, id);
        setData(email, id);
    }
    public void setData(String email , int id) {
        this.email = email;
        this.id = id;
    }

    @Override
    public String getData(int id, String email) {
        // TODO Auto-generated method stub
        return getData(id, email);
    }
    
}

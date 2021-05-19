//package management;
public class bill extends attendance{
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
    final double cpd=0,laundary=0,internet=0,barer=0,extraMess=0;
    private double  mess(){
        double mess;
          mess=this.cpd*this.nod; //cpd= cost per day, nod= no. of days.
          return mess;
        }
    private void finalMess (){
        double total;
        total=mess()+laundary+internet+barer+extraMess;
        System.out.println(total); //gui per dikhana ha 
    }
}
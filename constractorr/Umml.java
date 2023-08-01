package constractorr;


    public class Payroll{
        private String name;
        private int numberid;
        private double payRate;
        private double hoursworked;
    
    public Payroll(String n,int i)
    {
       this.name=n;
       this.numberid=i; 
    }
    public void setname(String n){
       // name=n;
        this.name=n;
    }
    public void setidNumber(int i){
        this.numberid=i;
    }
    public void setpayrate(double p){
        this.payRate=p;
    }
    public void sethoursworked(double h){
    this.hoursworked=h;
    }
    public String getname(){
        return getname(); 

    } 
    public int getidname(){
        return getidname();

    }
    public double getpayrate(){
        return getpayrate();

    }
    public double gethoursworked(){
        return gethoursworked();

    }
    public double getgrosspay(){
        return getgrosspay();

    }

}
public class Umml {
    public static void main(String[] args) {
      Payroll p=new Payroll("adnan", 21);
         p.getpayrate();
         p.gethoursworked();
       //p.display();
     

        

    }
}



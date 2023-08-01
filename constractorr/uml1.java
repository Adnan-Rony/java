package constractorr;

public class uml1 {
    
}
public class Payroll{
    private String name;
    private int numberid;
    private double payRate;
    private double hoursworked;

public Payroll(String n,int i)
{
   name=n;
   numberid=i; 
}
public void setname(String n){
    name=n;
}
public void setidNumber(int i){
    numberid=i;
}
public void setpayrate(double p){
    payRate=p;
}
public void sethoursworked(double h){
    hoursworked=h;
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
public void display(){
    System.out.println(getname());
    System.out.println(getidname());
   System.out.println(gethoursworked());
   System.out.println(getgrosspay());
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getNumberid() {
    return numberid;
}
public void setNumberid(int numberid) {
    this.numberid = numberid;
}
public double getPayRate() {
    return payRate;
}
public void setPayRate(double payRate) {
    this.payRate = payRate;
}
public double getHoursworked() {
    return hoursworked;
}
public void setHoursworked(double hoursworked) {
    this.hoursworked = hoursworked;
}
}

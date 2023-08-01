package constractorr;

public class Studennt {
    public int age;
    public double salary;
    public  String id;
    public static void main(String[] args) {
        Studennt o=new Studennt("221-15-5155");
        o.display();
        System.out.println(o.display(21));
        System.out.println(o.display(20.01230000)); 
        
    }
    Studennt(String i){
        //System.out.println(id);
        this.id=i;
    }
    public void display(){
        System.out.println("ALhamdulliah");
    }
    public int display(int a){
       // System.out.println(age);
       return a;
    }
    public double display(double s){
        //System.out.println(salary);
        return s;

    }

}

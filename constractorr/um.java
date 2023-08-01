package constractorr;

public class um {
    public static void main(String[] args) {
        Student s=new Student(12, 15.32123, "adnan");
        s.display();
       System.out.println(s.display(17.12334)) ;
        System.out.println(s.display(20));
    }

    
}
class Student{
    public int age;
    public double salary;
    private String id;
    Student(int a,double s,String i ){
        this.age=a;
        this.id=i;
        this.salary=s;
    }
    public void display(){
    System.out.println("adnan");
    }
    public int display(int myage){
        //age=myage;
        return age;

    }
    public double display(double mysalary){
        //this.salary=mysalary;
        return salary;

    }
}
package constractorr;

public class Um {
    public static void main(String[] args) {
        Student s=new Student(12, 15.32123,"adu");
        s.display();
       System.out.println(s.display(17.12334)) ;
        System.out.println(s.display(20));
    }

    
}
class Student{
    public int age;
    public double salary;
    private String id;
    Student(int age,double salary,String id ){
        this.age=age;
        
        this.salary=salary;
        this.id=id;
    }
    public void display(){
    System.out.println("adnan");
    }
    public int display(int myage){
        //age=myage;
        return myage;

    }
    public double display(double mysalary){
        //this.salary=mysalary;
        return mysalary;

    }
}
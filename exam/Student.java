package exam;

public class Student {
    public int age;
    public double salary;
    public String id;
    Student s=new Student("5155");
  

    
}

public  Student(String id ){
    this.id=id;
}
public void display(){
    System.out.println("ID: " + id);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
}
public int display(int age){
    System.out.println("Age: " + age);
   return age;
}
public double display(double salary){
    System.out.println("Salary: " + salary);
    return salary;
}

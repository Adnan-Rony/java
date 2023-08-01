package constractorr;

public class Student  {
    int age;
    public String name;
    public static void main(String[] args) {
       
    Student s=new Student();
    s.show();
    s.show("rony");
    }

public void show(){
    System.out.println("adnan");
}
void show(String nam){
    System.out.println(nam);
}
}

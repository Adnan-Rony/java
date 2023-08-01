package constractorr;

public class U {
    public static void main(String[] args) {
        Student s=new Student();
      s.show();
      s.show("bangladesh");
    }
}
class Student{
    int age;
    public String name;
    public void show(){
        System.out.println("enter");

    }
    void show(String name){
        System.out.println(name);
    }
}

package constractorr;

public class con1 {
    public static void main(String[] args) {
        Student s=new Student("adnan",21);
        s.input();
        Student s2=new Student("aduuuu",221);
        s2.input();
    }
}

class Student {
    String name;
    int id;
    public void input(){
        System.out.println(this.name);
        System.out.println(this.id);
    }
    Student(String n,int idd){
        this.name=n;
        this.id=idd;
    }
}

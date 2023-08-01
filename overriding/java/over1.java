package overriding.java;

public class over1 {
    



    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.name="adu";
        t.gender="male";
        t.age=21;
        t.tk=100000;
         t.display();
        
    }
    }
        class test{
        String name,gender;
        int age;
         void display(){
        System.out.println("name:"+name);
        System.out.println("gender:"+gender);
        System.out.println("age:"+age);
        }
        } 
        class Teacher extends test{
        int tk;
         void display(){
        System.out.println("name:"+name);
        System.out.println("gender:"+gender);
        System.out.println("age:"+age);
        System.out.println("money:"+tk);
        }
        
        } 

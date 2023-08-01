package constractorr;

public class abs1 {
   
    /**
     * @param args
     */
    public static void main(String[] args) {
        Teacher p=new Teacher();
        p.display();
        // p=new Student();
        // p.display();
        // p=new Teacher();
        // p.display();
    }
        
    
 public  class Person{
        void display(){
            System.out.println("i am a person");
        }
    }
 public class Student extends Person{
        void display(){
            System.out.println("i am a student");
        }
    }
  public class Teacher extends Person{
        void display(){
            System.out.println("i am a teacher ");
        }
    }
}

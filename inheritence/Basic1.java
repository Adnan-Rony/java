package inheritence;

public class Basic1 {
    public static void main(String[] args) {
       Teacher t=new Teacher();
       t.name="adnan";
       t.age=20;
       t.gender="male" ;
    
       t.area();  
    }

}
class person{
    String name;
    int age;
    // public void area(){
    //     System.out.println("name:"+name);
    //     System.out.println("age:"+age);
    // }
}
class Teacher extends person{
        String gender;
        public void area(){
            System.out.println("name:" +name);
            System.out.println("age:" +age);
            System.out.println("gender:" +gender);
        }
    }

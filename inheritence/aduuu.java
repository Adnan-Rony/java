package inheritence;

public class aduuu {
   public static void main(String[] args) {
    adnann a=new adnann();
    a.name="adnan rony";
    a.age=22;
    a.gender="male";
    a.area();


    
   } 
}
class education{
    String name;
    int age;
    // public void area(){
    //     System.out.println("name: "+name);
    //     System.out.println("agee: "+age);
    // }
}
class adnann extends education{
    String gender;
    public void area(){
           System.out.println("name: "+name);
        System.out.println("agee: "+age);
        System.out.println("gender: "+gender);
    }
}

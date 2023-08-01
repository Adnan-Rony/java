package Encapsulation;

public class neww {
    public static void main(String[] args) {
        Person p=new Person();
        p.setName("adnan");
        System.out.println(p.getName());
        p.setage(21);
        System.out.println(p.getage());
    }
    
}
 class Person{
    private String name;
   private int age;
   public void setName(String name){
    this.name=name;

   }
   public String getName(){
    return name;
   }
   public void setage(int age){
        this.age=age;
   }
   public int getage(){
    return age;
   }

}
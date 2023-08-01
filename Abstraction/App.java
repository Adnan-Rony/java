import Spider.Fish.Pet;

public class App {
    public static void main(String[] args) {
      Cat c=new Cat("samba");
      c.setName("samba");
      System.out.println(c.getName());
      c.play();
      c.eat();

      Fish f=new Fish();
      f.play();
      f.walk();
      f.eat();
      f.setname("fishy");
      System.out.println(f.getname());
    //   Animel a=new Animel();
    //   a.walk();
    //   a.eat();
        
    }
}
abstract class Animel{
    public int legs;
    public Animel(int legs){
        this.legs=legs;
      
    }
    public void walk(){
        System.out.println("animel is walking ");

    }
    public abstract void eat();
}
     class Cat extends Animel implements Pet {
    private  String name;
    public  Cat (String name){
            super(4);
        this.name=name;
    }
    public Cat(){
    super(4);
    }
    public String getName(){
        return name;
    }
    public void setName(String Name){
        this.name=Name;
    }
    public void play(){
        System.out.println("cat are playing");
    }
    public void eat(){
        System.out.println("cat are eating");
    }
}
class Spider extends Animel{
    public  Spider(){
        super(8);

    }
    public void eat(){
        System.out.println("Spider is eating");
   } 
}
    public class Fish extends Animel implements Pet{
    private String name;
    public  Fish(){
       super(5);
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void play(){
        System.out.println("cat are playing");
    }
    public void walk(){
        System.out.println("Fish is walking");
    }
    public void eat(){
    
        System.out.println("Fish is eating");
    }
    


}
interface Pet{
    public String getName();
    public void setName(String Name);
    public void play();
}
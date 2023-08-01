package constractorr;

public class con2 {
    public static void main(String[] args) {
        Teacher t=new Teacher("adnan", "male", "science");
      t.adnan();
      Teacher t2=new Teacher(21);
      t2.adnan2();
    }
}
class Teacher{
    String name,gender,sub;
    int age;
    // public void adnan(){
    //     System.out.println(this.name);
    //     System.out.println(this.gender);
    //     System.out.println(this.sub);
        
    // }
    // public void adnan2(){
    //     System.out.println(this.age);
    // }
    Teacher(String n,String g,String s){
        this.name=n;
        this.gender=g;
        this.sub=s;
    }
    Teacher(int a){
        this.age=a;
    }
    public void adnan(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(sub);
        
    }
    public void adnan2(){
        System.out.println(age);
    }
}

   
    


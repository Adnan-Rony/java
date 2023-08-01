package superclass;

public class suuperclass {
    public static void main(String[] args) {
        B ob=new B();
        ob.display();
    }
}
class A{
    void display(){
        System.out.println("print A class");
    }
}
class B extends A{
//method overiding
    void display(){
        super.display();
        System.out.println("print B class");
        
    }
}
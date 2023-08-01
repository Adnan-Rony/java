package exam;

public class paglu {
    public static void main(String[] args) {
        Shape s=new Shape();
        s.Setvalue(5, 10);
        Rectangle r=new Rectangle();
       System.out.println( r.getArea());
       Traingle t=new Traingle();
      System.out.println( t.getArea());
  
    
    }
    
}
 class Shape{
    private double height,width;
    public void Setvalue(double height,double width){
        this.height=height;
        this.width=width;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
}
class Rectangle extends Shape{
    
   public double getArea(){
    return getHeight()*getWidth();

    }
}
class Traingle extends Shape{

    public double getArea(){
     return 0.5*getHeight()*getWidth();
 
     }
 }
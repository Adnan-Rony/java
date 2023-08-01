package constractorr;

public class abs2 {
    public static void main(String[] args) {
        // Shape s=new Shape();
        //  Rectrangle r=new Rectrangle(10, 02);
        // Tringle t=new Tringle(3, 04);
        // System.out.println(s.area()); 
        // System.out.println(r.area()); 
        // System.out.println(t.area()); 

        Shape s1=new Shape();
        Shape s2=new Rectrangle(10, 02);
     Shape s3=new Tringle(3, 04);
       System.out.println(s1.area()); 
       System.out.println(s2.area()); 
       System.out.println(s3.area()); 
       
    
        
    }
}
 class Shape{
    double area(){
        System.out.println("area for shape");
        return 0;
    }
}
  class Rectrangle extends Shape{
        double length,width;
        Rectrangle(double length,double width){

            this.length=length;
            this.width=width;
        }
      

        double area(){
            System.out.println("area for rectrangle");
           return length*width;
        }
}
 class Tringle extends Shape{
    double base,height;
    Tringle(double base,double height)
    {
        this.base=base;
        this.height=height;
    }
    double area(){
        System.out.println("area for traingle");
        return 0.5*base*height;
    }
}

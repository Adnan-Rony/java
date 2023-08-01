package Assigment;

public class Problem1 {
    public static void main(String[] args) {
        PizzaSlice p=new PizzaSlice();
        p.Shapename();
      
        p.area(10, 2);
        p.CheckTringle();
        p.CheckRightAngleTringle();
        
        
    }
    
}
     class PizzaSlice{
        public double Angle1;
        private double Angle2;
        int Angle3;
        public double Height;
        public double Base;
    public void Shapename(){
        System.out.println("name of shape ");
    }
    public double area(double Height,double Base){
        System.out.println("print area:");
        return Height*Base;
    } 
    public void CheckTringle(){
        System.out.println("print tringle");
    }
    public void CheckRightAngleTringle(){
        System.out.println("adnan");
    }
  
}


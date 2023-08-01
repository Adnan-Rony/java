package exam;

import exam.Car.Bmw;

public class janu {
    
    public static void main(String[] args) {
        Car c=new Car();
        c.color();
        Bmw b=new Bmw();
        b.color();
    }


    
} 
public class Car{
    public void color()
    {
        System.out.println("Car color is red");
    }
 

    public class Bmw extends Car{
       
        public void color()
        {
           
            System.out.println("BMW color is BLACK");
        }
    }

}
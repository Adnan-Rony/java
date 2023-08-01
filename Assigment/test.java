package Assigment;

public class test {
    public static void main(String[] args) {
        Convert_class c=new Convert_class();
        c.Check_leap_year();
        c.Calculate_BirthYear();
        c.ConvertDolartoTaka();
    }
    
}
class Convert_class{
    int year;
    int age;
    int Current_Year;
    int dolar;
    int Fahrenheit;
   public int convert_celcious(int Fahrenheit)
   {
    return Fahrenheit;
   }
   public void Check_leap_year(){
    System.out.println("print leap year");
   }
   public void Calculate_BirthYear(){
    System.out.println("print birth year");
   }
   public double ConvertDolartoTaka(){

    System.out.println("print dollar");
    return dolar;
   }


    }

package inheritence.teacherr;

public class Calculation {
    int z;
    public void addition(int x,int z){
        z=x+y;
        System.out.println("addition is :"+z);

    }
    public void subtraction(int x,int z){
        z=x-y;
        System.out.println("subtraction is :"+z);

    }
}
class MyCalculation extends Calculation{


    public void multiplication(int x,int z){
        z=x*y;
        System.out.println("multiplication is "+z);
    }
    public void divisor(int x,int z){
        z=x/y;
        System.out.println("divisor is "+z);
    }
    public static void main(String[] args) {
        int x=10,y=5;
        MyCalculation m=new MyCalculation();
       
       
    }
}
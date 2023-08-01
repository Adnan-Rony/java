package exam.exception;

public class error1 {
  
    public static void main(String[] args) {
        try{

            int x=10;
            int y=0;
            int result=x/y;
            System.out.println("result is "+result);
        }
       
        // catch(ArithmeticException e)
        catch(Exception e)
      {
        System.out.println("exception is :"+e);
      }
      
        System.out.println("last line");
    }
}

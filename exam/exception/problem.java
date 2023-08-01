package exam.exception;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        while(true)
        {
            try{

                Scanner sc=new Scanner(System.in);
                System.out.println("please enter num1:");
                int num1=sc.nextInt();
                System.out.println("please enter num2 :");
                int num2=sc.nextInt();
                int result=num1/num2;
                System.out.println("result: " +num1 +"/"+ num2+"="+result);
            }
            catch(Exception e){
                System.out.println("exception :"+e);
                System.out.println("you must enter integer:please try again");
            }
        }
    

    }
}

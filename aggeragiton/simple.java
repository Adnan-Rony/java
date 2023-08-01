package aggeragiton;

public class simple extends Thread {
    public void run(){
        System.out.println("fuck you");
    }
    public static void main(String[] args) {
        simple s=new simple();
        s.start();
    }
    
}

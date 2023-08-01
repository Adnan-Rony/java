package constractorr;

 public class studentt {
    public int age;
    public double salary;
    private String id;

    public static void main(String[] args) {
        studentt s=new studentt("221-15-5155");
        s.display();
       System.out.println( s.display(21));
        System.out.println(s.display(2000.0000));;
        
    }

    public studentt(String id){
        this.id=id;
    } 
    public void display(){
        System.out.println("enter age and salary");
    }
    public int  display(int age){
       // System.out.println(age);
    return age;

    }
    public double display(double salary){
       // System.out.println(salary);
    return salary;
    }
 }

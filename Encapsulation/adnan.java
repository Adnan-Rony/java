package Encapsulation;

public class adnan {
    public static void main(String[] args) {
        education e=new education();
        e.setName("aduuuuu");
        System.out.println(e.getName());
        e.setnum(21);
        System.out.println(e.getnum());
        
    }
    
}
class education{
    private String name;
    private int num;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setnum(int num){
        this.num=num;
    }
    public int getnum(){
        return num;
    }
    
}

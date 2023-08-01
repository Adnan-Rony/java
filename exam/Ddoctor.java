package exam;

public class Ddoctor {
    private String name;
    private String id;
    private String hospital;
    private String phoneno;
    public static void main(String[] args) {
        Ddoctor d=new Ddoctor();
     d.setData("adu","5155", "abcd", "10101000");
        d.display();
        
    }
    

public void setData(String name,String id,String hospital,String phonenum){
    this.name=name;
    this.id=id;
    this.hospital=hospital;
    this.phoneno=phonenum;

}
public String getName(){
    return name;
}
public String getid(){
    return id;
}
public void display(){
    System.out.println("name:"+name);
    System.out.println("id:"+id);
    System.out.println("hospital:"+hospital);
    System.out.println("phonumber:"+phoneno);
}
}

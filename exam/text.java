package exam;

public class text {
    public static void main(String[] args)
    {
        Student st=new Student("adnan", 21, "CSE");
    //  Student st=new Student();
        // st.SetSName("adnan");
        System.out.println("Name:"+st.getsName());
        // st.setsid(5155);
      System.out.println(  "id"+st.getsid());
    //   st.setdept("CSE");
    System.out.println( "dept"+ st.getdept());
       
    }
    
}
 class Student{
    private String sName;
    private int sid;
    private String dept;
    // Student(){

    // }
    Student(String sName,int sid,String dept){
        this.sName=sName;
        this.sid=sid;
        this.dept=dept;

    }

    // public void SetSName(String sName){
    //     this.sName=sName;

    // }
    public String getsName(){
        return sName;
    }
    // public void setsid(int sid)
    // {
    //     this.sid=sid;
    // }
    public int getsid()
    {
        return sid;
    }
    // public void setdept(String dept)
    // {
    //     this.dept=dept;
    // }
    public String getdept()
    {
        return dept;
    }



  
}


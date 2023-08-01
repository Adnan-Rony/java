package exam;

public class Doctor {
  
    private String name;
    private String id;
    private String hospital;
    private String phoneNo;

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setData("John Doe", "1234", "XYZ Hospital", "123-456-7890");
        doctor.display();
        
       
        
    }
    public void setData(String name, String id, String hospital, String phoneNo) {
        this.name = name;
        this.id = id;
        this.hospital = hospital;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        // return this.name;
        return getName();
    }
    

    public String getId() {
        // return this.id;
        return  getId();
    }


    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Hospital: " + hospital);
        System.out.println("Phone Number: " + phoneNo);
      
    
}
}


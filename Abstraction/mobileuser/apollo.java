package mobileuser;

public class apollo extends SpaceCraft implements Drive,Shuttle {
    private int gear;

    public void setgear(int gear){
        this.gear=gear;
    }
    public int getgear(){
        return gear;
    }


    public apollo(int gear,String model){
        super(model);
        this.gear=gear;
    }


    public static void main(String[] args) {
        apollo p =new apollo(10, "ABCD12");
        p.drive();
        p.stop();
        p.turn();
        p.starShuttle();
        p.stopShuttle();
        p.display();
        
    }

    public void drive(){
        System.out.println("this space craft can be driven");

    }
    public void stop(){
        System.out.println("this space craft can be not driven");
    }
    public void turn(){
        System.out.println("this space turn craft can be driven");
    }
    public void starShuttle(){
        System.out.println("this space craft can be starshuttle");
    }
    public void stopShuttle(){
        System.out.println("this space craft can be notttt starshuttle");
    }



}
 class SpaceCraft {
    protected String model;
    SpaceCraft(String model){
        this.model=model;
    }
    public void display(){
        System.out.println("display showing spacecraft");

    }
}
 interface Drive{
    public void drive();
    public void stop();
    public void turn();
}
interface Shuttle{
    public void starShuttle();
    public void stopShuttle();
}

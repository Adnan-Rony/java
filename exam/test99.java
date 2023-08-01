package exam;

public class test99 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
      
        r.setheight(5);
        r.setWidth(5);

        r.setArea(10);
      System.out.println(  r.getheight());
    System.out.println(  r.getwidth());
  System.out.println(  r.getArea());
    }
    
}
public class Rectangle {
    private int height;
    private int width;
   private int area;
public void setheight(int height) {
    this.height = height;
}
public int getheight(){
    return height;
}


public void setWidth(int width) {
    this.width = width;
}
public int getwidth(){
    return width;
}


public void setArea(int area) {
    this.area = area;
}
public int getArea(){
    return area;
}



}

package exam;


public class hhh {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.setVales(5, 10);
        Rectangle r = new Rectangle();
        System.out.println(r.getArea());
        Triangle t = new Triangle();
        System.out.println(t.getArea());
    }
}

class Shape {
    private double height;
    private double width;

    public void setVales(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}

class Rectangle extends Shape {

    public double getArea() {
        return getHeight() * getWidth();
    }
}

class Triangle extends Shape {

    public double getArea() {
        return 0.5 * getHeight() * getWidth();
    }
}

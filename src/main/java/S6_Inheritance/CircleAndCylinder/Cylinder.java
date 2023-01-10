package S6_Inheritance.CircleAndCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        return getArea() * this.height;
    }

    public String toString() {
        return "height = " + height + super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.6, 7.8, "pink");
        System.out.println(cylinder.toString());
    }
}

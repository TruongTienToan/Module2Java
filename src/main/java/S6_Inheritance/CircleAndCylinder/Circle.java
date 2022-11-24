package S6_Inheritance.CircleAndCylinder;

public class Circle {
    private double radius;
    public String color = "Red";

    public Circle(){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return " radius = " + radius + ", color = " + color;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3, "green");
        System.out.println(circle.toString());
    }
}

package S6_Inheritance.ClassTriangle;

import S6_Inheritance.GeometricObject.Shape;

import java.util.Scanner;

public class Triangle extends Shape {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double p = (side1+side2+side3) / 2;
        double s = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return s;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{"
                + "side1="
                + side1
                + ", side2="
                + side2
                + ", side3="
                + side3
                + ".Area="
                + getArea()
                + ", Perimeter="
                + getPerimeter();
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.4, 5, 7);
        System.out.println(triangle);
    }
}

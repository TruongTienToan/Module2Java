package org.example.S4_LopVaDoiTuongTrongJava.QuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation(){

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public void showResult() {
        if (this.getDiscriminant() >= 0) {
            System.out.println("2 Nghiem" + this.getRoot1() + " - " + this.getRoot2());
        } else if (this.getDiscriminant() == 0) {
            System.out.println("1 nghiem" + this.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}


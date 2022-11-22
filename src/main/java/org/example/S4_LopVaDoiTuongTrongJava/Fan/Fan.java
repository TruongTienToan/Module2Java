package org.example.S4_LopVaDoiTuongTrongJava.Fan;

public class Fan {
    private int speed;
    private boolean on_off;
    private double radius;
    private String coler;

    public Fan(){
        this.speed = 2;
        this.on_off = true;
        this.radius = 10;
        this.coler = "Red";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn_off() {
        return on_off;
    }

    public void setOn_off(boolean on_off) {
        this.on_off = on_off;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }

    public String toString() {
        if (this.on_off) {
            return "speed: " + this.speed + ", color: " + this.coler + ", radius" + this.radius + ", fan is on";
        } else {
            return "color:  " + this.coler + ", radius: " + this.radius + "fan is off";
        }
    }
}

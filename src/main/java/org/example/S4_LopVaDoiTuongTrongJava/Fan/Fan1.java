package org.example.S4_LopVaDoiTuongTrongJava.Fan;

public class Fan1 {
    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan1.setSpeed(3);
        Fan1.setRadius(10);
        Fan1.setColer("yellow");
        Fan1.setOn_off(true);
        System.out.println("fan1: "+Fan1.toString());
    }
}

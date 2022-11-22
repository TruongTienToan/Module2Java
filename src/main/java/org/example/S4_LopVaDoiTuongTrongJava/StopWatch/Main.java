package org.example.S4_LopVaDoiTuongTrongJava.StopWatch;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IndexOutOfBoundsException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        StopWatch time = new StopWatch();
        time.setStart();
        String sc = scanner.nextLine();
//        Thread.sleep(10000);
        time.setStop();
        System.out.println(time.getElapsedTime());
    }
}

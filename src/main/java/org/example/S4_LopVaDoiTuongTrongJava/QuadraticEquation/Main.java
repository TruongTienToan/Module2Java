package org.example.S4_LopVaDoiTuongTrongJava.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị cho a: ");
        Double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập giá trị cho b: ");
        Double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập giá trị cho c: ");
        Double c = Double.parseDouble((scanner.nextLine()));


        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        quadraticEquation.showResult();

    }
}

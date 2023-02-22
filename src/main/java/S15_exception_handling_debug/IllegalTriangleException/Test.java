package S15_exception_handling_debug.IllegalTriangleException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập cạnh c: ");
        int c = scanner.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a) {
            ;
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
}

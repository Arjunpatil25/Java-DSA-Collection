package DSA;

import java.util.Scanner;

public class PrintAllOddNo {

    public static void allOddNo(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println(" enter the number: ");
            int n = sc.nextInt();
            allOddNo(n);

        }
    }
}

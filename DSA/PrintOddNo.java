package DSA;

import java.util.Scanner;

public class PrintOddNo {

    public static void oddNumbers(int n) {
        if (n % 2 != 0) {
            System.out.println("is a odd number" + n);
        } else {
            System.out.println("not a odd number " + n);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println(" enter the number: ");
            int n = sc.nextInt();

            oddNumbers(n);
        }
    }
}

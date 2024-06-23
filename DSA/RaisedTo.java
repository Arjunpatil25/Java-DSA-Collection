package DSA;

import java.util.Scanner;

public class RaisedTo {

    static void calpower(int n1, int n2) {
        double result = Math.pow(n1, n2);
        System.out.println(" power is : " + result);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Enter the number number1 and number 2 ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            calpower(n1, n2);
        }
    }
}

package DSA;

import java.util.Scanner;

public class Functions {

    public static float printAverage(int number1, int number2, int number3) {
        float result = (number1 + number2 + number3) / 3;
        return result;
        // System.out.println(" average is : "+result);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);) {
            
            System.out.println("enter the number 1 ");
            int number1 = sc.nextInt();
            System.out.println("enter the number 2 ");
            int number2 = sc.nextInt();
            System.out.println("enter the number 3");
            int number3 = sc.nextInt();
            System.out.println("average : "+printAverage(number1, number2, number3));
        }

    }
}

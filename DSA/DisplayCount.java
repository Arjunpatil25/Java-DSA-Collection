package DSA;

import java.util.Scanner;

public class DisplayCount {
    static int positive = 0;
    static int negavtive = 0;
    static int zero = 0;

    static void displaycount(int number) {
        if (number > 0) {
            positive++;
        } else if (number < 0) {
            negavtive++;
        } else {
            zero++;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean exit = false;
            while (!exit) {
                System.out.println(" 1.enter the number \n 2.exit");
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println(" enter the number");
                        int number = sc.nextInt();

                        displaycount(number);

                        break;
                    case 2:
                        exit = true;
                        System.out.println("positive count :" + positive);
                        System.out.println("negavtive count :" + negavtive);
                        System.out.println("zero count :" + zero);
                    default:
                        number = 0;
                        break;
                }

            }
        }
    }
}

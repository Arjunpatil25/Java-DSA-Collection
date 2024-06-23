package DSA;

import java.util.Scanner;

public class VoteEligible {
    static void cheakage(int age1) {
        if (age1 > 18) {
            System.out.println(" Eligible for voting age is : " + age1);
        } else {
            System.out.println(" NotEligible for voting age is sell than 18");

        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the age :");
            int age = sc.nextInt();
            cheakage(age);

        }
    }
}

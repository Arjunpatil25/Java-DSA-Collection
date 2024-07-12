package DSA.Recursion;

import java.util.Scanner;

public class FactoricalFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value ");
        int enterdvalue = sc.nextInt();
        System.out.println(FactoricalFunction.factorical(enterdvalue));
    }

    private static int factorical(int enterdvalue) {

        if (enterdvalue == 0) {
            return 1;
        } else {
            return enterdvalue * factorical(enterdvalue - 1);
        }

    }
}
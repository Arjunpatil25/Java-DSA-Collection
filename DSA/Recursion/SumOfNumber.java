package DSA.Recursion;

import java.util.Scanner;

public class SumOfNumber {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number ");
        int naturalnumber = sc.nextInt();
        System.out.println(SumOfNumber.sumOfAll(naturalnumber));

    }

    private static int sumOfAll(int naturalnumber) {
       if(naturalnumber==1){
        return 1;
       }
       else{
        return naturalnumber+sumOfAll(naturalnumber-1);
       }
    }
}

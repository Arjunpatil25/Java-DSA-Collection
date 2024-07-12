package DSA.Recursion;

import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the number ");
        int number= sc.nextInt();
        int a =0;
        int b =1;
        
        System.out.print(a);
        System.out.print(b);

        Fibonacci.fibfunction( a , b , number-2);
    }

    private static void fibfunction(int a, int b, int number) {
     if(number==0){
        return;
     }
       int c = a+b;
       System.out.print(c);
       fibfunction(b, c, number-1);

    
    
     
    }
}
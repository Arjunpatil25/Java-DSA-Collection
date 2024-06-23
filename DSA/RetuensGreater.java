package DSA;

import java.util.Scanner;

public class RetuensGreater {

    static void greaterNo(int n1,int n2){
        if(n1<n2){
            System.out.println("greater no is :"+n2);
        }else{System.out.println("greater no is :"+n1);}
    }
    public static void main(String[] args) {
         try(Scanner sc = new Scanner(System.in);){
            System.out.println(" enter two number ");
            int no1 = sc.nextInt();
            int no2 = sc.nextInt();
            greaterNo(no1, no2);
         }
    }
}

package DSA;

import java.util.*;

public class CircumferenceCal {

    static void CircumferenceCalu(double n1){
        System.out.printf("Circumference is :%.2f ",2*Math.PI*n1);

    }
     public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);)
         {
            System.out.println(" enter the radius ");
            double Radius = sc.nextDouble();
            CircumferenceCalu( Radius);
        }
    }
}

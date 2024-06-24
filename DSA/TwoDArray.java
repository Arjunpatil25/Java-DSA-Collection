package DSA;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int rows= sc.nextInt();
        int columns= sc.nextInt();
        int [][] numbers = new int [rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        int x=11;
        //int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if( numbers[i][j]==x ){
                    System.out.println("x is here"+i+" "+j+" ");
                    //count++;
                }
            }
        }
        //output 
        for (int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println( );
        }
    }
}

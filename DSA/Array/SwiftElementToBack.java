package DSA.Array;

public class SwiftElementToBack {
 public static void main(String[] args) {
    int []Array={1,2,3,4,5,6,7};
    int last = Array[Array.length-1];
    for(int i=0;i<Array.length-1;i++){
        Array[Array.length-1-i]=Array[Array.length-2-i];
    }
    Array[0]=last;
    for(int i=0;i<Array.length;i++){
        System.out.print(Array[i]+" ");
    }
 }   
}

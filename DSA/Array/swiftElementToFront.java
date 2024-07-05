package DSA.Array;

public class swiftElementToFront {
    public static void main(String[] args) {
        
        int []Array={1,2,4,6,73};
        int first =Array [0];
        for(int i=0;i<Array.length-1;i++){
        
                Array[i]=Array[i+1];
          }
        Array[Array.length-1]=first;
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i]+" ");
        }
    }
    
}

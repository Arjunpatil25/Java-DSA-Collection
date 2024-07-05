package DSA.Array;

public class SumOfAllElements {
    public static void main(String[] args) {
        
        int even=0;
        int odd=0;
        int[] ary={1,2,3,4,5,6,7,8,9,0,11,34,23,45,29};
        for(int i=0;i<ary.length;i++)
        {
            if(i%2==0)
            {
                even=i+even;
            }
            else{
                System.out.println("in odd"+i);
                odd=i+odd;
            }
            
    
        }System.out.println("Even"+even);
        System.out.println("odd"+odd);





    }
   
    
}

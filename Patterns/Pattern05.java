public class Pattern05 {
    public static void main(String[] args) 
    {
        
        // upper half 
        int n =4;
        for(int i=1;i<=n;i++)
        {
            //for first half
            for(int j=1;j<=i;j++)
            {
             System.out.print("*");
            }
           // for spaces
           int spaces=2*(n-i);
           for(int j=1;j<=spaces;j++)
           {
             System.out.print(" ");
           }
           //for secong half 
           for(int j =1;j<=i;j++)
           { System.out.print("*");

           }
           System.out.println(" ");
        }
        // for lower half 
        for(int i=n;i>=1;i--)
        {
            //for first half
            for(int j=1;j<=i;j++)
            {
             System.out.print("*");
            }
           // for spaces
           int spaces=2*(n-i);
           for(int j=1;j<=spaces;j++)
           {
             System.out.print(" ");
           }
           //for secong half 
           for(int j =1;j<=i;j++)
           { System.out.print("*");

           }
           System.out.println(" ");
        }
        
    }
    
}




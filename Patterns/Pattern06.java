public class Pattern06 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
          int star=1;
          for(int j=5;j>=star;j--){
            System.out.print("*");
          }
          for(int j=1;j<=i;j++){
            System.out.print(" ");
          }
          System.out.println(" ");
        }
    }
}

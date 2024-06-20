public class Pattern04 {
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println( " ");
        }for(int a=3;a<=6;a++){
            for(int b=6;b>=a;b--){
                System.out.print("*");
            }
            System.out.println( " ");
        }
    }
    
}

public class Pattern02 {
  public static void main(String[] arjun) {
    int i = 5;
    while (i >= 1) {
      int j = 1;
      while (j <= i) {
        System.out.print("  #");
        j++;

      }
      int c = 5;
      while (c >= j) {
        System.out.print("  *");
        c--;
      }

      System.out.println();
      i--;
    }

  }
}
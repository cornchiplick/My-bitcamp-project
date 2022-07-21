import java.lang.Math;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int n = in.nextInt();
    int k = in.nextInt();


    static int upperSide(int n, int k) {
      int result = 1;
      for (int i = n; i > k; i--) {
        result *= i;
      }
      return result;
    }

    static int lowerSide(int n, int k) {
      int result = n-k;
      for (int i = n-k; i > 0; i--) {

      }
    }

  }
}

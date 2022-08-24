import java.lang.Math;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int[][] count = new int[15][15];

    for (int i = 0; i < 15; i++) {
      count[0][i] = i;
      count[i][1] = 1;
    }
  
    for (int i = 1; i < 15; i++) {
      for (int j = 2; j < 15; j++) {
        count[i][j] = count[i][j-1] + count[i-1][j];
      }
    }

    int test = in.nextInt();

    for (int i = 0; i < test; i++) {
      int k = in.nextInt();
      int n = in.nextInt();
      System.out.println(count[k][n]);
     }
  }
}

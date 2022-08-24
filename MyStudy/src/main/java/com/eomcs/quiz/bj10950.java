import java.util.Scanner;

public class Main {

  static int plus(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int[] num = new int[2 * n];

    for (int i = 0; i < num.length; i += 2) {
      num[i] = in.nextInt();
      num[i + 1] = in.nextInt();
    }

    for (int i = 0; i < num.length; i += 2) {
      System.out.println(plus(num[i], num[i + 1]));
    }
  }
}

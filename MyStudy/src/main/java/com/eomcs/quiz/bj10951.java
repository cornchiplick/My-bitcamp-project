import java.util.Scanner;

public class Main {

  static int plus(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNextInt()) {
      int a = in.nextInt();
      int b = in.nextInt();

      System.out.println(plus(a, b));
    }
    in.close();
  }
}

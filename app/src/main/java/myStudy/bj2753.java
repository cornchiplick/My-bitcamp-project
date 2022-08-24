import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    int ans = -1;
    if (n % 400 == 0) {
      ans = 1;
    } else if (((n & 3) == 0) & (n % 100 != 0)) {
      ans = 1;
    } else {
      ans = 0;
    }

    System.out.println(ans);
  }
}

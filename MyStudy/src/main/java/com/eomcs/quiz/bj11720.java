import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    String num = in.next();
    int score = 0;

    for (int i = 0; i < n; i++) {
      score += ((int) num.charAt(i) - '0');
    }

    System.out.println(score);
  }
}

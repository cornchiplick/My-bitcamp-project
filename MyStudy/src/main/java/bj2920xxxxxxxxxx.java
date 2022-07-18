import java.lang.Math;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] muse = new int[8];
    for (int i = 0; i < 8; i++) {
      muse[i] = input.nextInt();
    }

    String ans = "";

    for (int i = 0; i < muse.length - 1; i++) {
      if (muse[i] == muse[i + 1] - 1) {
        ans = "ascending";
      } else if (muse[i] == muse[i + 1] + 1) {
        ans = "descending";
      } else {
        ans = "mixed";
        break;
      }
    }

    System.out.println(ans);
  }
}

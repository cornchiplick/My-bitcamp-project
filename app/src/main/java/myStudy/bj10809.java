import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();

    int count = -1;

    loop:for (int i = 0; i < 26; i++) {
      for (int j = 0; j < str.length(); j++) {
        if ((str.charAt(j) - 'a') == i) {
          count = j;
          System.out.print(count + " ");
          count = -1;
          continue loop;
        } else if ((count == -1) && (j == str.length() - 1)) {
          System.out.print(count + " ");
        }
      }
    }
  }
}

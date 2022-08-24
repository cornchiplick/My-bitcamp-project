import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int num = in.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    for (int i = 0; i < n; i++) {
      if (arr[i] < num) {
        System.out.print(arr[i]);
        System.out.print(" ");
      }
    }
  }
}

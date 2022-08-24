import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] arr = new int[10];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
      arr[i] = arr[i] % 42;
    }

    int score = 0;

    loop:for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < 10; j++) {
        if (arr[i] == arr[j]) {
          score += 1;
          continue loop;
        }
      }
    }
    System.out.println(10 - score);
  }
}

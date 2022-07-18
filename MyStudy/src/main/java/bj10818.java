import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int arr[] = new int[in.nextInt()];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }

    int min = arr[0];
    int max = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (min >= arr[i]) {
        min = arr[i];
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (max <= arr[i]) {
        max = arr[i];
      }
    }

    System.out.printf("%d %d", min, max);
  }
}

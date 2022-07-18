import java.lang.Math;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int M = in.nextInt();
    int[] arr = new int[N];

    int n = N * (N - 1) * (N - 2) / 6;
    int[] table = new int[n];

    for (int i = 0; i < N; i++) {
      arr[i] = in.nextInt();
    }

    int p = 0;
    for (int i = 0; i < N - 2; i++) {
      for (int j = i + 1; j < N - 1; j++) {
        for (int k = j + 1; k < N; k++) {
          table[p] = arr[i] + arr[j] + arr[k];
          p++;
        }
      }
    }

    int max = -1;
    for (int i = 0; i < n; i++) {
      if (table[i] < )
    }

  }
}

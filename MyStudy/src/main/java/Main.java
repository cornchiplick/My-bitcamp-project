import java.lang.Math;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int N = in.nextInt();

    int[] arr = new int[N];


    for (int i = 0; i < N; i++) {
      arr[i] = in.nextInt();
    }

    int[] counting = new int[10001];
    int[] sorted = new int[N];

    for (int i = 0; i < arr.length; i++) {
      counting[arr[i]]++;
    }

    for (int i = 1; i < counting.length; i++) {
      counting[i] += counting[i - 1];
    }

    for (int i = arr.length - 1; i >= 0; i--) {
      sorted[counting[arr[i]] - 1] = arr[i];
    }

    for (int i = 0; i < N; i++) {
      System.out.println(sorted[i]);
    }



    // 몰라 임마 이거 틀렸음 일단 중복값때매;

  }
}

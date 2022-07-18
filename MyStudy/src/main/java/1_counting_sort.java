import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    int[] arr = new int[] { 415, 156, 812, 334, 12, 555 };
    int[] counting = new int[1000];
    int[] sorted = new int[6];

    for (int i = 0; i < arr.length; i++) {
      counting[arr[i]]++;
    }

    for (int i = 1; i < counting.length; i++) {
      counting[i] += counting[i - 1];
    }

    for (int i = arr.length - 1; i >= 0; i--) {
      sorted[counting[arr[i]] - 1] = arr[i];
    }

    for (int i = 0; i < 6; i++) {
      System.out.println(sorted[i]);
    }
  }
}
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = input.nextInt();
    }

    int max = -1;
    for (int i = 0; i < arr.length; i++) {
      if (max>arr[i]) {
        continue;
      } else if (max<=arr[i]) {
        max = arr[i];
      } 
    }

    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += (double)((double)arr[i]/(double)max);
    }

    System.out.println(sum*100/n);

  }
}
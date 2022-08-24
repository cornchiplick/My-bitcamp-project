import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] n = new int[9];

    for (int i = 0; i < 9; i++) {
      n[i] = input.nextInt();
    }

    int no = 0;
    int max = 0;
    for (int i = 0; i < 9; i++) {
      if (max > n[i]) {
        continue;
      } else {
        max = n[i];
        no = i+1;
      }
    }
    
    
    System.out.println(max);
    System.out.println(no);


  }
}
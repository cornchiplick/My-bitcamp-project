import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    int[] count = new int[n];
    String[] word = new String[n];
    for (int i = 0; i < n; i++) {
      count[i] = input.nextInt();
      word[i] = input.nextLine();
    }


    for (int i = 0; i < n; i++) {
      for (int k = 1; k < word[i].length(); k++) {
        for (int j = 0; j < count[i]; j++) {
          System.out.print(word[i].charAt(k));
        }
      }
      System.out.println();
    }

  }
}
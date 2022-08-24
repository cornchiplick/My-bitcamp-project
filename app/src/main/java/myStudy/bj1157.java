import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String word = input.nextLine();
    input.close();
    int[] alphabet = new int[26];
    String ans = "";
    int count = 0;
    int k = 500;
    int t = 300;
    for (int i = 0; i < word.length(); i++) {
      for (int j = 1; j <= 26; j++) {
        if ( (int)word.charAt(i) % 32 == j ) {
        alphabet[j-1] += 1;
        }
      }
    }
    for (int j = 0, i = 0; i < 25; i++ ) {
      if (alphabet[j]<alphabet[i+1]) {
        count = i+1;
        j = i+1;
      } else if (alphabet[j]>alphabet[i+1]) {
        count = j;
      } else {
        k = 999;
        t = count;
      }
    }
    if ((k == 999) & (t == count)) {
      System.out.println("?");
    } else {
      count += 65;
      System.out.println((char)(count));
    }
  }
}
import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int d = input.nextInt();
    int e = input.nextInt();

    double no = Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2) + Math.pow(d,2) + Math.pow(e,2);
    int ans = (int)(no%10);
    System.out.println(ans);


  }
}
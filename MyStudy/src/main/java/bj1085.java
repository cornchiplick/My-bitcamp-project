import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int x = in.nextInt();
    int y = in.nextInt();
    int w = in.nextInt();
    int h = in.nextInt();

    int axisx = -1;
    int axisy = -1;

    if (x > (w - x)) {
      axisx = w - x;
    } else {
      axisx = x;
    }

    if (y > (h - y)) {
      axisy = h - y;
    } else {
      axisy = y;
    }

    if (axisx > axisy) {
      System.out.println(axisy);
    } else {
      System.out.println(axisx);
    }
  }
}

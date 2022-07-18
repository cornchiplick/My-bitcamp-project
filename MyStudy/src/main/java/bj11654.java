import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String str = in.nextLine();
    int num = str.charAt(0);

    System.out.println(num);
  }
}
// String 이 아니라 char 를 int로 바꿔서 출력해야 아스키코드가 된다!

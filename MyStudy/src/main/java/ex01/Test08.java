// [문제]
// 음이 아닌 두 정수의 곱셈을 수행하는 프로그램을 작성하라.
// 조건:
// => 2진수로 변환하여 비트 연산자만 이용하여 곱셈을 수행한다.
//
// [훈련 목표]
// - 비트 연산자를 이용한 2진수의 곱셈 수행 방법
//
// [시간 복잡도]
// - ?
//
public class Test08 {

  public static void main(String[] args) {
    System.out.println(multiply(5, 3) == 15);
    System.out.println(multiply(17, 13) == 221);
  }

  // 이 메서드를 완성하시오!
  static int multiply(int a, int b) {
    int result = 0;

    /*
    int i = 0;
    while (b != 0) {
      if ((b & 1) == 1) {
        result = result + (a << i);
      }
      b = b >> 1;
      i++;
    }
*/

    for (int i = 0; b != 0; i++) {
      if ((b & 1) == 1) {
        result = result + (a << i);
      }
      b = b >> 1;
    }

    return result;
  }
}

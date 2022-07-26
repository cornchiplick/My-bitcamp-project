// 출처: codefights.com
// 한 줄에 버그가 있다. 고쳐라!

/* n!(n 팩토리얼) 값을 조사하여 몇 개의 0으로 끝나는 지(trailing zeros) 개수를 리턴하라.
예1) 10!의 값은 두 개의 0으로 끝난다.
예2) 23!은 4개의 값으로 끝난다. (23!의 값은 4바이트를 초과하기 때문에 테스트하지 말아라!)
 */
/* 원문
Given an integer n, find the number of trailing zeros 
in the decimal representation of n! 
(the exclamation mark means factorial).

Example

for n = 10 output should be 2

[input] integer n

a positive integer
[output] integer
 */
//
// [시간 복잡도]
// - ?
//
public class Test07 {

  public static void main(String[] args) {
    System.out.println(factorialTrailingZeros(1) == 0);
    System.out.println(factorialTrailingZeros(2) == 0);
    System.out.println(factorialTrailingZeros(3) == 0);
    System.out.println(factorialTrailingZeros(4) == 0);
    System.out.println(factorialTrailingZeros(5) == 1);
    System.out.println(factorialTrailingZeros(10) == 2);
    System.out.println(factorialTrailingZeros(15) == 3);
    System.out.println(factorialTrailingZeros(20) == 4);
    System.out.println(factorialTrailingZeros(25) == 6);
    System.out.println(factorialTrailingZeros(30) == 7);

    // 더 정확한 테스트를 위해 본인(김민구)가 추가함
    System.out.println(factorialTrailingZeros(50) == 12);
    System.out.println(factorialTrailingZeros(126) == 31);
  }

  // 이 메서드를 완성하시오!
  static int factorialTrailingZeros(int n) {
    int result = 0;

    for (int i = 1; i <= n; i++) {
      result += isMultipleFive(i);
    }
    return result;
  }

  static int isMultipleFive(int no) {
    int count = 0;
    if (no % 5 == 0) {
      count = 1 + isMultipleFive(no / 5);
    }
    return count;
  }
}
// 참고:
// => "Legendre's formula(= de Polignac's formula)" 수학식을 적용해 보라!
//

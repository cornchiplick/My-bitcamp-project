// 출처: codefights.com
//
// 한번에 한 자리의 숫자만 바꿀 때 이전 값과 다르게 만들 수 있는 경우는 몇가지인가?
// 단 맨 앞의 숫자는 0이 될 수 없다.
// 예)
// 10 => 17 번
//
// [시간 복잡도]
// - ?
//
public class Test08 {

  public static void main(String[] args) {
    System.out.println(countWaysToChangeDigit(10) == 17);
  }

  // 이 메서드를 완성하시오!
  static int countWaysToChangeDigit(int value) {
    int answer = 0;
    while (true) {
      if (value == 0) {
        break;
      }
      answer += 9;
      value /= 10;
    }

    answer -= 1;

    return answer;
  }
}

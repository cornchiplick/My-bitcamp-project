// 출처: codefights.com
//
// 배열의 전체 길이를 L이라고 하자.
// 배열을 절반(L/2)으로 나눌 때, 앞쪽 부분과 뒤쪽 부분의 위치를 바꿔라.
// 예)
// [2, 4, 5, 6, 4, 3, 7, 8] => [4, 3, 7, 8, 2, 4, 5, 6]
//
// [시간 복잡도]
// - ?
//
public class Test06 {

  public static void main(String[] args) {
    int[] values = { 2, 4, 5, 6, 4, 3, 7, 8 };
    changeValuePosition(values);

    int[] results = { 4, 3, 7, 8, 2, 4, 5, 6 };

    for (int i = 0; i < results.length; i++) {
      if (values[i] != results[i]) {
        System.out.println(false);
        return;
      }
    }
    System.out.println(true);
  }

  // 이 메서드를 완성하시오!
  static void changeValuePosition(int[] values) {
    for (int i = 0; i < values.length / 2; i++) {
      if ((values.length & 1) == 0) {
        int temp = values[i];
        values[i] = values[i + (values.length / 2)];
        values[i + (values.length / 2)] = temp;
      } else {
        int temp = values[i];
        values[i] = values[i + 1 + (values.length / 2)];
        values[i + 1 + (values.length / 2)] = temp;
      }
    }
  }
}

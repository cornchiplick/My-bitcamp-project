public class Parent {

  public int m(int b) {
    if (b == 1) {
      System.out.println("부모 : 1받았습니다");
      b = 2;
      return b;
    } else if (b == 4) {
      System.out.println("부모 : 4받았습니다");
      b = 8;
      return b;
    } else {
      return 999;
    }
  }

  public int n(int b) {
    return null;
  }
}

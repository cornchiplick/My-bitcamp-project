class Child extends Parent {

  public int m(int a) {
    // super.m(a);
    if (super.m(a) == 2) {
      System.out.println("자식 : 2받았습니다");
      a = 4;
      // super.m(a);
    }
    return super.m(a);
  }
}

public class Inheritance {

  public static void main(String[] args) {
    Child ch = new Child();

    ch.m(1);
  }
}

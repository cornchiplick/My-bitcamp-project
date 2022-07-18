java.util.Scanner in = new java.util.Scanner(System.in);
  // 키보드 입력값(System.in)을 받는다.

String a = in.nextLine();
  // 입력값 in을 문자열 a로 저장한다.

Integer.parseInt(a);
  // 정수가 아닌 '타입'의 변수 a를 정수로 반환한다. // 정수로 반환이 안되면 실행오류

in.close();
  // 입력 멈춰

java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
  // 1996-07-26 의 형태로 날짜 데이터를 변환해준다.

java.util.Date date = new java.util.Date(날짜데이터);
  // 날짜데이터를 생성해줌.

long todayDate = System.currentTimeMillies();
  // 시스템에서 기본제공해주는 현재 시각정보

name1 = name1.toLowerCase(); , name1 = name1.toUpperCase();
  // 문자열 name1의 모든 알파벳을 소문자로, 그리고 대문자로 변환해줌.

String str = "    [    공    백    ]    ";
str.trim(); // 결과 ==> "[    공    백    ]"
  // 말하자면 즉, 문자열의 앞 뒤 끝의 공백만 제거해준다.

in.hasNext();
  // 입력값이 있으면 true를 반환, 없으면 false를 반환 while, if문 등과 같이 쓰임.

java.lang.Math.abs(값)
  // Math 클래스에서 abs 메서드를 가져옴. // 값의 절댓값을 반환한다.
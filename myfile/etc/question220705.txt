ex01 /*
exam0110 :
//1) 컴파일하기
//- $ javac -d bin/main -encoding UTF-8 src/main/java/com/eomcs/lang/ex01/Exam0110.java
//
//2) 생성된 클래스 파일 확인하기
//- bin/main/com/eomcs/lang/ex01 디렉토리에 Exam0110.class 파일이 생성된다

bin/main 아래에 아무것도 없는 상태에서
$ javac -d bin/main -encoding UTF-8 src/main/java/com/eomcs/lang/ex01/Exam0110.java
를 실행하면
/com/eomcs/lang/ex01 디렉토리를 생성하고 그 안에
Exam0110.class 파일이 생성된다.
>> 왜? 기준이 무엇인가? 몰라도되는건가? 내가 자유롭게 설정할수 없지 않을까?

혼자 생각해보기 >> 혹시 다음 문구 때문인걸까?
package com.eomcs.lang.ex01;
하지만 이 문구에는 빨간 밑줄이 쳐져있다.




exam0300 :
//## 실습
//1) 컴파일하기
//- $ javac -encoding [문자집합] [소스파일명]
//- 예) $ javac -d bin/main -encoding UTF-8 src/main/java/com/eomcs/lang/ex01/Exam0300.java
//
//2) 실행하기
//- $ java -cp bin/main com.eomcs.lang.ex01.Exam0300

bin/main 디렉토리 아래의 com.eomcs.lang.ex01.Exam0300 을 실행하라는 명령으로 보인다.
하지만 실상은 Exam0300을 실행하는 것이고 이 .class파일은
bin/main/com/eomcs/lang/ex01
디렉토리에 있다. 따라서
java -cp bin/main/com/eomcs/lang/ex01/Exam0300
을 해도 실행되어야 할 것 같지만 이는 다음과 같은 오류메세지를 띄운다.
Error: Could not find or load main class Exam0300
Caused by: java.lang.NoClassDefFoundError: com/eomcs/lang/ex01/Exam0300 (wrong name: Exam0300)

왜 오류가 뜨는가? 그 이유는 Exam0300.java 의 첫줄의
package com.eomcs.lang.ex01;
와 관계가 있는것인가?
*/




ex02 /*
exam0200 :
//## 실습
//1) Java Document 만들기
//- javadoc.exe 도구를 사용하여 자바 소스 파일에서 Javadoc 주석을 추출하여 HTML 파일을 생성해 보자.
//     javadoc 
//       -encoding [소스 파일의 문자집합]
//       -charset [생성될 HTML 파일의 문자집합]
//       -d [생성된 파일을 놓아둘 디렉토리] 
//       -sourcepath [자바 소스 경로] [자바 패키지]
//예) $ javadoc -encoding UTF-8 -charset UTF-8 -d javadoc -sourcepath src/main/java com.eomcs.basic.ex02
//
//2) Javadoc으로 생성한 HTML 문서 확인하기
//- /javadoc 디렉토리를 보면 자바 소스 파일에서 추출한 Javadoc 으로 만든 HTML 문서를 확인할 수 있다.

예) 부분을 basic을 lang으로만 바꿔서 입력하면 다음과 같은 오류메세지가 출력된다.
error: Illegal package name: "UTF-8"

아직 배우지 않은 부분이라서 무엇이 문제인지 아무것도 알 수 없다...




exam0300 :
@Override
머하는 개념일까??
>> 눈에 보이지 않지만 모든 class의 상위 class (=부모 class)가 존재한다. (= Object)
>> Object class에 있는 기본제공함수 toString()을 가져와서 자식 class인 Exam0300 이 쫌 수정을 하겠습니다. 라는 뜻??
>> 그렇다면 @Override의 용법은 어떻게 되는가?
>> 이것과 Annotation은 무슨 관계가 있는가?
>> pirimitive와 reference는 무슨 관계가 있는가?
>> class와 instance는 무슨 관계가 있는가?
>> 결국 static과 void는 뭘 의미하고 다른 함?수?(main과 같은..)에 어떻게 적용할 수 있는가?
*/
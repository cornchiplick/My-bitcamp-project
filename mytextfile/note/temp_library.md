1. 기초
    - 인터프리터 컴파일
    - 문법
```
    1. literal //데이터 표기법
    2. variable //메모리 준비
    3. operators //데이터 연산자
    4. 흐름제어문 //조건, 반복문
    5. 메소드 //명령어 묶음
    6. 클래스 //메소드 묶음
```

    - m1(), m2(), ... 를 모아서 classA, classB, ...를 만들었고
    > 이걸 모아서 폴더에 분리 : 폴더
    > = 패키지 in java, = 네임스페이스 in C++)
    - 요즘은 monolotic system에서 micro-service 로 바뀌고 있음 : class보다 method(=functional program)로 쪼개서 나중에 합치기 때문

```
- **convention : 국제 공통 관리 체계**
    `src/` : app제작에 관련된 파일을 두는 폴더
    `main/` : app 관련 파일을 두는 폴더
    `java/` : java 소스 파일을 두는 폴더
    `resources/` : 설정 파일이나 기타 파일을 두는 폴더
    `test/` : 제작한 app 소스를 테스트하는 파일을 두는 폴더
    `java/` : 단위 테스트 자바 소스파일을 두는 폴더
    `resources/` : 단위 테스트할 때 사용할 테스트에 관련된 설정파일 등을 두는 폴더

---
- 자바 패키지
    - 자바 소스 파일의 역할에 따라 관리하기 쉽게 여러개의 폴더에 분류, 배치하는 것
    - = 자바 소스 파일을 역할에 따라 분류한 하위 폴더
`java/` : 패키지가 아니다!!
`io/` : 패키지임
`db/` : 패키지임
`ui/` : 패키지임

---
- 자바 패키지 디렉토리 구조 :
> 회사(또는 조직)도메인명 / 제품명(서비스명) / 역할 /

- 회사도메인명 : 전세계에서 유일, 다른회사와 중복될 일이 없다
    - ex) com/
   com/microsoft/
    com/bitcamp/
    :: 상위조직에서 하위조직 순으로 디렉토리 계층을 구성

---
-  자바 패키지를 class안에서 표현할 때는 .으로 구분한다.
> (ex) package com.eomcs.lang.ex01)
```


- java se(standard edition) 가 있어야 java ee(enterprise edition)도 이용가능함.
- JDK : Java Development Kit
- JRE : Java Runtime Environment

```
- process와 메모리
- java.exe : 컴파일러 프로그램
    - 프로그램 = application s/w
    - 이 app을 실행시키면 java.exe는 프로세스( = 실행중인 프로그램 = 실행중인 app)가 된다.

1. process가 OS에게 [실행되는 동안 데이터를 보관할 때 사용할 메모리를 달라고 요청] 한다.
2. OS가 H/W인 RAM에서 빼오는걸 허락함.
3. process가 메모리를 사용.

- JVM은 OS에게 할당받은 메모리를 크게 3구획으로 나눠서 관리한다.
1. Method Area
2. JVM Stack (스레드 당 하나)
3. Heap

- "=" : assignment operator : 할당/배정/대입 연산자
    - l-value : 변수"만" 올 수 있다.
    - r-value : 변수, 리터럴, expression 이 올 수 있다.
```

```
- (SSD)HDD >> track >> Sector(=512 Byte/1sector)
    - 이 안에 OS 설치됨
    - OS의 핵심기능 = 커널 ( = Kernel)
    - 커널을 로딩한다 = OS를 로드한다.
- 전원을 키면 > ROM의 Firmware를 실행 >> 부트섹터에 있는 OS Loader를 실행 >> OS의 Kernel ( : H/W관리) 을 실행
**이 과정이 '부팅'**

- (메인보드에 설치된) BIOS : Boot Sector의 S/W를 실행시켜주는 프로그램 + H/W를 실행하는 프로그램

- 명령문 : statement
- 결과를 생성하는 문장 : expression
- 블록과 변수
    1. '{'안에 있는 변수는 '}'를 만나면 소멸당한다.
    2. 같은 {}블럭 안에 있는 변수들은 같은 이름으로 선언할 수 없다.
    3. 블럭을 벗어나면 사용할 수 없다.


- 명시적 형변환 = type conversion = type casting

---
- java ::
    1. 변수의 타입은 변경할 수 없다
    2. 정적 타입 바인딩 = 고정형 타입 바인딩
- javascript ::
    1. 값을 저장할 때 변수의 타입이 결정된다.
    2. 다른 타입의 값을 저장하면 변수의 타입도 바뀐다.
    3. 동적 타입 바인딩
```

2. 리터럴
```
- 리터럴과 메모리크기
- 정수
    - 주류
        - 100 :: 4 byte
        - 2진수 :: 01100100 (8bit)
        - 000...0_01100100 (0이 24개앞에 있고 01100100)
        - 16진수 :: 0x00_00_00_64
        - 100L :: 8 byte
        - 16진수 :: 0x00_00_00_00_00_00_00_64

- 부동소수점
    - 주류
        - 12.375 :: 8 byte
        - 2진수 :: 0x40_28_c0_00_00_00_00_00
        - 12.375f :: 4 byte
        - 2진수 :: 0x41_46_00_00
    - **f를 붙여주면 이 수를 4byte로 바꾸라는 명령**

- 문자
    - 'A' :: 2byte
    - 2진수로 변환 :: 0x0041
    - '가' :: 0xac00

- 논리값
    - true :: 4byte 2진수로 변환 :: 0x00_00_00_01
    - false :: 0x00_00_00_00
    - 단, 논리배열인 경우 1byte로 변환
        - true :: 0x01
        - false :: 0x00

- 문자열
    - "ABC" :: String 클래스에 정의된 대로 그 형식에 맞춰 변환(걔가 따로 몇 byte인지 정해줌)

---
- 메모리 크기와 값의 범위
- 정수
    - 4 byte 정수 리터럴 :: 약 -21억 ~ 21억
    - 8 byte 정수 리터럴 :: 약 -900경 ~ 900경

- 부동소수점
    - single precision(단정도) (=float)     32 bit >> 유효자릿수 7자리까지 '거의' 정상적으로 저장
    - double precision(배정도) (=double)    62 bit >> 유효자릿수 15자리까지 '거의' 정상적으로 저장

---
- 문자와 코드
    > CR : Carriage Return
    > LF : Line Feed

- 줄바꿈 코드
    > Windows 에서는 CR (1byte), LF(1byte) >>`합쳐서`>> 0D0A
    > Unix 에서는 LF(1byte) :: 0A

- 문자 리터럴
    - `'A', '가'`
`'\uAC00' = '\uac00' = 가`
`(즉, 대소문자를 구분하지 않는다.)`

- 문자-코드-폰트
    - 문자 >> -Unicode >> -Arial -굴림체 -궁서체
    - 'A' >>      0x41 >>     A    A      A
    - '가' >>     0xAC00 >>   x   가      가
- 즉, 폰트 파일에 해당코드의 문자그림이 없으면 출력할 수 없다.

<br>

- 폰트
1. (모눈종이에 두고 그리는 것처럼) 픽셀단위로 그리는 방식
    = Raster 방식
    = Raster 폰트
    - 픽셀 단위로 그린다
    - 그림크기 확대하면 계단현상 발생함
    - 출력속도는 빠르다

2. 점과 점을 연결하고 특정 수학식에 따라 그리는 방식
    = Vector 방식
    = Vector 폰트
    = Truetype 폰트
    - 계산하여 그린다.
    - 그림크기 확대해도 미려하게 출력가능
    - 계산이 필요하기 때문에 출력속도 느리다.

- 비트맵과 vector 이미지
    비트맵 : Raster 방식
    Raster 방식의 특징 그대로 계승 + 파일크기가 크다
    > .bmp .gif .jpg

- 벡터이미지 : Vector 방식
    > Vector 방식의 특징 그대로 계승
    > \+ 파일크기가 작다(명령어로 이루어져 있음)
    > 클립아트

!!! 주의 : 그림이 복잡하면 벡터명령이 많아지기 때문에 파일크기도 비트맵보다 더 커질 수 있다.
```


3. 변수 선언
```
- 변수 선언 : 메모리를 준비시키는 명령
    - 변수 : 값을 저장할 메모리
        `데이터유형 메모리이름;`
        `DataType 변수명;`
    > ex) int n;

- 자바 원시 타입 (primitive type) ::
    > byte, short, int, long, float, double, boolean, char

- 변수에 값 저장하기 `= assignment 하기`
    `변수명 = 리터럴;`
    > ex) `i = 100;`

    - 또는 `변수명 = 변수명;`
    > ex) `j = i;`

    - 또는 `변수명 = 명령문;`
    > ex) `s = i+j;`

1. 명령문 = statement
2. 값을 리턴하는 명령문
    `명령문 실행을 완료하면 값을 리턴`
3. Expression(표현식)
```



4. 프로젝트 시작하기
```
- 프로젝트 시작준비하기
    - main()메소드가 들어있는 class는 단 하나이다. 하나의 프로젝트 안에서.

- 프로젝트 빌드와 빌드도구
    - Gradle 빌드 도구를 이용하여 프로젝트 폴더 준비
        - 빌드 : Application 만들기 위해 수행하는 개발과정을 통칭
        - 개발과정 : 컴파일, 테스트, 패키징(.jar, .war 만드는 과정), API문서 생성, 배포(deploy=배치), 프로젝트 폴더 준비
        > .jar : java archive : class파일들의 모음
        > .war : web archive

        - 빌드할 때마다 직접 명령 실행하면 너무 번거롭다 :: 빌드 자동화
        - 빌드작업을 기술한 파일 >>`로딩`>> 빌드도구 :: 빌드 작업을 순서대로 일괄적으로 수행
        - 빌드작업을 기술한 파일 : 빌드 스크립트 파일
            - script : 명령문을 작성할 때 사용하는 간단한 프로그래밍 언어

---
- 빌드 도구
    1. Ant
    > build.xml (=Ant의 빌드스크립트 파일)

    2. Maven
    > - Ant빌드도구를 쓰다가 Maven으로 바꿨다. 그 이유는?
    :: 의존 라이브러리 관리 자동화
    > - pom.xml (=Maven의 빌드스크립트 파일)
    > - 단점 : xml이 태그기반 문법이다. >> 조건문, 반복문을 사용하기 힘들다.

    3. Gradle : Android studio의 기본 빌드 도구
    > - Maven의 단점 때문에 다들 Gradle로 바꾸는 추세
    > - 빌드스크립트를 XML 대신 GROOVY (=프로그래밍 언어) 사용
    > - 프로그래밍 언어의 문법을 이용하여 빌드작업을 좀 더 정밀하게 제어할 수 있다.
    > - build.gradle (= gradle의 빌드스크립트 파일)

- 즉, 택배상자(package)딱 뜯었을 때 제일 먼저 나오는 '사용설명서' 같은 존재(..?)

---
- 설치 : Gradle.org - installing manually - binary-only
> 환경변수 편집해서 PATH에 gradle\..\bin까지 경로설정

---
- DSL
> Domain-Specific Language = 특정도메인 언어 = 특정영역에서 쓰는 언어

> ex)
> JSP : Java
> build.gradle(빌드스크립트) : groovy(주류), kotlin
```

5. 레퍼런스와 인스턴스
```
- 일반 변수와 배열 변수
`int[] arr;` ::
    메모리 주소가 저장됨, 변수의 크기는 특정되지 않음

- `arr = new int[3];` ::
    연속된 int 메모리,
    `arr` : 메모리의 주소를 저장하는 변수 = reference
    `int[3]` : new 명령을 통해 준비한 메모리 = 배열 instance

---
- 배열 레퍼런스와 배열 인스턴스
- `int[] arr = new int[3];`
    인스턴스에 소속된 변수는 기본값이 자동으로 설정된다.
    - 정수 :: 0
    - 부동소수점 :: 0.0
    - 논리 :: false
    - 문자 :: \u0000
    - **모든것은 0으로**

- 메모리의 주소를 잃어버려 사용할 수 없는 인스턴스
= 메모리만 차지 = garbage(쓰레기)
> 1) cpu가 한가할 때
> 2) 메모리가 부족할 때
>> garbage를 제거한다. "garbage collector"가.
>> **JVM을 종료하면 JVM이 사용했던 모든 메모리를 OS가 강제로 해제시킨다.**

- Garbage와 레퍼런스 카운트
    - 레퍼런스 카운트 : 인스턴스의 주소를 갖고있는 레퍼런스의 개수
    - 레퍼런스 카운트가 0인 인스턴스 = Garbage
    - 레퍼런스 (= 포인터pointer (c에서))
```

6. 메서드
```
- 메서드에 묶인 코드 실행하기 = 메서드 호출 = 메서드 call
- 명명 : 맨첫글자 소문자, 그 뒤 단어 첫글자 대문자

`변수 = 메서드명(값, 값, ...);`

```java
메서드명 : 실행할 메서드
값, 값, ... : 메서드 파라미터에 전달할 값 = argument
변수 : 메서드가 값을 리턴할 경우, 그 값을 받을 변수 (값을 받지 않아도 된다.)
```

- 메서드는 정의, 변수는 선언

- 메서드를 통해 코드의 복잡함을 감춘다. `= encapsulation(캡슐화)`

---
- 클래스 사용 : 역할에 따라 메서드를 분류하기
    - 명명 : 명사, 명사구, 가끔 형용사 형태로 (동사형은 x)
    - 단어마다 전부 대문자시작
```

한줄 시리즈
- 용어 정리 : SI, SM, breadcrumb, 캡슐화(객체화?), CSV, XML, JSON, JIT(Just In Time)
- 인터프리터 컴파일
- jdk, jre, ee
- msb, lsb
- LAN card
- Collaboration Diagram
- Connection-Oriented / Connectionless / URI-URL-URN
- VM / Docker
- Concurrent / Multitasking
- cpu racing
- DBMS - sha2함수

1. 기초
    - 대략적 구조 + package
    \+ statement + expression
    - process와 memory + 부팅과정과 sector
    - 리터럴과 메모리 크기 + 값의 범위
    - 변수 선언
    - 클래스 로딩과 실행
    - serialize 와 deserialize

2. 폰트에 대해서

3. 프로젝트 시작하기

4. 형변환

5. 레퍼런스와 인스턴스 + new에 관해서

6. 메서드

7. UML

8. GRASP
    - factory method
    - Iterator
    - decorator
    - Information Expert
    - Proxy 패턴

9. 생성자

10. 비트연산

11. 데이터 접근 범위 (public, protected, .... persistence)

12. 상속과 연관
    - 오버로딩과 오버라이딩 + 추상메서드

13. 스태틱 초기화 블럭과 인스턴스 초기화 블럭

14. 예외처리 (try catch + try-with-resources)
Error와 Exception

15. 자료구조
    - ArrayList 와 LinkedList 비교

16. interface (+concrete)와 추상클래스
default method
private method
static method

17. generic

18. IP주소와 IPv4

19. HashMap - List, Set, Map

20. lambda문법과 functional interface

21. 향상된 for문

22. stateful / stateless

23. 원격메서드 호출기술과 진화 과정
    - Skeleton / Stub

24. 멀티 프로세싱과 멀티 스레딩 + Context switching
    - critical Region (+thread safe)
    - synchronized 문법

25. 
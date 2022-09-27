## 6/30

##### 자바 문법
    1. literal //데이터 표기법
    2. variable //메모리 준비
    3. operators //데이터 연산자
    4. 흐름제어문 //조건, 반복문
    5. 메소드 //명령어 묶음
    6. 클래스 //메소드 묶음

---

---
## 7/11

---
- 서로 다른 타입의 데이터를 계산
`[int 연산자 float]`
        int -> float 한 후
`[float 연산자 float]`를 계산

`int i=5;`
`int j=2;`
`int z = i / (float) j;`
    i를 float로 임시 형변환 후 float / float 계산 후, `= implicit conversion`
    z를 int로

---
## 7/13
- 도구함(클래스)의 도구(메서드)를 쓰기 위한 준비
    - Math.abs(값)
        abs는 별도의 데이터를 준비할 필요없이 바로 사용가능한 도구다.
        - `static mathod`
        - 이런 도구는 도구함 이름으로 바로 사용할 수 있다.
- 값 ::
    - 도구를 실행하는데 필요한 값 = parameter = argument
    - Date.getYear()
        - 이 도구는 그냥 사용할 수 없다.
        - Date도구함을 이용해서 데이터를 준비한 후에 사용할 수 있다.
        - `instance method`

- 인스턴스 메서드 사용하려면
    1. 도구 사용전 데이터 준비(설정) ::
        `Date d = new Date();`
            `new` : 도구함의 도구를 쓸 수 있도록 설정하기
            `d` : 설정된 데이터를 가리키는 변수
    2. 설정된 정보를 가지고 도구 실행
        `d.getYear()`
            `d` : 설정된 정보를 가리키는 변수 ( = 참조변수 = reference)


---
## 7/14
- 메서드 :: 코드를 유지보수하기 쉽게 기능 단위로 분리하기

---
`void processBoardList() {....}`

```java
processBoardList : 메서드명 : 행위를 나타내는 동사구 형태의 이름
() : 파라미터 목록 >>> 작업 수행에 필요한 데이터를 받을 변수
{....} : 메서드 몸체(=body) >>> 작업을 수행하는 코드
void : 리턴 타입 >>> 작업 완료후 결과 값의 리턴 여부
void : 값을 리턴 안함
그 외 다른것 : 리턴하는 값의 타입
```

---
- 메서드에 묶인 코드 실행하기 = 메서드 호출 = 메서드 call
- 명명 : 맨첫글자 소문자, 그 뒤 단어 첫글자 대문자

`변수 = 메서드명(값, 값, ...);`

```java
메서드명 : 실행할 메서드
값, 값, ... : 메서드 파라미터에 전달할 값 = argument
변수 : 메서드가 값을 리턴할 경우, 그 값을 받을 변수 (값을 받지 않아도 된다.)
```

---
- 클래스 사용 : 역할에 따라 메서드를 분류하기
    - 명명 : 명사, 명사구, 가끔 형용사 형태로 (동사형은 x)
    - 단어마다 전부 대문자시작

---
## 7/15

---
##### 사용자 정의 데이터 타입

* 클래스 문법
    1. 메서드를 분류
    2. 데이터 타입 정의

- 새 데이터 타입 정의

1.
```java
class Board {
        int no;
        String title;
        String content;
    }
```


2.
```java
new Board()
```
> Board설계도에 따라 변수를 준비한다.
> 마치 배열메모리처럼(?)
> 값 할당 : `b.no = ~~;`

---
```java
Board b1 = new Board();
b1.no = 100;

// b1배열의 0번째가 아니라
// b1배열의 no번째에 100을 넣어라.
```


---
## 7/18
- factory method : 인스턴스를 공장처럼 찍어내는 메소드

- 국제화 : internationalization : I18N
- 지역화 : localization : L10N

---
## 7/19
```
인스턴스는 만들고 싶으면 반드시 new 생성자로 만들어줘야 한다.
그리고 주소를 배정해야 하고 한번에 여러개 만드는 방법 따위는 없다.
만들고 싶으면 반복문을 이용해서 여러개 만들어라.
```

- 레퍼런스 카운트 테이블 :: JVM이 관리함.

---
- 클래스 레벨
    - 중첩 클래스 (2 category로 나뉨)
        1. non-static nested class = non static inner class
        2. static nested class != static inner class

- java.lang. 패키지의 클래스는 **몽땅** 생략해도 된다.
- 그 외 모든 다른 패키지의 클래스는 패키지명을 명시하지 않으면 컴파일 오류 발생함.  
- !!! <memo> java.lang.*. 아래의 패키지 클래스, 즉 하위 패키지의 클래스는 생략할 수 없다!!

---
- 클래스 문법 활용 예
    - 사용자 정의 데이터타입을 만드는 용도

```java
Score s1 = new Score();
    s1.name
```
> s1객체의 name 필드 = s1의 name 필드

* static 메서드와 인스턴스 메서드
```java
    Score.compute(s1)
        // Score : 클래스명
        // s1 : 데이터가 있는 인스턴스 주소
    
    
    s1.compute()
        // s1 : 인스턴스 주소
```

---
- 생성자 (constructor)
```
new 연산자를 이용하여 인스턴스를 만들 때 자동으로 호출되는 특별한 문법의 메서드
    - 메서드 명은 클래스 이름과 같아야 한다.
    - 리턴 타입은 없다.
    - 오직 new 명령을 실행할 때 호출할 수 있다. 나중에 따로 호출할 수 없다.
```

---
## 7/20
- msb = most significant bit = 최상위비트
- lsb = least significant bit = 최하위비트

- 패리티 비트와 XOR 연산자
```
    결합법칙을 활용
    교환법칙을 활용
        0111 0011 =>
                0111 ^ 0011 = 0100 =>
                        01 ^ 00 = 01 =>
                                0 ^ 1 = 1
```

- `i++;` ::
    > i : operand
    > ++ : operator

- s1.compute();
    > s1 : operand
    > compute : operator

- GRASP : 객체지향프로그래밍의 핵심

---
- 여러 곳에서 사용할 클래스라면 분리해서 관리하는게 유지보수에 좋다.

---
## 7/22
##### 데이터 접근 범위
    - public : 모두 공개
    - protected : 같은 패키지 + 자식 클래스
    - (default) : 같은 패키지
    - private : 그 멤버를 가지고 있는 클래스 안에서만 접근 가능

---
```
변수명 : 타입
메서드명(변수:타입, 변수:타입):리턴타입
```
    위처럼 나타내는 것이 UML 이다! (별로 안중요한 타입이라면 생략가능)

---
## 7/25


```java
    void m4(int value) {
      // 로컬 변수의 이름이 인스턴스 이름과 같을 경우 
      // this를 붙이지 않으면 로컬 변수를 가리킨다.
      value = 200; // 로컬 변수이다.

      this.value = 300; // 인스턴스 변수이다.
      // 따라서 로컬 변수가 아닌 인스턴스 변수를 가리키고 싶으면 this를 붙여야 한다.
    }
```

---
- 인스턴스를 만든 후에 즉시 생성자를 호출할 수 있다. 그 외에는 호출 불가능하다.

---
## 7/27
- Object : 객체라면 기본적으로 가져야할 필드와 메서드.

- Object 의 메서드 ::
    - equals : 인스턴스 주소가 같은지 비교
    - toString : 클래스명@식별번호 리턴
    - hashCode : 식별번호 리턴

- Object클래스를 상속받은 클래스인 Member~~
    - Member 인스턴스를 통해 호출하는 메서드는 모두 Object 클래스의 메서드이다.

- `Object obj = new String();`
    - 이라고 썼으면 `obj.~~` 를 할 때 Object클래스 의 메서드 사용가능.
    - String의 메서드 사용 불가능
    - 쓰고 싶으면 obj = (String) obj; 라고 형변환 해줄것.


---
## 8/1
- 자료 구조를 구현하고 다루는 방법:
    - Linked List

> BoardList의 데이터 저장 방식을 변경
> 상속을 이용해서 변경

- 배열을 이용해서 목록을 관리 ::
    - 가비지가 많이 생성
    - 삭제시 속도가 느리다.
    - 크기가 고정.
- 노드를 연결하는 방식으로 목록을 관리 ::
    - 초기 크기가 작다.
    - 크기 변경 가능 => 가비지가 적게 생성
    - 삭제가 빠르다.
        * 조회속도가 느리다.


- 메서드 사용법을 규격화하기 : 인터페이스

---
1. 기존 방식 : 규격화가 안된 경우
    
    - 메서드 형식 = method signature = (function prototype) ::
        - 메서드명
        - 파라미터 선언
        - 리턴 타입
        - **메서드 body는 없다!!**

2. 개선 방식 : 메서드 호출을 규격화 한 경우
    - 목록을 다루는 메서드의 호출 규칙을 정의
    - 규칙에 따라 메서드를 정의
    - 교체하더라도 메서드 규격이 같기 때문에 코드 변경을 최소화할 수 있다.

---
`interface` : 메서드의 사용 규칙
`concrete` : 규칙에 따라 만들어진 클래스

---
```
            인터페이스
                |
클래스 >>>>>>>>call>>>>>>>> (인터페이스 규칙이 적용된) 클래스
- caller                                - callee
- client                                - implementer(구현체)
```

---
```
- 인터페이스에 정의되는 필드는 모두 상수이다. (=> public static final 이라는 뜻)
- 인터페이스에 정의되는 함수는 모두 public 이다. (규칙이라는 것은 모름지기 공포되어야 하기 때문)
- 몽땅 abstract 이다.
- 위 두개는 생략이 가능 (public abstract)
```

- interface 의 default 메서드
    1. interface에 ~~ 나중에 새 규칙이 필요해서 메서드를 추가했다.
    2. 새로 만드는 클래스들은 새 규칙에 맞춰서 추가된 메서드를 구현했다.
    3. 예전에 그 규칙을 따라 만든 다른 클래스들은 어떻게 할 것인가?
        > 모두 새 규칙을 추가로 구현할 것인가??????
    
    4. 예전에 작성한 크래스에서 컴파일 오류가 나지 않도록 interface에서 미리 대충 구현해 둔다.
    5. 신규 프로젝트에서도 추가된 메서드를 구현한다.
    6. 이전 프로젝트 : 예전 프로젝트 소스로 변경될 필요가 없다
        > interface에서 새로 추가한 메서드로 일단 구현된 메서드이기 때문이다.
            **추상 메서드가 아니다!!**

        - 그것은 바로 `default method`

- `default method` ::
    > 과거에 작성된 코드에 영향을 주지 않으면서 신규 규칙을 추가할 수 있는 문법
    > `public void m1() {}` 의 형식을 가진다.

    - 기존 ::
    `public void m1();`

---
- 구현 메서드 (private method)
    - interface에서 default 메서드에서 구현할 때 쓰려고 또 아래에 있는 구현메서드
    **이따구로 할꺼면 interface로 하지말고 그냥 class로 만들어라!! 장난하는 것도 아니고**

- static method
    - 위와 동 (이따구~)
    - 인터페이스에 정의된 static 메서드는 인터페이스를 구현한 클래스를 통해 호출할 수 없다.
    - 또한 구현체의 레퍼런스를 통해서도 구현할 수 없다.

---
```
    상속은 실선 빈 화살표
    구현은 점선 빈 화살표 (상급자 쪽이 화살표를 받는다.)
```

- 상속관계의 인터페이스들
    - 수퍼 인터페이스 <- 서브 인터페이스

- 다중 인터페이스 구현
    - 두 인터페이스에 정의된 메서드가 중복되더라도 상관없다.
        => 단, 두 메서드의 signature가 같아야 한다.

- 인터페이스는 다중상속도 가능하다.
    - interface A extends (interface)B, (interface)C `OK!`

- 리턴 타입이 다른 중복 메서드(오버로딩이 성립하지 않는 두 메서드)의 존재가 확인될 경우
    => 다중 상속을 허용하지 않는다!!
  - 이미 구현된 default 메서드를 다중 상속을 통해 중복으로 받아야 할 경우
    => 다중 상속이 불가능하다.

---
## 8/3
- 인터페이스와 추상클래스 ::
    - interface를 따르는 abstract class 를 부모 클래스로 두면
        > 자식 클래스는 원하는 method만 상속받아 오버라이딩 하여 사용할 수 있다.
        > = 인터페이스 구현을 간소화할 수 있다.

- Stack
    = `Last In First Out = LIFO`
    `(push(넣기) 와 pop(튀어나오기))`

---
## 8/4
- 서브 클래스에서 추상메서드를 구현한다.
- 서브클래스가 메뉴처리의 세세한 부분을 구체적으로 정의한다.
    - 수퍼클래스에서 실행의 흐름을 정의하고
    - 서브클래스에서 세부적인 작업을 구체적으로 정의

- generic 문법의 가치
    - Object로 받으면 클래스는 한개만 정의해서 좋지만 사용할 때 특정 타입만 받는것이 불가능하다.
    - 특정 타입별로 클래스를 정의하면 유지보수가 거의 불가능하다.
    > 이 두 단점을 해결하기 위해서!
    - 한 개의 클래스를 만들어 놓고 각 타입 별로 따로 만든 클래스인것처럼 사용할 수 있게 해주는 문법.

---
## 8/8
- 객체화 = 부품화 ::
    > 기능 변경 및 교체가 쉽다.

---
- 파일 입출력 : binary 저장/읽기
    - 생성자에 파일 이름을 받는 파라미터 추가

- 바이너리(binary) 데이터 입출력
    바이너리 : byte형식의 데이터

- 데이터 저장 : (순차적으로 저장하는것을 도와주는 class : `FileOutputStream`)
    - 객체(인스턴스) >> 필드에 저장된 값을 바이트 배열로 전환 >> 순차적으로 저장 >> 파일

- 데이터 읽기 : (순차적으로 읽는것을 도와주는 class: `FileInputStream`)
    - 파일 >> 순차적으로 읽기 >> 바이트 배열의 값을 필드에 저장 >> 객체(인스턴스)

- FileOutputStream
    - write() : 1byte 출력
    - write(byte[]) : byte 배열 출력

- FileInputStream
    - read() : 1byte 읽기
    - read(byte[]) : byte 배열 읽기

`FileNotFoundException` = `checkedexception`

---
## 8/9
- data파일은 eclipse에서는 프로젝트 폴더아래에 생성되고, cmd에서는 명령을 실행한 폴더에 생성된다.

---
## 8/10
- 캡슐화, 객체화(encapsulation) :
    - 클래스, 메서드 안에 넣는다.(감춘다)
        > 복잡한 코드를 메서드 안에 감춰서 쓰기 쉽게 하는 것.

---
- 자바 I/O Stream : `java.io.*`
    - `InputStream/OutputStream` : byte stream(byte, byte[])
    - `Reader/Writer` : character stream(char, char[])
    - `DataSinkStream` : 데이터 저장소에 직접 읽고/쓰기를 수행하는 클래스
        > data 저장소
        - 파일 / 메모리 / 프로세스의 3 종류로 나뉜다.
    - `DataProcessingStream` : 중간에서 데이터를 가공하는 일을 하는 클래스
        > "**decorator**"
    
---
- 버퍼 사용 이유
    - HDD로 출력하는데는 시간이 많이 소요됨
        >  1 byte씩 바로 바로 HDD로 출력하는 것보다 일정량의 바이트들을 메모리에 모았다가 한 번에 출력하는 것이 시간이 덜 소요된다.

---
- 객체 직렬화 : 인스턴스를 통째로 입출력하기
    => 인스턴스 필드의 값을 통째로 입출력하기

-------------------------------------------
- `Serialize(직렬화)` 와 `Deserialize(역직렬화)`
    - serialize = 직렬화 = marshaling
        - 바이트 배열로 변환
            - 바이트 배열:
                - 클래스정보(이름, 패키지명 등)
                - 버전 번호(serialVersionUID)
                - 필드 값

    - deserialize = 역직렬화 = unmarshaling
        - 바이트 배열에 있는 data를 가지고 인스턴스 생성
            - 바이트 배열:
                - 클래스정보
                - 버전 번호
                - 필드 값

!!! <memo> 직접 필드값을 출력하는 것보다 파일 크기가 더 커지는 단점이 있다.
    장점 : 코딩이 쉽다.
    단점 : 다른 프로그래밍 언어로 읽고 쓰기가 어렵다.

---
- FileReader, FileWriter
    - CSV(Comma Separated Values) 방식으로 입출력
- 텍스트 형식의 데이터 특징
    - 바이너리 형식보다 파일 크기가 크다.
    - 저장할 때 (UTF-16 => UTF-8)로 인코딩
      읽을 때 (UTF-8 => UTF-16)로 디코딩
      인코딩/디코딩에 시간소요
    - 텍스트 편집기로 직접 변경 가능
      <=> 바이너리 형식은 전용 App을 사용해야 한다.
    - 프로그래밍 언어 간 호환이 잘 된다.
    => App끼리 데이터 교환이 쉽다.

- `FileReader` 클래스의 `readLine()` : 한 줄 단위로 문자열을 끊어서 리턴

---
- Factory Method 패턴(GOF의 디자인 패턴), Information Expert(GRASP) 패턴
    
    - **Information Expert** ::
        - 객체생성(Board)은 그 객체를 가장 잘아는 객체(Board)에게 맡긴다.

---
- **wrapper 클래스** : primitive data를 포장하는 객체

---
## 8/11
- CSV의 한계와 대안 형식
    - CSV : 다른 데이터를 포함하고 있는 데이터를 표현하기 힘들다.
            즉, 계층 구조로된 데이터를 표현하기 어렵다.

```
계층 구조의 데이터를 표현할 수 있고, 텍스트 형식으로 되어 있어,
OS나 프로그래밍 언어에 종속되지 않는 공개된 데이터 포맷
=====>> (XML => JSON) 형식
```

---
- `<book>` : 데이터를 설명하는 데이터
( = meta data(부가 데이터) = markup(출판 용어) = tag ( = element))

- 부모태그, 자식태그,
    > more ::
    > 조상태그(= ascendant), 자손태그(= descendant)

---
- XML : e**X**tensible **M**arkup **L**anguage

---
- 계층적인 구조의 데이터 표현
    - 각 데이터의 의미를 표시
        => 데이터 조회 및 추출이 용이
        => App에서 데이터를 제어하기가 쉽다.
        => 인간이 아닌 프로그램에서 데이터를 다루기 쉽다.
- 텍스트 형식
    - OS나 프로그래밍 언어에 상관없이 데이터를 주고 받기 쉽다.
        => 프로그램끼리 데이터 교환이 용이.

---
-  XML의 단점 :
    - 데이터보다 부가데이터가 더 클 수 있다.
        => 파일크기가 매우 커진다.

---
- JSON 형식 :
    **J**ava**S**cript **O**bject **N**otation :
    > 자바스크립트에서 객체를 표현하는 문법을 차용해서 데이터를 표현하는 문법으로 만든 것.

---
```
{ // 중괄호 시작
    "title":"---", // tag명을 반드시 double quotation 으로
    "descriptoin":"---",
    "authors":[{"name":"---","email":"---","tel":"---"}, // 배열일 경우 대괄호 시작
                {"name":"---","email":"---","tel":"---"}],
    "press":{"name":"---",
            "homepage":"---",
            "tel":"---"}
}
```

 =>
- 계통형 데이터 표현이 쉽다.
- 프로퍼티 명을 통해 데이터 의미를 표시
    => XML의 태그명(XML보다 부가 데이터의 크기가 작다)
- 텍스트 형식
    => XML보다 간결하다.

---
- `serialize (=encoding)`
```
[객체] >> toJson() >> [Gson] >> 생성 >> [JSON 문자열]
```

- `deserialize (=decoding)`
```
[객체] << fromJson() << [Gson] << 로딩 << [JSON 문자열]
```

---
1. 사용자와 App 간
    - UI제공
    - 업무로직 수행 (로직: 업무와 관련된 기능을 수행)
2. 데이터관리 App과 파일 간
    - 데이터를 파일에 I/O
3. App과 데이터관리App 간
    - Client App은 데이터관리App(Server App)에 데이터 작업(CRUD)을 요청
    - Server App은 Client App에게서 받은 작업결과를 응답

> 이렇게 Applicatoin을 Client와 Server로 이원화 한 것
> => C/S Application

---
- Client와 Server간의 데이터 전송에 네트워킹 기술을 이용한다.
    => `java.net.Socket` / `java.io.*`(스트림클래스, `PrintStream`, etc)

- C/S Applicatoin Architecture 의 장점 :
    > 다중 사용자에게 동시에 서비스 제공

---
- Single project와 Multisub project

```
1. Single Project 디렉토리 구조
    gradle-project/     // 메인 프로젝트 폴더
        |- settings.gradle // 프로제트 공통설정
        |- build.gradle // 프로젝트 설정

2. Multi-Sub Project 디렉토리 구조
    gradle-project/     // root project
        |- app/         // sub project 들
            |- build.gradle // sub project 전용 설정
        |- sub1/
            |- build.gradle
        |- sub2/
            |- build.gradle
        |- settings.gradle  // 모든 서브 프로젝트가 공유하는 공유 설정
```

---
## 8/16
##### Application Architecture
- App-client : 서버에 요청
    - UI처리
    - 업무 로직
- App-server : 클라이언트에게 응답
    - 데이터 처리

---
- 소켓 생성
`java.net.*`

`new Socket("접속하려는 상대편의 네트워크 주소", 포트번호(port));`
- 접속하려는 상대편의 네트워크 주소:
    - 도메인명
    - IP 주소
    - **__127.0.0.1 == local 컴퓨터를 가리키는 도메인명과 IP주소__**

- 포트번호:
    - 식별자

---
- IP 주소 :
    - 네트워크 상에서 컴퓨터 식별번호:
    - 한 컴퓨터에 여러 개의 IP 주소를 저장할 수 있다.(다중 랜카드)
        > = 지구에서 유일한 값
        > = 국제기구에서 번호 관리
            
- IPv4 : 0~255.0~255.0~255.0~255.
    - (32bit = 4byte)라서 IPv"4" 인 것.
    - 42억 대의 장치에 대해 IP 주소 부여(>> 모자라다)
    - 모자라니까 내부에서 **__"사설 IP"__** 사용
        > - 192.168. 으로 시작하는 IP가 사설 IP
        > - 외부로 보낼 때는 공유기에서 구분을 해준다.
        > - 외부에서 받아올 때도 사설IP를 알려주고 받아온다.

- 연결 기다림 : 서버 소켓
`new ServerSocket(포트번호)`

---
- `DataInputStream/Out..` ::
    - Decorator : I/O 객체에 덧붙여서 기능을 확장시킨다.

---
- InputStream : 단순히 1byte씩 읽어온다.
- InputStreaReader ::
    > - InputStream에서 읽어온 byte 타입의 데이터를 char 타입으로 바꿔서 UTF-16으로 리턴한다.
    > - 그 과정에서 한글이면 3바이트를 알아서 읽음.
- `BufferedReader` : \n을 만날 때까지 읽어오고 한줄을 리턴.

---
- http 프로토콜의 첫번째 라인(요청 및 응답) :
    `status 라인`
- http 프로토콜의 두번째 라인 :
    `Host 헤더(+포트번호)`

---
## 8/17
##### OS와 ShellScript
- Windows OS :
    - 명령창 기본 shell 스크립트
    - PowerShell (= Unix shell script 모방)
- Unix OS :
    - zsh, bash, bsh, tsh, csh, sh...
- Mac OS :
    - AppleScript, ...

---
- HashMap 사용
    - List:
        - 데이터 저장 및 조회시 사용하는 인덱스 : 0부터 순차적으로 증가하는 정수값
        - 입력순서 유지 : O
        - 객체 중복 저장 : O
        - 특징 : 입력 순서 유지
        - ArrayList, LinkedList, Vector
    - Set:
        - 데이터 저장 및 조회시 사용하는 인덱스 : 값에 대해 hash알고리즘으로 계산한 정수값
        - 입력순서 유지 : X
        - 객체 중복 저장 : X
        - 특징 : 중복제거
        - HashSet
    - Map:
        - 데이터 저장 및 조회시 사용하는 인덱스 : key에 대해 hash알고리즘으로 계산한 정수값
        - 입력순서 유지 : X
        - 객체 중복 저장 : key가 중복되지 않는다.
        - 특징 : key를 사용한 빠른 조회
            - HashMap
                - key, value : null 허용
            - Hashtable
                - key, value : null 불가!

---
- lambda 문법
    > 메소드가 하나밖에 없는 익명클래스(객체) 사용하고자 할 때 쓰는 문법

- functional interface : 추상 메서드가 한 개만 있는 인터페이스
    - `list.forEach(Exam0240::m1);` :: method reference
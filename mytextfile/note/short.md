- 주석은 컴파일에서 제외된다.
    - =.class파일에 포함되지 않는다.
    - .class의 크기와는 상관 없음) :: 코드에 대한 부가설명(자신이나 다른 개발자의 이해를 돕기위해)
- // : 한 줄 주석 : 줄 끝 까지
- /* ....~~~.... */ : 여러줄 주석

---

- java se(standard edition) 가 있어야 java ee(enterprise edition)도 이용가능함.
- JDK : Java Development Kit
- JRE : Java Runtime Environment

---

- 자바 호환(compatible)언어
    - .java >> .class
    - .kt >> .class : 요즘 안드로이드 개발언어
    - .groovy >> .class

---

- **convention : 국제 공통 관리 체계**
    `src/` : app제작에 관련된 파일을 두는 폴더
    `main/` : app 관련 파일을 두는 폴더
    `java/` : java 소스 파일을 두는 폴더
    `resources/` : 설정 파일이나 기타 파일을 두는 폴더
    `test/` : 제작한 app 소스를 테스트하는 파일을 두는 폴더
    `java/` : 단위 테스트 자바 소스파일을 두는 폴더
    `resources/` : 단위 테스트할 때 사용할 테스트에 관련된 설정파일 등을 두는 폴더

---

- DSL
> Domain-Specific Language = 특정도메인 언어 = 특정영역에서 쓰는 언어

> ex)
> JSP : Java
> build.gradle(빌드스크립트) : groovy(주류), kotlin

---

- Firmware : ROM 칩 안에 설치된 S/W

- (SSD)HDD >> track >> Sector(=512 Byte/1sector)
    - 이 안에 OS 설치됨
    - OS의 핵심기능 = 커널 ( = Kernel)
    - 커널을 로딩한다 = OS를 로드한다.
- 전원을 키면 > ROM의 Firmware를 실행 >> 부트섹터에 있는 OS Loader를 실행 >> OS의 Kernel ( : H/W관리) 을 실행
**이 과정이 '부팅'**

- (메인보드에 설치된) BIOS : Boot Sector의 S/W를 실행시켜주는 프로그램 + H/W를 실행하는 프로그램

---

- java ::
    1. 변수의 타입은 변경할 수 없다
    2. 정적 타입 바인딩 = 고정형 타입 바인딩
- javascript ::
    1. 값을 저장할 때 변수의 타입이 결정된다.
    2. 다른 타입의 값을 저장하면 변수의 타입도 바뀐다.
    3. 동적 타입 바인딩

---

- Buffer : 키보드에서 입력한 키 값을 임시 보관하는 메모리

- nextInt() : 버퍼에서 숫자만 쏙 빼가서 읽음
`1 2 3 (enter)` >> 1 2 3 을 읽고 (enter)가 남음
이거 지워줄려고 `nextLine()`을 써서 지움
- `nextLine()` : `enter`를 만날 때까지 데이터를 읽어들임

---

- System Integration (시스템 통합) : **SI**
    - 기존 시스템( = Legacy)에 새로 개발한 시스템( = 새 기능)을 연동( = 통합)

- System Maintenance : **SM**
    - 기능변경, 추가, 삭제
    - 버그패치

---

- 메서드는 정의, 변수는 선언
- 메서드를 통해 코드의 복잡함을 감춘다. `= encapsulation(캡슐화)`

---

- `UML (Unified Modeling Language)`
> 통합된 / 생각한 바를 글과 그림으로 표현하는 / 문법    

---

- `new` ::
> 도구함에 들어있는 도구를 사용하기 전에 필요 정보를 설정

---

- Low Coupling ::
> 관련된 클래스를 줄여라!

- High Cohesion ::
> 한 클래스가 가능한 한개의 역할을 수행하도록/ 응집력, 집중도를 높여라!

---

- `<< >>` :: 이렇게 꺾쇠 두개 박아놓는건 **'보조 명칭'** 이라고 함! (UML)
        ex) `<<abstract>>`

---

- 상수풀 ::
    - new 명령으로 만들면 Heap 에 만들어지지만
    `String x = "Hello";` 하면 Heap이 아니라 `String Constant Pool` 에 만든다.

---

- java document
    `/** (blah blah) */`  의 문법을 가짐.

 - 예)
 ```java
  /**
   * 목록에서 인덱스에 해당 하는 항목을 찾아 리턴한다.
   * @param index 목록에 저장된 항목의 인덱스
   * @return 목록에 저장된 항목
   * @throws ListException 인덱스가 무효함
   */
```

---

- dao : data access object

---

- 브레드크럼(breadcrumb) : 빵 부스러기 : 헨젤과그레텔

---

- 참고
    - 면접 질문
        - 스택과 큐를 설명하시오.
            => 스택(LIFO), 큐(FIFO)
        - 스택과 큐의 적용 예를 들어보시오.
            => 스택(웹페이지 방문기록(뒤로가기)), 큐(예약처리)

---

명령창 = command line = 콘솔창 = 터미널

---

- 인터프리터 언어
    - 소스파일을 읽어서 실행, 실행속도가 느리다.
    - 명렁어를 실행하기 전에는 명렁문에 오류가 있는지 알수 없다.- 버그가 발견되기 어려움
    - 소스코드가 노출 > 프로그래밍 자산 보호 불가능

- 자바
    - Hybrid 프로그래밍 > 컴파일형식+인터프리트형식
    - 자바 캐치프레이즈
        > write once, run anywhere :: 한번만 작성하고, 어디서든 작동함 :: 인터프리터 언어의 장점
        > 문법오류 검사 :: [명령문 최적화>실행명령수가 감소>실행속도향상], [가상기계어로 변환>소스노출을 막음>프로그래밍 자산을 보호]

bytecode player = java runtime = **JVM**(Java Virtual Machine)

---
- Bytecode 실행 한계 극복
    - JIT(Just-In-Time)컴파일
        > 실행할 일부 코드를 뭉텅이로 가져와서 기계어로 변환하고 즉시 실행.
    <<----->>
    -  ART(Android Run Time) AOT(Ahead Of Time)컴파일
        > 안드로이드에 주로 씀>>앱 설치할때 모든 코드를 기계어로 변환 후 저장함.

---

- Emulator(변환기) : 다른타입의 언어를 맞는 언어로 변환해 줌
    > ex.(intel>>ARM 변환기)
- JDK 종류
Open JDK > Oracle JDK > GraalVM
         > IBM JDK
         > Amazon JDK
         > Azul JDK

---

>> JAVA_HOME 환경변수 설정하는 이유 ::
>> 일부 java app은 실행할 때 jdk나 jre가 설치된 폴더의 위치를 조회하는 경우가 있다.
>> PATH 환경변수에 프로그램 폴더 경로를 등록하는 이유 ::
>> 명령 프롬프트의 디렉토리 위치에 상관없이 자바 개발도구를 실행할 수 있도록 하기 위함.

---

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

---

- 명시적 형변환 = type conversion = type casting

---
- 자바 원시 타입 (primitive type) ::
    > byte, short, int, long, float, double, boolean, char

---
- stakeholder : 투자자, 관계자

---
```
String s1 = new String("Hello");

UML 표기법 -> s1:String
```

---
- cmd 에서 즉시 실행할 수 없다.
    > Hello.class
> 완전한 기계어가 아니기 때문에
> Hello.class파일을 기계어로 바꿔주려면 JVM(Java.exe)이 필요하다

---
- 요즘은 monolotic system에서 micro-service 로 바뀌고 있음 : class보다 method(=functional program)로 쪼개서 나중에 합치기 때문

---
- final ::
    > 원래의 특성을 변경한다 = modifier

---
- 컴파일 옵션 ::
    ```java
    javac -encoding UTF-8 -d bin/main -sourcepath src/main/java src/main/java/com/bitcamp/board/App.java
    ```
    - `-sourcepath` : 소스파일에서 참조하는 클래스가 있는 파일의 경로를 알려준다.

---
- whitespace : space, tap, newline

---

- **optimizing(최적화)** vs **refactoring(코드개선)**
    - 최적화 : 속도상승, 코드 난해해짐 ( = 유지보수 어려워짐)
    - 코드개선 : 유지보수 용이성 좋아짐, 속도 저하
    > 자바 개발자는 refactoring에 초점을 맞춘다.
    > 속도에 신경을 쓸 것 같으면 애초에 자바말고 c를 쓰셈

---
- General Responsible Assignment Software Patterns ::
> GRASP 패턴
> 객체지향의 근본 패턴

- GRASP(General Responsibility Assignment Software Pattern)
    > 클래스에 책임 부여 방법론

---
> **역할을 수행하는 클래스 = 객체**

---

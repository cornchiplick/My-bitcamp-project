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
디자인 패턴 시리즈에 넣을 이터레이터 패턴

- Iterator 패턴
    - HashSet은 데이터를 저장할 때 데이터를 가지고 특정 계산식의 결과값을 인덱스로 사용하여 저장.
        - 특정 계산식의 결과값 : hash value = 정수로된 ID값
            - 배열의 인덱스처럼 0에서 시작하는 값으로 조회할 수 없다.
                > get() 메서드가 없다.

```
데이터 저장 방식(data structure = 자료구조)에 따라 데이터를 조회하는 방식이 다르다.
    => 데이터 조회를 위한 코딩이 일관성이 없다.
```

---
1. 데이터 조회를 다른 객체에세 맡긴다.
2. 데이터 조회 방식을 통일!
    > 데이터 조회의 일관성 확보
    > 유지보수가 쉽다.
    
!!! <memo> Iterator = 반복자

---
- Iterator 패턴 : 데이터 조회 코드를 객체화시켜 분리
    > 자료구조에 상관없이 일관된 방법으로 데이터 조회 수행
    > 객체화 >> 다양한 조회방식을 제공/교체

---
- Iterator 사용법
1. `iterator()` >> `LinkedList{}`
2. `LinkedList` >>>`생성`>>> `LinkedListIterator`
3. Iterator 구현체 리턴
4. `hasNext()` >> `LinkedList{}`
5. `next()` >> `LinkedList{}`



---
- class는 resposibility 하다.
= 클래스는 책임을 갖고 있다. 역할을 갖고있다.


---
dependency : 의존객체
**쌍방참조가 일어나서는 안된다. 절대로**

---
- JSP는 단독적으로 실행되지 않고 Servlet으로 바뀌어서 Servlet이 실행된다.
- JSP와 Servlet은 실상 동일한 개념이다.

---
- 배열은 크기를 늘릴 수 없다.
    > 새 배열을 만들어 기존 배열의 값을 복사해야 한다.

---
- `i++;` ::
    > i : operand
    > ++ : operator

- s1.compute();
    > s1 : operand
    > compute : operator

---

- Stack
    = `Last In First Out = LIFO`
    `(push(넣기) 와 pop(튀어나오기))`

---
- 객체화 = 부품화 ::
    > 기능 변경 및 교체가 쉽다.

---
- 캡슐화, 객체화(encapsulation) :
    - 클래스, 메서드 안에 넣는다.(감춘다)
        > 복잡한 코드를 메서드 안에 감춰서 쓰기 쉽게 하는 것.

---
```
    상속은 실선 빈 화살표
    구현은 점선 빈 화살표 (상급자 쪽이 화살표를 받는다.)
```

---
# generic 문법의 가치
    - Object로 받으면 클래스는 한개만 정의해서 좋지만 사용할 때 특정 타입만 받는것이 불가능하다.
    - 특정 타입별로 클래스를 정의하면 유지보수가 거의 불가능하다.
    > 이 두 단점을 해결하기 위해서!
    - 한 개의 클래스를 만들어 놓고 각 타입 별로 따로 만든 클래스인것처럼 사용할 수 있게 해주는 문법.

---
- data파일은 eclipse에서는 프로젝트 폴더아래에 생성되고, cmd에서는 명령을 실행한 폴더에 생성된다.

---
# Factory Method 패턴(GOF의 디자인 패턴), Information Expert(GRASP) 패턴
    - factory method : 인스턴스를 공장처럼 찍어내는 메소드   
    - **Information Expert** ::
        - 객체생성(Board)은 그 객체를 가장 잘아는 객체(Board)에게 맡긴다.

---
- **wrapper 클래스** : primitive data를 포장하는 객체

---
- GRASP : 객체지향프로그래밍의 핵심

---
- 여러 곳에서 사용할 클래스라면 분리해서 관리하는게 유지보수에 좋다.

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
-  Application Architecture
    - App-client : 서버에 요청
        - UI처리
        - 업무 로직
    - App-server : 클라이언트에게 응답
        - 데이터 처리


---
##### OS와 ShellScript
- Windows OS :
    - 명령창 기본 shell 스크립트
    - PowerShell (= Unix shell script 모방)
- Unix OS :
    - zsh, bash, bsh, tsh, csh, sh...
- Mac OS :
    - AppleScript, ...

---
- http 프로토콜의 첫번째 라인(요청 및 응답) :
    `status 라인`
- http 프로토콜의 두번째 라인 :
    `Host 헤더(+포트번호)`


---
- `<book>` : 데이터를 설명하는 데이터
( = meta data(부가 데이터) = markup(출판 용어) = tag ( = element))

- 부모태그, 자식태그,
    > more ::
    > 조상태그(= ascendant), 자손태그(= descendant)

---
- InputStream : 단순히 1byte씩 읽어온다.
- InputStreaReader ::
    > - InputStream에서 읽어온 byte 타입의 데이터를 char 타입으로 바꿔서 UTF-16으로 리턴한다.
    > - 그 과정에서 한글이면 3바이트를 알아서 읽음.
- `BufferedReader` : \n을 만날 때까지 읽어오고 한줄을 리턴.

---
- `echo %PATH%` : 환경변수의 경로 조회(?)
- . : 현재폴더
- .. : 상위폴더
<br>
###### `C:\Users\bitcamp>a.exe`
- 현재 경로에서 찾는다.
- OS의 PATH환경 변수에 등록된 경로를 순서대로 찾는다.
- Unix의 경우 현재 경로를 명시해야 한다.
    ex) `./a.exe`
    (PATH환경 변수에 등록된 경로를 따라가며 찾기 때문이다.)

- `a.exe` 파일 : 컴파일 된 기계어 명령의 실행파일
    - 실행 시에 `.exe` 부분은 생략가능
    > _순서_
    > 1. a.com 찾는다
    > 2. a.exe 찾는다
    > 3. a.bat 찾는다
    - `.com`과 `.exe`는 기계어 파일
        > .bat은 OS가 이해하는 스크립트로 작성된 명령어가 들어있는 파일 << 컴파일 불필요!
    - `a.doc` 등은 기계어 파일이 아니다! >> 직접실행불가!
        > .doc 확장자와 연결된 프로그램을 실행
        > 그 프로그램이 `a.doc` 파일을 읽는다.

- Unix 에서는 실행파일에 대해 사용자가 실행권한을 가지고 있어야만 실행할 수 있다.
`$ls -al`
`rw-r--r-- a` : 644
`rw-` : user권한
`r--` : group권한
`r--` : other 권한
`a` : 실행파일명
1. 실행파일에 대해 사용자에게 실행권한을 부여하지 않았기 때문에 실행할 수 없다.
2. 실행권한 부여 : `$chmod 744 a`
3. `744` : 111_100_100 (= rwx r-- r--) ->> **_실행권한을 2진수로 표현_**
4. `$a` : 드디어 실행할 수 있다.

---

* `implements Iterable` 이라면
> for (Member m : **list**) {} 에 사용할 수 있다.

---

#### 향상된 for문
    > for (Member m : members)
- 향상된 for문은 컬렉션과 배열(이들 또한 `iterable`구현체이다), `iterable`인터페이스를 구현한 객체라면 무엇이든 사용할 수 있다.
- 향상된 for문으로 컬렉션 데이터를 처리할 때, 컬렉션은 수정할 수 없다.


---

- Application은 결국 OS의 메서드 호출 >> 실행 시 OS의 영향을 받는다.

---

- LAN Card = NIC (Network Interface Card)

---

- 버퍼 사용시 입출력
    > 버퍼가 꽉 찼을 때 입출력하기 때문에 server-client 간 데이터전송이 원활하게 이루어지지 않는다.
- 해결법
    > `flush()`를 실행하여 출력을 명령한다.

---

- byte Stream : inputStream, ...
- character Stream : Reader, Writer, ...

---

- Node.js 는 싱글스레드로 되어 있다.
- 자바스크립트를 실행하는 스레드는 하나뿐이므로 Node를 싱글스레드라고 한다.
- 그 싱글스레드는 이벤트 루프이다.

---
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
##### 자바 문법
    1. literal //데이터 표기법
    2. variable //메모리 준비
    3. operators //데이터 연산자
    4. 흐름제어문 //조건, 반복문
    5. 메소드 //명령어 묶음
    6. 클래스 //메소드 묶음

---
- 국제화 : internationalization : I18N
- 지역화 : localization : L10N

---
```
인스턴스는 만들고 싶으면 반드시 new 생성자로 만들어줘야 한다.
그리고 주소를 배정해야 하고 한번에 여러개 만드는 방법 따위는 없다.
만들고 싶으면 반복문을 이용해서 여러개 만들어라.
```

- 레퍼런스 카운트 테이블 :: JVM이 관리함.

---
```
변수명 : 타입
메서드명(변수:타입, 변수:타입):리턴타입
```

위처럼 나타내는 것이 UML 이다! (별로 안중요한 타입이라면 생략가능)

---
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

---

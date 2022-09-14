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


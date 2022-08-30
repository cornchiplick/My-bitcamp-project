## 8/18
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

- `HashSet`이 중복여부를 검사할 때 `hashCode()`와 `equals()`의 리턴값으로 판단한다.(&&조건을 만족)
- `Object`의 `hashCode()`는 인스턴스가 다르면 무조건 다른 해시값을 리턴한다.
- `Object`의 `equals()`는 인스턴스의 주소가 같은 지 검사한다.

---

#### HashSet vs HashMap
##### HashSet
    - HashSet << == >> 객체
1. `HashSet`이 객체에게 `hashCode()`를 요구하고
2. 객체는 해시값을 리턴하고
3. 저장하려는 객체의 해시값을 가지고 위치를 선정한다.
- 값을 꺼낼 때
    > 임의의 순서로 꺼낸다.
    > 특정 객체를 콕 집어서 꺼낼수가 없다.

##### HashMap
    - HashSet << == >> key-value
1. 위와동
2. 위와동
3. 저장하려는 객체의 해시값이 아닌, 그 객체의 key의 해시값을 가지고 위치선정
- 값을 꺼낼 때
    > key를 가지고 특정 객체를 콕 집어서 꺼낼 수 있다.
- 같은 키로 다른 값을 저장하면 기존 값을 덮어쓴다.
- key는 **객체**여야 한다.
    > `int`는 안되지만 `Integer`는 가능하다.

---

- `keySet()`을 호출할 때 모든 key를 미리 목록을 만들어 리턴하지 않는다.
- `iterator`를 얻은 후에는 값을 변경하지 않아야 한다.
- 결론
    > key나 value에 null을 사용하고 싶다면 HashMap을 사용하라.
    > key나 value가 null이 되어서는 안된다면 Hashtable을 사용하라.

---

#### 향상된 for문
    > for (Member m : members)
- 향상된 for문은 컬렉션과 배열(이들 또한 `iterable`구현체이다), `iterable`인터페이스를 구현한 객체라면 무엇이든 사용할 수 있다.
- 향상된 for문으로 컬렉션 데이터를 처리할 때, 컬렉션은 수정할 수 없다.

---

## 8/19
- Proxy 패턴을 활용한 네트워킹 코드 캡슐화
    > 캡슐화 : 해당 기능이 필요한 경우 간단히 메서드 호출로 처리

1. Proxy 패턴
    > `Client >> _call_ >> **통신대행자** >> _통신_ >> Server`
    > `Client << _리턴_ << **통신대행자** << _결과_ << Server`
    - 통신대행자 : 통신코드를 감춘다.

- Proxy 패턴 적용 이전
    > **BoardHandler** << 통신 >> **BoardServlet**
- Proxy 패턴 적용 이후
    > **BoardHandler** << call, return >> **BoardDaoProxy** << 통신 >> **BoardServlet**

---

##### stateful => stateless (= Connection-Oriented = 연결지향 = **TCP**)
- stateful 방식
    > - 연결을 끊을 때까지 나머지가 대기해야 하는 줄서기 방식
    > : 은행 업무
    > - FTP, POP3, 채팅, 게임
- stateless 방식
    > - [연결>>요청>>응답>>연결끊기]를 반복하는 방식
    > : 114, ARS 인증
    > - HTTP
##### TCP 방식이 아닌 Connectionless 방식(= **UDP**)
    > : 편지, 방송
    > ping

## 8/22
- **"Remote Object"** : 실제 Data를 저장하고 꺼내는 일을 하는 객체 `BoardDao`
    - **"Skeleton"** : Remote Object의 서버측 대행자 `BoardServlet`
        > Server 측 ORB (Object Request Broker)
    - **"Stub"** : Remote Object의 클라이언트 쪽 대행자 `BoardHandler`
        > Client 측 ORB (Object Request Broker)

---

- 분산시스템 아키텍처
    > server를 회계전담서버, 인사전담서버, ... 등으로 나누다보니 시스템 간 기능호출이 필요하다
    > 이 때문에 **원격메서드호출**이 필요하다.

- 원격메서드 호출기술과 진화과정
    1. RPC (Remote Procedure Call)
        > - 원격 메서드를 만드는 개발자에게 부담이 가중되어서
        > 호출 대행자 생성을 자동화 했다.
        > - '메서드 생성기'를 통해 코드를 자동생성
    2. RMI (Remote Method Invocation)
        > - 객체 생성기가 코드를 자동 생성한다.
        > `skeleton`과 `stub`의 코드를.
    3. 
    - EJB(Enterprise Java Beans) `Beans (=Object)`
        > only java만 가능
    -  CORBA (Common Object Request Broker Architecture)
        > 언어중첩 : 언어에 구애받지 않고 호출할 수 있게 해준다.
    4. Web Service Architecture : `EJB+CORBA (+웹통신+XML)`
        > - WSDL : Web Service Description Language : 호출함수 원격 객체의 메서드 정보
        > - WSDL을 클라에게 응답/ 사용할 stub을 서버에게 요청/ stub을 다운로드/
        > - 이후 stub과 skeleton은 HTTP에 따라 통신
        > - **Eclipse IDE 등은 개발도구에서 stub 객체를 자동으로 다운로드 한다.**
        > **개발자가 직접 다운로드 하지 않는다.**
    5. RESTful API : `4.에서 추가로 순수 HTTP 기술 사용`
        > - 개발도구를 사용하여 sub을 자동 다운로드 하더라도 결국 client측에서는 stub객체를 사용해야 한다.
        > - 또한 프로그래밍 언어에 맞춰 stub을 다운로드 해야한다.
        > - 이를 해결하려고 순수 HTTP 기술 사용 `프로그래밍 언어별로 stub이 필요없다.`

    - Thread를 이용한 멀티태스킹 구현 : 동시 요청 처리하기
        > ServerApp : 프로세스
        > RequestThread : 실행흐름을 분리
    
    ---

    - IP주소 `v4의 경우 : 32bit 양의 정수 값`
        > 1. `C0A8004A` (16진수)
        > 2. `3,232,235,594` (10진수)
        > 3. `192.168.0.74` (표현하기 쉽게 1byte씩 잘라서 10진수로 표기)
        > 4. `localhost` (기억하기 쉽게 이름을 부여)
        > IP주소를 직접 사용하는 대신에 IP주소에 부여된 알파벳과 숫자로 된 텍스트 이름을 사용하는 것이 편하다.
        > IP주소에 대한 텍스트 이름을 알려주는 서버가 "**DNS**"

## 8/23
- proxy 서버 역할
    > 1. 필터링 >> 접근제어
    > 2. 로깅(logging) >> 사용기록
    > 3. 캐싱(caching) >> 임시 보관

- 통신을 하는 모든 프로그램은 port번호를 가져야 한다.
- client 의 port번호는 OS로부터 자동 발급 받는다. `49152 ~ 65535`

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

##### TCP/IP
- packet에 관하여~
![](./img/fig1.png)
`<fig1>`

---

- Collaboration Diagram
    > Sequence Diag.
    > 시간 흐름에 따라 실행과정을 표현하기에 적합

## 8/24
- Node.js 는 싱글스레드로 되어 있다.
- 자바스크립트를 실행하는 스레드는 하나뿐이므로 Node를 싱글스레드라고 한다.
- 그 싱글스레드는 이벤트 루프이다.

---

- Connection-Oriented vs Connectionless
    > Connection-Oriented : TCP (연결지향)
    > - stateful
    > - stateless
    > ServerSocket, Socket

    > Connectionless : UDP (비연결)
    > DatagramSocket, DatagramPacket
    > 편지, ping

- URI (Uniform Resource Identifier) :: URL, URN
    - URL : Uniform Resource Locator
        > `scheme(프로토콜)://<user(사용자id)>:<password(암호)>@<host(서버주소)>:<port(포트번호)>/(path)(자원의경로)<url-path(query string)>`
        > - id와 암호는 생략가능
    - URN : Uniform Resource Name
        > `example:animal:ferret:nose`

- 정적자원(Static Resources)과 동적자원(Dynamic Resources)
![](./img/fig2.png)
`<fig2>`

---

- VM (Virtual Machine)
    > Host OS 위에 Guest OS를 설치하는 모양새.
    > 가상머신은 실제컴퓨터처럼 H/W 자원을 사용 :: 자원낭비가 심하다.
    > 그래서...(아래)
- Docker
    > App을 실행하는데 필요한 H/W 자원만 사용
    > 물론 VM처럼 별도의 컴퓨터에서 실행하는 것처럼 동작

---

- 멀티 태스킹
> 여러 작업을 순차적으로가 아니라 동시에 수행

- concurrent
> 마치 동시에 실행하는것처럼 빠르게 왔다갔다 하는것. (!= parallel)

1. 멀티 프로세싱
    > 프로세스(process) : 실행중인 프로그램
    > 프로세스를 복제(fork)해서 멀티태스킹 수행
    > code가 중복로딩, heap 중복생성 :: 메모리 많이 사용
2. 멀티 스레딩
![](./img/fig3.png)
`<fig3>`

    > code와 heap 메모리를 여러 스레드가 공유
    > :: 멀티 프로세싱 방식에 비해 메모리 낭비가 적다.
    > 프로세스 종료 시 :: 종속된 스레드도 모두 자동 종료
    > 프로세스와 스레드를 동일하게 간주하여 동시 실행한다.
    
- cpu가 프로세스나 스레드의 명령을 실행할 떄, cpu실행을 분배하는 전략?
`cpu를 어떤식으로 분배해서 명령을 처리할 것인가?`
`"cpu scheduling"`
    > 1. windows :: Round Robin :: 프로세스와 스레드에 동일 시간 분배
    > 2. unix :: Priority + Aging :: (우선순위가 높은 프로세스나 스레드를 더 많이 실행) + (우선순위가 낮아 실행이 밀릴 때마다 우선순위를 높여서 다음 번엔 실행될 수 있게 하는 것)

- Context Switching
`cpu가 다른 프로세스나 스레드를 실행하기 위해 현재 프,스의 실행상태(여기까지 실행했다)를 저장하고  실행할 프,스의 실행상태(어디서부터 실행하나?)를 로딩하는것`
`cpu스케쥴링 시간을 너무 짧게 잡으면 명령을 실행하는 시간보다 context switching에 더 많은 시간을 소비하는 문제가 발생한다 :: 너무 간극을 크게 잡으면 동시실행 효과가 떨어진다.`

---

`cpu : L1(명령어 저장소) + L2(data 저장소)`

---

## 8/25
- `enumerate(parameter)` : 하위 스레드 그룹의 목록을 알아본다.
- `getParent()` : 상위 스레드 그룹을 알아본다.
- `t.start()` : 별도의 실행흐름을 만든 후 `run()`을 호출한다. 그리고 즉시 리턴한다. `run()`실행이 끝날때까지 기다리지 않는다. **:: 비동기 실행 (Asynchronous)**

######스레드 구현하기
1. Thread 클래스 상속받기
    > - 가장 간단하다.
    > - 다중 상속이 불가능하기 떄문에, 다른 클래스를 상속받으면서 스레드를 상속받을 수 없다.
2. Runnable 인터페이스 구현하기
    > 많이 사용되는 방법
    > 위와 사용법은 같다.

## 8/26
- main 스레드가 먼저 종료되어도 다른 스레드가 종료될 때까지 JVM은 종료되지 않는다.
- Thread의 생명주기(lifecycle)
    > 1. 준비 : start()를 통해 Running상태로 돌입
    > 2. Running : cpu스케쥴링 대상 = cpu를 받을 수 있는 상태
    > 3. Not Runnable : cpu를 안 받는 상태 = cpu스케쥴링 대상에서 제외
    > 4. Dead : run()메서드 실행 완료, 다시 Running상태로 갈 수 없다.

---

- cpu racing (cpu 쟁탈전)
    > 여러 프로세스나 스레드들이 cpu 사용권을 놓고 경쟁하는 것.
    > 그러나 사실은 OS가 cpu 스케쥴링 정책에 따라 결정하고 표현만 이렇게 한다.

---

#### Critical Region(Critical Section)

- 여러 스레드가 동시에 코드를 실행할 떄 문제가 발생하는 코드 블록을 "**Critical Region**" 또는 "**Critical Section**"이라 부른다.
> 왜 이런 문제가 발생하는가?

- 같은 메모리(변수)에 동시에 접근하여 값을 변경할 때, 다른 스레드가 쓴 값을 덮어 쓸 수 있기 때문이다.
> 어떻게 해결할 수 있는가?

- <u>한 번에 한 스레드 만</u>이 접근하도록 제한하면 된다
 `Mutual Exclusion (상호배타)` = `Mutex`
 자바에서는 Mutex를 문법으로 지원!
- 상호 배제 기법
`Semaphore(n)` : <u>n개 까지만 허용, 나머지는 배제</u>
    `semaphore(1) = Mutex`

---

- `thread safe` : 여러 스레드가 동시에 실행해도 문제가 없는 코드 블록

---

- **`synchronized` 문법**
`synchronized (객체명) {}` : {}안에서 동시에 접근할 수 없는 객체를 ()에 선언해준다.

---

#### Database
- 데이터 공유
- 일관성, 무결성, 보안성
- 데이터 중복 최소화
- 실시간 접근 가능
- etc

---

#### DBMS :: Database를 관리
- Database 관리
- 다중 client 요청 처리
- 접속자 인증/권한검사
- etc

> Oracle - Oracle DBMS
> MS - MS-SQL
> IBM - DB2
> Oracle - MySQL >>오픈소스>> **MariaDB**
> 개발커뮤니티 - MariaDB
> 한국 - Cubrid, Altibase, Tibero, ...

---

#### SQL (Structured Query Language)
- 구조를 갖춘, DBMS에 명령을 내릴 때 사용하는 문법
- 각 DBMS의 명령문법을 표준화한것(?)
- SQL표준문법 외에도 DBMS마다 전용 문법이 있다.
    > 왜?
    > :: 각자 장단점이 있다.
    > :: DBMS만의 특별기능을 사용할 문법이 필요.

---

## 8/29
![](./img/fig4.PNG)
`<fig4>`

- SQL 명령 전달?
    > 서버에는 SQL 명령을 입력받는 UI가 없다.
    > 사용자가 입력한 SQL을 서버에게 전달해줄 App을 사용(Client)

1. 사용자 등록
    `create user '(name)'@'(localhost)' identified by '(password)';`
2. 데이터베이스 생성
    `create database (database name) character set (utf8) collate (utf8_general_ci);`
3. 사용자가 접근할 수 있는 데이터베이스 권한 부여
    `grant all on (studydb.*) to '(name)'@'(localhost)';`

- `desc studydb.test01;` : table정보 확인
- `use studydb;` : 사용할 database명(import와 동일기능)
- `show tables;` : table들 보여줌.(MariaDB용)
- `insert into test1(no, name) values (1, 'aaa');` : 데이터를 입력한다. 문자를 입력할 때 single quotation을 권고한다.

---

##### SQL
##### DDL (Data Definition Language)
    > 테이블, 뷰, 함수, 트리거 등을 생성, 변경, 삭제하는 SQL 명령
    1. 테이블 정의
        > create table studydb.test01 (
            name varchar(50) not null,
            kor int not null,
            eng int not null,
            math int not null,
            sum int not null,
            aver float not null);

    2. 테이블에 데이터 입력
        > insert into test1(no, name) values(1, 'aaa');

    3. 테이블에 들어있는 데이터 조회
        > select no, name from test1;

- table, row, column
    > row : 행, `record`, `tuple`
    > column : 열, `attribute`
    > table : `entity`

- numeric
    > 전체 자릿수와 소수점 이하의 자릿수를 정밀하게 지정할 수 있다.
    > numeric(n,e) : 전체 n 자릿수 중에서 소수점은 e 자릿수다.
        > 예) numeric(10,2) : 12345.1211 => 12345.12
    > numeric : numeric(10, 0) 과 같다.

- PK (primary key)
    - 테이블의 데이터를 구분할 때 사용하는 컬럼들이다.
    - 줄여서 PK라고 표시한다.
    - PK 컬럼을 지정하지 않으면 데이터가 중복될 수 있다.

- 인공키 (Artificial key)
    - 오로지 key로만 사용할 목적으로 만들어진 column

- 대안키 (Alternate key)
    - PK는 아니지만 PK처럼 중복되어서는 안되는 컬럼을 지정할 때 사용한다.
    - 대안키는 DBMS에서 unique 컬럼으로 지정한다.

## 8/30
- create view
    > 따로 table을 만드는 것이 아니다.
    > 단축키를 만드는 것이다.
    > 가상의 table처럼 작동해서 sql문을 줄일 수 있다.

---
- commit / rollback :: 트랜잭션을 다룬다.
    - insert, update, delete, ...
    - 이들을 한 단위로 묶어서 처리해야 하는 경우가 있다.
        > ex) 구매할 제품 inesert + 결제정보를 insert
    - 여러 개의 DML 작업을 한 단위로 묶는다.
    **"Transaction"이라 부른다.**
    - 그 단위에 묶인 작업이 모두 성공할 때만 업무가 완성된다.

---
- key - 데이터를 구분하는 식별자
![](./img/fig5.png)
`<fig5>`

---
##### DQL (Data Query Language)
>데이터 조회 언어 :: Query : 조회

---
- "Projection" : 결과로 추출할 컬럼을 지정
- "Selection" : 특정 조건의 데이터를 선택
    > ex) select no, name from teset1 where no > 10;
    - no, name :: projection 대상
    - where no > 10 :: selection 조건







---
##### DML (Data Manipulation Language)
> 데이터 조작 언어 :: DQL+DML 묶어서 DML이라고도 한다.
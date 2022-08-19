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
    > 연결을 끊을 때까지 나머지가 대기해야 하는 줄서기 방식
    > : 은행 업무
    > FTP, POP3, 채팅, 게임
- stateless 방식
    > [연결>>요청>>응답>>연결끊기]를 반복하는 방식
    > : 114, ARS 인증
    > HTTP
##### TCP 방식이 아닌 Connectionless 방식(= **UDP**)
    > : 편지, 방송
    > ping

## 8/1

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
## 1단계 람다
### 람다와 클로저
람다는 익명 함수의 다른 표현이다. 함수이지만 이름이 없는 경우를 의미한다
#### 람다 실습1 익명 클래스를 람다로 전환
- -> 스트림을 사용해도 되는데 왜 익명클래스를 사용하는가?
  - 일시적으로 한번만 사용되고 버려지는 객체 -> 코딩 전 클래스를 별도로 만들지 않고 단 한번의 쓰임을 다하고 소멸한다
-[x] MoveStrategy에 대한 람다를 적용한다 
  - [x] 이동 메서드(Test code)
  - [x] 정지 메서드(Test code)
#### 람다를 활용해 중복 제거
-[x] sumAll 메서드(Test code)
-[x] sumAllEven 메서드(Test code)
#### List에 담긴 값 중 3보다 큰 수만을 더해야 한다.
-[x] 요구사항 1,2와 많은 중복이 발생한다, 람다를 활용해 중복을 제거 한다.
#### 힌트
-[x] 변경되는 부분과 변경되지 않는 부분의 코드를 분리 
-[x] 변경되는 부분을 인터페이스로 추출
-[x] 인터페이스에 대한 구현체를 익명 클래스로 구현, 메소드의 인자로 전달
-[x] 구글에서 자바의 익명 클래스로 검색해 익명 클래스가 무엇인지 학습한다.

### 스트림
#### map, filter, reduce
- map, filter ,reduce 를 활용해 구현  한다.

#### map, filter, reduce 실습1
- List에 담긴 모든 숫자중 3보다 큰 숫자를 2배 한후 모든값의 합을 구한다
  -[ ] nextstep.fp.StreamStudyTest 클래스의 sumOverThreeAndDouble() 테스트를 pass해야 한
    다.
#### map, filter, reduce 실습2
- nextstep.fp.StreamStudy 클래스의 printLongestWordTop100() 메서드를 구현
  - 요구사항
  -[ ] 단어의 길이가 12자를 초과 단어 추출
  -[ ] 12자가 넘는 단어 중 길이가 긴 순서로 100개 추출
  -[ ] 단어 중복 허용X , 서로 다른 단어 100개 추출
  -[ ] 추출한 100개의 단어를 출력, 모든 단어는 소문자로 출력

#### 힌트
- 단어의 길이가 12자를 초과하는 단어를 추출 
- 12자가 넘는 단어중 길이가 긴 순서로 100개 단어를 추출 - sorted 사용
- 단어 중복을 허용하지 않는다. - dintinct 사용
- 추출한 100개의 단어를 출력 모든 단어는 소문자로 출력 String.toLowerCase 사용


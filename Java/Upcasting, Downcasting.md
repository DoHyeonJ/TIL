### 업캐스팅(Upcasting) \[ 서브 클래스 객체가 슈퍼 클래스 타입으로 변환되는 것.\]

: 부모 클래스 타입으로 자식 생성자를 호출하는 것.

\- 부모와 자식간의 공통 요소(재정의 메소드)만 사용 가능하며, 자식 클래스의 추가된 것들은 사용할 수 없다.

\- 부모 타입으로 선언 되었기 때문에 부모의 필드만 사용 가능하지만, 자식 클래스에서 재정의 했다면, 재정의 된 메소드로 사용된다.

ex)

```java
class Parents {
        public void Color() {
            System.out.print("빨간");
        }
        public void name() {
            Color();
            System.out.println("딸기");
        }
    }
    class Rose extends Parents{
        public void name() {
            Color();
            System.out.println("장미");
        }
    }
    public class Test {
        public static void main(String[] args) {
            Parents par;
            par = new Parents();
            par.name();
            par = new Rose();
            par.name();
        }
}

```

\> Parents 라는 부모 클래스의 Color 메소드를 통하여 

빨간딸기,빨간장미라는 문구를 출력할수있게된다.

( class Rose extends Parents 라는 부분은 부모의 클래스를 상속받은것으로 보면된다. )

### 다운캐스팅(Downcasting) \[ 슈퍼 클래스 객체가 서브 클래스 타입으로 변환되는 것.\]

: 자식 클래스 타입으로 부모 생성자를 호출하는 오류

\- 부모의 범위가 더 크기 때문에 자식에 담을 수 없다.

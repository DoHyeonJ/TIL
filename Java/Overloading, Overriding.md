### 오버로딩(Overloading) 

: 자바의 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메소드가 있더라도 매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드를 정의할 수 있다.

사용조건

: 메소드의 이름이 같고, 매개변수의 개수나 타입이 달라야 함.

ex)
```java
class OverloadingTest{
    void sum() {
        System.out.println("매개변수 없음");
    }
    void sum(int a,int b) {
        System.out.println(a+b);
    }
    //매개변수 int형 2개인 sum 메소드
    void sum(String c) {
        System.out.println(c);
    }
    //매개변수 String형 1개인 메소드
}
 
public class Main {
    
    public static void main(String[] args) {
        OverloadingTest olt = new OverloadingTest();
        
        olt.sum();
        //매개변수가 없는 sum 호출
        olt.sum(1,1);
        //매개변수가 int 형 2개인 sum 호출
        olt.sum("오버로딩");
        //매개변수가 String 형 1개인 sum 호출
        
    }
}

```

<결과>

매개변수 없음

2

오버로딩

#### \- 사용이유 -

같은 기능을 하는 메소드를 하나의 이름으로 사용할 수 있다.

: println이라는 메소드를 예로 들 수 있다.

println의 인자 값으로 int, double, String 등의 타입의 매개변수들을 집어 넣어 콘솔창에 출력을 한다.

'출력하다' 라는 기능을 가진 메소드들을 println 이라는 하나의 이름으로 정의가 가능한 것이다.

### 오버라이딩(Overriding)

: 부모 클래스로부터 상속받은 메소드를 자식 클래스에서 재정의 하는 것.

상속받은 메소드를 그대로 사용할 수도 잇지만, 자식 클래스에서 상황에 맞게 변경해야하는 경우 오버라이딩할 필요가 생김

사용조건

: 오버라이딩하고자 하는 메소드의 이름, 매개변수, 리턴 값이 모두 같아야 한다.

ex)

```java
package 함수2.형성평가02;
 
public class Main {
 
    public static void main(String[] args) {
        Apple ap = new Apple();
        Grape gp = new Grape();
        Banana bn = new Banana();
        
        ap.color();
        gp.color();
        bn.color();
    }
}
class Apple{
    void color() {
        System.out.println("red");
    }
}
class Grape extends Apple{
    @Override
    protected void color() {
        System.out.println("pupple");
    }
}
class Banana extends Apple{
    @Override
    public void color() {
        System.out.println("yellow");
    }
}

```

<결과>

red

pupple

yellow

\-오버라이딩 규칙-

1\. 자식 클래스에서 오버라이딩하는 메소드의 접근 제어자는 부모 클래스보다 더 좁게 설정할 수 없다.

: 위에서 볼 수 있듯이 부모클래스의 접근제어자는 default로 기본설정되어있다. 여기서 자식 클래스들은 default 보다 같거나 더 넓은 범위의 접근제어자만 설정할 수 있으므로, default, protected, public 세 개의 접근 제어자는 사용이 가능하다.

2\. 예외(Exception)는 부모 클래스의 메소드 보다 많이 선언할 수 없다.

: 부모 클래스에서 어떤 예외를 throws 한다고 하면, 자식 클래스에서는 그 예외보다 더 큰 범위의 예외를 throws할 수 없다는 것이다.

3\. static메소드를 인스턴스의 메소드로 또는 그 반대로 바꿀 수 없다.

: 부모 클래스의 static메소드를 자식에서 같은 이름으로 정의할 수 있지만, 이것은 다시 정의하는 것이 아니라 같은 이름의 static메소드를 새로 정의하는 것이다.

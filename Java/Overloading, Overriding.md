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

<table class="colorscripter-code-table" style="margin: 0; padding: 0; border: none; background-color: #272727; border-radius: 4px;" cellspacing="0" cellpadding="0"><tbody><tr><td style="padding: 6px; width: 30px;"><div style="margin: 0; padding: 0; word-break: normal; text-align: right; color: #aaa; font-family: Consolas,&nbsp;'Liberation&nbsp;Mono',&nbsp;Menlo,&nbsp;Courier,&nbsp;monospace&nbsp;!important; line-height: 130%;"><div style="line-height: 130%;">1</div><div style="line-height: 130%;">2</div><div style="line-height: 130%;">3</div><div style="line-height: 130%;">4</div><div style="line-height: 130%;">5</div><div style="line-height: 130%;">6</div><div style="line-height: 130%;">7</div><div style="line-height: 130%;">8</div><div style="line-height: 130%;">9</div><div style="line-height: 130%;">10</div><div style="line-height: 130%;">11</div><div style="line-height: 130%;">12</div><div style="line-height: 130%;">13</div><div style="line-height: 130%;">14</div><div style="line-height: 130%;">15</div><div style="line-height: 130%;">16</div><div style="line-height: 130%;">17</div><div style="line-height: 130%;">18</div><div style="line-height: 130%;">19</div><div style="line-height: 130%;">20</div><div style="line-height: 130%;">21</div><div style="line-height: 130%;">22</div><div style="line-height: 130%;">23</div><div style="line-height: 130%;">24</div><div style="line-height: 130%;">25</div><div style="line-height: 130%;">26</div><div style="line-height: 130%;">27</div><div style="line-height: 130%;">28</div><div style="line-height: 130%;">29</div><div style="line-height: 130%;">30</div><div style="line-height: 130%;">31</div></div></td><td style="text-align: left; width: 770px;"><div style="margin: 0; padding: 0; color: #f0f0f0; font-family: Consolas,&nbsp;'Liberation&nbsp;Mono',&nbsp;Menlo,&nbsp;Courier,&nbsp;monospace&nbsp;!important; line-height: 130%;"><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;"><span style="color: #ff3399;">package</span>&nbsp;함수2.형성평가02;</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;"><span style="color: #ff3399;">public</span>&nbsp;<span style="color: #ff3399;">class</span>&nbsp;Main&nbsp;{</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;<span style="color: #ff3399;">public</span>&nbsp;<span style="color: #ff3399;">static</span>&nbsp;<span style="color: #ff3399;">void</span>&nbsp;main(<span style="color: #4be6fa;">String</span>[]&nbsp;args)&nbsp;{</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Apple&nbsp;ap&nbsp;<span style="color: #0086b3;"></span><span style="color: #ff3399;">=</span>&nbsp;<span style="color: #ff3399;">new</span>&nbsp;Apple();</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Grape&nbsp;gp&nbsp;<span style="color: #0086b3;"></span><span style="color: #ff3399;">=</span>&nbsp;<span style="color: #ff3399;">new</span>&nbsp;Grape();</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Banana&nbsp;bn&nbsp;<span style="color: #0086b3;"></span><span style="color: #ff3399;">=</span>&nbsp;<span style="color: #ff3399;">new</span>&nbsp;Banana();</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="ap.color();" target="_blank" rel="noopener">ap.color();</a></div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="gp.color();" target="_blank" rel="noopener">gp.color();</a></div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="bn.color();" target="_blank" rel="noopener">bn.color();</a></div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;}</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">}</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;"><span style="color: #ff3399;">class</span>&nbsp;Apple{</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;<span style="color: #ff3399;">void</span>&nbsp;color()&nbsp;{</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style="color: #4be6fa;">System</span>.<span style="color: #4be6fa;">out</span>.<span style="color: #4be6fa;">println</span>(<span style="color: #ffd500;">"red"</span>);</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;}</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">}</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;"><span style="color: #ff3399;">class</span>&nbsp;Grape&nbsp;<span style="color: #ff3399;">extends</span>&nbsp;Apple{</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;@Override</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;<span style="color: #ff3399;">protected</span>&nbsp;<span style="color: #ff3399;">void</span>&nbsp;color()&nbsp;{</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style="color: #4be6fa;">System</span>.<span style="color: #4be6fa;">out</span>.<span style="color: #4be6fa;">println</span>(<span style="color: #ffd500;">"pupple"</span>);</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;}</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">}</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;"><span style="color: #ff3399;">class</span>&nbsp;Banana&nbsp;<span style="color: #ff3399;">extends</span>&nbsp;Apple{</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;@Override</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;<span style="color: #ff3399;">public</span>&nbsp;<span style="color: #ff3399;">void</span>&nbsp;color()&nbsp;{</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style="color: #4be6fa;">System</span>.<span style="color: #4be6fa;">out</span>.<span style="color: #4be6fa;">println</span>(<span style="color: #ffd500;">"yellow"</span>);</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">&nbsp;&nbsp;&nbsp;&nbsp;}</div><div style="padding: 0&nbsp;6px; white-space: pre; line-height: 130%;">}</div></div><div style="text-align: right; margin-top: -13px; margin-right: 5px; font-size: 9px; font-style: italic;">&nbsp;</div></td><td style="vertical-align: bottom; width: 10px;">&nbsp;</td></tr></tbody></table>

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

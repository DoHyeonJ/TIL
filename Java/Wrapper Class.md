# Wrapper 클래스
- 기본형 타입을 객체화 하도록 도와주는 클래스
- ( 클래스타입 -> Wrapper 클래스 )

---

## 박싱 ( Boxing ) : Wrapper 클래스 -> 기본형 타입
- 기본 타입의 데이터를 래퍼 클래스의 인스턴스로 변환하는 과정


## 언박싱 ( Unboxing ) : Wrapper 클래스 <- 기본형 타입
- 래퍼 클래스의 인스턴스에 저장된 값을 다시 기본 타입의 데이터로 꺼내는 과정


> JDK 1.5부터는 박싱과 언박싱이 필요한 상황에서 java 컴파일러가 이를 자동으로 처리해 준다.
> 이렇게 자동화된 박싱과 언박싱을 오토 박싱과 오토 언박싱이라고 부른다.

---

ex)
```java
public class Wrapper {
    public static void main(String[] args) {
        //jdk 1.5 버전 전에는 무조건 이렇게 사용해야 한다.
        String str = new String("1");
        
        //jdk 1.5 이후
        String str2 = "1";//오토박싱
        Integer data = 10;    //오토박싱
        int data2 = data; //오토언박싱
         
        System.out.println(str);
        
    }
}
```

### Wrapper 클래스 사용하는 이유
- 기본형 타입을 객체로 다뤄야 할 때,
- 매개변수를 객체로 넘길 때,
- 기본형 타입이 아닌 객체로 저장해야 할 때,
- 객체간의 비교가 필요할때

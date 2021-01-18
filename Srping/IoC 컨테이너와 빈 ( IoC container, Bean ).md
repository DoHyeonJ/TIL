※ 본 내용들은 인프런강좌 중 백기선님의 스프링 프레임워크 핵심 기술 강의 내용을 정리한 내용입니다. ※

---

## IoC ( Inversion of Control ) 컨테이너

-   의존 관계 주입( Dependency Injection ) 이라고도 하며, 어떤 객체가 사용하는 의존 객체를 직접 만들어 사용하는게 아니라, 주입 받아 사용하는 방법
-   BeanFactory \[ 최상위 인터페이스 \]
-   애플리케이션 컴포넌트의 중앙 저장소.
-   빈 설정 소스로 부터 빈 정의를 읽어들이고, 빈을 구성하고 제공한다.

---

## Bean

-   Spring IoC 컨테이너가 관리하는 객체
-   Bean 으로 등록되어야 의존성 주입이 가능하다.  
    
-   Bean 은 따로 설정을 하지 않으면 Default 값이 싱글톤 이다.
-   스코프는 싱글톤, 프로토타입으로 나눌수있는데 기본값이 싱글톤 이기때문에 성능 향상에 도움이된다.

<table style="border-collapse: collapse; width: 90.0009%; height: 164px;" border="1"><tbody><tr><td style="width: 17.9277%; text-align: center;">싱글톤</td><td style="width: 82.0723%; text-align: center;">하나의 Bean 정의에 대해서 Spring IoC 컨테이너 내에 단 하나의 객체만 존재하는것</td></tr><tr><td style="width: 17.9277%; text-align: center;">프로토타입</td><td style="width: 82.0723%; text-align: center;">하나의 Bean 정의에 대해서 다수의 객체가 존재할 수 있음</td></tr></tbody></table>

---

## 예제 

-   빈의 사용방법

```java
public class Account {

    private Long id;

    }
}
```

\- 위와 같은 클래스는 Bean 으로 사용이 불가하다.

```java
@Transactional
public interface AccountRepository extends JpaRepository<Account, Long>{

    Account findByEmail(String email);

}

```

\- 위와 같이 @Transactional 이라는 ( 또는 다른 ) 어노테이션이 사용된 클래스는 Bean 으로 사용이 가능하다.

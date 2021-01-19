※ 본 내용들은 인프런강좌 중 백기선님의 스프링 프레임워크 핵심 기술 강의 내용을 정리한 내용입니다. ※

---

## 스프링 IoC 컨테이너의 역할

-   빈 인스턴스 생성
-   의존 관계 설정
-   빈 제공

---

##  ApplicationContext 

-   ClassPathXmlApplicationContext (XML)
-   AnnotationConfigApplicationContext (Java)

\- 이전엔 xml에 빈 설정을 했다.

ex )

```java
<bean id = ...         
	  class = ...         
	  scope = ... />
```

\- 이러한 설정은 번거롭기 때문에 ComponentScan이라는것이 등장하였다.

---

## ComponentScan

-   대표적인 예로 @Service, @Repository가 존재한다.
-   두 개의 어노테이션은 @Component를 확장한 것이다.
-   @Configration을 사용하여 클래스 안에서 Bean을 등록할 수 있다. (유연하게 사용가능) 

ex) 

```java
@Configuration
public class test {
	@Bean
    pulic Test test() {
    	return new Test();
    }
}
```

-   설정법 
    -   XML 설정 \[ context:component-scan \]
    -   자바 설정 \[ @ComponentScan \]

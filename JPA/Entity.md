# Jpa Entity
- DB에서 영속적으로 저장된 테이터를 자바 객체로 매핑하여 '인스턴스 형태'로 존재하는 데이터를 말한다.

—-

사용예 )

```java
@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Admin {
@Id
public Long idx; //고유 id
@Column(unique = true)
private String id; // 관리자 id
@Column
private String pw; // 관리자 pw
@Column
private LocalDateTime joinAt; //가입일
}
```
—-

> Entity : Entity 클래스임을 설정해준다.<br>
Getter : Lombok 애노테이션, getter를 생성하여준다.<br>
Setter : Lombok 애노테이션, setter를 생성하여준다.<br>
EqualsAndHashCode : 자바 bean에서 동등성 비교를 위해 equals와 hashcode 메소드를 오버라이딩해서 사용하는데, 이를 자동으로 생성해준다.<br>
Builder : 엔티티 객체를 Builder로 이용한다.<br>
AllArgsConstructor : 클래스에 존재하는 모든 필드에 대한 생성자를 자동으로 생성해준다.<br>
NoArgsConstructor : 파라미터가 없는 생성자를 생성한다.<br>
Id : 기본키로 설정해준다.<br>
Column : 컬럼으로 설정하여 준다.<br>
unique = true : 해당 값을 유니크로 설정하여준다.<br>

—-

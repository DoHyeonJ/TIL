# HashMap
- Map 인터페이스의 한 종류로써 Key와 Value 값으로 데이터를 저장하는 형태 ( 검색에 용이하다. )

---

### 특징
- Key는 중복이 불가능하다.
[ 중복된 key값을 입력하게 될 경우 이전의 key값이 사라지고 최근입력된 key값으로 덮어씌어진다. ]
- Value는 중복이 가능하다.
- key와 value는 서로 hashtable을 거친다.
> key <-> | hashtable | <-> value
- Map자료구조는 순서를 따지지 않기 때문에 Set으로 묶은 후 Iterator를 통해 순서를 부여 받아서 나와야한다.

---

### ex)
```java
public class MapTest {
    public static void main(String[] args) {
        //과일
        HashMap<String, Integer> fruitMap = new HashMap<>();
 
        fruitMap.put("사과", 1000);
        fruitMap.put("배", 2000);
        fruitMap.put("자두", 3000);
        fruitMap.put("수박", 4000);
        
        System.out.println(fruitMap.get("자두")+"원");
        System.out.println(fruitMap.values()); 
 ```

 ### 코드실행결과
 - 3000원
 - [ 2000, 4000, 1000, 3000 ]

---

### 관련메서드
```
containsKey(Object key) : 키가 있는지 검사
containsValue(Object value) : 값이 있는지 검사
get(Object key) : 키 값을 주고 그 짝꿍인 값을  가져온다.
isEmpty() : 비어있는지 확인
keySet() : HashMap에 저장된 모든 키가 저장된 형태.(Set타입)
values() : HashMap에 저장된 모든 값이 저장된 형태.(Collection타입)
```

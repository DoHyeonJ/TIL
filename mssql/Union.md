# Union

- 여러개의 SQL문을 합쳐 하나의 SQL문으로 만들어주는 방법
  (두 개의 쿼리의 합집합을 만들어준다고 생각하면 됨)
  (두 쿼리의 중복값을 제거해서 보여줌)

- UnionAll은 중복된값도 전부다 보여준다.
---
## 주의점
> 칼럼명이 같아야함.
칼럼별 데이터타입이 같아야함.

---

ex)

### 두 개의 테이블 조회

```
SELECT * FROM EX_TABLE1
Union
SELECT * FROM EX_TABLE2
```

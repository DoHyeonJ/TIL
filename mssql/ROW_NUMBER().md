# ROW_NUMBER()
---

- 행의 순서를 표시할 수 있다.
- 그룹별로 순서를 정해야 하는 경우 유용하게 사용가능
- OVER, PARTITION BY, ORDER BY와 함께 사용
---

### 사용법 )

```mysql
ROW_NUMBER() OVER(ORDER BY 정렬 기준 컬럼 정렬방법) 별명
ROW_NUMBER() OVER(ORDER BY COLUMN_IDX DESC) RNUM
```
---

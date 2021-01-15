# with(nolock)
---
- mssql은 기본적으로 공유잠금이 걸린다.<br>
- DML 작업중인 ROW 또는 TABLE에 select를 하게된다면,DML작업이 끝아야 select를 할수있게 된다.<br>
- 이를 방지하기 위해 with(nolock)을 사용하여 DB 성능을 향상시킨다.<br> 
---
### 사용법
```mysql
select * from 테이블명 with(nolock)
```
---

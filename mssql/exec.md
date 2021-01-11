# exec
- 저장 프로시저를 실행하는 명령

---
### 사용법

- 리턴값이 없을 때
```mysql
--Exec [저장프로시저 이름]
--Exec [저장프로시저 이름] [매개변수1], [매개변수2],....
Exec TestSelect @temp
```
- 리턴값이 있을 때
```mysql
--Exec [값을 받을 변수] = [저장프로시저 이름] [매개변수1], [매개변수2],....
Declare @nTemp int
Exec @nTemp = TestSelect @temp
```

- 셀렉트(select) 값이 있을 때
```mysql
--임시테이블
Declare @tableTemp table
	( sTemp varchar(32))
Insert @tableTemp exec [저장프로시저 이름] [매개변수1],[매개변수2]
```
---

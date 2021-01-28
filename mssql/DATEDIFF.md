# DATADIFF

- 두 개의 날짜값의 차이를 int로 반환하는 mssql 내장함수

#### int형으로 반환하기 때문에 int 범위를 넘어서는 차이는 구하지못함
---
### 구분자의 종류

```
년도	year	yy,yyyy
분기	quarter	qq,q
월	month	mm,m
일	day	dd,d
주	week	wk
시간	hour	m
분	minute	mi,n
초	second	ss,s
밀리초	millisecond	ms
마이크로초	microsecond	mcs
나노초	nanosecond	ns
```
---
### 사용법
```mssql
SELECT DATEDIFF('구분자','Start_Date,'End_Date')
```

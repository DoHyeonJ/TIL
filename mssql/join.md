# join
#### : 두개이상의 테이블이나 데이터베이스를 연결하여 검색하는 방법
#### 보통 PK 또는 FK로 두 테이블을 연결한다.

## 1. INNER JOIN
- 기준테이블과 Join한 테이블의 중복된 값

> SELECT
테이블.칼럼,
테이블.칼럼
FROM 기준테이블
INNER JOIN 조인테이블 ON 기준테이블.키 = 조인테이블.키

> SELECT
A.EMAIL,
B.BIRTH
FROM TABLE A
INNER JOIN JOIN_TABLE B ON A.IDX = B.IDX

## 2. LEFT OUTER JOIN
- 기준테이블의 값 + 테이블과 기준테이블의 중복된 값 (왼쪽 테이블을 기준으로 JOIN)

> SELECT
테이블.칼럼,
테이블.칼럼
FROM 기준테이블
LEFT OUTER JOIN 조인테이블 ON 기준테이블.키 = 조인테이블.키

> SELECT
A.EMAIL,
B.BIRTH
FROM TABLE A
LEFT OUTER JOIN JOIN_TABLE B ON A.IDX = B.IDX

## 3. RIGHT OUTER JOIN
- LEFT OUTER JOIN과 반대개념이다.

> SELECT
테이블.칼럼,
테이블.칼럼
FROM 기준테이블
RIGHT OUTER JOIN 조인테이블 ON 기준테이블.키 = 조인테이블.키

> SELECT
A.EMAIL,
B.BIRTH
FROM TABLE A
RIGHT OUTER JOIN JOIN_TABLE B ON A.IDX = B.IDX

## 4. FULL OUTER JOIN
- 두 개의 테이블이 가지고있는 데이터를 모두 검색 

> SELECT
테이블.칼럼,
테이블.칼럼
FROM 기준테이블
FULL OUTER JOIN 조인테이블 ON 기준테이블.키 = 조인테이블.키

> SELECT
A.EMAIL,
B.BIRTH
FROM TABLE A
FULL OUTER JOIN JOIN_TABLE B ON A.IDX = B.IDX

## 5. CROSS JOIN
- 모든 경우의 수를 전부 표현해주는 방식

## 6. SELF JOIN
- 자기자신과 자기자신을 조인한다는 의미 
  ( 하나의 테이블을 여러번 복사해서 조인하는것. )

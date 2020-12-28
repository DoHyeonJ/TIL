# partition by
- 그룹 내 순위 및 그룹 별 집계를 구할 때 유용하게 사용가능

#### 사용법
>SELECT 순위함수() OVER(PARTITION BY 컬럼명 ORDER BY 컬럼명) FROM 테이블명
SELECT 집계함수() OVER(PARTITION BY 컬럼명) FROM 테이블명

#### 순위함수
>ROW_NUMBER
RANK
DENSE_RANK

집계함수

> SUM(합계)
AVG(평균)
MAX, MIN(최대, 최소)
COUNT(개수)

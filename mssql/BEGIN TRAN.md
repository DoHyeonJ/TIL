# BEGIN TRAN이란?

- MS-SQL은 default 값이 AUTO_COMMIT이다.
- BEGIN TRAN을 사용하면 트랜잭션을 걸어주어 실수로 잘못된 update, delete문을 실행했을때 rollback을 통하여 되돌릴 수 있다.

## 잘못된 쿼리문 실행시 ( ROLLBACK )
> BEGIN TRAN
UPDATE MEMBER SET 나이 = 10
--commit
--rollback

- 위의 쿼리문 수행시 MEMBER테이블에 있는 모든 컬럼의 이름이 변경된다.
- WHERE문을 사용하여 조건을 걸어줘야한다. 
- 위처럼 잘못된 쿼리문을 실행하였다면 rollback을 사용하여 원래상태로 돌린다.


## 쿼리문을 정상 실행시 ( COMMIT )
> BEGIN TRAN
UPDATE MEMBER SET 나이 = 10
WHERE 이름 = '홍길동'
--commit
--rollback

- 위의 쿼리문 처럼 WHERE(조건문)을 정확하게 걸어주어 제대로 된 쿼리문을 실행하였다면, commit을 이용하여 트랜잭션을 커밋해준다.

##### commit과 rollback을 위와같이 주석처리 한상태로 실행하면 실수를 할시 빠르게 rollback이 가능하다

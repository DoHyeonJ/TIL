# Procedure
- 어떠한 동작을 절차적 일괄처리 작업하는데 사용

- SQL Server에서 사용하는 프로그래밍 기능

- 모듈식 프로그래밍 가능

- 보안강화 (저장프로시저 마다의 권한할당 가능)

- 네트워크 전송량 감소 (긴 쿼리문장의 단순화)

### 사용법

> CREATE OR REPLACE PROCEDURE 프로시저명 IS<br>
[<br>
변수명 타입;<br>
변수명 타입;<br>
변수명 타입;<br>
...<br>
]<br>
BEGIN<br>
기능 구현;<br>
END;

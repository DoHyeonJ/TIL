# convert
> select convert( [포맷](길이), [날짜], [변환형식] )

#### : 날짜 변환에 유용함.
#### 부동 소수점 또는 숫자에서 정수로 변환할때, convert()함수는 결과를 자른다.
#### 다른 변환일 경우에는 반올림한다.

ex )
```
select convert(varchar, getdate(19), 120)
-- 결과 : 현재시간의 초단위까지 ( 2020-12-16 23:04:33 )

select convert(varchar, getdate(16), 120)
-- 결과 : 현재시간의 분단위까지 ( 2020-12-16 23:04 )

select convert(varchar, getdate(10), 120)
-- 결과 : 현재날짜까지 ( 2020-12-16 )
```

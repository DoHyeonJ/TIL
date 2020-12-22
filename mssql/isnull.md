# isnull
- 칼럼이 null값일 경우 다른값으로 대체할 수 있는 함수
#### 사용법
> isnull(Colum,0)
(isnull(@PARAMETER, '')='')

#### ex)
> SELECT ISNULL(ID,'default') AS ID FROM table
ID를 검색하여 null값이면, default로 검색하기

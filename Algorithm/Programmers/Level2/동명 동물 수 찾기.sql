-- where 라는 조건은 group by 를 하기 전의 결과를 기준으로 조건을 잡기 떄문에 
-- group by 사용시에는 having 을 사용하여 조건을 걸어줘야한다
SELECT name, count(animal_id) as count 
from animal_ins 
group by name 
having count(name) > 1
order by name

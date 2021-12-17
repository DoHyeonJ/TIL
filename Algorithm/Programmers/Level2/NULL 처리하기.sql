-- ifnull 사용하여 조건에 맞춰 출력
SELECT animal_type, 
        ifnull(name, 'No name'), 
        sex_upon_intake
from animal_ins 
order by animal_id

-- in 절로 조건으로 주어진 이름이 포함된 놈들 전부 출력한다
select animal_id, 
        name,
        sex_upon_intake
from animal_ins 
where name in
('lucy', 'ella', 'pickle', 'rogan', 'sabrina', 'mitty')
order by animal_id

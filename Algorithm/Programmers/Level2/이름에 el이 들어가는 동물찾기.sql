-- like절 사용하여 검색한다
SELECT animal_id, 
        name
from animal_ins 
where name like '%el%' and animal_type = 'Dog' 
order by name

select e1.name
from Employee e
join Employee e1
on e.managerId = e1.id
group by e1.name,e1.id
having count(*)>=5


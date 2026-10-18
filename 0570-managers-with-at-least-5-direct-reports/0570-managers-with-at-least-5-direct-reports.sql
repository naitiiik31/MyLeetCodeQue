# Write your MySQL query statement below
select e1.name from employee e1 join employee e2 on e1.id=e2.managerId where e2.managerId is not null group by e2.managerId having count(*)>=5;
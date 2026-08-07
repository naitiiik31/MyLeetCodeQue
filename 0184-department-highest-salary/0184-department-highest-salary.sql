# Write your MySQL query statement below
select department,employee,salary from (
    select d.name as department,e.name as employee,e.salary as salary,rank() over(partition by e.departmentId  order by e.salary desc) as rnk 
    from employee e join Department d on e.departmentId =d.id
) s where rnk=1;
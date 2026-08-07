# Write your MySQL query statement below
select department,employee,salary from(
    select d.name as department,e.name as Employee,e.salary,DENSE_RANK() 
    over(
        Partition by e.departmentID ORDER by e.salary desc
    ) as rnk from employee e join department d on e.departmentId =d.id
)k where rnk<=3;
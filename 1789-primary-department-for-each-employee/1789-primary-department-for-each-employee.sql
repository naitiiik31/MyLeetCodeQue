# Write your MySQL query statement below
select employee_id,department_id from(
    select employee_id,department_id,primary_flag,COUNT(*) OVER(PARTITION BY employee_id) rnk from employee
)rn where rnk = 1 OR primary_flag = 'Y';
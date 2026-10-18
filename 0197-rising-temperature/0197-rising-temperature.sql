# Write your MySQL query statement below
select t.id from Weather t cross join Weather y where datediff(t.recordDate,y.recordDate)=1 And t.temperature>y.temperature;
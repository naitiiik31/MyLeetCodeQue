# Write your MySQL query statement below
select *,CASE
    WHEN 
        x+y>z 
        AND y+z>x 
        AND x+z>y
    THEN "Yes"
    else "No"
    end as triangle from triangle;
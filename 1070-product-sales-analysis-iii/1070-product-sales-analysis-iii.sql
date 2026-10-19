# Write your MySQL query statement below
select product_id,first_year,Quantity,Price from (
    select product_id,year as first_year,quantity,price,DENSE_RANK() OVER(PARTITION BY product_id order by year) as rnk from sales 
)rn where rnk=1;
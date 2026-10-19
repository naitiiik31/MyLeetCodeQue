# Write your MySQL query statement below
select c.customer_id from customer c  group by c.customer_id having COUNT(DISTINCT c.product_key)= (
    SELECT COUNT(DISTINCT product_key) FROM product
);
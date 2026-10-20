# Write your MySQL query statement below
select user_id,name,mail from users where binary mail like '%@leetcode.com' and mail REGEXP '^[a-zA-Z][0-9a-zA-Z_.-]*@leetcode\\.com$';
# Write your MySQL query statement below

select query_name,
round(avg(rating/position),2) as quality,
round(sum(rating<3)*100/(count(query_name)),2) as poor_query_percentage
from Queries
where query_name is not null
group by query_name;
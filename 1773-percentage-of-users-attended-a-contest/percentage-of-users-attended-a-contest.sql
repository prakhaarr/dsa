# Write your MySQL query statement below

select r.contest_id, round(count(distinct r.user_id)/count(distinct u.user_id)*100,2) as percentage from Users u join Register r group by r.contest_id order by 2 desc, 1 asc;
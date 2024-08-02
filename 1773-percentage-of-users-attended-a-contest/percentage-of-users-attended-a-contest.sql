# Write your MySQL query statement below

SELECT contest_id, round(COUNT(r.user_id) * 100/(SELECT COUNT(user_id) FROM Users), 2) AS percentage
FROM Register r
GROUP BY contest_id
ORDER BY percentage DESC, contest_id ASC;
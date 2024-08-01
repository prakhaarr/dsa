# Write your MySQL query statement below

select p.project_id, round(avg(e.experience_years),2) as average_years from Project p
join Employee e where p.employee_id = e.employee_id
GROUP BY p.project_id order by project_id;
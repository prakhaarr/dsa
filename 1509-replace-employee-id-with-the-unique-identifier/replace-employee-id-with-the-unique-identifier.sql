# Write your MySQL query statement below

-- select unique_id,name from Employees m,EmployeeUNI n where m.id = n.id else null;

select eu.unique_id,e.name from Employees e left join EmployeeUNI eu on e.id = eu.id;
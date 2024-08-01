# Write your MySQL query statement below
#jisko bonus nahi mila and jisko 1000 se kam mila 


select e.name,b.bonus from Employee e left join Bonus b on e.empId = b.empId where b.bonus<1000  OR b.bonus IS NULL;
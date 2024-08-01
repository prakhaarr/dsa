# Write your MySQL query statement below

select s.student_id, s.student_name, b.subject_name, COUNT(e.subject_name) AS attended_exams from Students s cross join Subjects b left join Examinations e on s.student_id=e.student_id and e.subject_name = b.subject_name
GROUP BY s.student_id, s.student_name, b.subject_name
ORDER BY s.student_id, b.subject_name;
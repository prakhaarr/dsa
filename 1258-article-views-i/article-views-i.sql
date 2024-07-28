# Write your MySQL query statement below

-- select author_id from Views where author_id = viewer_id GROUP BY author_id as 'id';

select distinct author_id as id from Views where author_id = viewer_id order by id;
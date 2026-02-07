select
    s.student_id,
    s.student_name,
    sub.subject_name,
    Count(ex.subject_name) as attended_exams
from Students s
Cross Join Subjects sub
Left Join Examinations ex
on ex.student_id = s.student_id
and sub.subject_name = ex.subject_name
group by s.student_id,
    s.student_name,
    sub.subject_name
order by 
s.student_id,
sub.subject_name

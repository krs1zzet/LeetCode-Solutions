select 
    r.contest_id,
    ROUND(
        (COUNT(DISTINCT(r.user_id)) * 100.0 /
        (SELECT COUNT(*) from Users))
    ,2) as percentage
from Register r
group by contest_id
order by percentage desc,r.contest_id ASC
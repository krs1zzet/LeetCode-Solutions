select q.query_name,
Round(AVG(
    ((q.rating)*1.00/(q.position))
),2) as quality,
Round(AVG(
    CASE
        when q.rating < 3 then 100 else 0
    end
),2) as poor_query_percentage
from Queries q
group by q.query_name

select v.customer_id, Count(*) as count_no_trans
from Visits v
Left Join Transactions t
on t.visit_id = v.visit_id
where t.visit_id IS NULL
GROUP BY v.customer_id;


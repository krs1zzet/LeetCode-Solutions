select TO_CHAR(t.trans_date,'YYYY-MM') as month,
t.country,
COUNT(*) as trans_count,
SUM(
    CASE
    when t.state = 'approved' then 1 else 0
    END
) as approved_count,
SUM(t.amount) as trans_total_amount ,
SUM(
    case
    when t.state='approved' then t.amount else 0
    end
) as approved_total_amount

from Transactions t
group by TO_CHAR(t.trans_date, 'YYYY-MM'),
    t.country;
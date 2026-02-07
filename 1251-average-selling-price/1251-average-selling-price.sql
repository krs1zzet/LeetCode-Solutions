select p.product_id,
round(coalesce(
    sum(p.price * u.units)::numeric
    /
    sum(u.units),
    0
    ),
    2) as average_price
from Prices p 
left join UnitsSold u
on p.product_id = u.product_id
and p.start_date <= u.purchase_date and u.purchase_date <= p.end_date
group by p.product_id
order by p.product_id



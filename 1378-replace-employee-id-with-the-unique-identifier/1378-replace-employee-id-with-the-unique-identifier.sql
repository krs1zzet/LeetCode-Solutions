select eu.unique_id,e.name
from Employees e
Left Join EmployeeUNI eu
ON eu.id=e.id
SELECT `product_name`, `order_date`,
adddate(`order_date`, interval 3 day) as pay_due, 
adddate(`order_date`, interval 1 month) as deliver_due
FROM `orders`;

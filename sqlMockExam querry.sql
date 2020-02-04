/*1. Create a query to return all orders made by users with the first name of “Marion” */

SELECT o.ORDER_ID,o.USER_ID,o.STORE_ID FROM users u
JOIN orders o
ON u.USER_ID=o.USER_ID
WHERE u.FIRST_NAME='Marion';

/*2. Create a query to select all users that have not made an order */

SELECT u.USER_ID,u.FIRST_NAME,u.LAST_NAME,u.CITY FROM users u 
LEFT JOIN orders o
ON u.USER_ID=o.USER_ID
WHERE o.ORDER_ID IS  NULL;

SELECT * FROM users u
WHERE u.USER_ID NOT IN (SELECT USER_ID FROM orders o WHERE o.USER_ID);

/*3. Create a Query to select the names and prices of all items that have been part 
of 2 or more separate orders. */

SELECT NAME,PRICE from order_items ot
JOIN items i
ON ot.ITEM_ID=i.ITEM_ID
GROUP BY ot.ITEM_ID
HAVING COUNT(ot.ITEM_ID)>=2;

/*4. Create a query to return the Order Id, Item name, Item Price, and Quantity from 
orders made at stores in the city “New York”. Order by Order Id in ascending order. */

SELECT ot.ORDER_ID,i.NAME,i.PRICE,ot.QUANTITY FROM order_items ot
join items i  
ON i.ITEM_ID=ot.ITEM_ID 
JOIN orders o
ON ot.ORDER_ID=o.ORDER_ID
join users u
ON o.USER_ID=u.USER_ID
WHERE u.CITY='New York'
ORDER BY ot.ORDER_ID;

/*5. Your boss would like you to create a query that calculates the total revenue generated 
by each item. Revenue for an item can be found as (Item Price * Total Quantity Ordered).
 Please return the first column as ‘ITEM_NAME’ and the second column as ‘REVENUE’. */
 
 SELECT  i.NAME as ITEM_NAME,sum(i.PRICE* ot.QUANTITY) as REVENUE from items i
 join order_items ot
 on i.ITEM_ID=ot.ITEM_ID
 GROUP BY ITEM_NAME
 
 /* Create a query with the following output: 
 a. Column 1 - Store Name 
i. The name of each store 
b. Column 2 - Order Quantity
 i. The number of times an order has been made in this store 
 c. Column 3 - Sales Figure 
 i. If the store has been involved in more than 3 orders,  mark as ‘High’ 
ii. If the store has been involved in less than 3 orders but more than 1 order,  mark as ‘Medium’ 
iii. If the store has been involved with 1 or less orders, mark as ‘Low’ 
d. Should be ordered by the Order Quantity in Descending Order */

SELECT s.Name,COUNT(o.ORDER_ID) AS 'Order Quantity' , 
CASE 
    WHEN COUNT(o.ORDER_ID)>3 THEN 'High'
    WHEN COUNT(o.ORDER_ID)<=3 AND COUNT(o.ORDER_ID) >1 THEN 'Medium'
    ELSE 'Low'
    END AS 'Sales Figure'
FROM stores s
join orders o
on o.STORE_ID=s.STORE_ID
GROUP BY s.NAME
ORDER BY COUNT(o.ORDER_ID) desc;


 


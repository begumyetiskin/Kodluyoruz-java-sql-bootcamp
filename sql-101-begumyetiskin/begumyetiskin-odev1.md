## 1. Soru
SELECT  c.customer_id, c.first_name, c.last_name, p.payment_date
FROM payment AS p
INNER JOIN customer AS c 
ON c.customer_id = p.customer_id
WHERE p.payment_date >=' 2007-04-01'
ORDER BY p.payment_date ASC

## 2. Soru
SELECT f.title, f.release_year, c.name 
FROM category AS c
INNER JOIN film_category fc 
ON c.category_id = fc.category_id
INNER JOIN film AS f 
ON fc.film_id = f.film_id
WHERE c.name = 'Action' OR c.name = 'Animation';

## 3. Soru
SELECT  c.first_name, c.last_name, p.payment_date, age(NOW(), p.payment_date)
FROM payment AS p
INNER JOIN customer AS c
ON p.customer_id = c.customer_id
ORDER BY age(NOW(), p.payment_date) DESC 

## 4. Soru
SELECT *
FROM film AS f 
WHERE f.title SIMILAR TO '[P-Z]%'  AND f.film_id NOT IN (SELECT i.film_id FROM inventory AS i)

## 5. Soru
SELECT c.first_name, c.last_name, SUM(p.amount) ,c.customer_id
FROM customer AS c
INNER JOIN payment AS p 
ON c.customer_id = p.customer_id
WHERE c.first_name LIKE 'B%' 
GROUP BY c.first_name, c.last_name,c.customer_id
ORDER BY c.customer_id


-- 1)city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz 
--   LEFT JOIN sorgusunu yazınız.

-- 2)customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name 
--   isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.

-- 3)customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name 
--   isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.

-- 1)
SELECT country, city FROM city
LEFT JOIN country ON country.country_id = city.country_id;

-- 2)
SELECT payment_id, first_name, last_name FROM customer
RIGHT JOIN payment ON payment.customer_id = customer.customer_id; 

-- 3)
SELECT rental_id, first_name, last_name FROM rental
FULL JOIN customer ON rental.customer_id = customer.customer_id;
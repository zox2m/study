### 4장 연습문제

## 7
# 1.부속질의
select name
from customer
where address like '대한민국%' and
	name in(select name
		from customer
		where custid in (select custid from orders));

# 2.exists
select name
from customer c1
where address like '대한민국%' and
	exists (select name
			from customer
			where custid in (select custid from orders)
				and c1.name like name);


# 3.조인 
select c1.name
from customer c1, customer c2
where c1.name=c2.name
	and c1.address like '대한민국%'
    and c2.name in (select name
					from customer
					where custid in (select custid from orders));

## 주문한 적 없는 고객 질의 
# 1. 부속질의
SELECT name
FROM customer
WHERE address LIKE '대한민국%' AND
      custid NOT IN (
          SELECT custid
          FROM orders
      );
# 2. existx
SELECT name
FROM customer c1
WHERE address LIKE '대한민국%' AND
      NOT EXISTS (
          SELECT 1
          FROM orders
          WHERE custid = c1.custid
      );
# 3. 조인

SELECT c1.name
FROM customer c1
LEFT JOIN orders o ON c1.custid = o.custid
WHERE c1.address LIKE '대한민국%' AND o.custid IS NULL;


## 12
# 1. 
CREATE VIEW highorders(bookid, bookname, name, publisher, saleprice)
AS SELECT bk.bookid, bk.bookname, cs.name, bk.publisher, od.saleprice
from orders od, customer cs, book bk
where od.custid=cs.custid and od.bookid=bk.bookid and od.saleprice >= 20000;

select *
from highorders;

# 2
select bookname, name 
from highorders;

# 3
CREATE OR REPLACE VIEW highorders(bookid, bookname, name, publisher)
AS SELECT bk.bookid, bk.bookname, cs.name, bk.publisher
FROM orders od, customer cs, book bk
WHERE od.custid = cs.custid AND od.bookid = bk.bookid AND od.saleprice >= 20000;

select bookname, name 
from highorders;


## 14
# 1
CREATE VIEW vw_theater_customer(극장이름, 고객이름)
AS SELECT th.극장이름, cu.이름
FROM 극장 th, 예약 res, 고객 cu
WHERE th.극장번호 = res.극장번호 AND res.고객번호 = cu.고객번호;

# 2
CREATE VIEW vw_daehan_customer_count(날짜, 고객수)
AS SELECT res.날짜, COUNT(DISTINCT res.고객번호)
FROM 극장 th, 예약 res
WHERE th.극장번호 = res.극장번호 AND th.극장이름 LIKE '대한%'
GROUP BY res.날짜;

## 15
create view 극장예약(극장이름, 예약수)
as select a.극장이름, count(*)
	from 극장 a, 예약 b
    where a.극장번호=b.극장번호
    group by a.극장이름;
    
# 1
select * from 극장예약;

#2
select 예약수 
from 극장예약
where 극장이름='강남';

#3
select min(예약수) 
from 극장예약;

#4
select count(*)
from 극장예약;

#5
select 극장이름
from 극장예약
where 예약수 >100;

#6
select 극장이름
from 극장예약
order by 예약수;
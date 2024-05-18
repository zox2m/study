# [3-1] 
select bookname, price
from book;

# [3-2]
select bookid, bookname, publisher, price
from book;

# [3-3]
select publisher
from book;

select distinct publisher  -- 중복 없음
from book;

# [3-4]
select *
from book
where price < 20000;

# [3-5] 
select *
from book
where price between 10000 and 20000;

# [3-7] 축구의 역사 출판사 
SELECT bookname, publisher
FROM Book
WHERE bookname LIKE '축구의 역사';

# [3-8] . 축구가 포함되는 제목 
SELECT bookname, publisher
FROM Book
WHERE bookname LIKE '%축구%';

# [3-9] . 두번째에 구 
SELECT *
FROM Book
WHERE bookname LIKE '%_구%';

# [3-10]
SELECT *
FROM book
WHERE bookname LIKE '%축구%' AND price >= 20000;

#[3-11]
SELECT *
FROM book
WHERE publisher = '굿스포츠' OR publisher = '대한미디어';

#[3-12]
SELECT *
FROM book
order by bookname;

# [3-13]
SELECT *
FROM book
order by price, bookname; -- 가격순으로 검색하고, 가격이 같으면 이름으로.

# [3-14]
SELECT *
FROM book
order by price DESC, publisher ASC; -- 내림차순, 오름차순

#[3-15]-- 주문 테이블에서 총 판매액 
SELECT SUM(saleprice) 
FROM Orders; 

#[3-16] 
SELECT SUM(saleprice) as 총매출
FROM orders
where custid=2; -- 특정 고객이 주문한 도서의 총판매액 

# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 집계함수 
#[3-17]  집계함수
select sum(saleprice) as total,
	avg(saleprice) as avgerage,
    min(saleprice) as Minimum,
    max(saleprice) as Maxinum
from orders;

# [3-18]
select count(*)
from orders; 

#[3-19] *** 고객별로 *** 주문한 도서의 총 수량과 총 판매액을 구하시오. -> group by 로 묶는다 . 
select custid,
		COUNT(*) as 도서수량, 
		SUM(saleprice) as 총액
from orders
group by custid;

#[3-20]
select custid, count(*) as 도서수량
from orders
where salesprice >= 8000
group by custid
HAVING count(*) >=2; -- group by 절의 결과를 제한하는 역할을 하는 having . having 은 group과 세트!!! select 에 조건 달때는 where!! 

# sql 은 실행순서가 없는 비절차적 언어지만 내부적인 실행순서가 있음. 
select custid, count(*) as 도서수량 	-- 5
from orders							-- 1
where saleprice >= 8000				-- 2
group by custid						-- 3
HAVING count(*) > 1					-- 4
order by custid; 					-- 6

# ~~~~~~~~~~~~~~~~~~~~~~ 두개이상의 테이블 사용 

select *
from customer, orders; -- 카티션 프로덕트 된다
-- 이건 딱히 아무조건 없이, 진짜 조건만 맞춰서 나옴. 이런식으론 안씀. 별 쓸데가 없음 

#[3-21]
select *
from customer, orders 
where customer.custid= orders.custid; -- customer의 기본키와 orders의 외래키를 합쳤다!! 

#[3-22]
select *
from customer, orders
where customer.custid = orders.custid
order by customer.custid; -- customer.name 으로도 ㄱㄴ 

#[3-23]  21과 같지만 name과 saleprice만 보기로 한 것   
select name, saleprice
from customer, orders
where customer.custid = orders.custid; 

# (?) inner join(동등조인, equl조인)
select name, saleprice
from customer inner join orders
on customer.custid = orders.custid; 

#[3-24]
select name, sum(saleprice)
from customer, orders
where customer.custid = orders.custid
group by customer.name
order by customer.name ; -- name 말고 custid 로 통일해서 해도 됨

# 3-24를 inner 조인으로 바꿔보면 ?
select name, sum(saleprice)
from customer inner join orders
	on customer.custid = orders.custid
group by customer.name
order by customer.name ; -- order by 는 늘 마지막에. 나중에  

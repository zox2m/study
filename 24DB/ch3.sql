# [1]
# [1-1] 도서번호가 1인 도서의 이름 
select bookname
from book
where bookid=1;

# [1-2] 가격이 20000 원 이상인 도서의 이름 
select bookname
from book
where price >= 20000;

# [1-3] 박지성의 총 구매액 
select sum(saleprice) 
from orders
where custid = (
	select custid
    from customer
    where name = '박지성');
    
# [1-4] 박지성이 구매한 도서의 수 
select count(*) 
from orders
where custid = (
	select custid
    from customer
    where name = '박지성');


# [1-5] 박지성이 구매한 도서의 출판사 수 
select count(distinct publisher) -- publisher 속성 선택 
from book, customer, orders
where book.bookid=orders.bookid and orders.custid=customer.custid and customer.name = '박지성';

# [1-6] 박지성이 구매한 도서의 이름, 가격, 정가와 판매가의 차이 
select bookname, price, saleprice,price - saleprice '가격차이' 
from book, customer, orders
where book.bookid=orders.bookid and orders.custid=customer.custid and customer.name = '박지성';

# [1-7] 박지성이 구매하지 않은 도서의 이름 
select bookname
from book
where bookname not in ( 
	select bookname 
	from book, customer, orders
	where book.bookid=orders.bookid and orders.custid=customer.custid 
	and customer.name ='박지성'); 




select *
from book;

select *
from orders;

select *
from customer;

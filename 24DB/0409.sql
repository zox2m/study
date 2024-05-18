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

#[3-25]
select customer.name, book.bookname
from customer, orders, book
where customer.custid=orders.custid and orders.bookid=book.bookid;

#[3-26]
select customer.name, book.bookname # 무엇을 
from customer,orders,book # 사용할 테이블들
where customer.custid=orders.custid and orders.bookid=book.bookid and book.price=20000;
# 조건들 연결 

#[3-27]
select customer.name, saleprice # 고객의 이름과 판매가격을 구하시오 
from customer left outer join orders 
on customer.custid=orders.custid;
# 고객 테이블을 출력하는데, 주문이 없어도 고객은 있다면 출력한다.

#[3-28] 메인쿼리- 부속쿼리
select bookname 
from book
where price= ( select max(price)
				from book); -- 부속 쿼리도 질의문이므로 결과는 테이블로 나온다. 

#[3-29]
select name
from customer
where custid in (select custid from orders); # in 키워드를 많이 쓴다! 


#[3-30]
select name # 고객이름 가져오셈 
from customer	# 이 고객 아이디의... 
where custid in( select custid # 어떤 고객 아이디 가져오셈 
				from orders		# 책아이디 주문한 적 있는 고객의
				where bookid in ( select bookid # 대한미디어에서 출반된 책아이디 가져오셈
								from book
								where publisher='대한미디어')); -- 박지성 나옴 

#[3-31] 상관 부속질의
select b1.bookname
from book b1 -- book을 b1이라고 별칭을 줌 
where b1.price > (select avg(b2.price)
					from book b2 -- book을 b2라고 별칭을 줌 
					where b2.publisher=b1.publisher);
                    
                    
# Union  집합연산 
#[3-32]
select name
from customer
where address LIKE '대한민국%'
UNION
select name
from customer
where custid in (select custid from orders);

#[3-33] exist
select name, address
from customer cs
where EXISTS ( select *
			from orders od
            where cs.custid=od.custid);
            
            
#### -----------------데이터 정의어 
# create 문
-- 모든 테이블 가져오기
select table_name from infromation_schema.tables 
where table_schema = 'madangdb'; 


#[3-34] 제약사항 없이 테이블 생성
create table newbook(
bookid	integer,
bookname varchar(20),
publisher varchar(20),
price	integer); 

drop table newbook;

create table newbook(
bookid	integer,
bookname varchar(20),
publisher varchar(20),
price	integer,
primary key (bookid)); 
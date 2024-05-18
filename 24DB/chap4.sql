#### Chap4 
# [4-1] 
select abs(-78),abs(+78); 
-- 간단한 계산은 from절이 필요 없기도 하다 

# [4-2] round
select round(4.875,1);

# [4-3] 
select custid '고객변호', round(sum(saleprice)/count(*),-2) '평균금액'
from orders
group by custid; 

#### 문자함수들 
-- 두 문자열을 연결함
select concat('마당', '서점');

-- 대상 문자열을 모두 소문자로 변환함
select lower('MR.SCOTT');

-- 대상 문자열의 왼쪽부터 지정한 자릿수까지 지정한 문자로 채움
select lpad('Page 1', 10, '*');

-- 대상 문자열의 지정한 문자를 원하는 문자로 변경함
select replace('Jack & Jue', 'J', 'BL');

-- 대상 문자열의 오른쪽부터 지정한 자릿수까지 지정한 문자로 채움
select rpad('Abc', 5, '*');

-- 대상 문자열의 지정된 자리에서부터 지정된 길이만큼 잘라서 반환함
select substr('ABCDEFG', 3, 4);

-- 대상 문자열의 양쪽에서 지정된 문자를 삭제함(문자열만 넣으면 기본값으로 공백 제거)
select trim('=' from '==BROWNING==');
select trim('        ==BROWNING==          ');

-- 대상 문자열을 모두 대문자로 변환함
select upper('mr.scott');

-- 대상 알파벳 문자의 아스키코드 값을 반환함
select ascii('D');

-- 대상 문자열의 byte를 반환함(알파벳은 1byte, 한글은 3byte(UTF-8))
select length('CANDIDE');
select length('서주민');

-- 문자열의 문자 수를 반환함
select char_length('데이터'); -- 문자수는 알파벳도 한글도 다 한글로 카운트

select * from new_book;

# [4-4]  replace 문자열을 치화하는 함수
select bookid, replace(bookname,'야구','농구') bookname, publisher, price
from new_book;
#### select -from은 꼭 사용되어야한다 o,x 퀴즈
#### replace select하면 원래있던 테이블의 값이 치환된다 ox 퀴즈  

# [4-5] length() 바이트 수. char_length: 문자의 수  
select bookname '제목', char_length(bookname) '문자수',
length(bookname) '바이트수'
from new_book
where publisher='굿스포츠'; 
#### 공백은 얼마~ 이렇게 해서 몇 바이트 찍힐지 문제 등 ~ 

# [4-6]  substr 함수 : ㅌㄱ정 위치에서 시작하여 지정한 길이만큼의 문자열을 반환
select substr(name,1,1) '성', count(*) '인원'
from customer
group by substr(name,1,1);

# [4-7] 
select orderid '주문번호', orderdate '주문일', adddate(orderdate,interval 10 day) '확정'
from orders;
--
select adddate('2024-07-01',interval -5 day) 5일전,
		adddate('2024-07-01',interval 5 day) 5일후;
        
        
# [4-8]
select orderid '주문번호', date_format(orderdate, '%Y-%m-%d') '주문일',
		custid '고객번호', bookid '도서번호'
from orders
where orderdate=str_to_date('20240707','%Y%m%d');

###count 함수의 결과는 null이 아니라 0이된다. ox퀴즈 될듯

# [4-9]
select sysdate(),
date_format(sysdate(),'%Y/%m/%d %a %h:%i') 'SYSDATE_1';

# [4-10]
select name '이름', IFNULL(phone,'연락처없음') '전화번호'
from customer;

# [4-11]
set @seq:=0;

select (@seq:=@seq+1) '순번', custid,name,phone
from customer
where @seq <2; 
/* 변수 사용 가능! set으로 변수 선언, @붙여서 사용하면 됨.*/
/*이거 한번 실행하고나면 set다시 해줘야함 ㅋㅋㅋㅋ*/

# [4-12]
select orderid, saleprice
from orders
where saleprice <= (
	select avg(saleprice) 
	from orders);
                    
# [4-13]
select orderid, custid, saleprice
from orders od1
where saleprice > (
	select avg(saleprice) 
	from orders od2
    where od1.custid= od2.custid);
# [4-14]
select sum(saleprice) 'total'
from orders
where custid in ( select custid
	from customer
	where address like '%대한민국%');
    
# [4-15]
select orderid, saleprice
from orders
where saleprice > all(
select saleprice
from orders
where custid='3');

# [4-16]
select sum(saleprice) 'total'
from orders od
where exists (
select *
from customer cs
where address like '%대한민국%' and cs.custid=od.custid);

# [4-17]
select (select name
from customer cs
where cs.custid=od.custid) 'name', sum(saleprice) 'total'
from orders od
group by od.custid;

# [4-18]
alter table orders add bname varchar(40);
update orders
set bname=( select bookname
from book
where book.bookid=orders.bookid);

# [4-19]
select cs.name, sum(od.saleprice) 'total'
from ( select custid,name
from customer
where custid <= 2) cs,
orders od
where cs.custid=od.custid
group by cs.name;

# -------------- 수업 쨌음 ---

# 방법 1 쿼리 - 익스플레인 커렌트 스탯먼트
select *
from book
where publisher='대한미디어' and price >= 30000;

# 방법2 explain 붙이기
explain select *
from book
where publisher = '대한미디어' and price>= 30000;
-- mysql에서는 인덱스 여러개 걸었을 때 하나밖에 타지 않음 
-- 인덱스를 적절하게 걸어주지 않으면 데이터가 커졌을 때 트래픽이 튀거나 슬로우 퀴리 등 문제가 될 확률이 거의 100%

##### 3 뷰 ######################

# 뷰의 생성

# [4-20]
create view vw_customer
as select *
	from customer
	where address like '%대한민국%';

select *
from vw_customer;

# [4-21]
create view vw_orders(orderid, custid, name, bookid, bookname, saleprice, orderdate)
as select od.orderid,  od.custid, cs.name, od.bookid, bk.bookname, od.saleprice, od.orderdate
from orders od, customer cs, book bk
where od.custid=cs.custid and od.bookid=bk.bookid;

select *
from vw_orders;

# [4-22]
create or replace view vw_customer
as select custid, name, address
	from customer
	where address like '%영국%';

select *
from vw_customer;

# [4-23]
drop view vw_customer;

select *
from vw_customer;

### 4 인덱스 
# [4-24]
create index ix_book on book(bookname);
# [4-25]
create index ix_book2 on book(publisher,price);
# [4-26]
analyze table book;
# [4-27]
drop index ix_book on book;

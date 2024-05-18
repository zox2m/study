-- [3-34] 에서 기본키 지정한 테이블 생성 1
create table Newbook(
bookname varchar(20),
publisher varchar(20),
price integer,
primary key (bookname,publisher));

-- 테이블 삭제하는 코드. 이미 있다고 뜨니까 이거도 활용하세여 ㅋㅋ 
drop table newbook;

-- [3-34] 에서 기본키 지정한 테이블 생성 2. 더 복잡한 제약사항 
create table newbook(
bookname varchar(20) not null, -- null값 불가 
publisher varchar(20) unique, -- 같은 값 불가 
price integer default 10000 check(price >= 1000), -- price값 조건 
primary key (bookname,publisher));


-- [3-35]
create table newcustomer(
custid integer primary key,
name varchar(40),
address varchar(40),
phone varchar(30));

-- [3-36] 외래키 생성
create table neworders(
orderid integer,
custid integer not null,
bookid integer not null,
saleprice integer,
orderdate date,
primary key(orderid),
FOREIGN KEY(custid) references newcustomer(custid) on delete cascade); -- 외래키가 삭제될 때 어떻게 할 것인지.. 


-- [3-37] 칼럼 추가 
alter table newbook add isbon varchar(13); -- 새로 넣겠다 는 뜻 

desc newbook;

-- [3-38] 칼럼 수정 
alter table newbook modify isbn integer;

desc newbook;

-- [3-39] 칼럼 삭제 
alter table newbook drop column isbn;

/* 어라 이거 왜 안돼 */

-- [3-40] 북네임은 not null이다! 
alter table newbook modify bookname varchar(20) not null;

desc newbook;

-- [3-41] 북아이디를 기본키로 변경 
alter table newbook add primary key(bookid);

desc newbook;

-- [3-42] 테이블 삭제 
drop table newbook;

desc newbook;

#### [ 참고] 테이블 복사alter
-- 1. 테이블의 구조와 데이터를 함께 복사할 경우 
create table new_book( select * from book);
desc new_book;
desc book;
-- 기존 테이블에 PK 또는  Auto_Increment, Index 가 설정되어 있으면 설정은 복사가
alter table new_book add primary key(bookid);

-- 1.1 커스터머 테이블도 복사 
create table new_customer( select * from customer);
desc new_custoer;
alter table new_customer add primary key(custid);

-- 2. 테이블 구조만 복사
create table new_book_st1 like book;
desc new_book_st1;
select * from new_book_st1;
create table new_book_st2 like book;

-- 3. 테이블 데이터 복사 (전체 복사하거나 원하는 컬럼만 복사 ㄱㄴ )
-- 3.1 (전체 복사) 서브쿼리로 조회된 내용들을 새 테이블로 옮김
insert into new_bok_st1(select * from book); # 테이블 조작어에 해당됨 
select * from new_book_st1;

-- 3.2 (부분 복사) // 기존 테이블으 ㅣ원하는 컬럼만 새 테이블로 옮김
insert into new_book_st2(bookid, bookname) (select bookid, bookname from book);
select * from new_book_st2;



# 5 -------------------데이터 조작어 -삽입, 수정, 삭제 ----------------------

# [3-44] 온전한 값 삽입 
insert into new_book(bookid, bookname,publisher,price) -- 칼럼 순서, 양식 잘 맞출거면 이부분 필요없는데, 순서 바꾸거나 몇개만 넣을거면 명시해줘야함 
	values (11,'스포츠 의학','한솔의학서적',90000);

-- 속성 순서를 바꾼다면?
insert into new_book(bookid, bookname,price,publisher) 
	values (11,'스포츠 의학',90000,'한솔의학서적');
    
#[ 3-45] 일부 값 삽입 
insert into new_book(bookid, bookname, publisher)
	values (14, '스포츠의학','한솔의학서적');

select * from new_book;

select * from imported_book;

# 3-36] 대량 삽입 
insert into new_book(bookid, bookname, price, publisher)
select bookid, bookname, price, publisher
from imported_book;

select * from new_book;
# [3-45]
Insert into book(bookid,bookname,publisher)
values(14,'스포츠의학','한솔의학서적');

# [3-46]
insert into book(bookid, bookname, price, publisher)
select bookid, bookname, price, publisher
from imported_book;

-- 2 update
### 참고 safe updates  모드
-- update나 delete 중 에러 발생 가능
-- 이유: 실수를 방지하기 위해 (참조무결성을 해친다던지 )
-- 기본키 속성만 사용할 수 있게 안전 옵션을 걸어두었기 때문 ( 워크벤치의 디폴트임)
 
 # [3-47]
set SQL_SAFE_UPDATES=0; /* safe update 옵션 해제 */
update new_customer
set address='대한민국 부산'
where custid=5;

select * from new_customer;


# [3-48]
update new_book
set publisher = (select publisher
            from imported_book
			where bookid=21)
where bookid = 14;


-- 3. delete 
# [3-49]
set SQL_SAFE_UPDATES=0;
delete from new_book
where bookid=11;

select * from new_book;

delete from book
where bookid='12' or bookid='13';

delete from new_book;

# [3-50] orders 테이블에서 외래키로 참조 중 
delete from customer; -- 그냥 삭제하려고 하면 안됨 

delete from new_customer; -- 여기선 외래키 참조 안하므로 ㄱㄴ 


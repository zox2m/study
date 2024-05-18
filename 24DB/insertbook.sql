use madangdb;
delimiter // -- 구분자로 // 를 사용함
create procedure insertbook( -- 프로시저 이름 
	in mybookid 	integer, -- 입력 파라미터는 in 변수명 자료형
	in mybookname 	varchar(40),
    in mypublisher 	varchar(40),
    in myprice 		integer)

begin
	insert into book(bookid, bookname, publisher, price)
    values(mybookid,mybookname,mypublisher,myprice);
end;
//
delimiter ; 


-- insert book 테스트
call insertbook(13,'스포츠과학','마당과학서적',25000);
select * from book;
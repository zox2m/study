use madangdb;
delimiter //
create procedure BookInsertOrUpdate(
	mybookid integer,
    mybookname varchar(40),
    mypublisher varchar(40),
    myprice int)
begin
	declare mycount integer;
	select count(*) into mycount from book
		where bookname like mybookname;
	if mycount !=0 then
		set SQL_SAFE_UPDATES=0; /* 수정 삭제에 필요한 설정*/
        update book set price = myprice
			where bookname like mybookname;
	else
		insert into book(bookid,bookname,publisher,price)
			values(mybookid,mybookname, mypublisher,myprice);
	end if;
end;
// 
delimiter ;

-- bookinsert otr update 프로시저로 테스트
call bookinsertorupdate(15,'스포츠 즐거움','마당과학서적',25000);
select * from book;

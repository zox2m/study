# after insert book
delimiter //
create trigger afterInsertBook
	after insert on book for each row
begin
	declare average integer;
    insert into book_log
    values(new.bookid, new.bookname, new.publisher, new.price);
end;
//
delimiter ;

/* 확인 */
insert into book values(14,'스포츠 과학 1','이상미디어',25000);
select * from book where bookid=14;
select * from book_log where bookid_l = '14'; 

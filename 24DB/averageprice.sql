delimiter //
create procedure averageprice(
	out averageval integer)
begin
	select avg(price) into averageval -- 변수에 값을 저장
    from book where price is not null;
end;
//
delimiter ;

call averageprice(@myvalue);
select @myvalue;
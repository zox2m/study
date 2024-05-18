delimiter //
create procedure Interest()
begin
    declare myInterest Integer default 0.0;
    declare price integer;
    declare endOfRow boolean default false;
    declare interestCursor CURSOR for
        select saleprice from orders;
    declare continue handler
        for not found set endOfRow=TRUE;
    
    OPEN interestCursor;
    cursor_loop: loop
        fetch interestCursor into price;
        if endofrow then leave cursor_loop;
        end if;
        if price >= 30000 then
            set myInterest = myInterest + price *0.1;
        else set myInterest = myInterest + price * 0.05;
        end if;
    end loop cursor_loop;
    close interestcursor;
    select concat('전체 이익 금액=',myInterest);
end;
//
delimiter ;

/* 테스트*/
call Interest();
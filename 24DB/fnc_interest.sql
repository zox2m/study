delimiter //
create function fnc_interest(
	price integer) returns int
begin
	declare myinterest integer;
    -- 가격이 30000이상이면 10%, 미만이면 5%
    if price >= 30000 then set myinterest = price *0.1;
    else set myInterest = price * 0.05;
    end if;
    return myInterest;
end; //
delimiter ;

# error 1418 발생시
SET global log_bin_trust_function_creators=ON;

/* orders 테이블에서 각 주문에 대한 이익을 출력 */
select custid, orderid, saleprice, fnc_interest(saleprice) interest
from orders;
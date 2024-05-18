delimiter //
create procedure inTest( In mybookprice int)
begin 
	select mybookprice as '프로시저 시작시 값을 읽음';
    set mybookprice = 10000;
    select mybookprice as '값 변경됨 ';
end \\
delimiter ;

-- 테스트
set @test1 = 20000;
select @test1 as '넘긴 변수 값'; -- 20000
call inTest(@test1);
select @test1 as '프로시저 종료 후 변수값은?'; -- 20000 

-- -----------------------------------------------------
delimiter //
create procedure outTest( out mybookprice int)
begin 
	select mybookprice as '프로시저 시작시 값을 읽음';
    set mybookprice = 10000;
    select mybookprice as '값 변경됨 ';
end \\
delimiter ;

-- 테스트
set @test2 = 20000;
select @test2 as '넘긴 변수 값'; -- 20000
call outTest(@test2);
select @test2 as '프로시저 종료 후 변수값은?'; -- 20000 

-- ----------------------------------------------

delimiter //
create procedure inoutTest( Inout mybookprice int)
begin 
	select mybookprice as '프로시저 시작시 값을 읽음';
    set mybookprice = 10000;
    select mybookprice as '값 변경됨 ';
end \\
delimiter ;

-- 테스트
set @test3 = 20000;
select @test3 as '넘긴 변수 값'; -- 20000
call inoutTest(@test3);
select @test3 as '프로시저 종료 후 변수값은?'; -- 20000 
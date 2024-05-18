# 쿼리 하나 실행 ctrl + Enter
show databases; #database에 어떤 것들이 있는지 보여줌
create database testdb; #database를 생성
use testdb; -- database를 선택
create table test(id smallint, name varchar(20)); -- table을 생성
show tables; -- DB에 있는 테이블을 보여줌
desc test; -- tabtestle의 구조를 보여줌
INSERT INTO test (id, name) VALUES (1, 'Sample data'); -- 데이터 삽입
SELECT * FROM test; -- 테이블의 값을 조회
use mysql; -- MYSQL의 정보가 있는 mysql db를 선택
drop database testdb; -- database 삭제
select *from user; -- 사용자 계정들을 나열
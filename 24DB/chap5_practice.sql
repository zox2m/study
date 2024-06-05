-- 연습문제 프로시저 들 

-- 6-1
USE madangdb;
DELIMITER //

CREATE PROCEDURE InsertCustomer(
    IN myCustID INT,
    IN myName VARCHAR(40),
    IN myAddress VARCHAR(50),
    IN myPhone VARCHAR(20)
)
BEGIN
    INSERT INTO Customer(custid, name, address, phone)
    VALUES(myCustID, myName, myAddress, myPhone);
END;
//

DELIMITER ;

-- 잘못생성했을땐? 삭제! 
DROP PROCEDURE IF EXISTS InsertCustomer;

-- InsertCustomer 프로시저 테스트
CALL InsertCustomer(10, '홍길동', '서울시 강남구', '010-1234-5678');
SELECT * FROM Customer;


-- 6-2
USE madangdb;
DELIMITER //

CREATE PROCEDURE BookInsertOrUpdate(
    IN myBookID INT,
    IN myBookName VARCHAR(40),
    IN myPublisher VARCHAR(40),
    IN myPrice INT
)
BEGIN
    DECLARE myCount INT;
    SELECT COUNT(*) INTO myCount FROM Book
    WHERE BookName = myBookName;

    IF myCount != 0 THEN
        SET SQL_SAFE_UPDATES=0; /* 수정 삭제에 필요한 설정 */
        UPDATE Book 
        SET Price = myPrice
        WHERE BookName = myBookName AND Price < myPrice;
    ELSE
        INSERT INTO Book(BookID, BookName, Publisher, Price)
        VALUES(myBookID, myBookName, myPublisher, myPrice);
    END IF;
END;
//

DELIMITER ;

-- 잘못생성했을땐? 삭제! 
DROP PROCEDURE IF EXISTS BookInsertOrUpdate;

-- 수정된 BookInsertOrUpdate 프로시저 테스트
CALL BookInsertOrUpdate(16, '스포츠 과학의 즐거움', '마당과학서적', 30000);
SELECT * FROM Book;

-- 7-1 
USE madangdb;
DELIMITER //

CREATE PROCEDURE ShowBooksByIsamedia()
BEGIN
    SELECT bookname, price
    FROM book
    WHERE publisher = '이사미디어';
END;
//

DELIMITER ;

-- ShowBooksByIsamedia 프로시저 테스트
CALL ShowBooksByIsamedia();


-- 7-2
USE madangdb;
DELIMITER //

CREATE PROCEDURE ShowTotalSalesByPublisher()
BEGIN
    SELECT b.publisher, SUM(o.saleprice) AS total_sales
    FROM book b
    JOIN orders o ON b.bookid = o.bookid
    GROUP BY b.publisher;
END;
//

DELIMITER ;

-- ShowTotalSalesByPublisher 프로시저 테스트
CALL ShowTotalSalesByPublisher();


-- 7-3
USE madangdb;
DELIMITER //

CREATE PROCEDURE ShowBooksAboveAveragePrice()
BEGIN
    SELECT b.publisher, b.bookname, b.price
    FROM book b
    JOIN (
        SELECT publisher, AVG(price) AS avg_price
        FROM book
        GROUP BY publisher
    ) AS avg_prices ON b.publisher = avg_prices.publisher
    WHERE b.price > avg_prices.avg_price;
END;
//

DELIMITER ;

-- ShowBooksAboveAveragePrice 프로시저 테스트
CALL ShowBooksAboveAveragePrice();

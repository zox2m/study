# mySQL 디비에 접속하는 모듈 
import pymysql

#데이터베이스 접속 관련 변수 초기화
host="localhost"
port = 3306
database="madangdb"
username="madang"
password="madang"

# 접속 상태 확인
conflag=True

try:
    print('데이터베이스 연결 준비..')
    conn = pymysql.connect(host=host,user=username,passwd=password,db=database, port=port, charset='utf8')
    print('디비 연결 성공')
except Exception as e:
    print('디비 연결 실패')
    print(e)
    conflag=False

# 접속 성공하면 실행
if conflag == True:
    cursor = conn.cursor() # 커서 생성

    sqlstring = 'select * from book;' # sql 문장 준비

    res = cursor.execute(sqlstring) # sql 문장 실행
    
    data = cursor.fetchall() # 쿼리 데이터를 가져옴 - 투플형태

    # 화면에 출력
    print('{0}\t{1:<}\t{2:<}\t{3:<}'.format('book no','book name', 'publisher','price'))

    for rowdata in data:
        print('{0}\t{1:<}\t{2:<}\t{3:<}'.format(rowdata[0], rowdata[1],rowdata[2], rowdata[3]))

    cursor.close() # 커서 닫음

    conn.close() # db 연결 닫음 
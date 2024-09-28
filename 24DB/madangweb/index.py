# Flask웹프레임워크, 템플릿렌더링을 위한 함수들 import
from flask import Flask, render_template,request
import pymysql

#변수 app에 Flask()인스턴스를 넘겨서 전역변수 인스턴스를 사용하도록 함
# Flask 애플리케이션을 생성
app = Flask(__name__)

db = pymysql.connect(host="localhost", user="lego",
                     passwd="lego", db="team_todo", charset="utf8")
cur = db.cursor() #데이터베이스 커서 생성

# @ decorator: 함수나 클래스의 동작을 변경하거나 확장(추가작업 가능하도록)
# Flask 애플리케이션에서 제공하는 route() 함수를 호출하여 '/' 경로에 대한 요청을 처리하는 함수로 지정
# app 객체의 route 함수에 request 인자를 넘겨서 http 요청(웹)을 처리
#  ‘/’은 접속 url로 주소 뒤 별도의 url이 없는 기본 웹 진입점
@app.route('/')

# 데이터베이스에서 모든 book 정보를 조회하여 가져와서 템플릿 파일에 전달
def index():
    sqlstring = "SELECT * FROM Book" #SQL 문장 준비
    cur.execute(sqlstring) #커서를 이용해 SQL 문장실행

    book_list = cur.fetchall()  #쿼리 결과 집합의 모든 행(데이터)를 가져옴

    # 템플릿 파일을 렌더링하고, 책 목록을 템플릿에 전달
    return render_template('booklist.html', book_list=book_list)

@app.route('/view')  # '/view' 경로에 대한 요청을 처리

# URL 매개변수로부터 책의 ID를 가져와서 해당 책의 정보를 데이터베이스에서 조회
def getTicket():
   id=request.args.get('id')
   sqlstring = "SELECT * FROM BOOK WHERE bookid='"+id+"'"
   cur.execute(sqlstring)

   book = cur.fetchall()

   # 템플릿 파일을 렌더링하고, 조회된 book 정보를 템플릿에 전달
   return render_template('bookview.html', book=book)

# 현재 파일이 메인으로 실행되는 경우에만 Flask 애플리케이션을 실행
if __name__ == '__main__':
    app.run('0.0.0.0')  #웹 서버 시작
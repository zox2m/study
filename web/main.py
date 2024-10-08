from flask import Flask, render_template, request, redirect, url_for, flash
import pymysql

app = Flask(__name__)
app.secret_key = 'supersecretkey'  # 이 값을 고유하고 비밀스럽게 설정하세요

db = pymysql.connect(host="localhost", user="lego",
                     passwd="lego", db="team_todo", charset="utf8")
cur = db.cursor() #데이터베이스 커서 생성

'''
# MySQL configurations
app.config['MYSQL_HOST'] = 'localhost'
app.config['MYSQL_USER'] = 'lego'  # MySQL 사용자 이름으로 변경하세요
app.config['MYSQL_PASSWORD'] = 'lego'  # MySQL 비밀번호로 변경하세요
app.config['MYSQL_DB'] = 'team_todo'
app.config['MYSQL_CURSORCLASS'] = 'DictCursor'
'''


@app.route('/')
def home():
    return render_template('login.html')

@app.route('/login', methods=['GET', 'POST'])
def login():    
    if request.method == 'POST':
        username = request.form['username']
        password = request.form['password']

        # 사용자 정보 조회 
        cur.execute("SELECT * FROM users WHERE username=%s", (username,))
        user = cur.fetchone()

        # cur.close()

        if user and password == user[2]:  # 인덱스 2는 password 컬럼
            return redirect(url_for('dashboard'))
        else:
            return redirect(url_for('home'))

    return render_template('login.html')


@app.route('/dashboard')
def dashboard():
    return render_template('dashboard.html')

@app.route('/edit_profile')
def edit_profile():
    return render_template('edit_profile.html')

@app.route('/signup')
def signup():
    return render_template('signup.html')


if __name__ == '__main__':
    app.run(debug=True)
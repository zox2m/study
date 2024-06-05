from flask import Flask, render_template, request, redirect, url_for, flash
import pymysql

app = Flask(__name__)

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

@app.route('/')
def home():
    return redirect(url_for('index'))

@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        username = request.form['username']
        password = request.form['password'].encode('utf-8')

        
        cur.execute("SELECT * FROM users WHERE username=%s", (username,))
        user = cur.fetchone()
        cur.close()

        if user and bcrypt.checkpw(password, user['password'].encode('utf-8')):
            flash("Welcome to TeamToDo!", "success")
            return redirect(url_for('index'))
        else:
            flash("Invalid username or password", "danger")

    return render_template('index.html')

@app.route('/index')
def index():
    return render_template('index.html')

if __name__ == '__main__':
    app.run(debug=True)

from flask import Flask, request, jsonify

app = Flask(__name__)

# 기본 경로로 POST 요청을 받으면 응답하는 API
@app.route('/api', methods=['POST'])
def text_response():
    data = request.json
    received_text = data.get('text', '')  # 요청으로부터 'text' 데이터를 가져옴
    response_text = f"Received: {received_text}"  # 받은 텍스트에 응답을 만들어줌
    return jsonify({'response': response_text})  # JSON 형태로 응답

if __name__ == '__main__':
    app.run(debug=True)

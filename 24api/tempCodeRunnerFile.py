import requests

url = 'http://127.0.0.1:5000/api'
data = {'text': 'Hello API'}

response = requests.post(url, json=data)
print(response.json())
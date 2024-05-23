function order() {
    // 각 품목의 수량을 가져옵니다
    var jajangQty = parseInt(document.getElementById('jajang').value) || 0;
    var bobQty = parseInt(document.getElementById('bob').value) || 0;
    var tangQty = parseInt(document.getElementById('tang').value) || 0;
    var gunQty = parseInt(document.getElementById('gun').value) || 0;
    var address = document.getElementById('address').value;

    // 주소가 입력되지 않았으면 경고 메시지를 표시합니다
    if (!address) {
        alert('주소를 입력해주세요.');
        return; // 함수를 끝낸다 
    }

    // 주소가 입력되었으면 감사 메시지를 표시합니다
    alert('주문해 주셔서 감사합니다!');

    // 각 품목의 가격을 정의합니다
    var jajangPrice = 5000;
    var bobPrice = 6000;
    var tangPrice = 10000;
    var gunPrice = 5000;

    // 총 가격을 계산합니다
    var totalPrice = (jajangQty * jajangPrice) + (bobQty * bobPrice) + (tangQty * tangPrice) + (gunQty * gunPrice);

    // 현재 날짜와 시간을 가져옵니다
    var now = new Date();
    var date = now.toLocaleDateString();
    var time = now.toLocaleTimeString();

    // 주문 정보를 결과 섹션에 표시합니다
    document.getElementById('date').innerText = date;
    document.getElementById('time').innerText = time;
    document.getElementById('destination').innerText = address;
    document.getElementById('price').innerText = totalPrice + '원';
    document.getElementById('totalJajang').innerText = '자장면: ' + jajangQty + '개';
    document.getElementById('totalBob').innerText = '볶음밥: ' + bobQty + '개';
    document.getElementById('totalTang').innerText = '탕수육: ' + tangQty + '개';
    document.getElementById('totalGun').innerText = '군만두: ' + gunQty + '개';
}

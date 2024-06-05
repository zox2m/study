// ------------- Condition #1 

// 로그인 가능한 계정 (아이디, 패드워드) 선언
var users = [
    {id: 'sin', password: 111},
    {id: 'seo', password: 111},
    {id: 'moon', password: 111}
];

function getLogin() {
    // main.html 에서 입력 받은 id 및 password 를 변수에 저장
    var id = document.querySelector('#id');
    var pw = document.querySelector('#password');

    // ------------- Condition #2
    // 유저 목록 순회 
    for (let i = 0; i < users.length; i++) {
        // id가 존재하는 지 확인 
        if (id.value === users[i].id) {
            // pw가 일치하는 지 확인 
            if (parseInt(pw.value) === users[i].password) {
                // 로그인 성공 시 리디렉션
                
                window.location.href = '../index.html';
                alert("welcome to team todo!");
                return;
            } else {
                // 비번 틀림 
                alert("wrong password!");
                return;
            }
        }
    }
    // id 존재 x 
    alert("check your ID again!");
}

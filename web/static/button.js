var id = document.getElementById("id");
var password = document.getElementById("password");
var login = document.getElementById("login");
password.addEventListener("keyup", checkButton);
id.addEventListener("keyup", checkButton);

// 비밀번호 토글 기능 추가
document.querySelectorAll('.password-toggle').forEach(toggle => {
    toggle.addEventListener('click', function() {
        const passwordInput = this.previousElementSibling;
        if (passwordInput.type === 'password') {
            passwordInput.type = 'text';
        } else {
            passwordInput.type = 'password';
        }
    });
});

/*
document.querySelectorAll('.password-toggle').forEach(toggle => {
    toggle.addEventListener('click', function() {
        const passwordInput = this.previousElementSibling;
        if (passwordInput.type === 'password') {
            passwordInput.type = 'text';
        } else {
            passwordInput.type = 'password';
        }
    });
});

*/

// 로그인 버튼 
function checkButton() {
  id.value.length > 0 && password.value.length > 0
    ? (login.disabled = false)
    : (login.disabled = true);
}

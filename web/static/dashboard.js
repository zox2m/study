document.addEventListener("DOMContentLoaded", function () {
const teamMembers = document.querySelectorAll(".team-member-item");
const userProfile = document.getElementById("user-profile");

const userInfo = JSON.parse(localStorage.getItem("userInfo"));

if (userInfo) {
    document.getElementById("profile-name").textContent = userInfo.name;
    document.getElementById("profile-position").textContent = `${userInfo.affiliation} / ${userInfo.position}`;
}

// 기본 설정: 로그인한 유저의 프로필 보이게 설정
userProfile.style.display = "flex";

teamMembers.forEach(function (member) {
    member.addEventListener("click", function () {
    const team = this.getAttribute("data-team");
    if (team === userInfo.position.toLowerCase()) {
        userProfile.style.display = "flex";
    } else {
        userProfile.style.display = "none";
    }
    });
});

// 오늘 날짜 배경색 변경
const today = new Date();
let currentMonth = today.getMonth();
let currentYear = today.getFullYear();

function generateCalendar(month, year) {
    const calendar = document.querySelector("#calendar tbody");
    calendar.innerHTML = "";
    const monthAndYear = document.getElementById("calendar-month");
    const firstDay = new Date(year, month).getDay();
    const daysInMonth = 32 - new Date(year, month, 32).getDate();
    const months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
    monthAndYear.textContent = `${months[month]} ${year}`;

    let date = 1;
    for (let i = 0; i < 6; i++) {
    const row = document.createElement("tr");
    for (let j = 0; j < 7; j++) {
        if (i === 0 && j < firstDay) {
        const cell = document.createElement("td");
        row.appendChild(cell);
        } else if (date > daysInMonth) {
        break;
        } else {
        const cell = document.createElement("td");
        cell.textContent = date;
        if (date === today.getDate() && year === today.getFullYear() && month === today.getMonth()) {
            cell.style.backgroundColor = "#C6E4FF";
        }
        row.appendChild(cell);
        date++;
        }
    }
    calendar.appendChild(row);
    }
}

document.querySelector(".prev-month").addEventListener("click", function () {
    currentMonth = (currentMonth === 0) ? 11 : currentMonth - 1;
    currentYear = (currentMonth === 11) ? currentYear - 1 : currentYear;
    generateCalendar(currentMonth, currentYear);
});

document.querySelector(".next-month").addEventListener("click", function () {
    currentMonth = (currentMonth === 11) ? 0 : currentMonth + 1;
    currentYear = (currentMonth === 0) ? currentYear + 1 : currentYear;
    generateCalendar(currentMonth, currentYear);
});

generateCalendar(currentMonth, currentYear);

const todoList = document.getElementById("todo-list");
const addTodoButton = document.querySelector(".add-todo-button");
const todoDropdown = document.querySelector(".todo-dropdown");
const todoInput = document.getElementById("todo-input");
const noticeList = document.getElementById("notice-list");

// 저장된 투두리스트 불러오기
const savedTodoList = JSON.parse(localStorage.getItem("todoList")) || [];
const savedNoticeList = JSON.parse(localStorage.getItem("noticeList")) || [];

function renderTodoList() {
    todoList.innerHTML = "";
    savedTodoList.forEach(item => {
    const li = document.createElement("li");
    const content = document.createElement("span");
    content.classList.add("content");

    if (item.type === "task") {
        const checkbox = document.createElement("input");
        checkbox.type = "checkbox";
        checkbox.classList.add("task-checkbox");
        if (item.completed) {
        checkbox.checked = true;
        }
        content.appendChild(checkbox);
        const textNode = document.createTextNode(` ${item.text}`);
        content.appendChild(textNode);
    } else if (item.type === "title") {
        content.classList.add("bold");
        content.textContent = item.text;
    }

    li.appendChild(content);
    const dragHandleButton = document.createElement("button");
    dragHandleButton.classList.add("drag-handle");
    dragHandleButton.innerHTML = "☰";
    li.appendChild(dragHandleButton);

    todoList.appendChild(li);
    });
}

function renderNoticeList() {
    noticeList.innerHTML = "";
    savedNoticeList.forEach(notice => {
    const noticeElement = document.createElement("p");
    noticeElement.textContent = notice;
    noticeList.appendChild(noticeElement);
    });
}

renderTodoList();
renderNoticeList();

addTodoButton.addEventListener("click", function () {
    const selectedOption = todoDropdown.value;
    const todoText = todoInput.value.trim();
    if (todoText === "") return;

    const li = document.createElement("li");
    const content = document.createElement("span");
    content.classList.add("content");

    if (selectedOption === "task") {
    const checkbox = document.createElement("input");
    checkbox.type = "checkbox";
    checkbox.classList.add("task-checkbox");
    content.appendChild(checkbox);
    const textNode = document.createTextNode(` ${todoText}`);
    content.appendChild(textNode);

    const notice = document.createElement("p");
    notice.textContent = `${userInfo.name} 님이 ToDo를 생성하였습니다.`;
    noticeList.appendChild(notice);

    savedNoticeList.push(notice.textContent);
    savedTodoList.push({ type: "task", text: todoText, completed: false });
    } else if (selectedOption === "title") {
    content.classList.add("bold");
    content.textContent = todoText;

    const notice = document.createElement("p");
    notice.textContent = `${userInfo.name} 님이 Goal을 생성하였습니다.`;
    noticeList.appendChild(notice);

    savedNoticeList.push(notice.textContent);
    savedTodoList.push({ type: "title", text: todoText });
    }

    li.appendChild(content);
    const dragHandleButton = document.createElement("button");
    dragHandleButton.classList.add("drag-handle");
    dragHandleButton.innerHTML = "☰";
    li.appendChild(dragHandleButton);

    todoList.appendChild(li);

    // LocalStorage에 저장
    localStorage.setItem("todoList", JSON.stringify(savedTodoList));
    localStorage.setItem("noticeList", JSON.stringify(savedNoticeList));

    todoInput.value = ""; // 입력 필드 초기화
});

new Sortable(todoList, {
    handle: ".drag-handle",
    animation: 150,
    onEnd: function () {
    const updatedTodoList = [];
    todoList.querySelectorAll("li").forEach(li => {
        const content = li.querySelector(".content");
        if (content.classList.contains("bold")) {
        updatedTodoList.push({ type: "title", text: content.textContent });
        } else {
        const checkbox = content.querySelector("input[type='checkbox']");
        updatedTodoList.push({ type: "task", text: content.textContent.trim(), completed: checkbox.checked });
        }
    });
    savedTodoList.length = 0;
    Array.prototype.push.apply(savedTodoList, updatedTodoList);
    localStorage.setItem("todoList", JSON.stringify(savedTodoList));
    }
});

todoList.addEventListener("change", function () {
    const checkboxes = todoList.querySelectorAll(".task-checkbox");
    const totalTasks = checkboxes.length;
    const completedTasks = Array.from(checkboxes).filter(checkbox => checkbox.checked).length;
    const progress = totalTasks === 0 ? 0 : (completedTasks / totalTasks) * 100;

    document.querySelector(".progress-fill").style.width = `${progress}%`;
    document.querySelector(".progress-percent").textContent = `${Math.round(progress)}%`;

    savedTodoList.forEach((item, index) => {
    if (item.type === "task") {
        item.completed = checkboxes[index].checked;
    }
    });

    localStorage.setItem("todoList", JSON.stringify(savedTodoList));
});

// 초기 로드 시 진행률 업데이트
const checkboxes = todoList.querySelectorAll(".task-checkbox");
const totalTasks = checkboxes.length;
const completedTasks = Array.from(checkboxes).filter(checkbox => checkbox.checked).length;
const progress = totalTasks === 0 ? 0 : (completedTasks / totalTasks) * 100;

document.querySelector(".progress-fill").style.width = `${progress}%`;
document.querySelector(".progress-percent").textContent = `${Math.round(progress)}%`;
});
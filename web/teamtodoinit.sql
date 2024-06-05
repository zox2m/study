-- 데이터베이스 생성
CREATE DATABASE team_todo;

-- 데이터베이스 사용
USE team_todo;

-- 팀 테이블 생성
CREATE TABLE teams (
    team_id INT AUTO_INCREMENT PRIMARY KEY,
    team_name VARCHAR(50) NOT NULL
);

-- 사용자 테이블 생성
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    nickname VARCHAR(50) NOT NULL,
    team_id INT,
    FOREIGN KEY (team_id) REFERENCES teams(team_id)
);

-- 목표 테이블 생성
CREATE TABLE goals (
    goal_id INT AUTO_INCREMENT PRIMARY KEY,
    goal_name VARCHAR(50) NOT NULL,
    team_id INT,
    FOREIGN KEY (team_id) REFERENCES teams(team_id)
);

-- 할 일 테이블 생성
CREATE TABLE tasks (
    task_id INT AUTO_INCREMENT PRIMARY KEY,
    task_content VARCHAR(200) NOT NULL,
    goal_id INT,
    FOREIGN KEY (goal_id) REFERENCES goals(goal_id)
);

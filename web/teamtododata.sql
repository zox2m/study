-- 샘플 팀 데이터 삽입
INSERT INTO teams (team_id,team_name) VALUES (1,'design'), (2,'develop') , (3,'AI');

-- 샘플 사용자 데이터 삽입
INSERT INTO users (username, password, nickname, team_id) VALUES
('sin', '111', 'Nyam', 1),
('seo', '111', 'zzoomm', 2),
('moon', '111', 'Moooon', 3);

-- 샘플 목표 데이터 삽입
INSERT INTO goals (goal_name, team_id) VALUES
('클컴', 1),
('캡스톤', 1),
('클컴', 2),
('캡스톤', 3);

-- 샘플 할 일 데이터 삽입
INSERT INTO tasks (task_content, goal_id) VALUES
('UI 디자인', 1),
('뜨개질', 1),
('개발', 2);

# create database teamtodo;
create user lego@localhost identified by 'lego';
grant all privileges on team_todo. * to lego@localhost;
commit;
-- Insert Testdata into the database on every start of the backend
INSERT INTO USERS (username, firstname, lastname, email, password) VALUES ('nabru', 'Natalie', 'Brucki', 'na@bru.com', '12345');
INSERT INTO USERS (username, firstname, lastname, email, password) VALUES ('abru', 'Andi', 'Brucki', 'a@bru.com', '12345');
INSERT INTO USERS (username, firstname, lastname, email, password) VALUES ('bbru', 'Bettina', 'Brucki', 'b@bru.com', '23456');
INSERT INTO USERS (username, firstname, lastname, email, password) VALUES ('cbru', 'Claudia', 'Brucki', 'c@bru.com', '34567');
INSERT INTO USERS (username, firstname, lastname, email, password) VALUES ('dbru', 'Daniel', 'Brucki', 'd@bru.com', '45678');
INSERT INTO USERS (username, firstname, lastname, email, password) VALUES ('ebru', 'Erik', 'Brucki', 'e@bru.com', '56789');

INSERT INTO PROJECT (name) VALUES ('Proj backend 1');
INSERT INTO PROJECT (name) VALUES ('Proj backend 2');
INSERT INTO PROJECT (name) VALUES ('Proj backend 3');
INSERT INTO PROJECT (name) VALUES ('Proj backend 4');
INSERT INTO PROJECT (name) VALUES ('Proj backend 5');
INSERT INTO PROJECT (name) VALUES ('Proj backend 6');
INSERT INTO PROJECT (name) VALUES ('Proj backend 7');
INSERT INTO PROJECT (name) VALUES ('Proj backend 8');

INSERT INTO Timesheet (weekday, starttime, endtime, workinghours, Project_pid, User_uid) VALUES ('Monday', '8:00', '16:30', 8.0, 1, 1);
INSERT INTO Timesheet (weekday, starttime, endtime, workinghours, Project_pid, User_uid) VALUES ('Tuesday', '8:00', '16:30', 8.0, 2, 3);
INSERT INTO Timesheet (weekday, starttime, endtime, workinghours, Project_pid, User_uid) VALUES ('Wednesday', '8:00', '16:30', 8.0, 3, 6);
INSERT INTO Timesheet (weekday, starttime, endtime, workinghours, Project_pid, User_uid) VALUES ('Thursday', '8:00', '16:30', 8.0, 4, 1);
INSERT INTO Timesheet (weekday, starttime, endtime, workinghours, Project_pid, User_uid) VALUES ('Friday', '8:00', '16:30', 8.0, 5, 4);
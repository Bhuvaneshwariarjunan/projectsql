create database Student
use Student
CREATE TABLE Student(
RollNo INT PRIMARY KEY,
Sname VARCHAR(45),
Age INT,
Gender VARCHAR(10),
Course VARCHAR(50)
);
SELECT * FROM Student;
INSERT INTO Student(RollNo,Sname,Age,Gender,Course)
VALUES(111,'sail',20,'Female','ECE'),
(121,'kodi',20,'Female','ECE'),
(131,'renu',25,'Female','CSE'),
(141,'Sakthi',23,'Female','BSc'),
(151,'Madhu',19,'Male','CSE');
UPDATE Student
SET Age=23,Course='Physics'
WHERE RollNo=111;
DELETE FROM Student
WHERE RollNo=151;
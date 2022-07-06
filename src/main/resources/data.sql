INSERT INTO employee (id,name,age)
VALUES(1,'Mike',25)
ON DUPLICATE KEY UPDATE id=id;
INSERT INTO employee (id,name,age)
VALUES(2,'Tom',30)
ON DUPLICATE KEY UPDATE id=id;
INSERT INTO employee (id,name,age)
VALUES(3,'Bob',20)
ON DUPLICATE KEY UPDATE id=id;

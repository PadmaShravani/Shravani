CREATE TABLE department
(id INT PRIMARY KEY NOT NULL,
name VARCHAR(30) NOT NULL
);

CREATE TABLE faculty
(id INT  PRIMARY KEY NOT NULL,
firstname VARCHAR(30) NOT NULL,
lastname VARCHAR(50) NOT NULL,
deptId INT NOT NULL,
CONSTRAINT faculty_fk Foreign Key (deptId) references department(id)
);

CREATE TABLE student 
(id INT PRIMARY KEY NOT NULL,
firstname VARCHAR(30) NOT NULL,
lastname  VARCHAR(50) NOT NULL,
street  VARCHAR(50) NOT NULL,
streetDetails  VARCHAR(30) ,
city VARCHAR(30) NOT NULL,
state  VARCHAR(30) NOT NULL,
postalCode CHAR(5) NOT NULL,
majorId INT NOT NULL,
CONSTRAINT student_fk Foreign Key (majorId) references department(id)
);

CREATE TABLE course
(id INT PRIMARY KEY NOT NULL,
name VARCHAR(50) NOT NULL,
deptId INT NOT NULL,
CONSTRAINT course_fk Foreign Key (deptId) references department(id)
);

CREATE TABLE studentCourse
(studentId INT NOT NULL ,
courseId INT NOT NULL ,
progress INT NOT NULL ,
startDate DATE NOT NULL,
PRIMARY KEY (studentId,courseId),
CONSTRAINT studentCourse_fk Foreign Key (studentId) references student(id)
);


CREATE TABLE facultyCourse
(facultyId INT NOT NULL,
courseId INT NOT NULL,
PRIMARY KEY (studentId,courseId),
CONSTRAINT facultyCourse_fk Foreign Key (facultyId) references faculty(id)
);
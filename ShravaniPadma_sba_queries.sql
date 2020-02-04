/*A. The Curriculum Planning Committee is attempting to fill in gaps in the current course offerings. 
You need to provide them with a query which lists each department and the number of courses offered by 
that department.  The two columns should have headers “Department Name” and 
“# Courses”, and the output should be sorted by “# Courses” in each department (ascending).*/

select * from department,course

select d.name as `Department Name`,count(c.id) as `# Courses`
 from course c
 join department d
 on c.deptId=d.id
 group by d.name
 order by count(c.id);
 
 /*B. The recruiting department needs to know which courses are most popular with the students.
  Please provide them with a query which lists the name of each course and the number of students in that course.
  The two columns should have headers “Course Name” and “# Students”, and the output should be 
 sorted first by # Students descending and then by course name ascending.*/
	 
select * from student,course;

select c.name as `Course Name`,count(s.id) as `# Students` from student s
join studentcourse sc
on s.id=sc.studentId
join course c
on sc.courseId=c.id
group by c.name
order by count(s.id) desc ,c.name;

/*C. Quite a few students have been complaining that the professors are absent from some of their courses.

1.Write a query to list the names of all courses where the # of faculty assigned to those courses is zero. 
The output should be in alphabetical order by course name.
2.Using the above, write a query to list the course names and the # of students in those courses for
 all courses where there is no assigned faculty.  The output should be ordered first by # of students 
 descending and then by course name ascending.*/

select * from course;
select * from facultycourse;
select * from faculty;

select c.name from course c
left join facultycourse fc
on c.id=fc.courseId 
where fc.facultyId is null
order by c.name;


select c.name, count(sc.studentId) from course c
left join facultycourse fc
on c.id=fc.courseId
join studentcourse sc
on c.id=sc.courseId
where fc.facultyId is null
group by c.name
order by count(sc.studentId) desc, c.name;

/*D. The enrollment team is gathering analytics about student enrollment throughout the years.
Write a query that lists the total # of students that were enrolled in classes during each school year. 
The first column should have the header “Students”.  Provide a second “Year” column showing the enrollment year. 
Display the records sorted in ascending order based on startDate.*/

select * from student,studentcourse

select count(sc.studentId) as `Students`,Year(sc.startDate) as `Year` 
 from studentcourse sc
group by Year(sc.startDate)
order by Year(sc.startDate);

/*E. The enrollment team is gathering analytics about student enrollment and they now want to know 
about August admissions specifically. Write a query that lists the Start Date and # of Students who 
enrolled in classes in August of each year. The Output should be ordered by start date ascending.*/
 
 select * from studentcourse
 
select  year(sc.startDate) as `year`,count(sc.studentId) as `# of Students`
from studentcourse sc
WHERE    MONTH(sc.startDate)='08'
GROUP BY  YEAR(sc.startDate)
order by sc.startDate;

/*F. Students are required to take 4 courses, and at least two of these courses must be from 
the department of their major. Write a query to list students’ First Name, Last Name, and the 
number of courses they are taking in their major department.  The output should be sorted first 
in increasing order of the number of courses, then by student last name.
Use aliases “First Name”, “Last Name” and “Number of Courses”.*/

select * from student
order by lastname;
select * from studentcourse


select firstname as 'First Name',lastname as 'Last Name',count(sc.studentId) as `Number of Courses` 
from student s
join studentcourse sc
on s.id=sc.studentId
group by sc.studentId
having count(sc.studentId)>3
order by count(sc.studentId) ,lastname

/*G. Students making average progress in their courses of less than 50% need to be offered tutoring assistance.
Write a query to list First Name, Last Name and Average Progress of all students achieving average progress
of less than 50%.  The average progress as displayed should be rounded to one decimal place.Sort the output
by average progress descending. Use aliases “First Name”, “Last Name” and “Average Progress”.*/

select * from studentcourse;
select * from student;

select s.firstname as 'First Name',s.lastname as 'Last Name', round(avg(sc.progress),1) AS 'Average Progress'
from student s
join studentcourse sc
on s.id=sc.studentId
group by sc.studentId
having round(avg(sc.progress),1)<50
order by round(avg(sc.progress),1) desc; 




/*H. Faculty is awarded bonuses based on the progress made by students in their courses.

1.Write a query to list each course name and the average progress of students in that course. 
The output should be sorted descending by average progress. Use aliases “Course Name” and “Average Progress”.*/

select c.name as 'Course Name', avg(sc.progress) as 'Average Progress'
from course c 
join studentcourse sc
on c.id = sc.courseId
group by sc.courseId
order by avg(sc.progress) desc;

/*2.Write a query that selects the maximum value of the average progress reported by the previous query.*/

select max(A.AverageProgress) from (select avg(sc.progress) as AverageProgress
from course c 
join studentcourse sc
on c.id = sc.courseId
group by sc.courseId) as A;

/*3.Write a query that outputs the faculty First Name, Last Name, and the average of the progress 
made over all of their courses. Use aliases “First Name”, “Last Name” and “Average Progress”.
      Sort the output by Average Progress ascending.*/
      
select f.firstname as 'First Name', f.lastname as 'Last Name', avg(sc.progress) as 'Average Progress'
from course c 
join facultycourse fc
on c.id = fc.courseId
join studentcourse sc
on c.id = sc.courseId
join faculty f
on f.id = fc.facultyId
group by sc.courseId
order by avg(sc.progress);

/*4.Write a query just like #3, but where only those faculties where average progress in their courses 
is 90% or more of the maximum observed in #2.
Display the records sorted in descending order based on “Average Progress”.*/

select f.firstname as 'First Name', f.lastname as 'Last Name', avg(sc.progress) as AP
from course c 
join studentcourse sc
on c.id = sc.courseId
join facultycourse fc
on c.id = fc.courseId
join faculty f
on f.id = fc.facultyId
group by fc.courseId
having AP >= (select 0.9*max(AverageProgress) 
from (select avg(sc.progress) as AverageProgress
from course c 
join studentcourse sc
on c.id = sc.courseId
group by sc.courseId) as A)
order by avg(sc.progress) desc;

/*I. Students are awarded two grades based on the minimum and maximum progress they are making in the courses.
 The grading scale is as follows:
     Progress < 40:   F
     Progress < 50:   D
     Progress < 60:   C
     Progress < 70:   B
     Progress >= 70:  A
Write a query which displays each student’s “First Name”, “Last Name”, minimum progress with “Min Grade” 
as ALIAS, and maximum progress with ALIAS “Max Grade”. Display the records sorted in ascending order
based on “Average Progress”.*/

select s.firstname as 'First Name',s.lastname as 'Last Name', 
CASE
    WHEN min(sc.progress)<40 THEN "F" 
    WHEN min(sc.progress)<50 THEN "D"
    WHEN min(sc.progress)<60 THEN "C"
    WHEN min(sc.progress)<70 THEN "B"
    WHEN min(sc.progress)>=70 THEN "A" 
    else "error"
   END AS 'Min Grade',
CASE
    WHEN max(sc.progress)<40 THEN "F" 
    WHEN max(sc.progress)<50 THEN "D"
    WHEN max(sc.progress)<60 THEN "C"
    WHEN max(sc.progress)<70 THEN "B"
    WHEN max(sc.progress)>=70 THEN "A" 
    else "error"
   END AS 'Max Grade'
from student s
join studentcourse sc
on s.id=sc.studentId
group by sc.studentId
order by avg(sc.progress) ; 

/*J. Write a query that returns student’s full name with “Student Name” as alias whose progress
 is greater than the average progress for their course.*/
 
 --correct result 
 select distinct concat(s.firstname,'  ',s.lastname) as 'Student Name' from student s
 join studentcourse sc
 on s.id=sc.studentId, 
 (select sc.courseId as cid, avg(sc.progress) as courseAvgProgress from studentcourse sc group by sc.courseId) A
 where sc.progress > A.courseAvgProgress and sc.courseId = A.cid;

 
 --test for validation
 select sc.courseId as cid, avg(sc.progress) as courseAvgProgress from studentcourse sc group by sc.courseId;

 select concat(s.firstname,'  ',s.lastname) as 'Student Name', s.id, sc.progress from student s
 join studentcourse sc
 on s.id=sc.studentId, 
 (select sc.courseId as cid, avg(sc.progress) as courseAvgProgress from studentcourse sc group by sc.courseId) A
 where sc.progress > A.courseAvgProgress and sc.courseId = A.cid;

 select concat(s.firstname,'  ',s.lastname) as 'Student Name', s.id, sc.progress from student s
 join studentcourse sc
 on s.id=sc.studentId;
 

 




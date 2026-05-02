This is 'Student Management Sytem' Program build using Java [we use File Handling concept to take input from the User], JDBC [Java Database Connectivity] and Oracle DB 
And follow proper MVC Architecture to build this Application
In this Program you can ADD student, DELETE student by using Student Id, SEARCH student, and UPDATE student

+++++++++++++++++
Oracle DB SQL--->
+++++++++++++++++

SQL> create table student(SID varchar2(5) primary key, SNAME varchar2(10), SADDR varchar2(10));

Table created.

SQL> commit;

Commit complete.

SQL> desc student;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 SID                                       NOT NULL VARCHAR2(5)
 SNAME                                              VARCHAR2(10)
 SADDR                                              VARCHAR2(10)

+++++++++++++++++++++++++++++++++
Sample Result of the Program --->
+++++++++++++++++++++++++++++++++


====================================
||   Student Management System    ||
====================================

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option	: 10
Invalid Option You Selected

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option	: 1
++++++++++++++++++++++++++++++++++
Enter Student Id	: S-111
Enter Student Name	: Ashif
Enter Student Address	: Delhi
Status	: Student Added Sucessfully
++++++++++++++++++++++++++++++++++

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option	: 1
++++++++++++++++++++++++++++++++++
Enter Student Id	: S-111
Enter Student Name	: Rohan
Enter Student Address	: Hyd
Status	: Student Existed Already
++++++++++++++++++++++++++++++++++

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option	: 2
++++++++++++++++++++++++++++++++++
Enter Student Id	:S-222
Status	: Student Not Existed
++++++++++++++++++++++++++++++++++

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option	: 2
++++++++++++++++++++++++++++++++++
Enter Student Id	:S-111
----------------------------------
Student Id 		: S-111
Student Name 		: Ashif
Student Address 	: Delhi
++++++++++++++++++++++++++++++++++

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option	: 3
++++++++++++++++++++++++++++++++++
Student Id		: S-111
Student Name [old : Ashif] New : Rohan
Student Address [old :Delhi] New : Pune
Status	: Student Updated Sucessfully
++++++++++++++++++++++++++++++++++

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option	: 2
++++++++++++++++++++++++++++++++++
Enter Student Id	:S-111
----------------------------------
Student Id 		: S-111
Student Name 		: Rohan
Student Address 	: Pune
++++++++++++++++++++++++++++++++++

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option	: 4
++++++++++++++++++++++++++++++++++
Student Id		: S-222
Status	: Student Not Existed
++++++++++++++++++++++++++++++++++

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option	: 4
++++++++++++++++++++++++++++++++++
Student Id		: S-111
Status	: Student Deleted Successfully
++++++++++++++++++++++++++++++++++

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option	: 2
++++++++++++++++++++++++++++++++++
Enter Student Id	:S-111
Status	: Student Not Existed
++++++++++++++++++++++++++++++++++

1. ADD Student
2. SEARCH Student
3. UPDATE Student
4. DELETE Student
5. EXIT
Your Option	: 5
******Thank You For Using Student Management System******


package com.asoft.app32.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.asoft.app32.dto.Student;
import com.asoft.app32.factory.StudentServiceFactory;
import com.asoft.app32.service.StudentService;

public class Test {
	
	public static void main(String[] args) {
		BufferedReader br = null;
		System.out.println("====================================");
		System.out.println("||   Student Management System    ||");
		System.out.println("====================================");
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			String sid = "";
			String sname ="";
			String saddr = "";
			String status = "";
			Student student = null;
			StudentService studentService = StudentServiceFactory.getStudentService();
			
			while(true) {
				System.out.println();
				System.out.println("1. ADD Student");
				System.out.println("2. SEARCH Student");
				System.out.println("3. UPDATE Student");
				System.out.println("4. DELETE Student");
				System.out.println("5. EXIT");
				System.out.print("Your Option	: ");
				
				int option = Integer.parseInt(br.readLine());
				
				switch(option) {
					
				case 1:
					System.out.println("++++++++++++++++++++++++++++++++++");
					System.out.print("Enter Student Id	: ");
					sid = br.readLine();
					System.out.print("Enter Student Name	: ");
					sname = br.readLine();
					System.out.print("Enter Student Address	: ");
					saddr = br.readLine();
					
					student = new Student();
					
					student.setSid(sid);
					student.setSname(sname);
					student.setSaddr(saddr);
					
					status = studentService.addStudent(student);
					
					if(status.equalsIgnoreCase("sucess")) {
						System.out.println("Status	: Student Added Sucessfully");
					}else if(status.equalsIgnoreCase("existed")){
						System.out.println("Status	: Student Existed Already");
					}else if(status.equalsIgnoreCase("failure")) {
						System.out.println("Status	: Student Insertion Failure");
					}
					System.out.println("++++++++++++++++++++++++++++++++++");
					break;
				case 2:
					System.out.println("++++++++++++++++++++++++++++++++++");
					System.out.print("Enter Student Id	:");
					sid = br.readLine();
					student = studentService.searchStudent(sid);
					
					if(student == null) {
						System.out.println("Status	: Student Not Existed");
					}else {
						System.out.println("-------------------------------");
						System.out.println("Student Id 		: "+student.getSid());
						System.out.println("Student Name 		: "+student.getSname());
						System.out.println("Student Address 	: "+student.getSaddr());
					}
					System.out.println("++++++++++++++++++++++++++++++++++");
					break;
				case 3:
					System.out.println("++++++++++++++++++++++++++++++++++");
					System.out.print("Student Id		: ");
					sid = br.readLine();
					student = studentService.searchStudent(sid);
					
					if(student == null) {
						System.out.println("Student Not Existed");
					}else {
						System.out.print("Student Name [old : "+student.getSname()+"] New : ");
						sname = br.readLine();
						System.out.print("Student Address [old :"+student.getSaddr()+"] New : ");
						saddr = br.readLine();
						
						Student newStudent = new Student();
						newStudent.setSid(sid);
						newStudent.setSname(sname);
						newStudent.setSaddr(saddr);
						
						status = studentService.updateStudent(newStudent);
						
						if(status.equalsIgnoreCase("sucess")) {
							System.out.println("Status	: Student Updated Sucessfully");
						}else if(status.equalsIgnoreCase("failure")) {
							System.out.println("Status	: Student Updation Failure");
						}
					}
					System.out.println("++++++++++++++++++++++++++++++++++");
					break;
				case 4:
					System.out.println("++++++++++++++++++++++++++++++++++");
					System.out.print("Student Id		: ");
					
					sid = br.readLine();
					
					status = studentService.deleteStudent(sid);
					
					if(status.equalsIgnoreCase("sucess")) {
						System.out.println("Status	: Student Deleted Successfully");
					}else if(status.equalsIgnoreCase("failure")) {
						System.out.println("Status	: Student Deletion Failure");
					}else if(status.equalsIgnoreCase("notexisted")) {
						System.out.println("Status	: Student Not Existed");
					}
					System.out.println("++++++++++++++++++++++++++++++++++");
					break;
				case 5:
					System.out.println("******Thank You For Using Student Management System******");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Option You Selected");
					break;
						
				}
			}
		}catch(Exception e ) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

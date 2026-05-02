package com.asoft.app32.factory;
import com.asoft.app32.service.StudentService;
import com.asoft.app32.service.StudentServiceImpl;

public class StudentServiceFactory {
	
	private static StudentService studentService;
	static {
		studentService = new StudentServiceImpl();
	}
	public static StudentService getStudentService() {
		return studentService;
	}
}

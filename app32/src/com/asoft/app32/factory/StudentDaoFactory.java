package com.asoft.app32.factory;
import com.asoft.app32.dao.StudentDao;
import com.asoft.app32.dao.StudentDaoImpl;

public class StudentDaoFactory {
	
	private static StudentDao studentDao;
	
	static {
		studentDao = new StudentDaoImpl();
	}
	public static StudentDao getStudentDao() {
		return studentDao;
	}

}

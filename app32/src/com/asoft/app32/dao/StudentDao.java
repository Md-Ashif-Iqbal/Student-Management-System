package com.asoft.app32.dao;

import com.asoft.app32.dto.Student;

public interface StudentDao {
	
	public String add(Student student);
	public Student search(String sid);
	public String update(Student student);
	public String delete(String sid);

}

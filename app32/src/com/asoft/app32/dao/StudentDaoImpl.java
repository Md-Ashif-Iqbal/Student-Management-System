package com.asoft.app32.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import com.asoft.app32.dto.Student;
import com.asoft.app32.factory.ConnectionFactory;

public class StudentDaoImpl implements StudentDao {
	

	@Override
	public String add(Student student) {
		
		String status = "";
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			Student std = search(student.getSid());
			
			if(std == null) {
				String query = "insert into student values('" + student.getSid() + "','" + student.getSname() + "','" + student.getSaddr() + "')";
				int rowCount = st.executeUpdate(query);
				if(rowCount == 1) {
					status = "sucess";
				}else {
					status = "failure";
				}
			}else {
				status = "existed";
			}
		}catch(Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		
		
		return status;
	}

	@Override
	public Student search(String sid) {
		
		Student student = null;
		
		try {
			
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student where sid = '" + sid + "'");
			
			boolean b = rs.next();
			if(b == true) {
				student = new Student();
				student.setSid(rs.getString("SID"));
				student.setSname(rs.getString("SNAME"));
				student.setSaddr(rs.getString("SADDR"));
			}else {
				student = null;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return student;
	}

	@Override
	public String update(Student newStudent) {
		String status = "";
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			String query = "update student set SNAME = '"+newStudent.getSname()+"', SADDR = '"+newStudent.getSaddr()+"' WHERE SID = '"+newStudent.getSid()+"'";
			
			int rowCount = st.executeUpdate(query);
			
			if(rowCount == 1) {
				status = "sucess";
			}else {
				status = "failure";
			}
		}catch(Exception e) {
			status = "faiure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public String delete(String sid) {
		
		String status ="";
		try {
			
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			Student student = search(sid);
			if(student == null) {
				status = "notexisted";
			}else {
				String query = "delete from student where SID = '"+sid+"'";
				int rowCount = st.executeUpdate(query);
				
				if(rowCount == 1) {
					status ="sucess";
				}else {
					status = "failure";
				}
			}
			
		}catch(Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		
		return status;
	}

}

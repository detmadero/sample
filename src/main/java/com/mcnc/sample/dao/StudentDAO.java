package com.mcnc.sample.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mcnc.sample.dto.StudentDTO;

public interface StudentDAO {
	
	public List<StudentDTO> getStudentList();
	
	public StudentDTO getStudentByStudentId(@Param("studentId") String studentId);
	
	public void insertStudent(StudentDTO student);
	
	public void updateStudent(StudentDTO student);
	
	public void deleteStudent(@Param("studentId") String studentId);
}

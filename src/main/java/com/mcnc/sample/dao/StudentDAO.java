package com.mcnc.sample.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mcnc.sample.dto.StudentDTO;

public interface StudentDAO {
	
	public List<StudentDTO> getStudentList();
	
	public StudentDTO getStudentByStudentId(@Param("studentId") String studentId);
}

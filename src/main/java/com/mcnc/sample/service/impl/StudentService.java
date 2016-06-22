package com.mcnc.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcnc.sample.dao.StudentDAO;
import com.mcnc.sample.dto.StudentDTO;
import com.mcnc.sample.service.IStudentService;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	public List<StudentDTO> getStudentList() {
		return studentDAO.getStudentList();
	}

	public StudentDTO getStudentByStudentId(String studentId) {
		return studentDAO.getStudentByStudentId(studentId);
	}

}

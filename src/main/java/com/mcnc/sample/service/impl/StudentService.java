package com.mcnc.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.mcnc.sample.dao.StudentDAO;
import com.mcnc.sample.dto.StudentDTO;
import com.mcnc.sample.service.IStudentService;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Autowired
	PlatformTransactionManager transactionManager;
	
	@Override
	public List<StudentDTO> getStudentList() {
		return studentDAO.getStudentList();
	}
	
	@Override
	public StudentDTO getStudentByStudentId(String studentId) {
		return studentDAO.getStudentByStudentId(studentId);
	}

	@Override
	public void insertStudent(StudentDTO student) {
		TransactionStatus tx = transactionManager.getTransaction(new DefaultTransactionDefinition());
		try {			
			studentDAO.insertStudent(student);
			transactionManager.commit(tx);
		} catch (DataAccessException ex) {
			transactionManager.rollback(tx);
			throw ex;
		}
	}

	@Override
	public void updateStudent(StudentDTO student) {
		studentDAO.updateStudent(student);
	}

	@Override
	public void deleteStudent(String studentId) {
		studentDAO.deleteStudent(studentId);
	}
}

package com.mcnc.sample.service;

import java.util.List;

import com.mcnc.sample.dto.StudentDTO;

public interface IStudentService {

	public List<StudentDTO> getStudentList();

	public StudentDTO getStudentByStudentId(String studentId);
}

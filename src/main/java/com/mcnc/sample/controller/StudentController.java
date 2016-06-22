package com.mcnc.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mcnc.sample.common.message.ResponseMessage;
import com.mcnc.sample.common.message.ResponseMessageUtils;
import com.mcnc.sample.dto.StudentDTO;
import com.mcnc.sample.service.IStudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@Autowired
	IStudentService studentService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseMessage<List<StudentDTO>> getStudentList() {
		return ResponseMessageUtils.makeSuccessResponse(studentService.getStudentList());
	}
	
	
	@RequestMapping(value = "/{studentId}", method = RequestMethod.GET)
	public ResponseMessage<StudentDTO> getStudentByStudentId(@PathVariable("studentId") String studentId) {
		return ResponseMessageUtils.makeSuccessResponse(studentService.getStudentByStudentId(studentId));
	}
}

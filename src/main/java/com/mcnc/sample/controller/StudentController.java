package com.mcnc.sample.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public ResponseMessage<StudentDTO> insertStudent(@RequestBody StudentDTO student) {
		String studentId = String.valueOf(Calendar.getInstance().getTimeInMillis());
		student.setId(studentId);
		studentService.insertStudent(student);
		return ResponseMessageUtils.makeSuccessResponse(studentService.getStudentByStudentId(studentId));
	}
	
	@RequestMapping(value = "/update/{studentId}", method = RequestMethod.PUT)
	public ResponseMessage<StudentDTO> updateStudent(@RequestBody StudentDTO student, @PathVariable("studentId") String studentId) {
		student.setId(studentId);
		studentService.updateStudent(student);
		return ResponseMessageUtils.makeSuccessResponse(studentService.getStudentByStudentId(studentId));
	}
	
	@RequestMapping(value = "/delete/{studentId}", method = RequestMethod.DELETE)
	public ResponseMessage<String> deleteStudent(@PathVariable("studentId") String studentId) {
		// TODO delete something
		studentService.deleteStudent(studentId);
		return ResponseMessageUtils.makeResponse(true, "");
	}
}

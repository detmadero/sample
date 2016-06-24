package sample.service.impl.test;

import java.util.Calendar;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mcnc.sample.dto.StudentDTO;
import com.mcnc.sample.service.IStudentService;

import sample.AbstractTestCase;

public class StudentServiceTest extends AbstractTestCase {

	@Autowired
	private IStudentService studentService;
	
	@Test
	public void getStudentList() {
		System.out.println(studentService.getStudentList());
	}
	
	@Test
	public void getStudentByStudentId() {
		String studentId = "STU001";
		System.out.println(studentService.getStudentByStudentId(studentId ));
	}
	
	@Test
	public void insertStudent() {

		String studentId = String.valueOf(Calendar.getInstance().getTimeInMillis());
		StudentDTO student = new StudentDTO();
		student.setId(studentId);
		student.setName("Yin Buntha~!@#$%^&*()_");
		student.setGender("Male");
		student.setAge(24);
		student.setScore(67);
		
		studentService.insertStudent(student);
		System.out.println(studentService.getStudentByStudentId(studentId));
	}
	
	@Test
	public void updateStudent() {
		
		String studentId = "STU002";
		StudentDTO student = new StudentDTO();
		student.setId(studentId);
		student.setName("Yin Buntha~!@#$%^&*()_+");
		student.setGender("Male");
		student.setAge(25);
		student.setScore(88);
		
		studentService.updateStudent(student);
		System.out.println(studentService.getStudentByStudentId(studentId));
	}
	
	@Test
	public void deleteStudent() {
		String studentId = "1464450107026";
		studentService.deleteStudent(studentId);
	}
}

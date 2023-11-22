package com.example.Student2;

import com.example.Student2.entity.Student;
import com.example.Student2.repo.StudentRepo;
import com.example.Student2.service.StudentService;
import com.example.Student2.service.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class Student2ApplicationTests {
        @MockBean
		private StudentRepo studentRepo;
	    @Autowired
		private StudentService studentService;


	@Test
	public void addStudentTest() {
		Student student=new Student(1,"Maha",22,30000);
		studentService.addStudent(student);
		verify(studentRepo,times(1)).save(student);
	}

	@Test
	public void getAllStudentTest() {
		when(studentRepo.findAll()).thenReturn(Stream
				.of(new Student(1,"Maha", 22,30000),
						new Student(2,"Harshi",23,40000))
				.collect(Collectors.toList()));
		assertEquals(2,studentService.getAllStudent().size());
	}
	@Test
	public void updateStudentTest() {
		long sId=2;
		Student student=new Student(2,"Maharshi",23,40000);
		studentService.updateStudent(sId, student);
		verify(studentRepo,times(1)).save(student);
	}

	@Test
	public void deleteStudentTest() {
		long sId=2;
		studentService.deleteStudent(sId);
		verify(studentRepo,times(1)).deleteById(sId);
	}


}

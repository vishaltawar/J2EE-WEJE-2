package com.jspider.springboot.servicestest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.jspider.springboot.pojo.StudentPojo;
import com.jspider.springboot.repository.StudentRepository;
import com.jspider.springboot.servise.StudentServises;

@SpringBootTest
public class StudentServiceTest {
	// @Autowired (if we give the @Autowired then we will get actual data from
	// databse. we need to give @Mock for mock data)
	@MockBean
	private StudentRepository repository;

	@Autowired
	private StudentServises servises;

	private StudentPojo studentPojo = new StudentPojo();

	@BeforeEach
	public void setUp() {
		studentPojo.setId(1);
		studentPojo.setName("Vishal");
		studentPojo.setEmail("vishal@gmail.com");
		studentPojo.setContact(7575757575L);
		studentPojo.setCity("Dhule");
	}
	
	@Test
	public void addStudent() {
		repository.save(studentPojo);
		Mockito.when(studentPojo).thenReturn(studentPojo);
		assertThat(servises.add(studentPojo)).isEqualTo(studentPojo);
	}

	@Test
	public void getAllStudent() {
		StudentPojo studentPojo1 = new StudentPojo();
		studentPojo1.setName("Aakash");
		studentPojo1.setEmail("aakash@gmail.com");
		studentPojo1.setContact(8578968457L);
		studentPojo1.setCity("Dhule");

		List<StudentPojo> allStudent = new ArrayList<>();
		allStudent.add(studentPojo);
		allStudent.add(studentPojo1);

		Mockito.when(repository.findAll()).thenReturn(allStudent);
		assertThat(servises.getAll()).isEqualTo(allStudent);
	}


	// StudenPojo can not be return findById()
	// findById() should return Optional
	
//	@Test
//	public void serchById() {
//				
//		Mockito.when(repository.findById(1).orElse(null)).thenReturn(studentPojo);
//		assertThat(servises.searchById(1)).isEqualTo(studentPojo);
//	}
	
	
	// "when()" is not allow return type void, & delete method return void.
//	@Test
//	public void delete() {
//		StudentPojo pojo = repository.findById(1).orElse(null);
//		Mockito.when(repository.delete(pojo)).thenReturn(studentPojo);
//		assertThat(servises.delete(1)).isEqualTo(studentPojo);
//		
//	}
}

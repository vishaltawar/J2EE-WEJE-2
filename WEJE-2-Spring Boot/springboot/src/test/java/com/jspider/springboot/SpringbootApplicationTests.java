package com.jspider.springboot;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jspider.springboot.pojo.StudentPojo;
import com.jspider.springboot.servise.StudentServises;

@SpringBootTest
class SpringbootApplicationTests {

//	@Autowired
	private CalculatorTest calculator = new CalculatorTest();

	
//	

	@Test
	void contextLoads() {
	}

	@Test
	public void add() {
		int actulValue = calculator.add(5, 4);
		int expected = 9;
		assertThat(actulValue).isEqualTo(expected);
	}

	@Test
	public void mul() {
		int actualMul = calculator.multiplication(5, 3);
		int expectedMul = 15;
		assertThat(actualMul).isEqualTo(expectedMul);
	}

	
}

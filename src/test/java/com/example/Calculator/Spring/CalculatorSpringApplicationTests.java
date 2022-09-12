package com.example.Calculator.Spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorSpringApplicationTests {

	public final CalculatorService calculatorService = new CalculatorService();


	@Test
	void checkIsItPossibleToDivideByZero(){
		//GIVEN
		int a = 0;
		int b = 1;

		//WHEN
		int result = calculatorService.divide(a, b);

		//THEN
		assertEquals(0, result);
	}
}

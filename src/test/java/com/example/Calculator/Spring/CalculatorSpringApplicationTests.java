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

	@Test
	void twoPlusTwoShouldGiveFour(){
		//GIVEN
		int a =2;
		int b =2;

		//WHEN
		int result = calculatorService.add(a, b);

		//THEN
		assertEquals(4, result);
	}

	@Test
	void twoPlusTwoGiveFive(){
		//GIVEN
		int a=2;
		int b=2;

		//WHEN
		int result = calculatorService.add(a, b);

		//THEN
		assertEquals(5, result);
	}

	@Test
	void fourDivideByTwoGivesOne(){
		//GIVEN
		int a=4;
		int b=2;

		//WHEN
		int reslut =calculatorService.divide(4, 2);

		//THEN
		assertEquals(1, reslut);
	}

	@Test
	void twoMinusTwoGivesZero(){
		//GIVEN
		int a=2;
		int b=2;

		//WHEN
		int reslut =calculatorService.minus(2, 2);

		//THEN
		assertEquals(0, reslut);
	}

	@Test
	void twoMinusTwoGivesOne(){
		//GIVEN
		int a=2;
		int b=2;

		//WHEN
		int reslut =calculatorService.minus(2, 2);

		//THEN
		assertEquals(1, reslut);
	}
}

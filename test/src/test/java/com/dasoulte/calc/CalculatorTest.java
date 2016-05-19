package com.dasoulte.calc;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() throws IOException {
		Calculator calculator = new Calculator();
		
		int sum = calculator.calcSum(getClass().getResource("input.txt").getPath());
		
		assertThat(sum, is(10));
		
	}
	
	@Test
	public void test3() throws IOException {
		Calculator calculator = new Calculator();
		
		int sum = calculator.calcSum2(getClass().getResource("input.txt").getPath());
		
		assertThat(sum, is(10));
		
	}
	
	@Test
	public void test5() throws IOException {
		Calculator calculator = new Calculator();
		
		String lines = calculator.concatenate(getClass().getResource("input.txt").getPath());
		
		assertThat(lines, is("1234"));
		
	}
	
	@Test
	public void test2() throws IOException {
		Calculator calculator = new Calculator();
		
		int mul = calculator.calcMul(getClass().getResource("input.txt").getPath());
		
		assertThat(mul, is(24));
		
	}
	
	@Test
	public void test4() throws IOException {
		Calculator calculator = new Calculator();
		
		int mul = calculator.calcMul2(getClass().getResource("input.txt").getPath());
		
		assertThat(mul, is(24));
		
	}
	
}

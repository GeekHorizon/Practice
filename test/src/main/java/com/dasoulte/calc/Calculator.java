package com.dasoulte.calc;

import java.io.BufferedReader;
import java.io.IOException;

import org.apache.commons.lang.StringUtils;

public class Calculator {

	public int calcSum(String filePath) throws IOException {
		return new CalculatorContext().context(filePath, new CalculatorCallback() {
			public int action(BufferedReader br) throws NumberFormatException, IOException {
				String line = StringUtils.EMPTY;
				
				int sum = 0;
				while ((line = br.readLine()) != null) {
					sum += Integer.valueOf(line);
				}
				
				return sum;
			}
		});
	}
	
	public int calcSum2(String filePath) throws IOException {
		return new CalculatorContext().context2(filePath, new CalculatorCallback2<Integer>() {
			public Integer doSomethingWithLine(String line, Integer value) {
				value += Integer.valueOf(line);
				return value;
			}
		}, 0);
	}
	
	public String concatenate(String filePath) throws IOException {
		return new CalculatorContext().context2(filePath, new CalculatorCallback2<String>() {
			public String doSomethingWithLine(String line, String value) {
				value += line;
				return value;
			}
		}, "");
	}

	public int calcMul(String filePath) throws IOException {
		return new CalculatorContext().context(filePath, new CalculatorCallback() {
			public int action(BufferedReader br) throws NumberFormatException, IOException {
				String line = StringUtils.EMPTY;
				
				int sum = 1;
				while ((line = br.readLine()) != null) {
					sum *= Integer.valueOf(line);
				}
				
				return sum;
			}
		});
	}
	
	public int calcMul2(String filePath) throws IOException {
		return new CalculatorContext().context2(filePath, new CalculatorCallback2<Integer>() {
			public Integer doSomethingWithLine(String line, Integer value) {
				value *= Integer.valueOf(line);
				return value;
			}
		}, 1);
	}
	
	
}

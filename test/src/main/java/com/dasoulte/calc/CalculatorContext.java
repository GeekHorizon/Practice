package com.dasoulte.calc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.lang.StringUtils;

public class CalculatorContext {

	public int context(String filePath, CalculatorCallback callback) throws IOException {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(filePath));
			return callback.action(br);
		} catch (IOException e) {
			throw e;
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public <T>T context2(String filePath, CalculatorCallback2<T> callback, T initValue) throws IOException {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(filePath));
			
			String line = StringUtils.EMPTY;
			T value = initValue;
			
			while ((line = br.readLine()) != null) {
				value = callback.doSomethingWithLine(line, value);
			}
			
			return value;
		} catch (IOException e) {
			throw e;
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
}

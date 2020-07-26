package com.dasoulte.calc.org;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.lang.StringUtils;

/**
 * 이 소스를 리팩토링 하시오
 * 
 * @author Administrator
 *
 */
public class Calculator {















	public int calcSum(String filePath) throws IOException {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(filePath));
			
			String line = StringUtils.EMPTY;
			
			int sum = 0;
			while ((line = br.readLine()) != null) {
				sum += Integer.valueOf(line);
			}
			return sum;
			
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
	
	public int calcMul(String filePath) throws IOException {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(filePath));
			
			String line = StringUtils.EMPTY;
			
			int sum = 1;
			while ((line = br.readLine()) != null) {
				sum *= Integer.valueOf(line);
			}
			return sum;
			
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

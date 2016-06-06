package com.dasolute.practice.first;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ThreeTest {
	
	/**
	 * 양의 정수만 들어온다고 가정한다.
	 * 
	 * validation
	 * > 음의 정수
	 * > 정수가 아닌 값
	 * 
	 */
	@Test
	public void arrayConvertTest() {
		String str = "234";
		
		char[] charArr = str.toCharArray();
		
		int[] intArr = new int[charArr.length];
		
		for (int index = 0 ; index < charArr.length ; index++) {
			intArr[index] = Character.digit(charArr[index], 10);
		}
		
		assertThat(intArr.length, is(charArr.length));
		assertThat(intArr[0], is(2));
		assertThat(intArr[1], is(3));
		assertThat(intArr[2], is(4));
	}
	
	@Test
	public void conditionTest() {
		// 숫자를 index array 로 변환
		String str = "1356";
		
		char[] charArr = str.toCharArray();
		
		int[] intArr = new int[charArr.length];
		
		for (int index = 0 ; index < charArr.length ; index++) {
			intArr[index] = Character.digit(charArr[index], 10);
		}
		
		// 해당 array에서 얼마나 매칭되었는지 판단
		int checkedCount = 0;
		
		for (int index = 0 ; index < intArr.length ; index++) {
			if (intArr[index] % 3 == 0) {
				checkedCount++;
			} 
		}
		
		// 판단된 수만큼 출력
		if (checkedCount > 0) {
			for (int index = 0 ; index < checkedCount ; index++) {
				System.out.print("*");
			}
		} else {
			System.out.println(str);
		}
	}
}

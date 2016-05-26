package com.dasolute.practice.first;

public class Three {

	public static void main(String[] args) {
	
		Three three = new Three();
		
		
		for (int index = 1; index < 100 ; index++) {
			System.out.println();
			three.run(String.valueOf(index));
		}
		
	}

	private void run(String str) {
		int[] intArr = covertToIntArray(str);
		
		int checkedCount = checkCount(intArr);
		
		print(checkedCount, str);
		
	}	

	private int[] covertToIntArray(String str) {
		char[] charArr = str.toCharArray();
		
		int[] intArr = new int[charArr.length];
		
		for (int index = 0 ; index < charArr.length ; index++) {
			intArr[index] = Character.digit(charArr[index], 10);
		}
		
		return intArr;
	}
	
	private int checkCount(int[] intArr) {
		int checkedCount = 0;
		
		for (int index = 0 ; index < intArr.length ; index++) {
			if (intArr[index] != 0 && intArr[index] % 3 == 0) {
				checkedCount++;
			} 
		}
		
		return checkedCount;
	}
	
	private void print(int checkedCount, String defaultString) {

		// 판단된 수만큼 출력
		if (checkedCount > 0) {
			for (int index = 0 ; index < checkedCount ; index++) {
				System.out.print("*");
			}
		} else {
			System.out.println(defaultString);
		}
	}
}

package com.dasolute.practice.compare;

public class Compare implements Comparable<Compare> {
	
	private int index;

	public Compare(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}

	@Override
	public String toString() {		
		return index + "@" + getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
	
	/**
	 * compare의 비교조건은 항상 헷갈린다.
	 * 
	 * 비교대상 o 와 비교해서 return 값 기준으로
	 * 
	 * 0보다 작은 경우 : 비교대상 o보다 내(this)가 앞선 순서에 있다.
	 * 0보다 큰 경우 :  비교대상 o가 나보다 뒤에 있다.
	 * 0인 경우 : 비교대상 o는 나와 같은 순서에 있다.
	 */
	public int compareTo(Compare o) {
		return this.index - o.index;
	}

}

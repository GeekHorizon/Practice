package com.dasolute.practice.compare;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class CompareTest {
	
	Compare[] compare = new Compare[4];
	
	@Before
	public void setUp() {
		compare[0] = new Compare(1);
		compare[1] = new Compare(2);
		compare[2] = new Compare(3);
		compare[3] = new Compare(4);
	}

	/**
	 * 비교대상이 되는 Object 스스로 comparable Inteface를 구현한 케이스
	 * 
	 * <code>
	 * return this.index - 비교대상.index;
	 * 
	 * 0보다 작으면 this 가 비교대상 보다 앞에 있는 경우이다. (즉 비교대상이 더 크고 뒤에 있다)
	 * 0보다 크면 this가 비교대상 보다 뒤에 있다. (즉 내가 (this)가 비교대상보다 더 크다 혹은 뒤에 있다)
	 * 0이라면 this와 비교대상은 순서가 같다.
	 */
	@Test
	public void objectComparableTest() {
		Arrays.sort(compare);
		
		for(Compare item : compare) {
			System.out.println(item);
		}
	}
	
	/**
	 * 별도의 Comparator 인터페이스를 구현한 케이스 (객체에서 구현하지 않아도 된다.)
	 * 
	 * <code>
	 * return o2.getIndex() - o1.getIndex()
	 * 
	 * public int compare(Compare o1, Compare o2) {
	 * }
	 * 
	 * 이 comparator 인터페이스를 구현한 함수가 
	 * 양수를 리턴하면 o2가 o1 보다 앞에 있다.
	 * 음수를 리턴하면 o2는 o1 보다 뒤에 있다.
	 * 
	 * 근데 재미있는게 [1,2,3,4] 를 Arrays.sort(arr, comparator)에 넘기면
	 * 일반적인 생각은 (1,2) 를 비교하고 (2,3)을 비교하고 (3,4) 를 비교할 거 같이 생각되지만
	 * 실제로는 (2,1) 을 비교하고 (3,2)를 비교하고 (4,3)을 비교한다.
	 * 이 부분이 해결되지 않으니 계속 헷갈릴 수 밖에 없다.
	 * 
	 * 그래서 1,2,3,4 를 4,3,2,1 로 정렬을 하려면 
	 * 수식을 o2 - o1 을 해줘야한다. 
	 * 
	 * 예를 들어 (2,1) 이 넘어오게 되면 o2 - o1 즉 1 - 2 를 하게 되고 
	 * compare 메소드의 결과는 -1 음수를 리턴한다.
	 * 음수가 리턴되면 o2가 o1보다 뒤에 있음을 의미하므로 2, 1 즉 역순으로 정리가 된다.
	 * 
	 */
	@Test
	public void objectComparatorTest() {
		Arrays.sort(compare, new ComparatorInterface());
		
		for(Compare item : compare) {
			System.out.println(item);
		}
	}
}

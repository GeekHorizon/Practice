package com.dasolute.learn;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * 해당 코드는 Junit 테스트 케이스들이 독립적으로 수행이 되는 것을 확인하기 위한 테스트 케이스입니다.
 * 
 * @author Administrator
 *
 */
public class JUnitTest {
	
	static Set<JUnitTest> set = new HashSet<JUnitTest>();

	@Test
	public void test1() {
		assertThat(set, not(hasItem(this)));
		set.add(this);	
	}
	
	@Test
	public void test2() {
		assertThat(set, not(hasItem(this)));
		set.add(this);	
	}
	
	@Test
	public void test3() {
		assertThat(set, not(hasItem(this)));
		set.add(this);	
	}
}

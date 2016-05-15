package com.dasolute.learn;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 해당 코드는 Junit 테스트 케이스들이 독립적으로 수행이 되는 것을 확인하기 위한 테스트 케이스입니다.
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/test-context.xml")
public class JUnitTest2 {
	
	@Autowired
	private ApplicationContext context;
	
	static Set<JUnitTest2> set = new HashSet<JUnitTest2>();
	static ApplicationContext currentContext;
	
	@Before
	public void setUp() {
		currentContext = context;
	}

	@Test
	public void test1() {
		assertThat(set, not(hasItem(this)));
		set.add(this);	
		
		assertThat(context, sameInstance(currentContext));
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

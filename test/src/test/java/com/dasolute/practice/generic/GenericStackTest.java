package com.dasolute.practice.generic;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


public class GenericStackTest {

	@Test
	public void genericStringTest() {
		GenericStack<String> stack = new GenericStack<String>();
		
		stack.push("test1");
		stack.push("test2");
		stack.push("test3");
	
		assertThat(stack.pop(), is("test3"));
	}
	
	@Test
	public void genericIntegerTest() {
		GenericStack<Integer> stack = new GenericStack<Integer>();
		
		stack.push(3);
		stack.push(6);
		
		assertThat(stack.pop(), is(6));
	}
}

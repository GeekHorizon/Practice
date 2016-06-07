package com.dasolute.practice.generic;

import java.util.LinkedList;
import java.util.List;

public class SimpleStack {

	private List list;
	
	public SimpleStack() {
		list = new LinkedList();
	}
	
	public void push(Object item) {
		list.add(0, item);
	}
	
	public Object pop() {
		if (list.size() == 0) {
			return null;
		}
		
		return list.remove(0);
	}
	
	
}

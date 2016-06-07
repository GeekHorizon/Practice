package com.dasolute.practice.generic;

import java.util.LinkedList;
import java.util.List;

/**
 * 동일 package에 존재하는 SimpleStack을 Generic으로 변경해라.
 * 
 * @author simons
 *
 */
public class GenericStack<E> {
	private List<E> list;
	
	public GenericStack() {
		list = new LinkedList<E>();
	}
	
	public void push(E item) {
		list.add(0, item);
	}
	
	public E pop() {
		if (list.size() == 0) {
			return null;
		}
		
		return list.remove(0);
	}
}
